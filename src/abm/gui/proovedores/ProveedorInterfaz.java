
package abm.gui.proovedores;

import abm.logica.ProveedoresTablaModel;
import abm.dominios.Proveedor;
import abm.logica.ABMProveedor;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class ProveedorInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProveedorInterfaz.class.getName());
    private ProveedoresTablaModel model;
    private JTable table;
    
    
    public ProveedorInterfaz() {
        initComponents();
        model = new ProveedoresTablaModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaProovedor.add(scrollPane, BorderLayout.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo1 = new javax.swing.JPanel();
        fondo2 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        tituloTxt = new javax.swing.JLabel();
        tablaProovedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        proveedorMenu = new javax.swing.JMenu();
        altaItem = new javax.swing.JMenuItem();
        bajaItem = new javax.swing.JMenuItem();
        modItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo1.setBackground(new java.awt.Color(224, 224, 224));
        fondo1.setForeground(new java.awt.Color(224, 224, 224));

        fondo2.setBackground(new java.awt.Color(38, 81, 89));
        fondo2.setForeground(new java.awt.Color(38, 81, 89));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo (2).png"))); // NOI18N

        tituloTxt.setBackground(new java.awt.Color(255, 255, 255));
        tituloTxt.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 36)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setText("Gestor de proveedores");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloTxt)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(fondo2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tituloTxt)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tablaProovedor.setLayout(new java.awt.BorderLayout());

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
            .addGap(0, 334, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondo1Layout = new javax.swing.GroupLayout(fondo1);
        fondo1.setLayout(fondo1Layout);
        fondo1Layout.setHorizontalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo1Layout.createSequentialGroup()
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondo1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablaProovedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        fondo1Layout.setVerticalGroup(
            fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo1Layout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablaProovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        menu.setText("Archivo");

        proveedorMenu.setText("Proveedor");

        altaItem.setText("Cargar proveedor");
        altaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaItemActionPerformed(evt);
            }
        });
        proveedorMenu.add(altaItem);

        bajaItem.setText("Eliminar proveedor");
        bajaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaItemActionPerformed(evt);
            }
        });
        proveedorMenu.add(bajaItem);

        modItem.setText("Modficar proveedor");
        modItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modItemActionPerformed(evt);
            }
        });
        proveedorMenu.add(modItem);

        menu.add(proveedorMenu);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaItemActionPerformed
        ProveedorDatosInterfaz pi = new ProveedorDatosInterfaz();
        
        pi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pi.setLocationRelativeTo(null);
        
        pi.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        pi.setVisible(true);
    }//GEN-LAST:event_altaItemActionPerformed

    private void bajaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaItemActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila de la tabla.", "Atención", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        Proveedor prov = model.obtenerProveedorPorFila(filaSeleccionada);
        
        int seleccion = JOptionPane.showConfirmDialog(this, "¿Está seguro/a de que desea eliminar este proveedor?", "Eliminar proveedor", JOptionPane.YES_NO_OPTION);
        if(seleccion == JOptionPane.YES_OPTION){
            ABMProveedor.getInstancia().eliminar(prov);
            JOptionPane.showMessageDialog(this, "Proveedor eliminado con exito!");
        }
        
        model.fireTableDataChanged();
        
    }//GEN-LAST:event_bajaItemActionPerformed

    private void modItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modItemActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila de la tabla.", "Atención", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        Proveedor prov = model.obtenerProveedorPorFila(filaSeleccionada);
        
        ProveedorDatosInterfaz pi = new ProveedorDatosInterfaz(prov);
        
        pi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pi.setLocationRelativeTo(null);
        
        pi.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        pi.setVisible(true);
    }//GEN-LAST:event_modItemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaItem;
    private javax.swing.JMenuItem bajaItem;
    private javax.swing.JPanel fondo1;
    private javax.swing.JPanel fondo2;
    private javax.swing.JLabel icono;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem modItem;
    private javax.swing.JMenu proveedorMenu;
    private javax.swing.JPanel tablaProovedor;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables
}
