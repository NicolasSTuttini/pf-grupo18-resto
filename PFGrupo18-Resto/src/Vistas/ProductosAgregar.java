/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.ProductoData;
import Entidades.PanelPersonalizado;
import javax.swing.JOptionPane;

/**
 *
 * @author nstut
 */
public class ProductosAgregar extends javax.swing.JInternalFrame {
    PanelPersonalizado fondo = new PanelPersonalizado("/imagenes/fondoInternal2.jpg");
    /**
     * Creates new form ProductosAgregar
     */
    public ProductosAgregar() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocation(85, 135);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
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

        jLabel1.setText("Agregar productos a catalogo");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Precio: ");

        jbAgregar.setText("Agregar");
        jbAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        ProductoData prod = new ProductoData();
        try {
            double precio = Double.parseDouble(jtPrecio.getText());
            if (precio < 0) {
                JOptionPane.showMessageDialog(this, "El precio debe ser una valor numerico mayor a cero.");
            } else {
                prod.agregarProducto(jtNombre.getText(), precio);
                jtNombre.setText("");
                jtPrecio.setText("");
            }
           
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El precio debe ser una valor numerico.");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
       MenuPrincipal.Escritorio.removeAll();
       MenuPrincipal.Escritorio.repaint();
       ProductosModificar pm = new ProductosModificar();
       pm.setVisible(true);
       MenuPrincipal.Escritorio.add(pm);
       MenuPrincipal.Escritorio.moveToFront(pm);
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
