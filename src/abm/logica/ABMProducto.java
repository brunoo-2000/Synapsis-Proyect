
package abm.logica;
import java.util.*;
import abm.dominios.*;

public class ABMProducto implements ABMInterfaz<Producto>{
    private static List <Producto> productos = new ArrayList<>();
    private static ABMProducto instancia;

    
    public Producto obtenerProdcutoPorId(int id){
        for(Producto p: productos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    
    private ABMProducto(){
    };
    
    public static ABMProducto getInstancia(){
        if(instancia == null){
            instancia = new ABMProducto();
        }
        return instancia;
    }
    
    @Override
    public boolean validarId(int id) {
        for(Producto p: productos){
            if(p.getId() == id){
                return true;
            }
        }
        return false;
    }

    
    @Override
    public void agregar(Producto p) {
        productos.add(p);
    }


    @Override
    public boolean eliminar(Producto p){
        if(!validarId(p.getId())){
            return false;
        }
        return productos.removeIf(x -> x.getId() == p.getId());
        
    }

    @Override
    public List<Producto> obtenerLista() {
        return productos;
    }


    
}
