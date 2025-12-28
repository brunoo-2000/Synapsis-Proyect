
package abm.logica;

import abm.dominios.Cliente;
import abm.dominios.Remito;
import abm.dominios.Venta;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;


public class GeneradorRemitos {
    
    public GeneradorRemitos(){
       
    }
    
    
    public static void generarRemitoPDF(Remito remito, Cliente cliente, Venta venta){
        Document documento = new Document();
        try{
            String nombreArchivo = "Remito_Venta_" + remito.getId()+ ".pdf";
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();
            
            documento.add(new Paragraph("REMITO - SYNAPSIS"));
            documento.add(new Paragraph ("Fecha: " + remito.getFecha()));
            documento.add(new Paragraph ("Cliente: " + cliente.getNombre() + " " + cliente.getApellido()));
            documento.add(new Paragraph("--------------------------------------------------"));
            documento.add(new Paragraph(" "));
            
            PdfPTable table = new PdfPTable(3);
            table.addCell("Producto");
            table.addCell("Cant.");
            table.addCell("Precio unit. ");
            
            for(LineaVenta lv: venta.getLineas()){
                table.addCell(lv.getProducto().getDescripcion());
                String cantidad = String.valueOf(lv.getCantidad());
                table.addCell(cantidad);
                String precioUnit = String.valueOf(lv.getProducto().getPrecio());
                table.addCell(precioUnit);
            }
             
            documento.add(table);
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("TOTAL (SIN IVA): $" + venta.getTotal()));
            documento.add(new Paragraph("TOTAL (CON IVA): $" + (venta.getTotal() * 1.21)));
            
            documento.close();
            
            java.awt.Desktop.getDesktop().open(new java.io.File(nombreArchivo));
        }catch(Exception e){
            System.out.println("Error al generar PDF: " + e.getMessage());
        }
    }
}
