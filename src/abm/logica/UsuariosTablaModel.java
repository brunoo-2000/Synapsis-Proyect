
package abm.logica;

import abm.dominios.Usuario;
import abm.logica.ABMUsuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class UsuariosTablaModel extends AbstractTableModel {
    
    private String[] nombreColumnas = {"ID", "Usuario", "Contraseña", "Nombre", "Rol"};
    private List<Usuario> usuarios = ABMUsuario.getInstancia().obtenerLista();
    
    public Usuario obtenerUsuarioPorFila(int fila){
        return usuarios.get(fila);
    }
    
    @Override
    public String getColumnName(int col){
        return nombreColumnas[col];
    }
    
    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch(columnIndex){
            case 0: return usuario.getId();
            case 1: return usuario.getUsername();
            case 2: return usuario.getContrasenia();
            case 3: return usuario.getNombre() + " " + usuario.getApellido();
            case 4: return usuario.getRol();
            default: return null;
        }
    }
    
}
