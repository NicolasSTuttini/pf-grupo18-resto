/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.MeseroData;
import AccesoDatos.PedidoData;
import Entidades.Mesero;
import Entidades.PanelPersonalizado;
import Entidades.Pedido;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

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
    PanelPersonalizado fondo = new PanelPersonalizado("/imagenes/fondoInternal2.jpg");
    /**
     * Creates new form PedidosSegunMesero
     */
    public PedidosSegunMesero() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocation(68, 60);
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
        jbVolver = new javax.swing.JButton();

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesero:");

        jcMeseros.setBackground(new java.awt.Color(40, 40, 40));
        jcMeseros.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jcMeseros.setForeground(new java.awt.Color(255, 255, 255));
        jcMeseros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        jtTablaPedidos.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
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
        jtTablaPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTablaPedidos);

        jrAtendidos.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jrAtendidos.setForeground(new java.awt.Color(255, 255, 255));
        jrAtendidos.setSelected(true);
        jrAtendidos.setText("Atendidos");
        jrAtendidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrAtendidos.setOpaque(false);
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

        jrCobrados.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jrCobrados.setForeground(new java.awt.Color(255, 255, 255));
        jrCobrados.setText("Cobrados");
        jrCobrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrCobrados.setOpaque(false);
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
                .addGap(52, 52, 52)
                .addComponent(jrAtendidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jrCobrados)
                .addGap(61, 61, 61))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrAtendidos)
                    .addComponent(jrCobrados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha:");

        jcFecha.setBackground(new java.awt.Color(40, 40, 40));
        jcFecha.setForeground(new java.awt.Color(255, 255, 255));
        jcFecha.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jcFecha.setOpaque(false);
        jcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcFechaPropertyChange(evt);
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed


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
    private javax.swing.JButton jbVolver;
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
    
    TableColumnModel modeloCol = jtTablaPedidos.getColumnModel();
    modeloCol.getColumn(0).setPreferredWidth(30);
    modeloCol.getColumn(1).setPreferredWidth(17);
    modeloCol.getColumn(2).setPreferredWidth(22);
    modeloCol.getColumn(3).setPreferredWidth(50);
    modeloCol.getColumn(4).setPreferredWidth(40);
    modeloCol.getColumn(5).setPreferredWidth(35);
}
    private void vaciarTabla () {
        for (int i = modelo.getRowCount()-1; i >= 0;i--){
            modelo.removeRow(i);
        }
    }

    private void cargarMeseros () {
        MeseroData md = new MeseroData();
        Mesero mesaDefecto = new Mesero(0,"","","",false){
            @Override
            public String toString() {
                return "                        --Meseros--";
            }
        };
        jcMeseros.addItem(mesaDefecto);
        
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
                        modelo.addRow(new Object[]{aux.getId_pedido(),aux.getMesa().getNumero(),hora,"$"+aux.getImporte(),entregado,pagado});
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
