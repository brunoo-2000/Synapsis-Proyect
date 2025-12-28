
package abm.gui.configuracion;

import abm.dominios.Usuario;
import abm.gui.LoginInterfaz;
import abm.gui.RoundedButton;
import abm.logica.ABMUsuario;
import javax.swing.JOptionPane;


public class ConfiguracionInterfaz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConfiguracionInterfaz.class.getName());
    private Usuario user;
    
    public ConfiguracionInterfaz() {
        initComponents();
        String username = LoginInterfaz.getUsername();
        user = ABMUsuario.getInstancia().obtenerUsuario(username);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nuevaPField = new abm.gui.ModernPasswordField();
        nuevaPRField = new abm.gui.ModernPasswordField();
        tituloLabel = new javax.swing.JLabel();
        nuevContrLabel = new javax.swing.JLabel();
        repContLabel = new javax.swing.JLabel();
        aceptarBttn = new RoundedButton();
        cancelarBttn = new RoundedButton();
        advLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 224, 224));
        jPanel1.setForeground(new java.awt.Color(224, 224, 224));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_LogoColor.png"))); // NOI18N

        nuevaPField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPFieldActionPerformed(evt);
            }
        });

        tituloLabel.setBackground(new java.awt.Color(24, 53, 97));
        tituloLabel.setFont(new java.awt.Font("Inter 18pt", 0, 24)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(24, 53, 97));
        tituloLabel.setText("Cambio contraseña");

        nuevContrLabel.setBackground(new java.awt.Color(24, 53, 97));
        nuevContrLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        nuevContrLabel.setForeground(new java.awt.Color(24, 53, 97));
        nuevContrLabel.setText("Nueva contraseña:");

        repContLabel.setBackground(new java.awt.Color(24, 53, 97));
        repContLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        repContLabel.setForeground(new java.awt.Color(24, 53, 97));
        repContLabel.setText("Repita contraseña:");

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

        advLabel.setBackground(new java.awt.Color(0, 0, 153));
        advLabel.setFont(new java.awt.Font("Inter 18pt", 2, 12)); // NOI18N
        advLabel.setForeground(new java.awt.Color(0, 0, 153));
        advLabel.setText("<html>La contraseña debe tener al menos 8 caracteras,<br> un numero, una mayuscula y caracter especial (ej: #%!)<html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevContrLabel)
                            .addComponent(nuevaPField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repContLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(aceptarBttn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelarBttn))
                                .addComponent(nuevaPRField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addComponent(advLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nuevContrLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nuevaPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(repContLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nuevaPRField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(advLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBttn)
                    .addComponent(cancelarBttn))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaPFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevaPFieldActionPerformed

    private void cancelarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarBttnActionPerformed

    private void aceptarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBttnActionPerformed
        char[] p1 = nuevaPField.getPassword();
        char[] p2 = nuevaPRField.getPassword();
        String nuevaPassword = String.valueOf(p1);
        String nuevaRepetirPassword = String.valueOf(p2);
        if(nuevaPassword.isEmpty() || nuevaRepetirPassword.isEmpty()){
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar en blanco!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(!ABMUsuario.getInstancia().validarContrasenia(nuevaPassword)){
            JOptionPane.showMessageDialog(this, "La contraseña no es segura!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(nuevaPassword.equals(nuevaRepetirPassword)){
            ABMUsuario.getInstancia().cambiarContra(user, nuevaPassword);
            JOptionPane.showMessageDialog(this, "Contraseña cambiada!");

        }
        this.dispose();
    }//GEN-LAST:event_aceptarBttnActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBttn;
    private javax.swing.JLabel advLabel;
    private javax.swing.JButton cancelarBttn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nuevContrLabel;
    private abm.gui.ModernPasswordField nuevaPField;
    private abm.gui.ModernPasswordField nuevaPRField;
    private javax.swing.JLabel repContLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
