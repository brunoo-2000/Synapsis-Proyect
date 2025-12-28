
package abm.gui.ventas;

import abm.dominios.Venta;
import abm.gui.remitos.RemitosInterfaz;
import abm.logica.ABMVenta;
import abm.logica.VentasTablaModel;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class VentasInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentasInterfaz.class.getName());
    private VentasTablaModel model;
    private JTable table;
    
    
    public VentasInterfaz() {
        initComponents();
        model = new VentasTablaModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaVentas.add(scrollPane, BorderLayout.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        fondo = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        tablaVentas = new javax.swing.JPanel();
        barra = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        ventaMenu = new javax.swing.JMenu();
        ventaAlta = new javax.swing.JMenuItem();
        ventaEliminar = new javax.swing.JMenuItem();
        ventaMod = new javax.swing.JMenuItem();
        remitosMenu = new javax.swing.JMenu();
        remitosItem = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

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
        txt.setText("Ventas realizadas");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt)
                .addContainerGap(424, Short.MAX_VALUE))
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

        tablaVentas.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        menu.setText("Archivo");

        ventaMenu.setText("Venta");

        ventaAlta.setText("Realizar Venta");
        ventaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaAltaActionPerformed(evt);
            }
        });
        ventaMenu.add(ventaAlta);

        ventaEliminar.setText("Eliminar Venta");
        ventaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaEliminarActionPerformed(evt);
            }
        });
        ventaMenu.add(ventaEliminar);

        ventaMod.setText("Modificar Venta");
        ventaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaModActionPerformed(evt);
            }
        });
        ventaMenu.add(ventaMod);

        menu.add(ventaMenu);

        barra.add(menu);

        remitosMenu.setText("Remitos");

        remitosItem.setText("Listado de remitos");
        remitosItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remitosItemActionPerformed(evt);
            }
        });
        remitosMenu.add(remitosItem);

        barra.add(remitosMenu);

        setJMenuBar(barra);

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

    private void ventaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaAltaActionPerformed
        VentaDatosInterfaz vi = new VentaDatosInterfaz();
        vi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vi.setLocationRelativeTo(null);
        
        vi.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        vi.setVisible(true);
    }//GEN-LAST:event_ventaAltaActionPerformed

    private void ventaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaModActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Venta venta = model.obtenerVentaPorFila(filaSeleccionada);
        
        VentaDatosInterfaz ui = new VentaDatosInterfaz(venta);
        ui.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ui.setLocationRelativeTo(null);
        
        ui.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        ui.setVisible(true);
    }//GEN-LAST:event_ventaModActionPerformed

    private void ventaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaEliminarActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Venta venta = model.obtenerVentaPorFila(filaSeleccionada);
        
        int seleccion = JOptionPane.showConfirmDialog(this, "¿Está seguro/a de que desea eliminar esta venta?", "Eliminar usuario", JOptionPane.YES_NO_OPTION);
        if(seleccion == JOptionPane.YES_OPTION){
            ABMVenta.getInstancia().eliminar(venta);
        }
        
        model.fireTableDataChanged();
        JOptionPane.showMessageDialog(this, "Venta eliminada con exito!");
        
          
    }//GEN-LAST:event_ventaEliminarActionPerformed

    private void remitosItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remitosItemActionPerformed
        RemitosInterfaz ri = new RemitosInterfaz();
        ri.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ri.setLocationRelativeTo(null);
        ri.setVisible(true);
    }//GEN-LAST:event_remitosItemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JMenuItem remitosItem;
    private javax.swing.JMenu remitosMenu;
    private javax.swing.JPanel tablaVentas;
    private javax.swing.JLabel txt;
    private javax.swing.JMenuItem ventaAlta;
    private javax.swing.JMenuItem ventaEliminar;
    private javax.swing.JMenu ventaMenu;
    private javax.swing.JMenuItem ventaMod;
    // End of variables declaration//GEN-END:variables
}
