
package abm.logica;

import abm.dominios.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ProductosAddTabla extends AbstractTableModel {
    
    private final String[] nombreColumnas = {"ID", "Producto", "Precio unitario", "Cantidad", "Sub-total"};
    private List<LineaVenta> lineasVenta = addProductos.getInstancia().obtenerLista();

    public double getTotalVenta(){
        double total = 0;
        for(LineaVenta v: lineasVenta){
            total += v.getSubtotal();
        }
        return total;
    }
    
    public LineaVenta obtenerLineaPorIdProducto(int id){
        return lineasVenta.get(id);
    }
    
    @Override
    public String getColumnName(int col){
        return nombreColumnas[col];
    }
    
    
    @Override
    public int getRowCount() {
        return lineasVenta.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineaVenta linea = lineasVenta.get(rowIndex);
        Producto prod = linea.getProducto();
        switch(columnIndex){
            case 0: return prod.getId();
            case 1: return prod.getDescripcion();
            case 2: return prod.getPrecio();
            case 3: return linea.getCantidad();
            case 4: return linea.getSubtotal();
            default: return null;
        }
    }
    
}
