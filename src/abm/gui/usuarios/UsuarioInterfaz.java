
package abm.gui.usuarios;

import abm.logica.UsuariosTablaModel;
import abm.dominios.Usuario;
import abm.logica.ABMUsuario;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class UsuarioInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UsuarioInterfaz.class.getName());
    private UsuariosTablaModel model;
    private JTable table;
    
    public UsuarioInterfaz() {
        initComponents();
        model = new UsuariosTablaModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaUsuarios.add(scrollPane, BorderLayout.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        tablaUsuarios = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        usuarioMenu = new javax.swing.JMenu();
        altaItem = new javax.swing.JMenuItem();
        bajaItem = new javax.swing.JMenuItem();
        modItem = new javax.swing.JMenuItem();

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
        txt.setText("Gestor de Usurios (ADMIN)");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt)
                .addContainerGap(438, Short.MAX_VALUE))
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
            .addGap(0, 351, Short.MAX_VALUE)
        );

        tablaUsuarios.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tablaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tablaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 61, Short.MAX_VALUE))
        );

        archivoMenu.setText("Archivo");

        usuarioMenu.setText("Usuario");

        altaItem.setText("Cargar Usuario");
        altaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaItemActionPerformed(evt);
            }
        });
        usuarioMenu.add(altaItem);

        bajaItem.setText("Eliminar Usuario");
        bajaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaItemActionPerformed(evt);
            }
        });
        usuarioMenu.add(bajaItem);

        modItem.setText("Modificar Usuario");
        modItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modItemActionPerformed(evt);
            }
        });
        usuarioMenu.add(modItem);

        archivoMenu.add(usuarioMenu);

        jMenuBar1.add(archivoMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaItemActionPerformed
        UsuarioDatosInterfaz ui = new UsuarioDatosInterfaz();
        ui.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ui.setLocationRelativeTo(null);
        
        ui.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        ui.setVisible(true);
        
    }//GEN-LAST:event_altaItemActionPerformed

    private void bajaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaItemActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Usuario user = model.obtenerUsuarioPorFila(filaSeleccionada);
        
        int seleccion = JOptionPane.showConfirmDialog(this, "¿Está seguro/a de que desea eliminar este usuario?", "Eliminar usuario", JOptionPane.YES_NO_OPTION);
        if(seleccion == JOptionPane.YES_OPTION){
            ABMUsuario.getInstancia().eliminar(user);
        }
        
        model.fireTableDataChanged();
        JOptionPane.showMessageDialog(this, "Usuario eliminado con exito!");
        
    }//GEN-LAST:event_bajaItemActionPerformed

    private void modItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modItemActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Usuario user = model.obtenerUsuarioPorFila(filaSeleccionada);
        
        UsuarioDatosInterfaz ui = new UsuarioDatosInterfaz(user);
        ui.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ui.setLocationRelativeTo(null);
        
        ui.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        ui.setVisible(true);
    }//GEN-LAST:event_modItemActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaItem;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenuItem bajaItem;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem modItem;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel tablaUsuarios;
    private javax.swing.JLabel txt;
    private javax.swing.JMenu usuarioMenu;
    // End of variables declaration//GEN-END:variables
}
