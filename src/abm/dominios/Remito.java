
package abm.dominios;

import java.time.LocalDate;
import java.time.LocalTime;


public class Remito {
    private int id;
    private static int idContador = 2500;
    private int idVenta;
    private LocalDate fecha;
    private LocalTime hora;
    private int idCliente;
    private int idVendedor;
    
    public Remito(){
        this.id = idContador++;
    }

    public int getId() {
        return id;
    }

    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    
    
}
