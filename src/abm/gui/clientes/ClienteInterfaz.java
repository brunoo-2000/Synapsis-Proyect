
package abm.gui.clientes;

import abm.logica.ClientesTablaModel;
import abm.dominios.Cliente;
import abm.logica.ABMCliente;
import java.awt.BorderLayout;
import javax.swing.*;


public class ClienteInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteInterfaz.class.getName());
    private ClientesTablaModel model;
    private JTable tabla;
    
    public ClienteInterfaz() {
        initComponents();
        model = new ClientesTablaModel();
        tabla = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabla);
        clientesTable.add(scrollPane, BorderLayout.CENTER);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        clientesTable = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        clienteMenu = new javax.swing.JMenu();
        altaItem = new javax.swing.JMenuItem();
        bajaItem = new javax.swing.JMenuItem();
        modificarItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(224, 224, 224));

        clientesTable.setBackground(new java.awt.Color(0, 51, 51));
        clientesTable.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(38, 81, 89));
        jPanel1.setForeground(new java.awt.Color(38, 81, 89));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestor de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(38, 81, 89));
        jPanel3.setForeground(new java.awt.Color(38, 81, 89));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        archivoMenu.setText("Archivo");

        clienteMenu.setText("Cliente");

        altaItem.setText("Cargar Cliente");
        altaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaItemActionPerformed(evt);
            }
        });
        clienteMenu.add(altaItem);

        bajaItem.setText("Eliminar Cliente");
        bajaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaItemActionPerformed(evt);
            }
        });
        clienteMenu.add(bajaItem);

        modificarItem.setText("Modificar Cliente");
        modificarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarItemActionPerformed(evt);
            }
        });
        clienteMenu.add(modificarItem);

        archivoMenu.add(clienteMenu);

        barraMenu.add(archivoMenu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clientesTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientesTable, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bajaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaItemActionPerformed
        
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila de la tabla.", "Atención", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        Cliente cliente = model.obtenerClientePorFila(filaSeleccionada);
        
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar a " + cliente.getNombre() + " " + cliente.getApellido() + "?","Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        
        if(confirmar == JOptionPane.YES_OPTION){
            ABMCliente.getInstancia().eliminar(cliente);
            JOptionPane.showMessageDialog(this, "Cliente eliminado con exito");
        }
        
        model.fireTableDataChanged();
        
        
    }//GEN-LAST:event_bajaItemActionPerformed

    private void modificarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarItemActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila de la tabla.", "Atención", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        Cliente cliente = model.obtenerClientePorFila(fila);
        ClienteAltaInterfaz ca = new ClienteAltaInterfaz(cliente);
        
        ca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ca.setLocationRelativeTo(null);
        
        ca.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        ca.setVisible(true);
        
        
    }//GEN-LAST:event_modificarItemActionPerformed

    private void altaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaItemActionPerformed
        ClienteAltaInterfaz ca = new ClienteAltaInterfaz();
        
        
        ca.setLocationRelativeTo(null);
        ca.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ca.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        ca.setVisible(true);
       
        
    }//GEN-LAST:event_altaItemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaItem;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenuItem bajaItem;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JPanel clientesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem modificarItem;
    // End of variables declaration//GEN-END:variables
}
