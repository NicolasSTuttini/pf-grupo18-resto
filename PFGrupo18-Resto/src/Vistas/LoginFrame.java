/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.Conexion;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
// *
 * @author nstut
 */
public class LoginFrame extends javax.swing.JFrame {
     private boolean admin,mesero ;
     fondoPanel fondo = new fondoPanel();
    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
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
        jtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtContrasenia = new javax.swing.JTextField();
        jbIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("  Ingreso al sistema");

        jLabel2.setText("DNI:");

        jLabel3.setText("Contraseña:");

        jtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtContraseniaActionPerformed(evt);
            }
        });

        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDni)
                            .addComponent(jtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        try {
            int dni = Integer.parseInt(jtDni.getText());
            String pass = jtContrasenia.getText();
            boolean usuarioError = true,contraError = true;
            if (dni > 99999999) {
                JOptionPane.showMessageDialog(null,"Ingrese correctamente el DNI.");
            } else {
                Connection con = Conexion.conectar();

                String sql = "SELECT * FROM administracion";
                PreparedStatement ps =  con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    if (rs.getInt("dni") == dni) {
                        if (rs.getString("contrasenia").equals(pass)) {
                            this.admin = true;
                            contraError = false;
                        }
                        usuarioError = false;
                    }
                }
                ps.close();

                String sql2 = "SELECT dni,contrasenia FROM mesero";
                PreparedStatement ps2 =  con.prepareStatement(sql2);
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    if (rs2.getInt("dni") == dni) {
                        if (rs2.getString("contrasenia").equals(pass) ) {
                            this.mesero = true;
                            contraError = false;
                        }
                        usuarioError = false;
                    }
                }
                ps2.close();
                if (usuarioError){
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado.");
                } else if (contraError) {
                    JOptionPane.showMessageDialog(null,"Contraseña invalida.");
                } else {
                    this.dispose();
                }
            }

        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Ingresar solo números en el campo 'DNI'.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ejecutar la consulta SQL.");
        }

    }//GEN-LAST:event_jbIngresarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       MenuPrincipal menu = new MenuPrincipal(admin,mesero);
       menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtContraseniaActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JTextField jtContrasenia;
    private javax.swing.JTextField jtDni;
    // End of variables declaration//GEN-END:variables

/*private ResultSet () {
 
}*/
    class fondoPanel extends JPanel {
       private Image imagen;
       
       @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon (getClass().getResource("/imagenes/fondoLogin1.jpg")).getImage();
        g.drawImage(imagen,0,0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
}
