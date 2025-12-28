
package abm.logica;
import abm.dominios.*;
import java.util.*;


public class ABMCliente implements ABMInterfaz<Cliente> {
    private static List<Cliente> clientes = new ArrayList<>();
    private static ABMCliente instancia;
    
    private ABMCliente(){
    };
    
    
    public boolean validarDuplicacion(String x){
        for(Cliente c: clientes){
            if(c.getCuit().equals(x)){
                return false;
            }
        }
        return true;
    }
    
    
    public Cliente obtenerClientePorId(int id){
        for(Cliente c: clientes){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    
    public static ABMCliente getInstancia(){
        
        if (instancia == null) {
            instancia = new ABMCliente();
        }
        return instancia;
    }
    
    @Override
    public boolean validarId(int id) {
        for(Cliente c: clientes){
            if(c.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void agregar(Cliente c) {
        clientes.add(c);
    }


    @Override
    public boolean eliminar(Cliente c){
        if(!validarId(c.getId())) return false;
        return clientes.removeIf(x -> x.getId() == c.getId());
    }

    @Override
    public List<Cliente> obtenerLista() {
        return clientes;
    }
    
    
    
    
}
