
package abm.gui;

import abm.dominios.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.Timer;
import abm.gui.clientes.*;
import abm.gui.configuracion.ConfiguracionInterfaz;
import abm.gui.productos.ProductoInterfaz;
import javax.swing.JFrame;
import abm.gui.proovedores.*;
import abm.gui.usuarios.*;
import abm.gui.ventas.VentasInterfaz;
import abm.logica.ABMUsuario;
import javax.swing.JOptionPane;

public class InterfazGeneral extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazGeneral.class.getName());
    String username;
    Usuario user;
    
    public InterfazGeneral() {
        initComponents();
        iniciarReloj(horaLabel);
        username = LoginInterfaz.getUsername();
        user = ABMUsuario.getInstancia().obtenerUsuario(username);
        usernameTxt.setText("Bienvenido" + "," + " " + user.getNombre() + " " + user.getApellido() + "!");
    }

    public void iniciarReloj(JLabel label){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        ActionListener tareaActualizar = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fechaYHora = LocalDateTime.now().format(formatter);
            label.setText(fechaYHora);
            }
        };     
        Timer timer = new Timer(1000, tareaActualizar);
        timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        horaLabel = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JLabel();
        rotacionBttn = new RoundedButton();
        exitBttn = new RoundedButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clienteBttn = new abm.gui.RoundedButton();
        proveedorBttn = new abm.gui.RoundedButton();
        productoBttn = new abm.gui.RoundedButton();
        ventaBttn = new abm.gui.RoundedButton();
        userBttn = new abm.gui.RoundedButton();
        configuracionBttn = new abm.gui.RoundedButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.setForeground(new java.awt.Color(224, 224, 224));

        jPanel3.setBackground(new java.awt.Color(51, 108, 115));
        jPanel3.setPreferredSize(new java.awt.Dimension(620, 200));

        horaLabel.setBackground(new java.awt.Color(153, 255, 255));
        horaLabel.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 14)); // NOI18N
        horaLabel.setForeground(new java.awt.Color(153, 255, 255));

        usernameTxt.setBackground(new java.awt.Color(255, 255, 255));
        usernameTxt.setFont(new java.awt.Font("Inter 18pt", 0, 14)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(255, 255, 255));

        rotacionBttn.setBackground(new java.awt.Color(46, 72, 75));
        rotacionBttn.setForeground(new java.awt.Color(46, 72, 75));
        rotacionBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotacion-de-personal.png"))); // NOI18N
        rotacionBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotacionBttnActionPerformed(evt);
            }
        });

        exitBttn.setBackground(new java.awt.Color(46, 72, 75));
        exitBttn.setForeground(new java.awt.Color(46, 72, 75));
        exitBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-sesion.png"))); // NOI18N
        exitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotacionBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(horaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(rotacionBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(38, 81, 89));
        jPanel4.setForeground(new java.awt.Color(38, 81, 89));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        clienteBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/segmento-de-clientes.png"))); // NOI18N
        clienteBttn.setText("Clientes");
        clienteBttn.setBorderPainted(false);
        clienteBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 13)); // NOI18N
        clienteBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clienteBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clienteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBttnActionPerformed(evt);
            }
        });

        proveedorBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor.png"))); // NOI18N
        proveedorBttn.setText("Proveedores");
        proveedorBttn.setBorderPainted(false);
        proveedorBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 13)); // NOI18N
        proveedorBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proveedorBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        proveedorBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorBttnActionPerformed(evt);
            }
        });

        productoBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar-producto.png"))); // NOI18N
        productoBttn.setText("Productos");
        productoBttn.setBorderPainted(false);
        productoBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 13)); // NOI18N
        productoBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productoBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productoBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoBttnActionPerformed(evt);
            }
        });

        ventaBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas.png"))); // NOI18N
        ventaBttn.setText("Ventas");
        ventaBttn.setBorderPainted(false);
        ventaBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 13)); // NOI18N
        ventaBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventaBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventaBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaBttnActionPerformed(evt);
            }
        });

        userBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar-usuario.png"))); // NOI18N
        userBttn.setText("Usuarios");
        userBttn.setBorderPainted(false);
        userBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 13)); // NOI18N
        userBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        userBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBttnActionPerformed(evt);
            }
        });

        configuracionBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sistema-de-seguridad.png"))); // NOI18N
        configuracionBttn.setText("Cambiar Contraseña");
        configuracionBttn.setBorderPainted(false);
        configuracionBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 10)); // NOI18N
        configuracionBttn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        configuracionBttn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        configuracionBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clienteBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(ventaBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proveedorBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productoBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(configuracionBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clienteBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(productoBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proveedorBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ventaBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(configuracionBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionarClientesBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarClientesBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarClientesBttnActionPerformed

    private void gestionarProductosBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarProductosBttnActionPerformed
 
    }//GEN-LAST:event_gestionarProductosBttnActionPerformed

    private void gestionarProveedoresBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarProveedoresBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarProveedoresBttnActionPerformed

    private void gestionarVentasBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarVentasBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarVentasBttnActionPerformed

    private void gestionarUsuariosBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarUsuariosBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionarUsuariosBttnActionPerformed

    private void configuracionBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionBttnActionPerformed
        String contra = JOptionPane.showInputDialog(this, "Inserte la contraseña actual");
        if(!user.getContrasenia().equals(contra)){
            JOptionPane.showMessageDialog(this, "ERROR: Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ConfiguracionInterfaz ci = new ConfiguracionInterfaz();
        ci.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ci.setLocationRelativeTo(null);
        ci.setVisible(true);
    }//GEN-LAST:event_configuracionBttnActionPerformed

    private void clienteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBttnActionPerformed
        ClienteInterfaz ci = new ClienteInterfaz();
        ci.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ci.setLocationRelativeTo(null);
        ci.setVisible(true);
        
    }//GEN-LAST:event_clienteBttnActionPerformed

    private void productoBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoBttnActionPerformed
        ProductoInterfaz pi = new ProductoInterfaz();
        
        pi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pi.setLocationRelativeTo(null);
        pi.setVisible(true);
    }//GEN-LAST:event_productoBttnActionPerformed

    private void proveedorBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorBttnActionPerformed
        ProveedorInterfaz pi = new ProveedorInterfaz();
        
        pi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pi.setLocationRelativeTo(null);
        pi.setVisible(true);
    }//GEN-LAST:event_proveedorBttnActionPerformed

    private void userBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBttnActionPerformed

        if(user.getRol().equals(Usuario.Rol.EMPLEADO)){
            JOptionPane.showMessageDialog(this, "Para acceder a esta funcionalidad debe ser administrador!", "Error!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        UsuarioInterfaz ui = new UsuarioInterfaz();
        ui.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }//GEN-LAST:event_userBttnActionPerformed

    private void rotacionBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotacionBttnActionPerformed
        dispose();
        LoginInterfaz li = new LoginInterfaz();
        li.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        li.setLocationRelativeTo(null);
        li.setVisible(true);
    }//GEN-LAST:event_rotacionBttnActionPerformed

    private void exitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBttnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBttnActionPerformed

    private void ventaBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaBttnActionPerformed
        VentasInterfaz vi = new VentasInterfaz();
        vi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vi.setLocationRelativeTo(null);
        vi.setVisible(true);
    }//GEN-LAST:event_ventaBttnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private abm.gui.RoundedButton clienteBttn;
    private abm.gui.RoundedButton configuracionBttn;
    private javax.swing.JButton exitBttn;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private abm.gui.RoundedButton productoBttn;
    private abm.gui.RoundedButton proveedorBttn;
    private javax.swing.JButton rotacionBttn;
    private abm.gui.RoundedButton userBttn;
    private javax.swing.JLabel usernameTxt;
    private abm.gui.RoundedButton ventaBttn;
    // End of variables declaration//GEN-END:variables
}
