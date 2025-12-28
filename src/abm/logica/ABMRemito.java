
package abm.logica;
import abm.dominios.Remito;
import abm.dominios.Venta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class ABMRemito implements ABMInterfaz<Remito>{
    private List<Remito> remitos = new ArrayList<>();
    private static ABMRemito instancia;
    
    public static ABMRemito getInstancia(){
        if(instancia == null){
            instancia = new ABMRemito();
        }
        return instancia;
    }
    private ABMRemito(){};
    
    
    public boolean crearRemito(Venta v){
        for(Remito r: remitos){
            if(v.getId() == r.getId()){
                return false;
            }
        }
        
        Remito remito = new Remito();
        remito.setFecha(LocalDate.now());
        remito.setHora(LocalTime.now());
        remito.setIdCliente(v.getIdCliente());
        remito.setIdVendedor(v.getIdVendedor());
        remito.setIdVenta(v.getId());
        agregar(remito);
        
        return false;
    }
    
    
    @Override
    public boolean validarId(int x) {
        for(Remito r : remitos){
            if(r.getId() == x){
                return true;
            }
        }
        return false;
    }

    @Override
    public void agregar(Remito r) {
        remitos.add(r);
    }

    @Override
    public boolean eliminar(Remito r) {
        if(!validarId(r.getId())) return false;
        return remitos.removeIf(x -> x.getId() == r.getId());
    }

    @Override
    public List obtenerLista() {
        return remitos;
    }
    
    
    
}
