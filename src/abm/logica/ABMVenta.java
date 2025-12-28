
package abm.logica;
import java.util.*;
import abm.dominios.*;

public class ABMVenta implements ABMInterfaz<Venta> {
    private List<Venta> ventas = new ArrayList<>();
    private static ABMVenta instancia;
    
    
    public Venta obtenerVentaPorId(int x){
        for(Venta v: ventas){
            if(v.getId() == x){
                return v;
            }
        }
        return null;
    }
    
    public static ABMVenta getInstancia(){
        if(instancia == null){
            instancia = new ABMVenta();
        }
        return instancia;
    }
    
    @Override
    public boolean validarId(int id) {
        for(Venta v: ventas){
            if(v.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void agregar(Venta v) {
        ventas.add(v);
    }


    @Override
    public boolean eliminar(Venta v) {
        for(LineaVenta lv: v.getLineas()){
            Producto p = lv.getProducto();
            if(p != null){
                p.setStock(p.getStock() + lv.getCantidad());
            }else{
                return false;
            }
        }
        this.ventas.remove(v);
        return true;
    }

    @Override
    public List<Venta> obtenerLista() {
        return ventas;
    }
    
    
    
}
