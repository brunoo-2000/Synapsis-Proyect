
package abm.logica;
import abm.dominios.*;
import abm.logica.ABMProducto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProductosTablaModel extends AbstractTableModel {
    
    private final String[] nombreColumnas = {"ID", "Descripcion", "Proovedor", "Precio", "Stock"};
    private List<Producto> productos = ABMProducto.getInstancia().obtenerLista();
    
    
    public Producto obtenerProductoPorFila(int fila){
        return productos.get(fila);
    }
    
    @Override
    public String getColumnName(int col){
        return nombreColumnas[col];
    }
    
    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto = productos.get(rowIndex);
        switch(columnIndex){
            case 0: return producto.getId();
            case 1: return producto.getDescripcion();
            case 2:
                int idProveedor = producto.getIdProovedor();
                Proveedor prov = ABMProveedor.getInstancia().obtenerProveedorPorId(idProveedor);
                if (prov != null) {
                    return prov.getRazonSocial();
                } else {
                    return "Proveedor no disponible"; 
                }
            case 3: return producto.getPrecio();
            case 4: return producto.getStock();
            default: return null;
        }
    }
    
}
