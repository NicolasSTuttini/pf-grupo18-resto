/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.PedidoData;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.awt.AWTAccessor;

/**
 *
 * @author nstut
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private boolean admin  ,mesero;
    fondoPanel fondo = new fondoPanel();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(boolean admin, boolean mesero) {
        this.setContentPane(fondo);
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
        jmProductos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmMesas = new javax.swing.JMenu();
        jmMesasGestion = new javax.swing.JMenuItem();
        jmPedidos = new javax.swing.JMenu();
        mjCargarPedido = new javax.swing.JMenuItem();
        jmPedidosGestionar = new javax.swing.JMenuItem();
        jmPedidosRegistro = new javax.swing.JMenuItem();
        jmMeseros = new javax.swing.JMenu();
        jmGestionarMesero = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
            .addGap(0, 655, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jmProductos.setText("Productos");
        jmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Gestionar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmProductos.add(jMenuItem3);

        jmMenuBarra.add(jmProductos);

        jmMesas.setText("Mesas");
        jmMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMesasActionPerformed(evt);
            }
        });

        jmMesasGestion.setText("Gestionar");
        jmMesasGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMesasGestionActionPerformed(evt);
            }
        });
        jmMesas.add(jmMesasGestion);

        jmMenuBarra.add(jmMesas);

        jmPedidos.setText("Pedidos");

        mjCargarPedido.setText("Cargar pedido");
        mjCargarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mjCargarPedidoActionPerformed(evt);
            }
        });
        jmPedidos.add(mjCargarPedido);

        jmPedidosGestionar.setText("Entregar y cobrar");
        jmPedidosGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidosGestionarActionPerformed(evt);
            }
        });
        jmPedidos.add(jmPedidosGestionar);

        jmPedidosRegistro.setText("Registro");
        jmPedidosRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPedidosRegistroActionPerformed(evt);
            }
        });
        jmPedidos.add(jmPedidosRegistro);

        jmMenuBarra.add(jmPedidos);

        jmMeseros.setText("Meseros");

        jmGestionarMesero.setText("Gestionar");
        jmGestionarMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionarMeseroActionPerformed(evt);
            }
        });
        jmMeseros.add(jmGestionarMesero);

        jmMenuBarra.add(jmMeseros);

        jMenu5.setText("         ");
        jMenu5.setEnabled(false);
        jMenu5.setPreferredSize(new java.awt.Dimension(315, 21));
        jmMenuBarra.add(jMenu5);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmProductosActionPerformed

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
     
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMesasActionPerformed
       
    }//GEN-LAST:event_jmMesasActionPerformed

    private void jmMesasGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMesasGestionActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        MesasGestionar mg = new MesasGestionar();
        mg.setVisible(true);
        Escritorio.add(mg);
        Escritorio.moveToFront(mg);
    }//GEN-LAST:event_jmMesasGestionActionPerformed

    private void jmGestionarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionarMeseroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        MeserosGestionar mg = new MeserosGestionar();
        mg.setVisible(true);
        Escritorio.add(mg);
        Escritorio.moveToFront(mg);
    }//GEN-LAST:event_jmGestionarMeseroActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
           /*System.exit(0);*/
           this.dispose();
    }//GEN-LAST:event_jmSalirMouseClicked

    private void mjCargarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mjCargarPedidoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        
        PedidoData pd = new PedidoData();
        int id_pedido = pd.crearPedido();
        
        PedidosCargar pc = new PedidosCargar(id_pedido);
        
        pc.setVisible(true);
        Escritorio.add(pc);
        Escritorio.moveToFront(pc);
        
    }//GEN-LAST:event_mjCargarPedidoActionPerformed

    private void jmPedidosGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidosGestionarActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        PedidosGestionar pg = new PedidosGestionar();
        
        pg.setVisible(true);
        Escritorio.add(pg);
        Escritorio.moveToFront(pg);
    }//GEN-LAST:event_jmPedidosGestionarActionPerformed

    private void jmPedidosRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPedidosRegistroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        PedidosRegistro pg = new PedidosRegistro();
        
        pg.setVisible(true);
        Escritorio.add(pg);
        Escritorio.moveToFront(pg);
    }//GEN-LAST:event_jmPedidosRegistroActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        PedidoData pd = new PedidoData();
        pd.eliminarPedidosVacios();
        
        
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmGestionarMesero;
    private javax.swing.JMenuBar jmMenuBarra;
    private javax.swing.JMenu jmMesas;
    private javax.swing.JMenuItem jmMesasGestion;
    private javax.swing.JMenu jmMeseros;
    private javax.swing.JMenu jmPedidos;
    private javax.swing.JMenuItem jmPedidosGestionar;
    private javax.swing.JMenuItem jmPedidosRegistro;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem mjCargarPedido;
    // End of variables declaration//GEN-END:variables

public void validarMenuMostrar () {
    if (admin){
         jmMenuBarra.setVisible(true);
    } else if (mesero) {
         jmMenuBarra.setVisible(true);
         jmMeseros.setVisible(false);
         jmProductos.setVisible(false);
         jmMesas.setVisible(false);
         jmPedidosRegistro.setVisible(false);
    } else {
         JOptionPane.showMessageDialog(null, "Error al mostrar el menu");
    }
}

class fondoPanel extends JPanel {
       private Image imagen;
       
       @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon (getClass().getResource("/imagenes/fondo.png")).getImage();
        g.drawImage(imagen,0,0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}    
}
