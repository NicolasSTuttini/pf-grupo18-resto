/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import javax.swing.JOptionPane;
import sun.awt.AWTAccessor;

/**
 *
 * @author nstut
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private boolean admin  ,mesero;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(boolean admin, boolean mesero) {
        this.admin = admin;
        this.mesero = mesero;
        initComponents();
        setLocationRelativeTo(null);
        validarMenuMostrar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jmMenuBarra = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAgregarProducto = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmMesasGestion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmMeseros = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                EscritorioComponentRemoved(evt);
            }
        });
        Escritorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                EscritorioComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                EscritorioComponentMoved(evt);
            }
        });
        Escritorio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                EscritorioPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMenu1.setText("Productos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmAgregarProducto.setText("Agregar");
        jmAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarProductoActionPerformed(evt);
            }
        });
        jMenu1.add(jmAgregarProducto);

        jMenuItem3.setText("Modificar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jmMenuBarra.add(jMenu1);

        jMenu2.setText("Mesas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmMesasGestion.setText("Gestionar");
        jmMesasGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMesasGestionActionPerformed(evt);
            }
        });
        jMenu2.add(jmMesasGestion);

        jmMenuBarra.add(jMenu2);

        jMenu3.setText("Pedidos");
        jmMenuBarra.add(jMenu3);

        jmMeseros.setText("Meseros");
        jmMenuBarra.add(jmMeseros);

        jMenu5.setText("         ");
        jMenu5.setEnabled(false);
        jMenu5.setPreferredSize(new java.awt.Dimension(315, 21));
        jmMenuBarra.add(jMenu5);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jmMenuBarra.add(jmSalir);

        setJMenuBar(jmMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarProductoActionPerformed
    Escritorio.removeAll();
    Escritorio.repaint();
    ProductosAgregar pa = new ProductosAgregar();
    pa.setVisible(true);
    Escritorio.add(pa);
    Escritorio.moveToFront(pa);
    }//GEN-LAST:event_jmAgregarProductoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void EscritorioComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_EscritorioComponentRemoved
       
    }//GEN-LAST:event_EscritorioComponentRemoved

    private void EscritorioComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_EscritorioComponentHidden

    }//GEN-LAST:event_EscritorioComponentHidden

    private void EscritorioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_EscritorioPropertyChange
   
    }//GEN-LAST:event_EscritorioPropertyChange

    private void EscritorioComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_EscritorioComponentMoved

    }//GEN-LAST:event_EscritorioComponentMoved

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    Escritorio.removeAll();
    Escritorio.repaint();
    ProductosModificar pmodif = new ProductosModificar();
    pmodif.setVisible(true);
    Escritorio.add(pmodif);
    Escritorio.moveToFront(pmodif);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmMesasGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMesasGestionActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        MesasGestionar mg = new MesasGestionar();
        mg.setVisible(true);
        Escritorio.add(mg);
        Escritorio.moveToFront(mg);
    }//GEN-LAST:event_jmMesasGestionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmAgregarProducto;
    private javax.swing.JMenuBar jmMenuBarra;
    private javax.swing.JMenuItem jmMesasGestion;
    private javax.swing.JMenu jmMeseros;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables

public void validarMenuMostrar () {
    if (admin){
         jmMenuBarra.setVisible(true);
    } else if (mesero) {
         jmMenuBarra.setVisible(true);
         jmMeseros.setVisible(false);
    } else {
         JOptionPane.showMessageDialog(null, "Error al mostrar el menu");
    }
}
}
