
package abm.gui.productos;

import abm.dominios.Producto;
import abm.gui.FiltrosInput;
import javax.swing.JOptionPane;
import abm.logica.ABMProducto;
import abm.logica.ABMProveedor;
import abm.gui.*;

public class ProductoDatosInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProductoDatosInterfaz.class.getName());
    private Producto productoAEditar = null;
   
    public ProductoDatosInterfaz() {
        initComponents();
        FiltrosInput.aplicarFiltro(descripcionField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(precioField, FiltrosInput.Tipo.NUMEROS_FLOAT, 50);
        FiltrosInput.aplicarFiltro(stockField, FiltrosInput.Tipo.NUMEROS_FLOAT, 20);
        FiltrosInput.aplicarFiltro(proovedorIdField, FiltrosInput.Tipo.NUMEROS_FLOAT, 20);
    }
    
    public ProductoDatosInterfaz(Producto producto){
        initComponents();
        this.productoAEditar = producto;
        FiltrosInput.aplicarFiltro(descripcionField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(precioField, FiltrosInput.Tipo.NUMEROS_FLOAT, 50);
        FiltrosInput.aplicarFiltro(stockField, FiltrosInput.Tipo.NUMEROS_FLOAT, 20);
        FiltrosInput.aplicarFiltro(proovedorIdField, FiltrosInput.Tipo.NUMEROS_FLOAT, 20);
        descripcionField.setText(producto.getDescripcion());
        String precio = String.valueOf(producto.getPrecio());
        precioField.setText(precio);
        String stock = String.valueOf(producto.getStock());
        stockField.setText(stock);
        String proovedor = String.valueOf(producto.getIdProovedor());
        proovedorIdField.setText(proovedor);
        
        setTitle("Modificar producto");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        fondo2 = new javax.swing.JPanel();
        tituloTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aceptarBttn = new RoundedButton();
        cancelarBttn = new RoundedButton();
        descripcionField = new ModernTextField();
        precioField = new ModernTextField();
        stockField = new ModernTextField();
        proovedorIdField = new ModernTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(224, 224, 224));
        fondo.setForeground(new java.awt.Color(224, 224, 224));

        fondo2.setBackground(new java.awt.Color(38, 81, 89));
        fondo2.setForeground(new java.awt.Color(38, 81, 89));

        tituloTxt.setBackground(new java.awt.Color(255, 255, 255));
        tituloTxt.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 36)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setText("Datos Productos");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo.png"))); // NOI18N

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloTxt)
                .addGap(0, 167, Short.MAX_VALUE))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(fondo2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tituloTxt)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        aceptarBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        aceptarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lista-de-verificacion.png"))); // NOI18N
        aceptarBttn.setText("Aceptar");
        aceptarBttn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        aceptarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBttnActionPerformed(evt);
            }
        });

        cancelarBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        cancelarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-eliminar.png"))); // NOI18N
        cancelarBttn.setText("Cancelar");
        cancelarBttn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cancelarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBttnActionPerformed(evt);
            }
        });

        descripcionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel1.setText("Descripcion");

        jLabel2.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel2.setText("Precio");

        jLabel3.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel3.setText("Stock");

        jLabel4.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel4.setText("Proovedor (ID)");

        jPanel1.setBackground(new java.awt.Color(38, 81, 89));
        jPanel1.setForeground(new java.awt.Color(38, 81, 89));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(descripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(188, 188, 188)))
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(223, 223, 223))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(aceptarBttn)
                                    .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)))
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(proovedorIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarBttn))))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proovedorIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptarBttn)
                            .addComponent(cancelarBttn))
                        .addGap(60, 60, 60))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBttnActionPerformed
        String descripcion = descripcionField.getText();
        String precio = precioField.getText();
        String stock = stockField.getText();
        String proovedorId = proovedorIdField.getText();
        
        if(descripcion.isEmpty() || precio.isEmpty() || stock.isEmpty() || proovedorId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Uno o más campos estan vacios!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double p = Double.parseDouble(precio);
        
        if(p < 0){
            JOptionPane.showMessageDialog(this, "El precio no puede ser menor a 0!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int idProv = Integer.parseInt(proovedorId);
        
        if(!ABMProveedor.getInstancia().validarId(idProv)){
            JOptionPane.showMessageDialog(this, "No se encontro proovedor con ese ID!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        int stockInt = 0;
        try{
            stockInt = Integer.parseInt(stock);
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El stock no puede ser decimal!", "ERROR EN DECIMAL!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(stockInt < 0){
            JOptionPane.showMessageDialog(this, "El stock no puede ser menor a 0!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(this.productoAEditar == null){
            Producto producto = new Producto();
            producto.setDescripcion(descripcion);
            producto.setIdProovedor(idProv);
            producto.setPrecio(p);
            producto.setStock(stockInt);
            ABMProducto.getInstancia().agregar(producto);
            JOptionPane.showMessageDialog(this, "Producto cargado con exito!");
        }else{
            this.productoAEditar.setDescripcion(descripcion);
            this.productoAEditar.setIdProovedor(idProv);
            this.productoAEditar.setPrecio(p);
            this.productoAEditar.setStock(stockInt);
            JOptionPane.showMessageDialog(this, "Producto modificado con exito!");
        }
        
        dispose();
        
        
    }//GEN-LAST:event_aceptarBttnActionPerformed

    private void cancelarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBttnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBttnActionPerformed

    private void descripcionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionFieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBttn;
    private javax.swing.JButton cancelarBttn;
    private javax.swing.JTextField descripcionField;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField precioField;
    private javax.swing.JTextField proovedorIdField;
    private javax.swing.JTextField stockField;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables
}
