
package abm.dominios;


public class Cliente {
    private static int contadorId = 1;
    int id;
    private String nombre;
    private String apellido;
    private String cuit;
    private String email;
    private String telefono;
    private String direccion;
    private String direccionNum;

    public Cliente() {
        this.id = contadorId++;
    }

    public Cliente(String nombre, String apellido, String cuit, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
    
    public int getId() {
        return id;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionNum() {
        return direccionNum;
    }

    public void setDireccionNum(String direccionNum) {
        this.direccionNum = direccionNum;
    }
    
    
    
}
