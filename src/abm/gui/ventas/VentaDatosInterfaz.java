
package abm.gui.ventas;

import abm.dominios.Cliente;
import abm.dominios.Producto;
import abm.dominios.Usuario;
import abm.dominios.Venta;
import abm.gui.FiltrosInput;
import abm.gui.LoginInterfaz;
import abm.gui.RoundedButton;
import abm.logica.ABMProducto;
import abm.logica.ABMCliente;
import abm.logica.ABMRemito;
import abm.logica.ABMUsuario;
import abm.logica.ABMVenta;
import abm.logica.LineaVenta;
import abm.logica.ProductosAddTabla;
import abm.logica.addProductos;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;




public class VentaDatosInterfaz extends abm.gui.BaseFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentaDatosInterfaz.class.getName());
    private ProductosAddTabla model;
    private JTable table;
    private Cliente cliente;
    private Usuario user;
    private String username;
    private Venta ventaAEditar;
    
    public VentaDatosInterfaz() {
        initComponents();
        addProductos.getInstancia().limpiarVenta();
        model = new ProductosAddTabla();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaProductos.add(scrollPane, BorderLayout.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        FiltrosInput.aplicarFiltro(idClienteField, FiltrosInput.Tipo.NUMEROS, 70);
        username = LoginInterfaz.getUsername();
        user = ABMUsuario.getInstancia().obtenerUsuario(username);
    }
    
    public VentaDatosInterfaz(Venta venta) {
        initComponents();
        this.ventaAEditar = venta;
        if(ventaAEditar == null){
            addProductos.getInstancia().limpiarVenta();
        }
        else{
            List<LineaVenta> lineasExistentes = ventaAEditar.getLineas();
            addProductos.getInstancia().cargarLineasParaEdicion(lineasExistentes);
        }
        int idCliente = ventaAEditar.getIdCliente();
        cliente = ABMCliente.getInstancia().obtenerClientePorId(idCliente);
        idClienteField.setText(String.valueOf(idCliente));
        nomCliField.setText(cliente.getNombre() + " " + cliente.getApellido());
        direField.setText(cliente.getDireccion() + " " + cliente.getDireccionNum());
        telefonoField.setText(cliente.getTelefono());
        emailField.setText(cliente.getEmail());
        cuitField.setText(cliente.getCuit());
        double costoTotal = ventaAEditar.getTotal();
        costoTotalField.setText(String.format("%.2f", costoTotal));
        double totalIVA = costoTotal * 1.21;
        totalField.setText(String.format("%.2f", totalIVA));
        
        model = new ProductosAddTabla();
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        tablaProductos.add(scrollPane, BorderLayout.CENTER);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        
        
        
        
        FiltrosInput.aplicarFiltro(idClienteField, FiltrosInput.Tipo.NUMEROS, 70);
        username = LoginInterfaz.getUsername();
        user = ABMUsuario.getInstancia().obtenerUsuario(username);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        tablaProductos = new javax.swing.JPanel();
        fondo2 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        aggProd = new javax.swing.JButton();
        elimProd = new javax.swing.JButton();
        idClienteField = new abm.gui.ModernTextField();
        nomCliField = new abm.gui.ModernTextField();
        direField = new abm.gui.ModernTextField();
        telefonoField = new abm.gui.ModernTextField();
        emailField = new abm.gui.ModernTextField();
        cuitField = new abm.gui.ModernTextField();
        clienteIdLabel = new javax.swing.JLabel();
        nomClienteLabel = new javax.swing.JLabel();
        direLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        cuitLabel = new javax.swing.JLabel();
        prodLabel = new javax.swing.JLabel();
        costoTotalField = new abm.gui.ModernTextField();
        totalField = new abm.gui.ModernTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        validarBttn = new RoundedButton();
        aceptarBttn = new RoundedButton();
        cancelarBttn = new RoundedButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(224, 224, 224));
        fondo.setForeground(new java.awt.Color(224, 224, 224));

        tablaProductos.setLayout(new java.awt.BorderLayout());

        fondo2.setBackground(new java.awt.Color(38, 81, 89));
        fondo2.setForeground(new java.awt.Color(38, 81, 89));

        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Synapsis_Logo.png"))); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Realizar venta");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        aggProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mas.png"))); // NOI18N
        aggProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aggProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggProdActionPerformed(evt);
            }
        });

        elimProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/signo-menos.png"))); // NOI18N
        elimProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        elimProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimProdActionPerformed(evt);
            }
        });

        nomCliField.setEditable(false);

        direField.setEditable(false);

        telefonoField.setEditable(false);

        emailField.setEditable(false);

        cuitField.setEditable(false);

        clienteIdLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        clienteIdLabel.setText("Cliente (ID)");

        nomClienteLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        nomClienteLabel.setText("Nombre cliente");

        direLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        direLabel.setText("Dirección");

        telLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        telLabel.setText("Telefono");

        emailLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        emailLabel.setText("Email");

        cuitLabel.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        cuitLabel.setText("CUIT");

        prodLabel.setFont(new java.awt.Font("Inter 18pt", 1, 12)); // NOI18N
        prodLabel.setText("Productos");

        costoTotalField.setEditable(false);

        totalField.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel1.setText("Total costo:");

        jLabel2.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        jLabel2.setText("Total (con IVA):");

        validarBttn.setFont(new java.awt.Font("Inter 18pt", 0, 12)); // NOI18N
        validarBttn.setText("Validar");
        validarBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarBttnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(idClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(validarBttn))
                            .addComponent(clienteIdLabel))
                        .addGap(46, 46, 46)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomClienteLabel)
                                .addComponent(telefonoField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomCliField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telLabel))
                        .addGap(19, 19, 19)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(direLabel)
                                .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(direField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(emailLabel))
                        .addGap(18, 18, 18)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuitLabel)
                            .addComponent(cuitField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(aggProd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(elimProd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodLabel)
                            .addComponent(tablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costoTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(106, 106, 106)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(aceptarBttn)
                        .addGap(112, 112, 112)
                        .addComponent(cancelarBttn)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteIdLabel)
                    .addComponent(nomClienteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomCliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validarBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telLabel)
                    .addComponent(emailLabel)
                    .addComponent(cuitLabel))
                .addGap(3, 3, 3)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(prodLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(aggProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elimProd))
                    .addComponent(tablaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costoTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBttn)
                    .addComponent(cancelarBttn))
                .addGap(21, 21, 21))
        );

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarTotalVenta(){
        double t = model.getTotalVenta();
        double t2 = model.getTotalVenta() * 1.21;
        String total = String.format("%.2f", t);
        String total2 = String.format("%.2f", t2);
        costoTotalField.setText(total);
        totalField.setText(total2);
    }
    
    
    private void aggProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggProdActionPerformed
        String idProducto = JOptionPane.showInputDialog(this, "ID del producto");
        if(idProducto == null || idProducto.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe poner un ID!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
            int id = Integer.parseInt(idProducto);
            Producto productoEncontrado = ABMProducto.getInstancia().obtenerProdcutoPorId(id);
            if(productoEncontrado == null){
                JOptionPane.showMessageDialog(this, "El ID insertado no pertenece a un producto", "Advertencia!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String inputCantidad = JOptionPane.showInputDialog(this, "Cantidad", productoEncontrado.getDescripcion(), JOptionPane.QUESTION_MESSAGE);
            if(inputCantidad == null || inputCantidad.isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe proporcionar una cantidad", "Advertencia!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int cantidad = Integer.parseInt(inputCantidad);
            if(cantidad <= 0){
               JOptionPane.showMessageDialog(this, "La cantidad no puede ser menor o igual a 0", "Advertencia!", JOptionPane.WARNING_MESSAGE); 
               return;
            }
            
            int stockDisponible = productoEncontrado.getStock();
            int cantidadPreviaEnVenta = 0;
            LineaVenta lineaPrevia = addProductos.getInstancia().getLineaPorId(id);
            if (lineaPrevia != null) {
                cantidadPreviaEnVenta = lineaPrevia.getCantidad();
            }
            int cantidadTotalSolicitada = cantidadPreviaEnVenta + cantidad;
            if (cantidadTotalSolicitada > stockDisponible) {
                JOptionPane.showMessageDialog(this, "ERROR: Stock Insuficiente para la compra.\n" +"Stock Disponible: " + stockDisponible + "\n" +"Cantidad Total en Venta: " + cantidadTotalSolicitada, "Stock Insuficiente", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            addProductos.getInstancia().aggProductos(productoEncontrado, cantidad);
            model.fireTableDataChanged();
            actualizarTotalVenta();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ID o Cantidad deben ser números válidos.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_aggProdActionPerformed

    private void elimProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimProdActionPerformed
        int filaSeleccionada = table.getSelectedRow();
        if(filaSeleccionada == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila", "Advertencia!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        LineaVenta linea = model.obtenerLineaPorIdProducto(filaSeleccionada);
        addProductos.getInstancia().eliminarLinea(linea);
        
        
        model.fireTableDataChanged();
        
        
    }//GEN-LAST:event_elimProdActionPerformed

    private void validarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarBttnActionPerformed
        String idCliente = idClienteField.getText();
        if(idCliente.isEmpty() || idCliente == null){
            JOptionPane.showMessageDialog(this, "Debe ingresar un ID!", "Ingrese ID", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = Integer.parseInt(idCliente);
        if(!ABMCliente.getInstancia().validarId(id)){
            JOptionPane.showMessageDialog(this, "No se encuentra el cliente!", "Ingrese ID", JOptionPane.WARNING_MESSAGE);
            return;
        }
        this.cliente = ABMCliente.getInstancia().obtenerClientePorId(id);
        
        nomCliField.setText(this.cliente.getNombre() + " " + this.cliente.getApellido());
        direField.setText(this.cliente.getDireccion() + " " + this.cliente.getDireccionNum());
        telefonoField.setText(this.cliente.getTelefono());
        emailField.setText(this.cliente.getEmail());
        cuitField.setText(this.cliente.getCuit());
    }//GEN-LAST:event_validarBttnActionPerformed

    private void cancelarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarBttnActionPerformed

    private void aceptarBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBttnActionPerformed
        LocalDate fechaAhora = LocalDate.now();
        LocalTime horaAhora = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
        String fAhora = "";
        String hAhora = "";
        String idC = "";
        int idCliente = 0;
        int idUser = 0;
        try{
            fAhora = String.valueOf(fechaAhora);
            hAhora = String.valueOf(horaAhora);
            idC = idClienteField.getText();
            idCliente = Integer.parseInt(idC);
            if(!ABMCliente.getInstancia().validarId(idCliente) || idC.isEmpty()){
                JOptionPane.showMessageDialog(this, "Error: El cliente no se encuentra o el campo esta en blanco", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            idUser = user.getId();
            String idUserString = String.valueOf(idUser);
            //List<Producto> productos = addProductos.getInstancia().obtenerProductosVenta();

            if(fAhora.isEmpty() || hAhora.isEmpty() || idC.isEmpty() || idUserString.isEmpty()){
                JOptionPane.showMessageDialog(this, "Error: Uno o más campos estan vacios!", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error en carga!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String totalConComa = costoTotalField.getText();
        String totalCorregido = totalConComa.replace(',', '.'); 
    
        double totalCosto = 0;
        try {
            totalCosto = Double.parseDouble(totalCorregido); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al procesar el costo total. Revise el formato.", "Error Interno", JOptionPane.ERROR_MESSAGE);
            return;
        }   
        
        List<LineaVenta> lineasVentaFinales = addProductos.getInstancia().obtenerLista();
        
        if (this.ventaAEditar != null) {
            for (LineaVenta lvVieja : this.ventaAEditar.getLineas()) {
                Producto p = lvVieja.getProducto();
                if (p != null) {
                    p.setStock(p.getStock() + lvVieja.getCantidad());
                }
            }
        }
        
        if(lineasVentaFinales.isEmpty()){
            JOptionPane.showMessageDialog(this, "No ha seleccionado productos!", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (this.ventaAEditar == null) {
            Venta nuevaVenta = new Venta();
            nuevaVenta.setHora(horaAhora);
            nuevaVenta.setMomento(fechaAhora);
            nuevaVenta.setIdCliente(idCliente);
            nuevaVenta.setIdVendedor(idUser);
            nuevaVenta.setTotal(totalCosto);
            nuevaVenta.setLineas(new java.util.ArrayList<>(lineasVentaFinales)); 
            ABMVenta.getInstancia().agregar(nuevaVenta);
            ABMRemito.getInstancia().crearRemito(nuevaVenta);
            JOptionPane.showMessageDialog(this, "Venta cargada con exito!");
        } else {
            this.ventaAEditar.setIdCliente(idCliente);
            this.ventaAEditar.setTotal(totalCosto);
            this.ventaAEditar.setLineas(new java.util.ArrayList<>(lineasVentaFinales));
            JOptionPane.showMessageDialog(this, "Venta modificada con exito!");
        }
        
       
        for (LineaVenta lvNueva : lineasVentaFinales) {
            Producto p = lvNueva.getProducto();
            if (p != null) {
                p.setStock(p.getStock() - lvNueva.getCantidad());
               }
        }
        
        
        
        this.dispose();
        
    }//GEN-LAST:event_aceptarBttnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBttn;
    private javax.swing.JButton aggProd;
    private javax.swing.JButton cancelarBttn;
    private javax.swing.JLabel clienteIdLabel;
    private abm.gui.ModernTextField costoTotalField;
    private abm.gui.ModernTextField cuitField;
    private javax.swing.JLabel cuitLabel;
    private abm.gui.ModernTextField direField;
    private javax.swing.JLabel direLabel;
    private javax.swing.JButton elimProd;
    private abm.gui.ModernTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondo2;
    private javax.swing.JLabel icono;
    private abm.gui.ModernTextField idClienteField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private abm.gui.ModernTextField nomCliField;
    private javax.swing.JLabel nomClienteLabel;
    private javax.swing.JLabel prodLabel;
    private javax.swing.JPanel tablaProductos;
    private javax.swing.JLabel telLabel;
    private abm.gui.ModernTextField telefonoField;
    private abm.gui.ModernTextField totalField;
    private javax.swing.JButton validarBttn;
    // End of variables declaration//GEN-END:variables
}
