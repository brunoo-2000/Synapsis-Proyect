
package abm.logica;
import java.util.*;
import abm.dominios.*;

public class ABMUsuario implements ABMInterfaz<Usuario> {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static ABMUsuario instancia;

    public ABMUsuario() {
        adminPrueba();
    }
    
    public boolean validarUsername(String username){
        boolean tieneEspacio = false;
        
        
        for(int i = 0; i < username.length(); i++){
            char c = username.charAt(i);
            if(Character.isSpaceChar(c)){
                tieneEspacio = true;
            }
        }
        
        return tieneEspacio;
    }
    
    public Usuario obtenerUsuarioPorId(int id){
        for(Usuario u: usuarios){
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }
    
    
    public boolean validarContrasenia(String psswd){
        if(psswd.length() < 8){
            return false;
        }
        
        boolean tieneNumero = false;
        boolean tieneCaracter = false;
        boolean tieneMayuscula = false;
        
        String especiales = "!@#$%^&*()_+-=[]{};':\"|,.<>/?";
        
        for(int i = 0; i < psswd.length(); i++){
            char c = psswd.charAt(i);
            if(Character.isDigit(c)){
                tieneNumero = true;
            }
            else if(especiales.indexOf(c) != -1){
                tieneCaracter = true;
            }else if(Character.isUpperCase(c)){
                tieneMayuscula = true;
            }
            
            if (tieneNumero && tieneCaracter && tieneMayuscula) {
            return true;
            }
        }
        return tieneNumero && tieneCaracter && tieneMayuscula;
    }
    
    public Usuario obtenerUsuario(String username){
        for(Usuario u: usuarios){
            if(u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }
    
    
    private static void adminPrueba(){
        Usuario usuario = new Usuario();
        usuario.setUsername("admin");
        usuario.setContrasenia("admin");
        usuario.setNombre("Administrador");
        usuario.setRol(Usuario.Rol.ADMIN);
        usuarios.add(usuario);
    }
    
    public static ABMUsuario getInstancia(){
        if (instancia == null){
            instancia = new ABMUsuario();
        }
        return instancia;
    }
    
    public boolean validarUsuario(String name, String password){
        for(Usuario u: usuarios){
            if(u.getUsername().equals(name) && u.getContrasenia().equals(password)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean validarId(int id) {
        for(Usuario u: usuarios){
            if(u.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void agregar(Usuario u) {
        usuarios.add(u);
    }


    @Override
    public boolean eliminar(Usuario u) {
        if(!validarId(u.getId())) return false;
        return usuarios.removeIf(x -> x.getId() == u.getId());
        
    }

    @Override
    public List<Usuario> obtenerLista() {
        return usuarios;
    }
    
    public void cambiarContra(Usuario user, String contraseña){
        user.setContrasenia(contraseña);
    }
    
}
