
package abm.logica;

import java.util.List;

public interface ABMInterfaz<T> {
    public boolean validarId(int x);
    public void agregar(T x);
    public boolean eliminar(T x);
    public List<T> obtenerLista();
}
