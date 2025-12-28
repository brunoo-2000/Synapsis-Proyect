
package abm.logica;

import abm.dominios.Producto;
import java.util.ArrayList;
import java.util.List;
import abm.logica.ABMProducto;

public class addProductos {
    private static List<LineaVenta> lineasVenta = new ArrayList<>();
    private static addProductos instancia;
    
    
    public void cargarLineasParaEdicion(List<LineaVenta> lineasACargar){
        lineasVenta.clear();
        if(lineasACargar != null){
            lineasVenta.addAll(lineasACargar);
        }
    }
    public LineaVenta getLineaPorId(int id){
        for(LineaVenta v: lineasVenta){
            if(v.getProducto().getId() == id){
                return v;
            }
        }
        return null;
    }
    
    public void limpiarVenta(){
        lineasVenta.clear();
    }
    
    public static addProductos getInstancia(){
        if(instancia == null){
            instancia = new addProductos();
        }
        return instancia;
    }
    
    public boolean eliminarLinea(LineaVenta v){
        int idProducto = v.getProducto().getId();
        return lineasVenta.removeIf(l -> l.getProducto().getId() == idProducto);
    }
    
    public boolean aggProductos(Producto p, int cantidadVenta){
        if(!ABMProducto.getInstancia().validarId(p.getId())){
            return false;
        }
        
        LineaVenta lineaExistente = null;
        for(LineaVenta v: lineasVenta){
            if(v.getProducto().getId() == p.getId()){
                lineaExistente = v;
                break;
            }
        }
        
        if(lineaExistente != null){
            int nuevaCantidad = lineaExistente.getCantidad() + cantidadVenta;
            lineaExistente.setCantidad(nuevaCantidad);
        }else{
            LineaVenta nuevaLinea = new LineaVenta(p, cantidadVenta);
            lineasVenta.add(nuevaLinea);
        }
        
        return true;
    }
    
    
    public List<LineaVenta> obtenerLista(){
        return lineasVenta;
    }
    
    public List<Producto> obtenerProductosVenta(){
        List<Producto> productosVenta = new ArrayList<>();
        for(LineaVenta v: lineasVenta){
            productosVenta.add(v.getProducto());
        }
        return productosVenta;
    }
    
    
}
