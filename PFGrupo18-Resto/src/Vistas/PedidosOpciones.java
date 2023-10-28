/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.PedidoData;
import Entidades.PanelPersonalizado;
import static Vistas.MenuPrincipal.Escritorio;

/**
 *
 * @author nstut
 */
public class PedidosOpciones extends javax.swing.JInternalFrame {
    PanelPersonalizado fondo = new PanelPersonalizado("/imagenes/fondoInternal2.jpg");
    /**
     * Creates new form PedidosOpciones
     */
    public PedidosOpciones() {
        this.setContentPane(fondo);
        initComponents();
        mostrarContenido();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCargarPedido = new javax.swing.JButton();
        jbEntregarCobrar = new javax.swing.JButton();
        jbRegistro = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();

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

        jbCargarPedido.setBackground(new java.awt.Color(40, 40, 40));
        jbCargarPedido.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbCargarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jbCargarPedido.setText("Cargar Pedido");
        jbCargarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCargarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarPedidoActionPerformed(evt);
            }
        });

        jbEntregarCobrar.setBackground(new java.awt.Color(40, 40, 40));
        jbEntregarCobrar.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbEntregarCobrar.setForeground(new java.awt.Color(255, 255, 255));
        jbEntregarCobrar.setText("Gestionar Pedidos");
        jbEntregarCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEntregarCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntregarCobrarActionPerformed(evt);
            }
        });

        jbRegistro.setBackground(new java.awt.Color(40, 40, 40));
        jbRegistro.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jbRegistro.setText("Registro");
        jbRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistroActionPerformed(evt);
            }
        });

        jbVolver.setBackground(new java.awt.Color(40, 40, 40));
        jbVolver.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(255, 255, 255));
        jbVolver.setText("Volver");
        jbVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbEntregarCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jbCargarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jbCargarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbEntregarCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEntregarCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntregarCobrarActionPerformed
        this.dispose();
        Escritorio.removeAll();
        Escritorio.repaint();
        PedidosGestionar pg = new PedidosGestionar();
        
        pg.setVisible(true);
        Escritorio.add(pg);
        Escritorio.moveToFront(pg);
    }//GEN-LAST:event_jbEntregarCobrarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuPrincipal.Escritorio.add(MenuPrincipal.jpBotonesPanel);
    }//GEN-LAST:event_formInternalFrameClosed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbCargarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarPedidoActionPerformed
        this.dispose();
        Escritorio.removeAll();
        Escritorio.repaint();
        
        PedidoData pd = new PedidoData();
        int id_pedido = pd.crearPedido();
        
        PedidosCargar pc = new PedidosCargar(id_pedido);
        pc.setVisible(true);
        Escritorio.add(pc);
        Escritorio.moveToFront(pc);
    }//GEN-LAST:event_jbCargarPedidoActionPerformed

    private void jbRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistroActionPerformed
        this.dispose();
        Escritorio.removeAll();
        Escritorio.repaint();
        PedidosRegistro pg = new PedidosRegistro();
        pg.setVisible(true);
        Escritorio.add(pg);
        Escritorio.moveToFront(pg);
    }//GEN-LAST:event_jbRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCargarPedido;
    private javax.swing.JButton jbEntregarCobrar;
    private javax.swing.JButton jbRegistro;
    private javax.swing.JButton jbVolver;
    // End of variables declaration//GEN-END:variables
private void mostrarContenido() {
    if (MenuPrincipal.mesero) {
        jbRegistro.setVisible(false);
        this.setSize(getWidth(), getHeight()-100);
        
        this.setLocation(130, 80);
    } else {
        this.setLocation(130, 45);
    }
}

}
