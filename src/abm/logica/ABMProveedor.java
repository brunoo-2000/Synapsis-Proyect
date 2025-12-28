
package abm.logica;
import java.util.*;
import abm.dominios.*;

public class ABMProveedor implements ABMInterfaz<Proveedor> {
    private List<Proveedor> proovedores = new ArrayList<>();
    private static ABMProveedor instancia;
    
    
    public ABMProveedor(){
    }
    
    public static ABMProveedor getInstancia(){
        if(instancia == null){
            instancia = new ABMProveedor();
        }
        return instancia;
    }
    
    public Proveedor obtenerProveedorPorId(int id){
        for(Proveedor p: proovedores){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    
    @Override
    public boolean validarId(int id) {
        for(Proveedor p: proovedores){
            if(p.getId() == id) return true;
        }
        return false;
    }

    @Override
    public void agregar(Proveedor p) {
        proovedores.add(p);
    }


    @Override
    public boolean eliminar(Proveedor p) {
        if(!validarId(p.getId())) return false;
        return proovedores.removeIf(x -> x.getId() == p.getId());
    }

    @Override
    public List<Proveedor> obtenerLista() {
        return proovedores;
    }
    
    
    
    
}
