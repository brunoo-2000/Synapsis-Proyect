
package abm.gui.clientes;
import abm.dominios.Cliente;
import abm.gui.*;
import abm.logica.ABMCliente;
import javax.swing.JOptionPane;


public class ClienteAltaInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteAltaInterfaz.class.getName());
    private Cliente clienteAEditar = null;
    
    public ClienteAltaInterfaz() {
        initComponents();
        FiltrosInput.aplicarFiltro(nombreField, FiltrosInput.Tipo.LETRAS, 20);
        FiltrosInput.aplicarFiltro(apellidoField, FiltrosInput.Tipo.LETRAS, 25);
        FiltrosInput.aplicarFiltro(cuitField, FiltrosInput.Tipo.NUMEROS_FLOAT, 11);
        FiltrosInput.aplicarFiltro(direccionField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(direccionField2, FiltrosInput.Tipo.NUMEROS_FLOAT, 10);
        FiltrosInput.aplicarFiltro(telefonoField, FiltrosInput.Tipo.NUMEROS_FLOAT, 30);
        FiltrosInput.aplicarFiltro(emailField, FiltrosInput.Tipo.TODO, 70);
    }
    
    public ClienteAltaInterfaz(Cliente cliente) {
        initComponents(); 
        this.clienteAEditar = cliente; 
        FiltrosInput.aplicarFiltro(nombreField, FiltrosInput.Tipo.LETRAS, 20);
        FiltrosInput.aplicarFiltro(apellidoField, FiltrosInput.Tipo.LETRAS, 25);
        FiltrosInput.aplicarFiltro(cuitField, FiltrosInput.Tipo.NUMEROS_FLOAT, 11);
        FiltrosInput.aplicarFiltro(direccionField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(direccionField2, FiltrosInput.Tipo.NUMEROS_FLOAT, 10);
        FiltrosInput.aplicarFiltro(telefonoField, FiltrosInput.Tipo.NUMEROS_FLOAT, 30);
        FiltrosInput.aplicarFiltro(emailField, FiltrosInput.Tipo.TODO, 70);
        nombreField.setText(cliente.getNombre());
        apellidoField.setText(cliente.getApellido());
        cuitField.setText(String.valueOf(cliente.getCuit()));
        emailField.setText(cliente.getEmail());
        telefonoField.setText(String.valueOf(cliente.getTelefono()));
        direccionField.setText(cliente.getDireccion());
        direccionField2.setText(cliente.getDireccionNum());

        setTitle("Modificar Cliente"); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        fondo = new javax.swing.JPanel();
        fondo1 = new javax.swing.JPanel();
        nombreField = new ModernTextField();
        emailField = new ModernTextField();
        nombreLabel = new javax.swing.JLabel();
        cuitLabel = new javax.swing.JLabel();
        direccionField = new ModernTextField();
        apellidoField = new ModernTextField();
        apellidoLabel = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        cuitField = new ModernTextField();
        telefonoField = new ModernTextField();
        emailLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        aceptarBttn = new RoundedButton();
        cancelarBttn = new RoundedButton();
        jPanel1 = new javax.swing.JPanel();
        cargaClienteField = new javax.swing.JLabel();
        synapsisLogo = new javax.swing.JLabel();
        direccionField2 = new ModernTextField();
        direccionLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jTextField7.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(230, 231, 232));
        fondo.setForeground(new java.awt.Color(230, 231, 232));

        fondo1.setBackground(new java.awt.Color(224, 224, 224));
        fondo1.setForeground(new java.awt.Color(224, 224, 224));

        nombreField.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreFieldKeyTyped(evt);
            }
        });

        emailField.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N

        nombreLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        nombreLabel.setText("Nombre");

        cuitLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        cuitLabel.setText("CUIT");

        direccionField.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N

        apellidoField.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N

        apellidoLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        apellidoLabel.setText("Apellido");

        direccionLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        direccionLabel.setText("Direccion");

        cuitField.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        cuitField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuitFieldKeyTyped(evt);
            }
        });

        telefonoField.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        emailLabel.setText("Email");

        telefonoLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        telefonoLabel.setText("Telefono");

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

        cargaClienteField.setBackground(new java.awt.Color(255, 255, 255));
        cargaClienteField.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 36)); // NOI18N
        cargaClienteField.setForeground(new java.awt.Color(255, 255, 255));
        cargaClienteField.setText("Datos del Cliente");

        synapsisLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        synapsisLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(synapsisLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cargaClienteField)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cargaClienteField)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(synapsisLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        direccionField2.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N

        direccionLabel1.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        direccionLabel1.setText("Número");

        jPanel2.setBackground(new java.awt.Color(38, 81, 89));
        jPanel2.setForeground(new java.awt.Color(38, 81, 89));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoLabel)
                    .addComponent(aceptarBttn)
                    .addComponent(apellidoLabel))
                .addGap(18, 18, 18)
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuitField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuitLabel)
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionLabel))
                        .addGap(18, 18, 18)
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionLabel1)
                            .addComponent(direccionField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cancelarBttn))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLabel)
                            .addComponent(apellidoLabel)
                            .addComponent(cuitLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoLabel)
                            .addComponent(direccionLabel)
                            .addComponent(direccionLabel1)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptarBttn)
                            .addComponent(cancelarBttn))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void nombreFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyTyped
        
    }//GEN-LAST:event_nombreFieldKeyTyped

    private void cuitFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuitFieldKeyTyped
        
    }//GEN-LAST:event_cuitFieldKeyTyped

    private void aceptarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBttnActionPerformed
       
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String cuit = cuitField.getText();
        String direccionNum = direccionField2.getText();
        String direccion = direccionField.getText();
        String email = emailField.getText();
        String telefono = telefonoField.getText();
        
        if(nombre.isEmpty() || apellido.isEmpty() || cuit.isEmpty() || direccion.isEmpty() || email.isEmpty() || telefono.isEmpty()){
            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(cuit.length() < 11){
            JOptionPane.showMessageDialog(this, "El cuit no debe tener menos de 11 numeros", "ERROR!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!FiltrosInput.validarEmail(email)){
            JOptionPane.showMessageDialog(this, "El correo introducido no es valido o esta mal escrito", "ERROR EN CORREO!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!ABMCliente.getInstancia().validarDuplicacion(cuit)){
            JOptionPane.showMessageDialog(this, "El CUIT ya existe!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        if(this.clienteAEditar == null){
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCuit(cuit);
            cliente.setDireccion(direccion);
            cliente.setDireccionNum(direccionNum);
            cliente.setEmail(email);
            cliente.setTelefono(telefono);
            ABMCliente.getInstancia().agregar(cliente);
            JOptionPane.showMessageDialog(this, "Cliente cargado con exito!");
        }
        else{
            this.clienteAEditar.setNombre(nombre);
            this.clienteAEditar.setApellido(apellido);
            this.clienteAEditar.setCuit(cuit);
            this.clienteAEditar.setDireccion(direccion);
            this.clienteAEditar.setDireccionNum(direccionNum);
            this.clienteAEditar.setEmail(email);
            this.clienteAEditar.setTelefono(telefono);
            JOptionPane.showMessageDialog(this, "Cliente modificado con exito!");
        }
        
        this.dispose();
        
    }//GEN-LAST:event_aceptarBttnActionPerformed

    private void cancelarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarBttnActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBttn;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JButton cancelarBttn;
    private javax.swing.JLabel cargaClienteField;
    private javax.swing.JTextField cuitField;
    private javax.swing.JLabel cuitLabel;
    private javax.swing.JTextField direccionField;
    private javax.swing.JTextField direccionField2;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JLabel direccionLabel1;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel synapsisLogo;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}
