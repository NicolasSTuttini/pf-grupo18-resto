/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.ProductoData;
import Entidades.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nstut
 */
public class ProductosModificar extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int fila, int column) {
                if (column == 0) {
                    return false;
                }else{
                    return true;
                }
        }
    };    
    /**
     * Creates new form ProductosModificar
     */
    public ProductosModificar() {
        initComponents();
        armarCabecera();
        vaciarTabla();
        cargarActivos();
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
        jrActivos = new javax.swing.JRadioButton();
        jrInactivos = new javax.swing.JRadioButton();
        jbAlta = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("Actualizar carta");

        jrActivos.setSelected(true);
        jrActivos.setText("activos");
        jrActivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrActivosItemStateChanged(evt);
            }
        });
        jrActivos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrActivosStateChanged(evt);
            }
        });
        jrActivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrActivosMouseClicked(evt);
            }
        });
        jrActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivosActionPerformed(evt);
            }
        });
        jrActivos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jrActivosPropertyChange(evt);
            }
        });

        jrInactivos.setText("inactivos");
        jrInactivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrInactivosItemStateChanged(evt);
            }
        });
        jrInactivos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jrInactivosStateChanged(evt);
            }
        });
        jrInactivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrInactivosMouseClicked(evt);
            }
        });
        jrInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInactivosActionPerformed(evt);
            }
        });

        jbAlta.setText("Alta");
        jbAlta.setEnabled(false);
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbBaja.setText("Baja");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jLabel2.setText("Nombre:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jLabel3.setText("\"Debe presionar enter antes de intentar actaulizar el valor\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jbAlta)
                                .addGap(38, 38, 38)
                                .addComponent(jbBaja)
                                .addGap(194, 194, 194)
                                .addComponent(jbActualizar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jrActivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrInactivos)
                        .addGap(80, 80, 80))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrActivos)
                    .addComponent(jrInactivos))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlta)
                    .addComponent(jbBaja)
                    .addComponent(jbActualizar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrActivosActionPerformed

    private void jrInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInactivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrInactivosActionPerformed

    private void jrActivosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jrActivosPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jrActivosPropertyChange

    private void jrActivosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrActivosStateChanged
       
    }//GEN-LAST:event_jrActivosStateChanged

    private void jrInactivosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jrInactivosStateChanged
     
    }//GEN-LAST:event_jrInactivosStateChanged

    private void jrActivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrActivosMouseClicked
       
       
    }//GEN-LAST:event_jrActivosMouseClicked

    private void jrInactivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrInactivosMouseClicked

    }//GEN-LAST:event_jrInactivosMouseClicked

    private void jrActivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrActivosItemStateChanged
        vaciarTabla ();
       if (jrActivos.isSelected()) {
        jrInactivos.setSelected(false);
        jbAlta.setEnabled(false);
        jbBaja.setEnabled(true);
        jbActualizar.setEnabled(true);
        cargarActivos ();
    } else {
        jrInactivos.setSelected(true);
        jbAlta.setEnabled(true);
        jbBaja.setEnabled(false);
        jbActualizar.setEnabled(false);
    }
    }//GEN-LAST:event_jrActivosItemStateChanged

    private void jrInactivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrInactivosItemStateChanged
        vaciarTabla ();
        if (jrInactivos.isSelected()) {
        jrActivos.setSelected(false);
        jbAlta.setEnabled(true);
        jbBaja.setEnabled(false);
        jbActualizar.setEnabled(false);
        cargarInactivos ();
        } else {
        jrActivos.setSelected(true);
        jbAlta.setEnabled(false);
        jbBaja.setEnabled(true);
        jbActualizar.setEnabled(true);
        
    }
    }//GEN-LAST:event_jrInactivosItemStateChanged

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        if (jrActivos.isSelected()) {
            vaciarTabla();
            cargarActivos ();
        } else {
            vaciarTabla();
            cargarInactivos ();
        }
        
    }//GEN-LAST:event_jtNombreKeyReleased

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        if (jtTablaProductos.getSelectedRowCount() > 0) {
            ProductoData prod = new ProductoData();
            int exito = 0;
            for (int i = 0; i < jtTablaProductos.getSelectedRowCount(); i++) {
                int fila = jtTablaProductos.getSelectedRows()[i];
                int id = Integer.parseInt(jtTablaProductos.getValueAt(fila, 0).toString());
                if(prod.altaProducto(id) > 0) {
                    exito++;
                }
            }
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se dió de alta el producto.");
            } else if (exito > 1) {
                JOptionPane.showMessageDialog(null, "Se dieron de alta los productos.");
            }
            vaciarTabla();
            cargarInactivos ();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.");
        }
        
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed

        if (jtTablaProductos.getSelectedRowCount() > 0) {
            ProductoData prod = new ProductoData();
            int exito = 0;
            for (int i = 0; i < jtTablaProductos.getSelectedRowCount(); i++) {
                int fila = jtTablaProductos.getSelectedRows()[i];
                int id = Integer.parseInt(jtTablaProductos.getValueAt(fila, 0).toString());
                if(prod.eliminarProducto(id) > 0) {
                    exito++;
                }
            }
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se dió de baja el producto.");
            } else if (exito > 1) {
                JOptionPane.showMessageDialog(null, "Se dieron de baja los productos.");
            }
            vaciarTabla();
            cargarActivos ();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.");
        }
        
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        ProductoData prod = new ProductoData();
        int fila = jtTablaProductos.getSelectedRow();
        try {
            if( fila >= 0) {
                int id = Integer.parseInt(jtTablaProductos.getValueAt(fila, 0).toString());
                String nombre = jtTablaProductos.getValueAt(fila, 1).toString();
                double precio = Double.parseDouble(jtTablaProductos.getValueAt(fila, 2).toString());

                prod.modificarProducto(nombre, precio, id);
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un valor numerico.");
        }
            vaciarTabla();
            if (jrActivos.isSelected()) {
                cargarActivos ();
            }
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JRadioButton jrActivos;
    private javax.swing.JRadioButton jrInactivos;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtTablaProductos;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Precio");
    jtTablaProductos.setModel(modelo);
}
private void vaciarTabla () {
    for (int i = modelo.getRowCount()-1; i >= 0;i--){
        modelo.removeRow(i);
    }
}
private void cargarActivos (){
        ProductoData prod = new ProductoData();
        List <Producto> listaActivos = prod.listarProductos();
        
        for (Producto aux : listaActivos){
            if (aux.isEstado()){
                if(aux.getNombre().startsWith(jtNombre.getText()) || jtNombre.getText().equals("") ) {
                    modelo.addRow(new Object[]{aux.getId_producto(),aux.getNombre(),aux.getPrecio()});
                }
            }
        }
}

private void cargarInactivos (){
        ProductoData prod = new ProductoData();
        List <Producto> listaActivos = prod.listarProductos();
        
        for (Producto aux : listaActivos){
            if (!aux.isEstado()){
                if(aux.getNombre().startsWith(jtNombre.getText()) || jtNombre.getText().equals("") ) {
                modelo.addRow(new Object[]{aux.getId_producto(),aux.getNombre(),aux.getPrecio()});
                }
            }
        }    
}
/*private void mostrarSeleccion () {
    if (jrActivos.isSelected()) {
        jrInactivos.setSelected(false);
        jbAlta.setEnabled(false);
        jbBaja.setEnabled(true);
        cargarActivos ();
    } else {
        jrActivos.setSelected(false);
        jbAlta.setEnabled(true);
        jbBaja.setEnabled(false);
        cargarInactivos ();
    }

}
// Agregar KeyListener al JTextField para detectar la tecla "Enter"
        jtContrasenia.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    realizarAccionIngresar();
                }
            }
        });*/
/*private int devolverId () {
    int fila = jtTablaProductos.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(jtTablaProductos.getValueAt(fila, 0).toString());
            return id;
        } else {
            return 0;
        }    
    
}*/
}
