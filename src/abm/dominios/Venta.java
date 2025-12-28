
package abm.dominios;
import abm.logica.LineaVenta;
import java.time.*;
import java.util.*;


public class Venta {
    private static int idContador = 100;
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private int idCliente;
    private int idVendedor;
    private double total;
    private List<LineaVenta> lineas; 

    public Venta() {
        this.id = idContador++;
    }
    
    public int getId() {
        return id;
    }

    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setMomento(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<LineaVenta> getLineas() {
        return this.lineas;
    }

    public void setLineas(List<LineaVenta> lineas) {
        this.lineas = lineas;
    }


    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    
    
    
    
}
