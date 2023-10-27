/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;


import AccesoDatos.LoginData;
import Entidades.PanelPersonalizado;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
// *
 * @author nstut
 */
public class LoginFrame extends javax.swing.JFrame {
    private boolean admin,mesero ;
    PanelPersonalizado fondo = new PanelPersonalizado("/imagenes/fondoLogin3.png");
    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        try {
            UIManager.setLookAndFeel(new HiFiLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
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

        jLabel2 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbIngresar = new javax.swing.JButton();
        jtContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI:");

        jtDni.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jtDni.setForeground(new java.awt.Color(255, 255, 255));
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDniKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        jbIngresar.setBackground(new java.awt.Color(0, 153, 51));
        jbIngresar.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jbIngresar.setText("Ingresar");
        jbIngresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 8, true));
        jbIngresar.setBorderPainted(false);
        jbIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        jtContra.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jtContra.setForeground(new java.awt.Color(255, 255, 255));
        jtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtContraActionPerformed(evt);
            }
        });
        jtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtContraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jtContra))
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jbIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        LoginData ld = new LoginData();
        try {
            int dni = Integer.parseInt(jtDni.getText());
            String pass = new String (jtContra.getPassword());
            
            int dniConfirmar;
            
            if (dni > 99999999) {
                JOptionPane.showMessageDialog(null,"Ingrese correctamente el DNI.");
            } else {
                dniConfirmar = ld.verificarDni(dni);
                if (dniConfirmar == 0){
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado.");
                } else if (dniConfirmar == 1) {
                    this.admin = ld.verificarContraAdmin(pass);
                    if (this.admin) {
                        this.dispose();
                    } else { 
                        JOptionPane.showMessageDialog(null,"Contraseña invalida.");
                    }
                }else if (dniConfirmar == 2){
                   this.mesero = ld.verificarContraMesero(pass);
                    if (this.mesero) {
                        this.dispose();
                    } else { 
                        JOptionPane.showMessageDialog(null,"Contraseña invalida.");
                    }
                }
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Ingresar solo números en el campo 'DNI'.");
        } 
    }//GEN-LAST:event_jbIngresarActionPerformed
    
    private void jbIngresarActionPerformed(KeyEvent evt) {                                           
        LoginData ld = new LoginData();
        try {
            int dni = Integer.parseInt(jtDni.getText());
            String pass = new String (jtContra.getPassword());
            
            int dniConfirmar;
            
            if (dni > 99999999) {
                JOptionPane.showMessageDialog(null,"Ingrese correctamente el DNI.");
            } else {
                dniConfirmar = ld.verificarDni(dni);
                if (dniConfirmar == 0){
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado.");
                } else if (dniConfirmar == 1) {
                    this.admin = ld.verificarContraAdmin(pass);
                    if (this.admin) {
                        this.dispose();
                    } else { 
                        JOptionPane.showMessageDialog(null,"Contraseña invalida.");
                    }
                }else if (dniConfirmar == 2){
                   this.mesero = ld.verificarContraMesero(pass);
                    if (this.mesero) {
                        this.dispose();
                    } else { 
                        JOptionPane.showMessageDialog(null,"Contraseña invalida.");
                    }
                }
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Ingresar solo números en el campo 'DNI'.");
        } 
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       MenuPrincipal menu = new MenuPrincipal(admin,mesero);
       menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtContraActionPerformed

    private void jtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             jbIngresarActionPerformed(evt);
        }    
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            if(JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?","Salir",0) == 0) {
                System.exit(0);
            }
          
        }
    }//GEN-LAST:event_jtDniKeyPressed

    private void jtContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtContraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             jbIngresarActionPerformed(evt);
        } 
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
          if(JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?","Salir",0) == 0) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jtContraKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       
    }//GEN-LAST:event_formKeyPressed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JPasswordField jtContra;
    private javax.swing.JTextField jtDni;
    // End of variables declaration//GEN-END:variables

/*private ResultSet () {
 
}*/
   /* class fondoPanel extends JPanel {
       private Image imagen;
       
    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon (getClass().getResource("/imagenes/fondoLogin3.png")).getImage();
        g.drawImage(imagen,0,0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    }*/
}
