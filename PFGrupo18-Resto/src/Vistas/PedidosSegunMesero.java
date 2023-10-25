/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.MeseroData;
import AccesoDatos.PedidoData;
import Entidades.Mesero;
import Entidades.Pedido;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nstut
 */
public class PedidosSegunMesero extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable (int row, int colum) {
            return false;
            }
    };
    /**
     * Creates new form PedidosSegunMesero
     */
    public PedidosSegunMesero() {
        initComponents();
        this.setLocation(80, 15);
        cargarMeseros();
        Calendar fechaHoy = Calendar.getInstance();
        jcFecha.setDate(fechaHoy.getTime());
        
        armarCabecera();
        vaciarTabla();
        cargarPedidos(jrCobrados.isSelected());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcMeseros = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPedidos = new javax.swing.JTable();
        jrAtendidos = new javax.swing.JRadioButton();
        jrCobrados = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jcFecha = new com.toedter.calendar.JDateChooser();

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

        jLabel1.setText("Pedidos");

        jLabel3.setText("Mesero:");

        jcMeseros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcMeserosItemStateChanged(evt);
            }
        });
        jcMeseros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcMeserosMouseClicked(evt);
            }
        });
        jcMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMeserosActionPerformed(evt);
            }
        });

        jtTablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaPedidos);

        jrAtendidos.setSelected(true);
        jrAtendidos.setText("Atendidos");
        jrAtendidos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrAtendidosItemStateChanged(evt);
            }
        });
        jrAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAtendidosActionPerformed(evt);
            }
        });

        jrCobrados.setText("Cobrados");
        jrCobrados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrCobradosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jrAtendidos)
                .addGap(69, 69, 69)
                .addComponent(jrCobrados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrAtendidos)
                    .addComponent(jrCobrados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel4.setText("Fecha:");

        jcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcFechaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcMeserosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMeserosItemStateChanged
        vaciarTabla();
        cargarPedidos(jrCobrados.isSelected());
    }//GEN-LAST:event_jcMeserosItemStateChanged

    private void jcMeserosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcMeserosMouseClicked

    }//GEN-LAST:event_jcMeserosMouseClicked

    private void jcMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMeserosActionPerformed

    }//GEN-LAST:event_jcMeserosActionPerformed

    private void jrAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAtendidosActionPerformed
        
    }//GEN-LAST:event_jrAtendidosActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuPrincipal.Escritorio.removeAll();
        MenuPrincipal.Escritorio.repaint();
        PedidosRegistro pg = new PedidosRegistro();
        
        pg.setVisible(true);
        MenuPrincipal.Escritorio.add(pg);
        MenuPrincipal.Escritorio.moveToFront(pg);
    }//GEN-LAST:event_formInternalFrameClosed

    private void jcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcFechaPropertyChange
        vaciarTabla();
        cargarPedidos(jrCobrados.isSelected());
    }//GEN-LAST:event_jcFechaPropertyChange

    private void jrAtendidosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrAtendidosItemStateChanged
       vaciarTabla();
        if (jrAtendidos.isSelected() == true) {
            jrCobrados.setSelected(false);
            
            
            cargarPedidos(jrCobrados.isSelected());
        } else {
            jrCobrados.setSelected(true);
        }
    }//GEN-LAST:event_jrAtendidosItemStateChanged

    private void jrCobradosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrCobradosItemStateChanged
        vaciarTabla();
        if (jrCobrados.isSelected() == true) {
            jrAtendidos.setSelected(false);
            cargarPedidos(jrCobrados.isSelected());
        } else {
            jrAtendidos.setSelected(true);
        }
    }//GEN-LAST:event_jrCobradosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcFecha;
    private javax.swing.JComboBox<Mesero> jcMeseros;
    private javax.swing.JRadioButton jrAtendidos;
    private javax.swing.JRadioButton jrCobrados;
    private javax.swing.JTable jtTablaPedidos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
    modelo.addColumn("N° Pedido");
    modelo.addColumn("Mesa");
    modelo.addColumn("Hora");
    modelo.addColumn("Importe");
    modelo.addColumn("Entregado");
    modelo.addColumn("Pagado");
    
    jtTablaPedidos.setModel(modelo);
}
    private void vaciarTabla () {
        for (int i = modelo.getRowCount()-1; i >= 0;i--){
            modelo.removeRow(i);
        }
    }

    private void cargarMeseros () {
        MeseroData md = new MeseroData();
        List<Mesero> meseros = md.listarMeseros();
        for (Mesero aux : meseros) {
                jcMeseros.addItem(aux);
        }
    }
    private void cargarPedidos (boolean cobrados) {
        PedidoData pd = new PedidoData();
        MeseroData md = new MeseroData();
        List<Pedido> pedidos = pd.listarPedidos((Mesero)jcMeseros.getSelectedItem());
        
        String pagado;
        String entregado;
        DateTimeFormatter horaFormat = DateTimeFormatter.ofPattern("HH:mm");
        String hora; 
        try {
            for (Pedido aux : pedidos) {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        //Usamos esta clase para crear un string con el formato de fecha que queremos a partir de un dato tipo Date
                SimpleDateFormat dateAString = new SimpleDateFormat("yyyy-MM-dd");
                        //Con el metodo .format() transformamos el dato Date a un string con el formato especificado arriba
                String fechaS = dateAString.format(jcFecha.getDate());

                LocalDate fecha = LocalDate.parse(fechaS,formatter);
                if (aux.getFecha().equals(fecha) ) {
                    if (!cobrados) {
                        if (aux.isPagado()) { 
                            pagado = "SI";
                        } else { 
                            pagado = "NO";
                        }
                        if(aux.isEntregado()) {
                            entregado = "SI";
                        } else {
                            entregado = "NO";
                        }
                        hora = aux.getHora().format(horaFormat);
                        modelo.addRow(new Object[]{aux.getId_pedido(),aux.getMesa().getNumero(),hora,aux.getImporte(),entregado,pagado});
                    } else {
                        if (aux.isEntregado() && aux.isPagado()) {
                            pagado = "SI";
                            entregado = "SI";

                            hora = aux.getHora().format(horaFormat);
                            modelo.addRow(new Object[]{aux.getId_pedido(),aux.getMesa().getNumero(),hora,aux.getImporte(),entregado,pagado});
                        } 
                    }
                }    
            }           
                
        } catch(NullPointerException ex){}
    }
    
}
