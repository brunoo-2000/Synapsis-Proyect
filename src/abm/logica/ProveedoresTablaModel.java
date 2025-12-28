
package abm.logica;
import abm.dominios.Proveedor;
import abm.logica.ABMProveedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProveedoresTablaModel extends AbstractTableModel {
    
    private final String[] nombreColumnas = {"ID","Razon social", "CUIT", "Telefono", "Email", "Direccion", "Rubro"};
    private List<Proveedor> proveedores = ABMProveedor.getInstancia().obtenerLista();

    public Proveedor obtenerProveedorPorFila(int fila){
        return proveedores.get(fila);
    }
    
    @Override
    public String getColumnName(int col){
        return nombreColumnas[col];
    }
    
    @Override
    public int getRowCount() {
        return proveedores.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedor proveedor = proveedores.get(rowIndex);
        switch(columnIndex){
            case 0: return proveedor.getId();
            case 1: return proveedor.getRazonSocial();
            case 2: return proveedor.getCuit();
            case 3: return proveedor.getTelefono();
            case 4: return proveedor.getEmail();
            case 5: return proveedor.getDireccion() + " " + proveedor.getDireccionNum();
            case 6: return proveedor.getRubro();
            default: return null;   
        }
    }
    
    
    
}
