/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import SuperCompreBarato.Conexion;
import SuperCompreBarato.Conexion2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class Tienda extends javax.swing.JFrame {
    private String cantidadProductoDisponibles;
    private int montoFacturado = 0;
    private String nombresProductosComprados = " ";
  
    /**
     * Creates new form Tienda
     */
    public Tienda() {
        initComponents();
        this.setTitle("Tienda");
        setLocationRelativeTo(null);
        DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model1 = new DefaultTableModel();
        
        
        
    }
    //Metodo para calcular el monto por producto
    public String calcularMontoProducto(String precio, String cantidad){
        int montoProducto = 0;
        
        montoProducto = Integer.parseInt(precio) * Integer.parseInt(cantidad);
        
        return String.valueOf(montoProducto);
    }
     
    // Metodo para cancelar la inclusion del producto, borra todos los textfields
    public void cancelarProducto(){
        txtCodigoProducto.setText(null);
        txtNombreProducto.setText(null);
        txtPrecioProducto.setText(null);
        txtCantidadProducto.setText(null);
        txtDescripcion.setText(null);
        txtCodigoProducto.setText(null);
    }
    
    // Metodo para limpiar jtable de productos seleccionados
    public void limpiaJtable(){
        DefaultTableModel model1 = (DefaultTableModel) jtProductosSeleccionados.getModel();
        model1.setRowCount(0);
    }
    
    // Metodo para sumar los montos totales por producto
    public int sumarMontoTotal(){
        int fila = 0;
        int total = 0;
        
        for(int i = 0; i < jtProductosSeleccionados.getRowCount(); i++){
            fila = Integer.parseInt(jtProductosSeleccionados.getValueAt(i, 5).toString());
            total += fila; 
        }
        return total;
    }
    
    // Metodo para guardar todos los nombres de los productos comprados y su cantidad
    
    public String nombreProductosComprados(){
        String nombre = " ";
        String nombreProductos = " ";
        
        for(int i = 0; i < jtProductosSeleccionados.getRowCount(); i++){
            nombre = jtProductosSeleccionados.getValueAt(i, 1).toString();
            nombreProductos += nombre + " , "; 
        }
        return nombreProductos;
        
    }
    
    public void actualizarDB(String id, String cantidad){
        Connection con = null;
        try{
            con = Conexion2.getConnection();
            String sql = "UPDATE productos SET cantidadProducto ="+ cantidad + "WHERE codigo ="+ id;
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Registro modificado");
     
         con.close();
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }
    
    //*****************************************************************************
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedEmpleado = new javax.swing.JTextField();
        txtCedCliente = new javax.swing.JTextField();
        btnFinalizarVenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFechaVenta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCatalogoProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtProductosAdquiridos = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        txtCantidadProducto = new javax.swing.JTextField();
        cbMetodoPago = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMontoFacturado = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProductosSeleccionados = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jlNombreCliente = new javax.swing.JLabel();
        jlNombreEmpleado = new javax.swing.JLabel();
        jlTipoCliente = new javax.swing.JLabel();
        btnInfoCliente = new javax.swing.JButton();
        btnInfoEmpleado = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Tienda");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ced. Cliente");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha");

        btnFinalizarVenta.setText("Finalizar Venta");
        btnFinalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVentaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Productos ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Ced. Empleado");

        jtCatalogoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad ", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCatalogoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCatalogoProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCatalogoProductos);

        jLabel3.setText("Codigo Producto");

        jLabel5.setText("Nombre Producto");

        jLabel6.setText("Precio Producto");

        jLabel7.setText("Cantidad de Producto");

        jLabel8.setText("Descripcion");

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        cbMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Metodo Pago");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Monto Facturado");

        jtProductosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad ", "Descripcion", "Monto total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductosSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosSeleccionadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtProductosSeleccionados);

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nombre cliente");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nombre Empleado");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Tipo Cliente");

        jlNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jlNombreEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jlTipoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnInfoCliente.setBackground(new java.awt.Color(255, 204, 102));
        btnInfoCliente.setText("OK");
        btnInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoClienteActionPerformed(evt);
            }
        });

        btnInfoEmpleado.setBackground(new java.awt.Color(255, 204, 102));
        btnInfoEmpleado.setText("OK");
        btnInfoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(210, 255, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtDescripcion))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductosAdquiridos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtMontoFacturado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbMetodoPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(btnVer)
                                        .addGap(44, 44, 44)
                                        .addComponent(btnAgregarProducto)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnEliminarProducto)
                                        .addGap(83, 83, 83)
                                        .addComponent(btnCancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCedEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnInfoCliente)
                                            .addComponent(btnInfoEmpleado))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(jlNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btnFinalizarVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtCedCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel17)
                                .addComponent(jlTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnInfoCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCedEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(btnInfoEmpleado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregarProducto)
                    .addComponent(btnEliminarProducto)
                    .addComponent(btnVer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtProductosAdquiridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtMontoFacturado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnFinalizarVenta)
                .addGap(19, 19, 19)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCatalogoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCatalogoProductosMouseClicked
        int row = jtCatalogoProductos.getSelectedRow(); // obtener indice de la fila
        DefaultTableModel model = (DefaultTableModel) jtCatalogoProductos.getModel();
        
        
        //obtener valor getValueAt(row index, column index)
        
        txtCodigoProducto.setText(model.getValueAt(row, 0).toString()); // valor seleccionada columna 1
        txtNombreProducto.setText(model.getValueAt(row, 1).toString());
        txtPrecioProducto.setText(model.getValueAt(row, 2).toString());
        cantidadProductoDisponibles = model.getValueAt(row, 3).toString();
        txtDescripcion.setText(model.getValueAt(row, 4).toString());
        
        
    }//GEN-LAST:event_jtCatalogoProductosMouseClicked

    private void btnFinalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVentaActionPerformed
        
         Connection con = null;
        

        try {
            con = Conexion2.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO venta (monto,productos,metodoPago,idCliente,idEmpleado,fechaVenta) VALUES (?,?,?,?,?,?)");
            
            ps.setString(1, txtMontoFacturado.getText());
            ps.setString(2, txtProductosAdquiridos.getText());
            ps.setString(3,cbMetodoPago.getSelectedItem().toString() );
            ps.setString(4, txtCedCliente.getText());
            ps.setString(5, txtCedEmpleado.getText());
            ps.setString(6, txtFechaVenta.getText());
            
            //Actualizar base de datos de productos
            
            

            if(ps.executeUpdate() > 0){

                JOptionPane.showMessageDialog(null, "La venta fue agregada correctamente");

            } else {

                JOptionPane.showMessageDialog(null, "Error al agregar la venta");

            }

            con.close();
            MenuVentas menuVentas = new MenuVentas();
            menuVentas.setVisible(true);
            this.dispose();
        
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        
        }
    }//GEN-LAST:event_btnFinalizarVentaActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        Connection con = null;
        String sql = "SELECT * FROM productos";
        try
        {
            DefaultTableModel model = (DefaultTableModel) jtCatalogoProductos.getModel();
            con = Conexion2.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()) {
                model.addRow(new String[]{rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6)});
            }
            con.close();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void jtProductosSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosSeleccionadosMouseClicked
        
    }//GEN-LAST:event_jtProductosSeleccionadosMouseClicked

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
        
        int cantidadProductoSeleccionado = Integer.parseInt(txtCantidadProducto.getText());
        if(Integer.parseInt(cantidadProductoDisponibles) >= cantidadProductoSeleccionado){
        DefaultTableModel model1 = (DefaultTableModel) jtProductosSeleccionados.getModel();
        
        String montoProducto = calcularMontoProducto(txtPrecioProducto.getText(), txtCantidadProducto.getText());
        
        model1.insertRow(model1.getRowCount(),new Object[]{
            txtCodigoProducto.getText(), txtNombreProducto.getText(), 
            txtPrecioProducto.getText(), txtCantidadProducto.getText(),
            txtDescripcion.getText(), montoProducto});
        
        // Calcular Monto Facturado y ensenar en pantalla
        montoFacturado = sumarMontoTotal();
        txtMontoFacturado.setText(String.valueOf(montoFacturado));
        
        
        
        // Determinar nombre de los productos comprados y ensenar en pantalla
        nombresProductosComprados = nombreProductosComprados();
        txtProductosAdquiridos.setText(nombresProductosComprados);
        
        
        
        
    } else{
            JOptionPane.showMessageDialog(null, "No hay suficientes unidades disponibles");
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        DefaultTableModel model1 = (DefaultTableModel) jtProductosSeleccionados.getModel();
        
        try{
            int SelectedRowIndex = jtProductosSeleccionados.getSelectedRow();
            model1.removeRow(SelectedRowIndex);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar de la lista de Productos Seleccionados");
        }
        
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       cancelarProducto();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuVentas menuVentas = new MenuVentas();
        menuVentas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoClienteActionPerformed
        Connection con = null;
        try
        {  
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM cliente WHERE cedula = ?");
            ps.setString(1, txtCedCliente.getText());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next())
            {
                jlNombreCliente.setText(rs.getString("nombre"));
                jlTipoCliente.setText(rs.getString("tipoCliente"));
                
            
            } else
            {
            
                JOptionPane.showMessageDialog(null, "Esa cedula no esta registrada");
            
            }
            
            con.close();
            
        } catch (Exception e)
        {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
    }//GEN-LAST:event_btnInfoClienteActionPerformed

    private void btnInfoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEmpleadoActionPerformed
        Connection con = null;
        try {
            con = Conexion2.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados "
                    + "WHERE cedula=?");
            ps.setString(1, txtCedEmpleado.getText());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                jlNombreEmpleado.setText(rs.getString("nombre"));
                                             
            } else {
                //el else cuando la cedula no coincida
                JOptionPane.showMessageDialog(null, "Cedula no registrada:");
            }
            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnInfoEmpleadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnFinalizarVenta;
    private javax.swing.JButton btnInfoCliente;
    private javax.swing.JButton btnInfoEmpleado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cbMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlNombreCliente;
    private javax.swing.JLabel jlNombreEmpleado;
    private javax.swing.JLabel jlTipoCliente;
    private javax.swing.JTable jtCatalogoProductos;
    private javax.swing.JTable jtProductosSeleccionados;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCedCliente;
    private javax.swing.JTextField txtCedEmpleado;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtMontoFacturado;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtProductosAdquiridos;
    // End of variables declaration//GEN-END:variables
}
