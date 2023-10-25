/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.MesaData;
import AccesoDatos.MeseroData;
import AccesoDatos.PedidoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nstut
 */
public class PedidosSegunMesa extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable (int row, int colum) {
            return false;
        }
    };

    /**
     * Creates new form PedidosSegunMesa
     */
    public PedidosSegunMesa() {
        initComponents();
        this.setLocation(80, 35);
        cargarMesas();
        Calendar fechaHoy = Calendar.getInstance();
        jcFecha.setDate(fechaHoy.getTime());
        
        cargarHora();
        
        armarCabecera();
        cargarComponentes ();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPedidos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtpTotalMesaDia = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpTotalDia = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jcFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcHora = new javax.swing.JComboBox<>();
        jcMesas = new javax.swing.JComboBox<>();

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

        jLabel5.setText("Total ingresos de la mesa en el día:");

        jLabel6.setText("Total de ingresos del día:");

        jtpTotalMesaDia.setMinimumSize(new java.awt.Dimension(6, 30));
        jScrollPane2.setViewportView(jtpTotalMesaDia);

        jScrollPane3.setViewportView(jtpTotalDia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setText("Pedidos");

        jcFecha.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jcFechaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jcFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcFechaPropertyChange(evt);
            }
        });

        jLabel4.setText("Fecha:");

        jLabel3.setText("Mesa:");

        jLabel2.setText("Hora:");

        jcHora.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcHoraItemStateChanged(evt);
            }
        });

        jcMesas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcMesasItemStateChanged(evt);
            }
        });
        jcMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMesasActionPerformed(evt);
            }
        });
        jcMesas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcMesasPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcHora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcMesas, 0, 200, Short.MAX_VALUE)
                            .addComponent(jcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(jLabel1)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(427, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcFechaPropertyChange
        cargarComponentes ();
    }//GEN-LAST:event_jcFechaPropertyChange

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MenuPrincipal.Escritorio.removeAll();
        MenuPrincipal.Escritorio.repaint();
        PedidosRegistro psr = new PedidosRegistro();
        
        psr.setVisible(true);
        MenuPrincipal.Escritorio.add(psr);
        MenuPrincipal.Escritorio.moveToFront(psr);
    }//GEN-LAST:event_formInternalFrameClosed

    private void jcMesasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcMesasPropertyChange
        
    }//GEN-LAST:event_jcMesasPropertyChange

    private void jcMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMesasActionPerformed

    }//GEN-LAST:event_jcMesasActionPerformed

    private void jcMesasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMesasItemStateChanged
        cargarComponentes ();
                
    }//GEN-LAST:event_jcMesasItemStateChanged

    private void jcFechaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jcFechaCaretPositionChanged
       
    }//GEN-LAST:event_jcFechaCaretPositionChanged

    private void jcHoraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcHoraItemStateChanged
        cargarComponentes ();
    }//GEN-LAST:event_jcHoraItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jcFecha;
    private javax.swing.JComboBox<String> jcHora;
    private javax.swing.JComboBox<Mesa> jcMesas;
    private javax.swing.JTable jtTablaPedidos;
    private javax.swing.JTextPane jtpTotalDia;
    private javax.swing.JTextPane jtpTotalMesaDia;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
    modelo.addColumn("N° Pedido");
    modelo.addColumn("Mesero");
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

    private void cargarMesas () {
        MesaData md = new MesaData();
        List<Mesa> mesas = md.listarMesas();
        
        for (Mesa aux : mesas) {
            if (aux.isEstado()) {
                jcMesas.addItem(aux);
            }
        }
    }
    private void cargarHora () {
        for (int i = 8 ; i < 9; i++) {
                jcHora.addItem("0"+i+":00 a 0"+(i+1)+":00" );
        }
        for (int i = 9 ; i < 14; i++) {
                jcHora.addItem(i+":00 a "+(i+1)+":00" );
        }
        for (int i = 20 ; i < 24; i++) {
                jcHora.addItem(i+":00 a "+(i+1)+":00" );
        }
        for (int i = 0 ; i < 2; i++) {
                jcHora.addItem("0"+i+":00 a 0"+(i+1)+":00" );
        }
    }
    
    private void cargarPedidos () {
        PedidoData pd = new PedidoData();
        try {
            List<Pedido> pedidos = pd.listarPedidos((Mesa)jcMesas.getSelectedItem());

            String pagado;// variables para determinar el valor de casillas de pagado y entregado en cada fila 
            String entregado;
            
            int indice; //variables para llamar a funcion que verifica la hora
            LocalTime hora;
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");//obtenemos una fecha LocalDate desde el jcalendar que originalmente devuelve una fecha Date
            SimpleDateFormat dateAString = new SimpleDateFormat("yyyy-MM-dd");
            String fechaS = dateAString.format(jcFecha.getDate());
            LocalDate fecha = LocalDate.parse(fechaS,formatter);//esta fecha la compararemos con la de cada pedido
            
            for (Pedido aux : pedidos) {
                
                hora= aux.getHora();
                indice = jcHora.getSelectedIndex();
                
                if (aux.getFecha().equals(fecha) && coincideHora(indice, hora)) {
                    if(aux.isEntregado()) {
                        entregado = "SI";
                    } else {
                        entregado = "NO";
                    }
                    if (aux.isPagado()) {
                        pagado = "SI";
                    } else {
                        pagado = "NO";
                    }
                    modelo.addRow(new Object[]{aux.getId_pedido(),aux.getMesero().getNombre()+" "+aux.getMesero().getApellido(),aux.getImporte(),entregado,pagado});
                }
            }
        } catch (NullPointerException ex) {
            
        }
    }
    
    private LocalTime[] verifHora(int indice) {
        LocalTime[] hora = new LocalTime[2];
        switch (indice) {
            case 0: hora[0] = LocalTime.parse("08:00");
                    hora[1] = LocalTime.parse("09:00");
                break;
            case 1: hora[0] = LocalTime.parse("09:00");
                    hora[1] = LocalTime.parse("10:00");
                break;
            case 2: hora[0] = LocalTime.parse("10:00");
                    hora[1] = LocalTime.parse("11:00");
                break;
            case 3: hora[0] = LocalTime.parse("11:00");
                    hora[1] = LocalTime.parse("12:00");
                break;
            case 4: hora[0] = LocalTime.parse("12:00");
                    hora[1] = LocalTime.parse("13:00");
                break;
            case 5: hora[0] = LocalTime.parse("13:00");
                    hora[1] = LocalTime.parse("14:00");
                break;
            case 6: hora[0] = LocalTime.parse("20:00");
                    hora[1] = LocalTime.parse("21:00");
                break;
            case 7: hora[0] = LocalTime.parse("21:00");
                    hora[1] = LocalTime.parse("22:00");
                break;
            case 8: hora[0] = LocalTime.parse("22:00");
                    hora[1] = LocalTime.parse("23:00");
                break;
            case 9: hora[0] = LocalTime.parse("23:00");
                    hora[1] = LocalTime.parse("00:00");
                break;
            case 10:hora[0] = LocalTime.parse("00:00");
                    hora[1] = LocalTime.parse("01:00");
                break;
            case 11:hora[0] = LocalTime.parse("01:00");
                    hora[1] = LocalTime.parse("02:00");
                break;
                
        }
        return hora;
    } 
    
    private boolean coincideHora(int indice, LocalTime hora) {
        boolean coinciden = false;
        LocalTime horaMenor = verifHora(indice)[0];
        LocalTime horaMayor = verifHora(indice)[1];
        if (hora.isAfter(horaMenor) && hora.isBefore( horaMayor)) {
            coinciden = true;
        }
        
        return coinciden;
    }
    
    private void cargarTotalMesaDia () {
        double total = 0;
        int filas = modelo.getRowCount();
        int id;
        String pagado;
        
        PedidoData pd = new PedidoData();
        Pedido pedido;
        
        try {
            if (filas > 0) {
                for (int i = 0; i < filas; i++) {
                   id = Integer.parseInt(jtTablaPedidos.getValueAt(i, 0).toString());
                   pagado = jtTablaPedidos.getValueAt(i, 4).toString();

                   if (pagado.equals("SI")) {
                        pedido = pd.getPedido(id);

                        total += pedido.getImporte();
                   }
                }
            } 
            jtpTotalMesaDia.setText(""+total);
        } catch (NullPointerException ex) {
        }
    }
    
    private void cargarTotalDia () {
        double total = 0;
        PedidoData pd = new PedidoData();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            SimpleDateFormat dateAString = new SimpleDateFormat("yyyy-MM-dd");
            String fechaS = dateAString.format(jcFecha.getDate());
            LocalDate fecha = LocalDate.parse(fechaS,formatter);
            
            List<Pedido> pedidos = pd.listarPedidos(fecha);

            for (Pedido aux : pedidos) {

                if (aux.isPagado()) {
                    total += aux.getImporte();
                }
            }
            jtpTotalDia.setText(""+total);
        } catch (NullPointerException ex) {
            
        }
    }
    
    private void cargarComponentes () {
        vaciarTabla();
        cargarPedidos();
        cargarTotalMesaDia();
        cargarTotalDia();
    }
}
