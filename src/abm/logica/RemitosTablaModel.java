
package abm.logica;

import abm.dominios.Cliente;
import abm.dominios.Remito;
import abm.dominios.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class RemitosTablaModel extends AbstractTableModel {
    private String[] nombreColumnas = {"ID Remito", "ID Venta", "Fecha", "Hora", "Cliente", "Vendedor"};
    private List<Remito> remitos = ABMRemito.getInstancia().obtenerLista();
   
    
    public Remito obtenerRemitoPorFila(int x){
        return remitos.get(x);
    }
    
    @Override
    public String getColumnName(int col){
        return nombreColumnas[col];
    }
    
    @Override
    public int getRowCount() {
        return remitos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Remito remito = remitos.get(rowIndex);
        Cliente cliente = ABMCliente.getInstancia().obtenerClientePorId(remito.getIdCliente());
        Usuario vendedor = ABMUsuario.getInstancia().obtenerUsuarioPorId(remito.getIdVendedor());
        switch(columnIndex){
            case 0: return "#" + remito.getId();
            case 1: return remito.getIdVenta();
            case 2: return remito.getFecha();
            case 3: return remito.getHora();
            case 4: return cliente.getNombre() + cliente.getApellido();
            case 5: return vendedor.getNombre();
            default: return null;
        }
    }
    
}
