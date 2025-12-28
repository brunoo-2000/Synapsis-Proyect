
package abm.logica;

import abm.dominios.Cliente;
import abm.dominios.Producto;
import abm.dominios.Usuario;
import abm.dominios.Venta;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class VentasTablaModel extends AbstractTableModel {
    
    private static String[] nombreColumnas = {"ID Venta","Fecha","Hora", "Cliente", "Vendedor", "Productos"};
    private List<Venta> ventas = ABMVenta.getInstancia().obtenerLista();
    
    public Venta obtenerVentaPorFila(int fila){
        return ventas.get(fila);
    }
    
    @Override
    public String getColumnName(int col){
        return nombreColumnas[col];
    }
    
    @Override
    public int getRowCount() {
        return ventas.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venta venta = ventas.get(rowIndex);
        Cliente cliente = ABMCliente.getInstancia().obtenerClientePorId(venta.getIdCliente());
        Usuario user = ABMUsuario.getInstancia().obtenerUsuarioPorId(venta.getIdVendedor());
        List<LineaVenta> linea = venta.getLineas();
        switch(columnIndex){
            case 0: return venta.getId();
            case 1: return venta.getFecha();
            case 2: return venta.getHora();
            case 3: return cliente.getNombre() + " " + cliente.getApellido();
            case 4: return user.getNombre() + " " + user.getApellido();
            case 5: 
                if(linea.isEmpty()){
                    return "Venta sin ítems";
                }
                String resumen = linea.stream().map(lv -> lv.getProducto().getDescripcion()).collect(java.util.stream.Collectors.joining(", "));
                return resumen;
                
            default: return null;
        }
    }
    
}
