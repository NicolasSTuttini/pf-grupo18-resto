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
        this.setLocation(73, 135);
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
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.white);
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

        jLabel1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Agregar productos a catalogo");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Precio: ");

        jtNombre.setBackground(new java.awt.Color(40, 40, 40));
        jtNombre.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jtNombre.setForeground(java.awt.Color.white);

        jtPrecio.setBackground(new java.awt.Color(40, 40, 40));
        jtPrecio.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jtPrecio.setForeground(java.awt.Color.white);

        jbAgregar.setBackground(new java.awt.Color(0, 153, 51));
        jbAgregar.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbAgregar.setForeground(java.awt.Color.white);
        jbAgregar.setText("Agregar");
        jbAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(40, 40, 40));
        jbSalir.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Volver");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jtPrecio)
                                .addGap(127, 127, 127)))))
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
