
package abm.dominios;



public class Usuario {
    private static int idContador = 1;
    private int id;
    private String username;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private Rol rol;

    public enum Rol{
       ADMIN, EMPLEADO
    }
    
    public Usuario() {
        this.id = idContador++;
        if(this.apellido == null){
            this.apellido = "";
        }
    }

    public int getId() {
        return id;
    }

    
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    
    
    
}
