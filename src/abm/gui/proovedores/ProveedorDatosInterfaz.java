
package abm.gui.proovedores;

import abm.dominios.Proveedor;
import abm.gui.FiltrosInput;
import abm.logica.ABMProveedor;
import javax.swing.JOptionPane;
import abm.gui.*;


public class ProveedorDatosInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProveedorDatosInterfaz.class.getName());
    private Proveedor proveedorAEditar = null;
    
    public ProveedorDatosInterfaz() {
        initComponents();
        FiltrosInput.aplicarFiltro(razonSocialField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(cuitField, FiltrosInput.Tipo.NUMEROS_FLOAT, 11);
        FiltrosInput.aplicarFiltro(telefonoField, FiltrosInput.Tipo.NUMEROS_FLOAT, 50);
        FiltrosInput.aplicarFiltro(emailField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(direccionField, FiltrosInput.Tipo.TODO, 60);
        FiltrosInput.aplicarFiltro(numDireccionField, FiltrosInput.Tipo.NUMEROS_FLOAT, 20);
        FiltrosInput.aplicarFiltro(rubroField, FiltrosInput.Tipo.TODO, 50);
    }
    
    public ProveedorDatosInterfaz(Proveedor proveedor){
        initComponents();
        this.proveedorAEditar = proveedor;
        FiltrosInput.aplicarFiltro(razonSocialField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(cuitField, FiltrosInput.Tipo.NUMEROS_FLOAT, 11);
        FiltrosInput.aplicarFiltro(telefonoField, FiltrosInput.Tipo.NUMEROS_FLOAT, 50);
        FiltrosInput.aplicarFiltro(emailField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(direccionField, FiltrosInput.Tipo.TODO, 60);
        FiltrosInput.aplicarFiltro(numDireccionField, FiltrosInput.Tipo.NUMEROS_FLOAT, 20);
        FiltrosInput.aplicarFiltro(rubroField, FiltrosInput.Tipo.TODO, 50);
        razonSocialField.setText(proveedor.getRazonSocial());
        cuitField.setText(proveedor.getCuit());
        telefonoField.setText(proveedor.getTelefono());
        emailField.setText(proveedor.getEmail());
        direccionField.setText(proveedor.getDireccion());
        numDireccionField.setText(proveedor.getDireccionNum());
        rubroField.setText(proveedor.getRubro());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        fondo2 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        tituloTxt = new javax.swing.JLabel();
        razonSocialLabel = new javax.swing.JLabel();
        cuitLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        rubroLabel = new javax.swing.JLabel();
        numeroLabel = new javax.swing.JLabel();
        razonSocialField = new ModernTextField();
        cuitField = new ModernTextField();
        telefonoField = new ModernTextField();
        emailField = new ModernTextField();
        direccionField = new ModernTextField();
        numDireccionField = new ModernTextField();
        rubroField = new ModernTextField();
        aceptarBttn = new RoundedButton();
        cancelarBttn = new RoundedButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(224, 224, 224));
        fondo.setForeground(new java.awt.Color(224, 224, 224));

        fondo2.setBackground(new java.awt.Color(38, 81, 89));
        fondo2.setForeground(new java.awt.Color(38, 81, 89));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo (2).png"))); // NOI18N

        tituloTxt.setBackground(new java.awt.Color(255, 255, 255));
        tituloTxt.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 36)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setText("Datos del proovedor");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloTxt)
                .addContainerGap(401, Short.MAX_VALUE))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondo2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tituloTxt)))
                .addContainerGap())
        );

        razonSocialLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        razonSocialLabel.setText("Razon social");

        cuitLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        cuitLabel.setText("CUIT");

        telefonoLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        telefonoLabel.setText("Telefono");

        emailLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        emailLabel.setText("Email");

        direccionLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        direccionLabel.setText("Direccion");

        rubroLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        rubroLabel.setText("Rubro");

        numeroLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        numeroLabel.setText("Número");

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

        jPanel1.setBackground(new java.awt.Color(38, 81, 89));
        jPanel1.setForeground(new java.awt.Color(38, 81, 89));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
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
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(aceptarBttn)
                        .addGap(112, 112, 112)
                        .addComponent(cancelarBttn))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(razonSocialField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(razonSocialLabel))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cuitField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuitLabel))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonoLabel)
                                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccionLabel))
                                .addGap(12, 12, 12)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroLabel)
                                    .addComponent(numDireccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rubroLabel)
                                    .addComponent(rubroField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(razonSocialLabel)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cuitLabel)
                                    .addComponent(telefonoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(razonSocialField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(direccionLabel)
                            .addComponent(numeroLabel)
                            .addComponent(rubroLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numDireccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rubroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptarBttn)
                            .addComponent(cancelarBttn))
                        .addContainerGap(44, Short.MAX_VALUE))))
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

    private void cancelarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBttnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBttnActionPerformed

    private void aceptarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBttnActionPerformed
        String razonSocial = razonSocialField.getText();
        String cuit = cuitField.getText();
        String telefono = telefonoField.getText();
        String email = emailField.getText();
        String direccion = direccionField.getText();
        String direccionNum = numDireccionField.getText();
        String rubro = rubroField.getText();
        
        if(razonSocial.isEmpty() || cuit.isEmpty() || telefono.isEmpty() || email.isEmpty() || direccion.isEmpty() || direccionNum.isEmpty() || rubro.isEmpty()){
            JOptionPane.showMessageDialog(this, "Uno o más campos estan vacios!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(cuit.length() < 11){
            JOptionPane.showMessageDialog(this, "El cuit no puede contener menos de 11 caracteres!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!FiltrosInput.validarEmail(email)){
            JOptionPane.showMessageDialog(this, "El correo no posee un formato correcto!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(this.proveedorAEditar == null){
            Proveedor proveedor = new Proveedor();
            proveedor.setCuit(cuit);
            proveedor.setDireccion(direccion);
            proveedor.setDireccionNum(direccionNum);
            proveedor.setEmail(email);
            proveedor.setRazonSocial(razonSocial);
            proveedor.setRubro(rubro);
            proveedor.setTelefono(telefono);
            ABMProveedor.getInstancia().agregar(proveedor);
            JOptionPane.showMessageDialog(this, "Proovedor cargado con exito!");
        }
        else{
            this.proveedorAEditar.setCuit(cuit);
            this.proveedorAEditar.setDireccion(direccion);
            this.proveedorAEditar.setDireccionNum(direccionNum);
            this.proveedorAEditar.setEmail(email);
            this.proveedorAEditar.setRazonSocial(razonSocial);
            this.proveedorAEditar.setRubro(rubro);
            this.proveedorAEditar.setTelefono(telefono);
            JOptionPane.showMessageDialog(this, "Proveedor modificado con exito!"); 
        }
        
        dispose();
        
    }//GEN-LAST:event_aceptarBttnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBttn;
    private javax.swing.JButton cancelarBttn;
    private javax.swing.JTextField cuitField;
    private javax.swing.JLabel cuitLabel;
    private javax.swing.JTextField direccionField;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondo2;
    private javax.swing.JLabel icono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numDireccionField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField razonSocialField;
    private javax.swing.JLabel razonSocialLabel;
    private javax.swing.JTextField rubroField;
    private javax.swing.JLabel rubroLabel;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables
}
