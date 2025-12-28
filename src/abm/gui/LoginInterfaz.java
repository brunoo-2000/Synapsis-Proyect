
package abm.gui;

import abm.dominios.Usuario;
import abm.logica.ABMUsuario;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



public class LoginInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginInterfaz.class.getName());
    private static String username;
    
    
    public LoginInterfaz() {
        initComponents();
        setTitle("Synapsis");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userField = new abm.gui.ModernTextField();
        passwordField = new abm.gui.ModernPasswordField();
        loginBttn = new abm.gui.RoundedButton();
        txtPl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(224, 224, 224));
        fondo.setForeground(new java.awt.Color(224, 224, 224));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_LogoColor.png"))); // NOI18N

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        loginBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/esquema-del-boton-de-flecha-cuadrada-de-inicio-de-sesion.png"))); // NOI18N
        loginBttn.setText("LOG IN");
        loginBttn.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 14)); // NOI18N
        loginBttn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttnActionPerformed(evt);
            }
        });

        txtPl.setBackground(new java.awt.Color(24, 53, 97));
        txtPl.setFont(new java.awt.Font("Inter 18pt Medium", 0, 12)); // NOI18N
        txtPl.setForeground(new java.awt.Color(24, 53, 97));
        txtPl.setText("PLATAFORMA DE GESTION");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(loginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(userField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtPl)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(loginBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
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

    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed
        username = userField.getText();
        char[] password = passwordField.getPassword();
        String pass = String.copyValueOf(password);
        
        if(username.isEmpty() || pass.isEmpty()){
            return;
        }
        
        if(!ABMUsuario.getInstancia().validarUsuario(username, pass)){
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecto!", "Login", JOptionPane.ERROR_MESSAGE);
            passwordField.setText("");
            return;
        }else{
            JOptionPane.showMessageDialog(this, "Login correcto!");
            this.dispose();
            InterfazGeneral ig = new InterfazGeneral();
            ig.setLocationRelativeTo(null);
            ig.setVisible(true);
            
        } 
    }//GEN-LAST:event_loginBttnActionPerformed

    public static String getUsername(){
        return username;
    }
    
    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        
    }//GEN-LAST:event_userFieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private abm.gui.RoundedButton loginBttn;
    private abm.gui.ModernPasswordField passwordField;
    private javax.swing.JLabel txtPl;
    private abm.gui.ModernTextField userField;
    // End of variables declaration//GEN-END:variables
}
