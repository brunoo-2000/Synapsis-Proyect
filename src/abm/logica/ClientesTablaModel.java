
package abm.logica;
import abm.dominios.*;
import abm.logica.ABMCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClientesTablaModel extends AbstractTableModel {
    
    private final String[] nombreColumnas = {"ID", "Nombre", "Apellido", "CUIT", "Email", "Telefono", "Dirección"};
    private static List<Cliente> clientes = ABMCliente.getInstancia().obtenerLista();
    
    
    public Cliente obtenerClientePorFila(int fila){
        return clientes.get(fila);
    }
            
    @Override
    public String getColumnName(int col){
        return nombreColumnas[col];
    }
    
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        
        switch(columnIndex){
            case 0: return cliente.getId();
            case 1: return cliente.getNombre();
            case 2: return cliente.getApellido();
            case 3: return cliente.getCuit();
            case 4: return cliente.getEmail();
            case 5: return cliente.getTelefono();
            case 6: return cliente.getDireccion().concat(" ").concat(cliente.getDireccionNum());
            default: return null;
        }
    }
    
    
}
