/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.ProductoData;
import AccesoDatos.ProductosPedidosData;
import Entidades.Producto;
import Entidades.ProductosPedidos;
import static Vistas.MenuPrincipal.Escritorio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nstut
 */
public class PedidosAgregarProductos extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int column) {
            if (column < 3){
                return false; 
            } else {
                return true;
            }
        }
    };    
    /**
     * Creates new form PedidosAgregarProductos
     */
    public PedidosAgregarProductos() {
        initComponents();
        armarCabecera();
        vaciarTabla();
        cargarProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtProd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaProductos = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Productos");

        jtProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtProdKeyReleased(evt);
            }
        });

        jtTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jbAgregar.setText("Agregar al pedido");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jtProd, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAgregar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdKeyReleased
        vaciarTabla();
        cargarProductos ();
    }//GEN-LAST:event_jtProdKeyReleased

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Escritorio.removeAll();
        Escritorio.repaint();
        PedidosCargar pc = new PedidosCargar(PedidosCargar.getId_pedido());
        pc.setVisible(true);
        Escritorio.add(pc);
        Escritorio.moveToFront(pc);
    }//GEN-LAST:event_formInternalFrameClosed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        ProductosPedidosData ppd = new ProductosPedidosData();
        int filas = jtTablaProductos.getSelectedRowCount();
        
        int id_pedido = PedidosCargar.getId_pedido();
        int agregados = 0;
        
        if (filas > 0){
            for (int i = 0; i < jtTablaProductos.getSelectedRowCount(); i++) {
                int fila = jtTablaProductos.getSelectedRows()[i];
   
                int id_producto = Integer.parseInt(jtTablaProductos.getValueAt(fila, 0).toString());
                int cantidad = Integer.parseInt(jtTablaProductos.getValueAt(fila, 3).toString());
                agregados += ppd.agregarProductosPedidos (id_pedido,id_producto,cantidad);
            }
            
            
            if (agregados == 1) {
                JOptionPane.showMessageDialog(null, "Pedido agregado exitosamente.");
            } else if (agregados > 1) {
                JOptionPane.showMessageDialog(null, "Pedidos agregados exitosamente.");
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto.");
        }
        
        
        
        
        
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JTextField jtProd;
    private javax.swing.JTable jtTablaProductos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Precio");
    modelo.addColumn("Cantidad");
    jtTablaProductos.setModel(modelo);
}
    private void vaciarTabla () {
        for (int i = modelo.getRowCount()-1; i >= 0;i--){
            modelo.removeRow(i);
        }
    }
    private void cargarProductos (){
            ProductoData prod = new ProductoData();
            List <Producto> listaActivos = prod.listarProductos();

            for (Producto aux : listaActivos){
                if (aux.isEstado()){
                    if(aux.getNombre().startsWith(jtProd.getText()) || jtProd.getText().equals("") ) {
                        modelo.addRow(new Object[]{aux.getId_producto(),aux.getNombre(),aux.getPrecio(), 1});
                    }
                }
            }
    }
}
