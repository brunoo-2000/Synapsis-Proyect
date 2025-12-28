
package abm.dominios;


public class Proveedor {
    private static int idContador = 1;
    private int id;
    private String razonSocial;
    private String cuit;
    private String telefono;
    private String email;
    private String direccion;
    private String direccionNum;
    private String rubro;

    public Proveedor() {
        this.id = idContador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getDireccionNum() {
        return direccionNum;
    }

    public void setDireccionNum(String direccionNum) {
        this.direccionNum = direccionNum;
    }
    
    
    
    
}
