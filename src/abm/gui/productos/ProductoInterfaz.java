
package abm.gui.productos;

import abm.logica.ProductosTablaModel;
import abm.dominios.Producto;
import abm.logica.ClientesTablaModel;
import abm.logica.ABMProducto;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class ProductoInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ProductoInterfaz.class.getName());
    private ProductosTablaModel model;
    private JTable table;
    
    public ProductoInterfaz() {
        initComponents();
        model = new ProductosTablaModel();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaProductos.add(scrollPane, BorderLayout.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        fondo2 = new javax.swing.JPanel();
        synapsisLogo = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        tablaProductos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        productoMenu = new javax.swing.JMenu();
        altaProducto = new javax.swing.JMenuItem();
        bajaProducto = new javax.swing.JMenuItem();
        modProducto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo2.setBackground(new java.awt.Color(38, 81, 89));
        fondo2.setForeground(new java.awt.Color(38, 81, 89));

        synapsisLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        synapsisLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo.png"))); // NOI18N
        synapsisLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tituloLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloLabel.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 48)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("Gestor de productos");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(synapsisLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel)
                .addContainerGap(216, Short.MAX_VALUE))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel)
                    .addComponent(synapsisLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tablaProductos.setLayout(new java.awt.BorderLayout());

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
            .addGap(0, 299, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablaProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        archivoMenu.setText("Archivo");

        productoMenu.setText("Producto");

        altaProducto.setText("Cargar Producto");
        altaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaProductoActionPerformed(evt);
            }
        });
        productoMenu.add(altaProducto);

        bajaProducto.setText("Eliminar Producto");
        bajaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaProductoActionPerformed(evt);
            }
        });
        productoMenu.add(bajaProducto);

        modProducto.setText("Modificar Producto");
        modProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modProductoActionPerformed(evt);
            }
        });
        productoMenu.add(modProducto);

        archivoMenu.add(productoMenu);

        jMenuBar1.add(archivoMenu);

        setJMenuBar(jMenuBar1);

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
    
    public ProductosTablaModel retornarModelo(){
        return model;
    }
    
    private void altaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaProductoActionPerformed
        ProductoDatosInterfaz ci = new ProductoDatosInterfaz();
        
        ci.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ci.setLocationRelativeTo(null);
        
        ci.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        ci.setVisible(true);
    }//GEN-LAST:event_altaProductoActionPerformed

    private void bajaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaProductoActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila de la tabla.", "Atención", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        
        Producto prod = model.obtenerProductoPorFila(filaSeleccionada);
        
        int seleccion = JOptionPane.showConfirmDialog(this, "Esta seguro de que desea eliminar este producto?", "Eliminar producto", JOptionPane.YES_NO_OPTION);
        if(seleccion == JOptionPane.YES_OPTION){
            ABMProducto.getInstancia().eliminar(prod);
            JOptionPane.showMessageDialog(this, "Producto eliminado con exito!");
        }
        
        model.fireTableDataChanged();
        
        
    }//GEN-LAST:event_bajaProductoActionPerformed

    private void modProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modProductoActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila de la tabla.", "Atención", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        Producto prod = model.obtenerProductoPorFila(filaSeleccionada);
        
        ProductoDatosInterfaz pi = new ProductoDatosInterfaz(prod);
        
        pi.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pi.setLocationRelativeTo(null);
        
        pi.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e){
                model.fireTableDataChanged();
            }
        });
        
        pi.setVisible(true);
        
    }//GEN-LAST:event_modProductoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaProducto;
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenuItem bajaProducto;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondo2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem modProducto;
    private javax.swing.JMenu productoMenu;
    private javax.swing.JLabel synapsisLogo;
    private javax.swing.JPanel tablaProductos;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
