/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.MesaData;
import Entidades.Mesa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nstut
 */
public class MesasGestionar extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form MesasAgregar
     */
    public MesasGestionar() {
        initComponents();
        armarCabecera();
        vaciarTabla();
        cargarActivas();
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
        jbAgregarMesa = new javax.swing.JButton();
        jrActivas = new javax.swing.JRadioButton();
        jrInactivas = new javax.swing.JRadioButton();
        jbAlta = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMesas = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Mesas");

        jbAgregarMesa.setText("Agregar Mesa");
        jbAgregarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMesaActionPerformed(evt);
            }
        });

        jrActivas.setSelected(true);
        jrActivas.setText("Mesas activas");
        jrActivas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrActivasItemStateChanged(evt);
            }
        });
        jrActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivasActionPerformed(evt);
            }
        });

        jrInactivas.setText("Mesas inactivas");
        jrInactivas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrInactivasItemStateChanged(evt);
            }
        });

        jbAlta.setText("Alta");
        jbAlta.setEnabled(false);
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbBaja.setText("Baja");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jtTablaMesas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaMesas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jrActivas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrInactivas)))
                        .addComponent(jbAgregarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAgregarMesa)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrActivas)
                    .addComponent(jrInactivas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlta)
                    .addComponent(jbBaja))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        MesaData md =new MesaData();
        int  filasSelec = jtTablaMesas.getSelectedRowCount();
        if ( filasSelec> 0) {
            for (int i = 0; i < filasSelec; i++ ) {
                int fila = jtTablaMesas.getSelectedRows()[i];
                int id = Integer.parseInt(jtTablaMesas.getValueAt(fila , 0).toString());
                md.eliminarMesa(id);
                
            }
            vaciarTabla ();
            cargarActivas ();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una mesa.");
        }
        
        
        
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        MesaData md =new MesaData();
        int  filasSelec = jtTablaMesas.getSelectedRowCount();
        if ( filasSelec> 0) {
            for (int i = 0; i < filasSelec; i++ ) {
                int fila = jtTablaMesas.getSelectedRows()[i];
                int id = Integer.parseInt(jtTablaMesas.getValueAt(fila , 0).toString());
                md.altaMesa(id);
            }
            vaciarTabla ();
            cargarInactivas ();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una mesa.");
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jrInactivasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrInactivasItemStateChanged
        vaciarTabla ();
        if (jrInactivas.isSelected()) {
            jrActivas.setSelected(false);
            jbAlta.setEnabled(true);
            jbBaja.setEnabled(false);
            cargarInactivas ();
        } else {
            jrActivas.setSelected(true);
            jbAlta.setEnabled(false);
            jbBaja.setEnabled(true);
        }
    }//GEN-LAST:event_jrInactivasItemStateChanged

    private void jrActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrActivasActionPerformed

    private void jrActivasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrActivasItemStateChanged
        vaciarTabla ();
        if (jrActivas.isSelected()) {
            jrInactivas.setSelected(false);
            jbAlta.setEnabled(false);
            jbBaja.setEnabled(true);
            cargarActivas ();
        } else {
            jrInactivas.setSelected(true);
            jbAlta.setEnabled(true);
            jbBaja.setEnabled(false);
        }
    }//GEN-LAST:event_jrActivasItemStateChanged

    private void jbAgregarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMesaActionPerformed
        this.dispose();
        MenuPrincipal.Escritorio.removeAll();
        MenuPrincipal.Escritorio.repaint();
        MesasAgregar ma = new MesasAgregar();
        ma.setVisible(true);
        ma.setLocation(120, 125);
        MenuPrincipal.Escritorio.add(ma);
        MenuPrincipal.Escritorio.moveToFront(ma);
       

    }//GEN-LAST:event_jbAgregarMesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregarMesa;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JRadioButton jrActivas;
    private javax.swing.JRadioButton jrInactivas;
    private javax.swing.JTable jtTablaMesas;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("Numero");
        modelo.addColumn("Capacidad");
        jtTablaMesas.setModel(modelo);
        }
    
    private void vaciarTabla () {
        for (int i = modelo.getRowCount()-1; i >= 0;i--){
            modelo.removeRow(i);
        }
    }
    private void cargarActivas (){
        MesaData mesa = new MesaData();
        List <Mesa> listaActivas = mesa.listarMesas();

        for (Mesa aux : listaActivas){
            if (aux.isEstado()){
                    modelo.addRow(new Object[]{aux.getId_mesa(),aux.getCapacidad()});
            }
        }
    }

    private void cargarInactivas (){
            MesaData mesa = new MesaData();
            List <Mesa> listaActivas = mesa.listarMesas();

            for (Mesa aux : listaActivas){
                if (!aux.isEstado()){
                   modelo.addRow(new Object[]{aux.getId_mesa(),aux.getCapacidad()});
                }
            }    
    }
}
