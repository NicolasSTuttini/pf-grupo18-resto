/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoDatos.MeseroData;
import Entidades.Mesero;
import Entidades.PanelPersonalizado;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author fliac
 */
public class MeserosGestionar extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable (int fila, int columna) {
            if (columna == 0 || jrMInactivos.isSelected()) {
                return false;
            } else {
                return true;
            }
        }
    }; 
    PanelPersonalizado fondo = new PanelPersonalizado("/imagenes/fondoInternal2.jpg");
    
    /*
     * Creates new form MeserosGestionar
     */
    public MeserosGestionar() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocation(90, 67);
        agregarCabecera();
        vaciarTabla();
        cargarActivos ();
        jtTablaMeseros.setSelectionBackground(Color.LIGHT_GRAY);
        jtTablaMeseros.setRowSelectionAllowed(true);
        
        jbContra.setVisible(false);
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
        jbAgregarNuevoMesero = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMeseros = new javax.swing.JTable();
        jbMeserosBaja = new javax.swing.JButton();
        jbMeserosAlta = new javax.swing.JButton();
        jbMeserosModif = new javax.swing.JButton();
        jrMActivos = new javax.swing.JRadioButton();
        jrMInactivos = new javax.swing.JRadioButton();
        jbVolver = new javax.swing.JButton();
        jbContra = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
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
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Meseros");

        jbAgregarNuevoMesero.setBackground(new java.awt.Color(0, 153, 51));
        jbAgregarNuevoMesero.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbAgregarNuevoMesero.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregarNuevoMesero.setText("Agregar nuevo mesero/a");
        jbAgregarNuevoMesero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAgregarNuevoMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarNuevoMeseroActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        jtTablaMeseros.setBackground(new java.awt.Color(40, 40, 40));
        jtTablaMeseros.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jtTablaMeseros.setForeground(new java.awt.Color(255, 255, 255));
        jtTablaMeseros.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaMeseros.getTableHeader().setReorderingAllowed(false);
        jtTablaMeseros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMeserosMouseClicked(evt);
            }
        });
        jtTablaMeseros.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtTablaMeserosPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaMeseros);

        jbMeserosBaja.setBackground(new java.awt.Color(255, 0, 0));
        jbMeserosBaja.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbMeserosBaja.setForeground(new java.awt.Color(255, 255, 255));
        jbMeserosBaja.setText("Baja");
        jbMeserosBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMeserosBaja.setMaximumSize(new java.awt.Dimension(55, 40));
        jbMeserosBaja.setPreferredSize(new java.awt.Dimension(55, 40));
        jbMeserosBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbMeserosBajaMouseClicked(evt);
            }
        });
        jbMeserosBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeserosBajaActionPerformed(evt);
            }
        });

        jbMeserosAlta.setBackground(new java.awt.Color(0, 153, 51));
        jbMeserosAlta.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbMeserosAlta.setForeground(new java.awt.Color(255, 255, 255));
        jbMeserosAlta.setText("Alta");
        jbMeserosAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMeserosAlta.setEnabled(false);
        jbMeserosAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeserosAltaActionPerformed(evt);
            }
        });

        jbMeserosModif.setBackground(new java.awt.Color(0, 153, 255));
        jbMeserosModif.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbMeserosModif.setForeground(new java.awt.Color(255, 255, 255));
        jbMeserosModif.setText("Modificar");
        jbMeserosModif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMeserosModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeserosModifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbMeserosAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jbMeserosBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jbMeserosModif)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMeserosModif, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMeserosBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMeserosAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jrMActivos.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jrMActivos.setForeground(new java.awt.Color(255, 255, 255));
        jrMActivos.setSelected(true);
        jrMActivos.setText("Meseros activos");
        jrMActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrMActivos.setOpaque(false);
        jrMActivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrMActivosItemStateChanged(evt);
            }
        });
        jrMActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMActivosActionPerformed(evt);
            }
        });

        jrMInactivos.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jrMInactivos.setForeground(new java.awt.Color(255, 255, 255));
        jrMInactivos.setText("Meseros inactivos");
        jrMInactivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrMInactivos.setOpaque(false);
        jrMInactivos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrMInactivosItemStateChanged(evt);
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

        jbContra.setBackground(new java.awt.Color(0, 153, 255));
        jbContra.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jbContra.setForeground(new java.awt.Color(255, 255, 255));
        jbContra.setText("Contraseña");
        jbContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jrMActivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrMInactivos)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbAgregarNuevoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbContra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAgregarNuevoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrMActivos)
                    .addComponent(jrMInactivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMeserosModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMeserosModifActionPerformed
        MeseroData md = new MeseroData();
        int fila = jtTablaMeseros.getSelectedRow();
        if (fila >= 0) {
            try {
                int id = Integer.parseInt(jtTablaMeseros.getValueAt(fila, 0).toString());
                int dni = Integer.parseInt(jtTablaMeseros.getValueAt(fila, 1).toString());
                String nombre = jtTablaMeseros.getValueAt(fila, 2).toString();
                String apellido = jtTablaMeseros.getValueAt(fila, 3).toString();
                if (dni < 10000000 || dni > 60000000){
                    JOptionPane.showMessageDialog(this, "DNI invalido.");
                } else if (comprobarCadena(nombre)) {
                    JOptionPane.showMessageDialog(this, "El nombre no puede contener números.");
                } else if(nombre.length() > 30) {
                    JOptionPane.showMessageDialog(this, "El nombre no puede tener más de 30 caracteres.");
                } else if(nombre.length() < 3) {
                    JOptionPane.showMessageDialog(this, "El nombre debe tener al menos 3 caracteres.");
                } else if (comprobarCadena(apellido)) {
                    JOptionPane.showMessageDialog(this, "El apellido no puede contener números.");
                } else if(apellido.length() > 30) {
                    JOptionPane.showMessageDialog(this, "El apellido no puede tener más de 30 caracteres.");
                } else if(apellido.length() < 3) {
                    JOptionPane.showMessageDialog(this, "El apellido debe tener al menos 3 caracteres.");
                } else {
                    md.modificarMesero(id,dni, nombre, apellido);
                }
                vaciarTabla();
                cargarActivos ();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El dni debe ser un valor numerico.");
                vaciarTabla();
                cargarActivos ();
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un mesero/a.");
        }
    }//GEN-LAST:event_jbMeserosModifActionPerformed

    private void jbAgregarNuevoMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarNuevoMeseroActionPerformed
       this.dispose();
       MenuPrincipal.Escritorio.removeAll();
       MenuPrincipal.Escritorio.repaint();
       MeseroAgregarNuevo ma = new MeseroAgregarNuevo();
       ma.setVisible(true);
       MenuPrincipal.Escritorio.add(ma);
       MenuPrincipal.Escritorio.moveToFront(ma);
    }//GEN-LAST:event_jbAgregarNuevoMeseroActionPerformed

    private void jrMActivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrMActivosItemStateChanged
        vaciarTabla();
        if (jrMActivos.isSelected()) {
            jrMInactivos.setSelected(false);
            jbMeserosAlta.setEnabled(false);
            jbMeserosBaja.setEnabled(true);
            jbMeserosModif.setEnabled(true);
            cargarActivos();
        } else {
            jrMInactivos.setSelected(true);
            jbMeserosAlta.setEnabled(true);
            jbMeserosBaja.setEnabled(false);
            jbMeserosModif.setEnabled(false);
        }
        
        if (jtTablaMeseros.getSelectedRowCount()== 1) {
            jbContra.setVisible(true);
        } else {
           jbContra.setVisible(false);
        }
    }//GEN-LAST:event_jrMActivosItemStateChanged

    private void jrMInactivosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrMInactivosItemStateChanged
        vaciarTabla();
        if (jrMInactivos.isSelected()) {
            jrMActivos.setSelected(false);
            jbMeserosAlta.setEnabled(true);
            jbMeserosBaja.setEnabled(false);
            jbMeserosModif.setEnabled(false);
            cargarInactivos();
        } else {
            jrMActivos.setSelected(true);
            jbMeserosAlta.setEnabled(false);
            jbMeserosBaja.setEnabled(true);
            jbMeserosModif.setEnabled(true);
        }
        
        if (jtTablaMeseros.getSelectedRowCount()== 1) {
           jbContra.setVisible(true);
        } else {
           jbContra.setVisible(false);
        }
    }//GEN-LAST:event_jrMInactivosItemStateChanged

    private void jbMeserosBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMeserosBajaActionPerformed
        if (jtTablaMeseros.getSelectedRowCount() > 0) {
            MeseroData mes = new MeseroData();
            int exito = 0;
            for (int i = 0; i < jtTablaMeseros.getSelectedRowCount(); i++) {
                int fila = jtTablaMeseros.getSelectedRows()[i];
                int id = Integer.parseInt(jtTablaMeseros.getValueAt(fila, 0).toString());
                if(mes.eliminarMesero(id) > 0) {
                    exito++;
                }
            }
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se dió de baja el/la mesero/a.");
            } else if (exito > 1) {
                JOptionPane.showMessageDialog(null, "Se dieron de baja los meseros.");
            }
            vaciarTabla();
            cargarActivos ();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un mesero/a.");
        }    
    }//GEN-LAST:event_jbMeserosBajaActionPerformed

    private void jbMeserosBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMeserosBajaMouseClicked
        
    }//GEN-LAST:event_jbMeserosBajaMouseClicked

    private void jbMeserosAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMeserosAltaActionPerformed
        if (jtTablaMeseros.getSelectedRowCount() > 0) {
            MeseroData mes = new MeseroData();
            int exito = 0;
            for (int i = 0; i < jtTablaMeseros.getSelectedRowCount(); i++) {
                int fila = jtTablaMeseros.getSelectedRows()[i];
                int id = Integer.parseInt(jtTablaMeseros.getValueAt(fila, 0).toString());
                if(mes.altaMesero(id) > 0) {
                    exito++;
                }
            }
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se dió de alta el/la mesero/a.");
            } else if (exito > 1) {
                JOptionPane.showMessageDialog(null, "Se dieron de alta los meseros.");
            }
            vaciarTabla();
            cargarInactivos ();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un mesero/a.");
        }    
    }//GEN-LAST:event_jbMeserosAltaActionPerformed

    private void jrMActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMActivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrMActivosActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
       
    }//GEN-LAST:event_formInternalFrameClosing

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuPrincipal.Escritorio.add(MenuPrincipal.jpBotonesPanel);
    }//GEN-LAST:event_formInternalFrameClosed

    private void jbContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContraActionPerformed
        MeseroData md = new MeseroData();
        if(jtTablaMeseros.getSelectedRowCount() == 1) {
            int fila = jtTablaMeseros.getSelectedRow();
            int id = Integer.parseInt(jtTablaMeseros.getValueAt(fila, 0).toString());
            
            this.dispose();
            MenuPrincipal.Escritorio.removeAll();
            MenuPrincipal.Escritorio.repaint();
            MeserosContrasenia mc = new MeserosContrasenia(id);
            mc.setVisible(true);
            MenuPrincipal.Escritorio.add(mc);
            MenuPrincipal.Escritorio.moveToFront(mc);
        }
        
    }//GEN-LAST:event_jbContraActionPerformed

    private void jtTablaMeserosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtTablaMeserosPropertyChange

    }//GEN-LAST:event_jtTablaMeserosPropertyChange

    private void jtTablaMeserosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMeserosMouseClicked
        if (jtTablaMeseros.getSelectedRowCount()== 1) {
           jbContra.setVisible(true);
       } else {
           jbContra.setVisible(false);
       }
    }//GEN-LAST:event_jtTablaMeserosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregarNuevoMesero;
    private javax.swing.JButton jbContra;
    private javax.swing.JButton jbMeserosAlta;
    private javax.swing.JButton jbMeserosBaja;
    private javax.swing.JButton jbMeserosModif;
    private javax.swing.JButton jbVolver;
    private javax.swing.JRadioButton jrMActivos;
    private javax.swing.JRadioButton jrMInactivos;
    private javax.swing.JTable jtTablaMeseros;
    // End of variables declaration//GEN-END:variables

private void agregarCabecera() {
    modelo.addColumn("ID");
    modelo.addColumn("DNI");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    jtTablaMeseros.setModel(modelo);
    
    TableColumnModel modeloCol = jtTablaMeseros.getColumnModel();
    modeloCol.getColumn(0).setPreferredWidth(10);
    modeloCol.getColumn(1).setPreferredWidth(55);
    modeloCol.getColumn(2).setPreferredWidth(80);
    modeloCol.getColumn(3).setPreferredWidth(80);
}
private void vaciarTabla() {
    for (int i = jtTablaMeseros.getRowCount()-1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}
private void cargarActivos () {
    MeseroData md = new MeseroData();
    List<Mesero> meseros = md.listarMeseros();
    for (Mesero aux : meseros) {
        if (aux.isEstado()) {
            modelo.addRow(new Object[]{aux.getId_mesero(),aux.getDni(),aux.getNombre(),aux.getApellido()});
        }
    }
}
private void cargarInactivos () {
    MeseroData md = new MeseroData();
    List<Mesero> meseros = md.listarMeseros();
    for (Mesero aux : meseros) {
        if (!aux.isEstado()) {
            modelo.addRow(new Object[]{aux.getId_mesero(),aux.getDni(),aux.getNombre(),aux.getApellido()});
        }
    }
}
private boolean comprobarCadena ( String cadena){
         return cadena.matches(".*\\d.*");
    }
}
