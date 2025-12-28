
package abm.gui.usuarios;
import abm.dominios.Usuario;
import abm.dominios.Usuario.Rol;
import abm.gui.*;
import abm.logica.ABMUsuario;
import javax.swing.JOptionPane;

public class UsuarioDatosInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UsuarioDatosInterfaz.class.getName());
    private Usuario usuarioAEditar = null;
    
    public UsuarioDatosInterfaz() {
        initComponents();
        FiltrosInput.aplicarFiltro(nombreField, FiltrosInput.Tipo.LETRAS, 30);
        FiltrosInput.aplicarFiltro(apellidoField, FiltrosInput.Tipo.LETRAS, 20);
        FiltrosInput.aplicarFiltro(passwordField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(usernameField, FiltrosInput.Tipo.TODO, 10);
        FiltrosInput.aplicarFiltro(repetirPasswordField, FiltrosInput.Tipo.TODO, 50);
    }

    public UsuarioDatosInterfaz(Usuario usuario){
        initComponents();
        this.usuarioAEditar = usuario;
        FiltrosInput.aplicarFiltro(nombreField, FiltrosInput.Tipo.LETRAS, 30);
        FiltrosInput.aplicarFiltro(apellidoField, FiltrosInput.Tipo.LETRAS, 20);
        FiltrosInput.aplicarFiltro(passwordField, FiltrosInput.Tipo.TODO, 50);
        FiltrosInput.aplicarFiltro(usernameField, FiltrosInput.Tipo.TODO, 10);
        FiltrosInput.aplicarFiltro(repetirPasswordField, FiltrosInput.Tipo.TODO, 50);
        nombreField.setText(usuario.getNombre());
        apellidoField.setText(usuario.getApellido());
        passwordField.setText(usuario.getContrasenia());
        usernameField.setText(usuario.getUsername());
        repetirPasswordField.setText(usuario.getContrasenia());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        nombreField = new ModernTextField();
        apellidoField = new ModernTextField();
        usernameField = new ModernTextField();
        rolBox = new javax.swing.JComboBox<>();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        psswdLabel = new javax.swing.JLabel();
        psswd2Label = new javax.swing.JLabel();
        rolLabel = new javax.swing.JLabel();
        aceptarBttn = new RoundedButton();
        cancelarBttn = new RoundedButton();
        passwordField = new ModernPasswordField();
        repetirPasswordField = new ModernPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(224, 224, 224));
        fondo.setForeground(new java.awt.Color(224, 224, 224));

        panel1.setBackground(new java.awt.Color(38, 81, 89));
        panel1.setForeground(new java.awt.Color(38, 81, 89));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo.png"))); // NOI18N

        txt.setBackground(new java.awt.Color(255, 255, 255));
        txt.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 36)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setText("Datos del usuario");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt)
                .addGap(26, 26, 26))
        );

        panel2.setBackground(new java.awt.Color(38, 81, 89));
        panel2.setForeground(new java.awt.Color(38, 81, 89));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        rolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "EMPLEADO" }));
        rolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolBoxActionPerformed(evt);
            }
        });

        nombreLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        nombreLabel.setText("Nombre");

        apellidoLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        apellidoLabel.setText("Apellido");

        usernameLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        usernameLabel.setText("Username");

        psswdLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        psswdLabel.setText("Contraseña");

        psswd2Label.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        psswd2Label.setText("Repite contraseña");

        rolLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        rolLabel.setText("Rol");

        aceptarBttn.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        aceptarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lista-de-verificacion.png"))); // NOI18N
        aceptarBttn.setText("Aceptar");
        aceptarBttn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        aceptarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBttnActionPerformed(evt);
            }
        });

        cancelarBttn.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        cancelarBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-eliminar.png"))); // NOI18N
        cancelarBttn.setText("Cancelar");
        cancelarBttn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cancelarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBttnActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Inter 18pt", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("La contraseña debe tener al menos 8 caracteras, un numero, una mayuscula y caracter especial (ej: #%!)");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(aceptarBttn)
                        .addGap(109, 109, 109)
                        .addComponent(cancelarBttn))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(repetirPasswordField)
                                .addGap(101, 101, 101)
                                .addComponent(rolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(296, 296, 296))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(psswdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rolLabel)
                                .addGap(373, 373, 373))
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(fondoLayout.createSequentialGroup()
                                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombreLabel))
                                        .addGap(101, 101, 101)
                                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(apellidoLabel))
                                        .addGap(109, 109, 109)
                                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usernameLabel)
                                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(psswd2Label)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(120, 120, 120))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLabel)
                            .addComponent(apellidoLabel)
                            .addComponent(usernameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psswdLabel)
                            .addComponent(rolLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repetirPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(psswd2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aceptarBttn)
                            .addComponent(cancelarBttn))
                        .addContainerGap(57, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
       
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void aceptarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBttnActionPerformed
       String nombre = nombreField.getText();
       String username = usernameField.getText();
       String apellido = apellidoField.getText();
       char[] p = passwordField.getPassword();
       String password1 = String.valueOf(p);
       char[] p2 = repetirPasswordField.getPassword();
       String password2 = String.valueOf(p2);
       Rol rol = null;
       Object r = rolBox.getSelectedItem();
       String r2 = String.valueOf(r);
       if(r2.equals("ADMIN")){
           rol = rol.ADMIN;
       }else{
           rol = rol.EMPLEADO;
       }
       
       
       if(ABMUsuario.getInstancia().validarUsername(username)){
            JOptionPane.showMessageDialog(this, "El username no puede contener espacios!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
       }
       
       if(nombre.isEmpty() || apellido.isEmpty() || password1.isEmpty() || password2.isEmpty() || username.isEmpty()){
           JOptionPane.showMessageDialog(this, "Uno o más campos estan vacios!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
           return;
       }
       
       if(!password1.equals(password2)){
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
       }
       
       
       if(!ABMUsuario.getInstancia().validarContrasenia(password1)){
           JOptionPane.showMessageDialog(this, "Contraseña insegura!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
           return;
       }
       
       if(this.usuarioAEditar == null){
           Usuario usuario = new Usuario();
           usuario.setNombre(nombre);
           usuario.setUsername(username);
           usuario.setApellido(apellido);
           usuario.setContrasenia(password1);
           usuario.setRol(rol);  
           ABMUsuario.getInstancia().agregar(usuario);
           JOptionPane.showMessageDialog(this, "Usuario cargado con exito!");
           this.dispose();
       }else{
           this.usuarioAEditar.setNombre(nombre);
           this.usuarioAEditar.setApellido(apellido);
           this.usuarioAEditar.setContrasenia(password1);
           this.usuarioAEditar.setUsername(username);
           this.usuarioAEditar.setRol(rol);
           JOptionPane.showMessageDialog(this, "Usuario modificado con exito!");
           this.dispose();
       }
       
    }//GEN-LAST:event_aceptarBttnActionPerformed

    private void rolBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolBoxActionPerformed

    private void cancelarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarBttnActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBttn;
    private javax.swing.JTextField apellidoField;
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JButton cancelarBttn;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel psswd2Label;
    private javax.swing.JLabel psswdLabel;
    private javax.swing.JPasswordField repetirPasswordField;
    private javax.swing.JComboBox<String> rolBox;
    private javax.swing.JLabel rolLabel;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
