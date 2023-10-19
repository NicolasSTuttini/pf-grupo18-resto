/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import AccesoDatos.MeseroData;
import javax.swing.JOptionPane;

/**
 *
 * @author fliac
 */
public class MeseroAgregarNuevo extends javax.swing.JInternalFrame {

    /** Creates new form AgregarNuevoMesero */
    public MeseroAgregarNuevo() {
        initComponents();
        this.setLocation(95, 75);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtContra = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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

        jLabel1.setText("DNI: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellido: ");

        jLabel4.setText("Contraseña: ");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nuevo mesero/a");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jtApellido)
                            .addComponent(jtContra))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
       MenuPrincipal.Escritorio.removeAll();
       MenuPrincipal.Escritorio.repaint();
       MeserosGestionar mg = new MeserosGestionar();
       mg.setVisible(true);
       MenuPrincipal.Escritorio.add(mg);
       MenuPrincipal.Escritorio.moveToFront(mg);
    }//GEN-LAST:event_formInternalFrameClosed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            int dni = Integer.parseInt(jtDni.getText().toString());
            String nombre = jtNombre.getText().toString();
            String apellido = jtApellido.getText().toString();
            String contra = jtContra.getText();
            
            if (comprobarCampos ()) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
            } else if (dni < 10000000 || dni > 60000000) {
                JOptionPane.showMessageDialog(null, "El DNI ingresado no es válido.");
            } else if (comprobarCadena(nombre)) {
                JOptionPane.showMessageDialog(null, "El nombre no puede contener números.");
            } else if(nombre.length() > 30) {
                 JOptionPane.showMessageDialog(null, "El nombre no puede contener más de 30 caracteres.");
            } else if(nombre.length() < 3) {
                 JOptionPane.showMessageDialog(null, "El nombre debe contener al menos 3 caracteres.");
            } else if (comprobarCadena(apellido)){ 
                JOptionPane.showMessageDialog(null, "El apellido no puede contener números.");
            } else if(apellido.length() > 30) {
                 JOptionPane.showMessageDialog(null, "El apellido no puede contener más de 30 caracteres.");
            } else if(apellido.length() < 3) {
                 JOptionPane.showMessageDialog(null, "El apellido debe contener al menos 3 caracteres.");
            } else if ( contra.length() < 8) {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres.");
            } else if ( contra.length() > 20) {
                JOptionPane.showMessageDialog(null, "La contraseña no puede tener más de 20 caracteres.");
            }else {
                MeseroData md = new MeseroData();
                md.agregarMesero(dni, nombre, apellido, contra);
                
                jtDni.setText("");
                jtNombre.setText("");
                jtApellido.setText("");
                jtContra.setText("");
            }
            
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El dni debe ser un valor numerico.");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estár completos.");
        }
        
        
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtContra;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
private boolean comprobarCadena ( String cadena){
         return cadena.matches(".*\\d.*");
    }
private boolean comprobarCampos () {
    if (jtDni.getText() == "" || jtNombre.getText() == "" ||
        jtApellido.getText() == "" || jtContra.getText() == "" ) {
        return true;
    } else {
        return false;
    }
}
}
