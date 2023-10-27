/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.MesaData;
import AccesoDatos.MeseroData;
import AccesoDatos.PedidoData;
import AccesoDatos.ProductoData;
import AccesoDatos.ProductosPedidosData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.PanelPersonalizado;
import Entidades.Producto;
import Entidades.ProductosPedidos;
import static Vistas.MenuPrincipal.Escritorio;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nstut
 */
public class PedidosCargar extends javax.swing.JInternalFrame {
    private static int id_pedido;
    private DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable (int fila, int columna) {
            return false;
        }
    };
    PanelPersonalizado fondo = new PanelPersonalizado("/imagenes/fondoInternal2.jpg");
    
    public PedidosCargar() {
        this.setContentPane(fondo);
        initComponents();
        armarCabecera();
        vaciarTabla();
        cargarProductosPedidos();
    }
    public PedidosCargar(int id_pedido) {
        this.id_pedido = id_pedido;
        initComponents();
        cargarMesas();
        cargarMeseros();
        
        armarCabecera();
        vaciarTabla();
        cargarProductosPedidos();
        this.setLocation(85, 5);
//        jbQuitarProducto.setVisible(false);
    }

    public static int getId_pedido() {
        return id_pedido;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtabMostrarProductos = new javax.swing.JTabbedPane();
        jptabTablaProd = new javax.swing.JScrollPane();
        jtTablaProductosPedidos = new javax.swing.JTable();
        jttabDatos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtpNumeroPedido = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtpMesa = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtpMesero = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtpFecha = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpImporte = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jbAgregarPedido = new javax.swing.JButton();
        jbQuitarProducto = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcMesas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcMeseros = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbAgregarProducto = new javax.swing.JButton();

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

        jLabel4.setText("Detalle del pedido:");

        jtabMostrarProductos.setToolTipText("");
        jtabMostrarProductos.setName(""); // NOI18N
        jtabMostrarProductos.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jtabMostrarProductosHierarchyChanged(evt);
            }
        });
        jtabMostrarProductos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jtabMostrarProductosStateChanged(evt);
            }
        });
        jtabMostrarProductos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtabMostrarProductosFocusGained(evt);
            }
        });
        jtabMostrarProductos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jtabMostrarProductosComponentMoved(evt);
            }
        });
        jtabMostrarProductos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtabMostrarProductosPropertyChange(evt);
            }
        });
        jtabMostrarProductos.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jtabMostrarProductosVetoableChange(evt);
            }
        });

        jptabTablaProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jptabTablaProdFocusGained(evt);
            }
        });
        jptabTablaProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jptabTablaProdMouseClicked(evt);
            }
        });

        jtTablaProductosPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaProductosPedidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtTablaProductosPedidosFocusGained(evt);
            }
        });
        jtTablaProductosPedidos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtTablaProductosPedidosPropertyChange(evt);
            }
        });
        jptabTablaProd.setViewportView(jtTablaProductosPedidos);

        jtabMostrarProductos.addTab("Productos", jptabTablaProd);

        jttabDatos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jttabDatosFocusGained(evt);
            }
        });
        jttabDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jttabDatosMouseClicked(evt);
            }
        });

        jLabel7.setText("N° de pedido:");

        jtpNumeroPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtpNumeroPedido.setFocusable(false);
        jScrollPane4.setViewportView(jtpNumeroPedido);

        jLabel11.setText("Mesa :");

        jtpMesa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtpMesa.setFocusable(false);
        jScrollPane7.setViewportView(jtpMesa);

        jLabel6.setText("Mesero:");

        jtpMesero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtpMesero.setFocusable(false);
        jScrollPane5.setViewportView(jtpMesero);

        jLabel8.setText("Fecha y hora:");

        jtpFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtpFecha.setFocusable(false);
        jScrollPane6.setViewportView(jtpFecha);

        jtpImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtpImporte.setFocusable(false);
        jScrollPane3.setViewportView(jtpImporte);

        jLabel5.setText("Importe total:");

        javax.swing.GroupLayout jttabDatosLayout = new javax.swing.GroupLayout(jttabDatos);
        jttabDatos.setLayout(jttabDatosLayout);
        jttabDatosLayout.setHorizontalGroup(
            jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jttabDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jttabDatosLayout.createSequentialGroup()
                        .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jttabDatosLayout.createSequentialGroup()
                                .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jttabDatosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jttabDatosLayout.createSequentialGroup()
                        .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jttabDatosLayout.setVerticalGroup(
            jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jttabDatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jttabDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jttabDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jttabDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jtabMostrarProductos.addTab("Datos", jttabDatos);

        jbAgregarPedido.setText("Agregar pedido");
        jbAgregarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarPedidoActionPerformed(evt);
            }
        });

        jbQuitarProducto.setText("Quitar producto");
        jbQuitarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarProductoActionPerformed(evt);
            }
        });

        jbVolver.setText("Volver");
        jbVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jcMesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel2.setText("Mesas:");

        jcMeseros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcMeseros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcMeserosItemStateChanged(evt);
            }
        });
        jcMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMeserosActionPerformed(evt);
            }
        });

        jLabel10.setText("Mesero:");

        jLabel1.setText("Pedidos");

        jbAgregarProducto.setText("Agregar Producto/s");
        jbAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jbAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtabMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbQuitarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(jbAgregarPedido)
                        .addGap(18, 18, 18)
                        .addComponent(jbVolver))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtabMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbQuitarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarProductoActionPerformed
        this.dispose();
        Escritorio.removeAll();
        Escritorio.repaint();
        PedidosAgregarProductos pap = new PedidosAgregarProductos();
        pap.setVisible(true);
        Escritorio.add(pap);
        Escritorio.moveToFront(pap);
        pap.setLocation(100,60);
    }//GEN-LAST:event_jbAgregarProductoActionPerformed

    private void jcMesasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMesasItemStateChanged
        
    }//GEN-LAST:event_jcMesasItemStateChanged

    private void jcMeserosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMeserosItemStateChanged

    }//GEN-LAST:event_jcMeserosItemStateChanged

    private void jcMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMeserosActionPerformed
        cargarDetalle();
    }//GEN-LAST:event_jcMeserosActionPerformed

    private void jcMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMesasActionPerformed
        cargarDetalle();
    }//GEN-LAST:event_jcMesasActionPerformed

    private void jbAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarPedidoActionPerformed
        PedidoData pd = new PedidoData();
        MesaData md = new MesaData();
        double importe = Double.parseDouble(jtpImporte.getText());
        if (importe < 1) { 
            JOptionPane.showMessageDialog(null, "Debe cargar al menos 1 producto en el pedido");
        } else {
            Mesa mesa = (Mesa)jcMesas.getSelectedItem();
            Mesero mesero = (Mesero) jcMeseros.getSelectedItem();
            /*DateTimeFormatter fechaF = DateTimeFormatter.ofPattern("d/M/yyyy");
            DateTimeFormatter horaF = DateTimeFormatter.ofPattern("HH:mm");*/
            LocalDate fecha = LocalDate.now();
            LocalTime hora = LocalTime.now();
            
            int agregado = pd.agregarPedido (this.id_pedido, mesa.getId_mesa(), mesero.getId_mesero(),  fecha,  hora,  importe);
            md.setOcupadaMesa(agregado, mesa.getId_mesa());
            this.dispose();
            Escritorio.removeAll();
            Escritorio.repaint();
            
            int id_pedido = pd.crearPedido();
            
            PedidosCargar pc = new PedidosCargar(id_pedido);
            pc.setVisible(true);
            Escritorio.add(pc);
            Escritorio.moveToFront(pc);
        }
        
    }//GEN-LAST:event_jbAgregarPedidoActionPerformed

    private void jbQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarProductoActionPerformed
        if (jtTablaProductosPedidos.getSelectedRowCount() > 0) {
            ProductosPedidosData ppd = new ProductosPedidosData();
            int exito = 0;
            for (int i = 0; i < jtTablaProductosPedidos.getSelectedRowCount(); i++) {
                int fila = jtTablaProductosPedidos.getSelectedRows()[i];
                int id_prod = Integer.parseInt(jtTablaProductosPedidos.getValueAt(fila, 0).toString());
                if(ppd.quitarProducto(id_prod, this.id_pedido) > 0) {
                    exito++;
                }
            }
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se quitó el producto exitosamente.");
            } else if (exito > 1) {
                JOptionPane.showMessageDialog(null, "Se quitaron los productos exitosamente.");
            }
            vaciarTabla();
            cargarProductosPedidos();
            cargarDetalle();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.");
        }    
        if (jtTablaProductosPedidos.getRowCount() > 0){
            jbVolver.setEnabled(false);
        } else {
            jbVolver.setEnabled(true);
        }
    }//GEN-LAST:event_jbQuitarProductoActionPerformed

    private void jtTablaProductosPedidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTablaProductosPedidosFocusGained
//        if (jtTablaProductosPedidos.getSelectedRowCount() > 0) {
//            jbQuitarProducto.setVisible(true);
//        } else {
//            jbQuitarProducto.setVisible(false);
//        }
    }//GEN-LAST:event_jtTablaProductosPedidosFocusGained

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        PedidoData pd = new PedidoData();
        pd.eliminarPedidosVacios();
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtTablaProductosPedidosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtTablaProductosPedidosPropertyChange
        if (jtTablaProductosPedidos.getRowCount() > 0){
            jbVolver.setEnabled(false);
        } else {
            jbVolver.setEnabled(true);
        }
    }//GEN-LAST:event_jtTablaProductosPedidosPropertyChange

    private void jtabMostrarProductosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtabMostrarProductosFocusGained
        
    }//GEN-LAST:event_jtabMostrarProductosFocusGained

    private void jttabDatosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jttabDatosFocusGained
        
    }//GEN-LAST:event_jttabDatosFocusGained

    private void jptabTablaProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jptabTablaProdFocusGained
        
    }//GEN-LAST:event_jptabTablaProdFocusGained

    private void jttabDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jttabDatosMouseClicked
        
    }//GEN-LAST:event_jttabDatosMouseClicked

    private void jptabTablaProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jptabTablaProdMouseClicked
       
    }//GEN-LAST:event_jptabTablaProdMouseClicked

    private void jtabMostrarProductosComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jtabMostrarProductosComponentMoved
        
    }//GEN-LAST:event_jtabMostrarProductosComponentMoved

    private void jtabMostrarProductosHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jtabMostrarProductosHierarchyChanged
        
    }//GEN-LAST:event_jtabMostrarProductosHierarchyChanged

    private void jtabMostrarProductosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jtabMostrarProductosStateChanged
        if (jtabMostrarProductos.getSelectedIndex() == 1) {
            jbQuitarProducto.setEnabled(false);
        } else {
            jbQuitarProducto.setEnabled(true);
        }
    }//GEN-LAST:event_jtabMostrarProductosStateChanged

    private void jtabMostrarProductosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtabMostrarProductosPropertyChange
      
    }//GEN-LAST:event_jtabMostrarProductosPropertyChange

    private void jtabMostrarProductosVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jtabMostrarProductosVetoableChange
       
    }//GEN-LAST:event_jtabMostrarProductosVetoableChange

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
       
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Escritorio.removeAll();
        Escritorio.repaint();
        PedidosOpciones po = new PedidosOpciones();
        
        po.setVisible(true);
        Escritorio.add(po);
        Escritorio.moveToFront(po);
        
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton jbAgregarPedido;
    private javax.swing.JButton jbAgregarProducto;
    private javax.swing.JButton jbQuitarProducto;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Mesa> jcMesas;
    private javax.swing.JComboBox<Mesero> jcMeseros;
    private javax.swing.JScrollPane jptabTablaProd;
    private javax.swing.JTable jtTablaProductosPedidos;
    private javax.swing.JTabbedPane jtabMostrarProductos;
    private javax.swing.JTextPane jtpFecha;
    private javax.swing.JTextPane jtpImporte;
    private javax.swing.JTextPane jtpMesa;
    private javax.swing.JTextPane jtpMesero;
    private javax.swing.JTextPane jtpNumeroPedido;
    private javax.swing.JPanel jttabDatos;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
    modelo.addColumn("Código");
    modelo.addColumn("Nombre");
    modelo.addColumn("Precio");
    modelo.addColumn("Cantidad");
    jtTablaProductosPedidos.setModel(modelo);
}
    private void vaciarTabla () {
        for (int i = modelo.getRowCount()-1; i >= 0;i--){
            modelo.removeRow(i);
        }
    }
    private void cargarProductosPedidos (){
            ProductosPedidosData prodPedidos = new ProductosPedidosData();
            List <ProductosPedidos> listaPp = prodPedidos.listarProductosPedidos(PedidosCargar.id_pedido);
            ProductoData pd = new ProductoData();
            Producto prod;
            for (ProductosPedidos aux :listaPp){
                prod = pd.getProducto(aux.getId_producto());
                modelo.addRow(new Object[]{prod.getId_producto(),prod.getNombre(),prod.getPrecio(), aux.getCantidad()});
            }
            
    }
    private void cargarMesas () {
        MesaData md = new MesaData();
        List<Mesa> mesas = md.listarMesas();
        Mesa mesaDefecto = new Mesa(0,0,false,0){
            @Override
            public String toString() {
                return "--Mesas--";
            }
        };
        jcMesas.addItem(mesaDefecto);
        
        for (Mesa aux : mesas) {
            if (aux.isEstado()) {
                jcMesas.addItem(aux);
            }
        }
    }
    private void cargarMeseros () {
        MeseroData md = new MeseroData();
        List<Mesero> meseros = md.listarMeseros();
        
        for (Mesero aux : meseros) {
            if (aux.isEstado()) {
                jcMeseros.addItem(aux);
            }
        }
    }
    
    private void cargarDetalle() {
        if(jcMesas.getSelectedItem()!= null &&  jcMeseros.getSelectedItem()!= null) {
            Mesa mesa = (Mesa) jcMesas.getSelectedItem();
            Mesero mesero = (Mesero) jcMeseros.getSelectedItem();

            DateTimeFormatter horaF = DateTimeFormatter.ofPattern("HH:mm");
            DateTimeFormatter fecheF = DateTimeFormatter.ofPattern("d/M/yyyy");
            jtpNumeroPedido.setText(""+this.id_pedido);
            jtpMesa.setText("" + mesa.getNumero());
            jtpMesero.setText(mesero.getNombre() +" "+ mesero.getApellido());
            if(jtTablaProductosPedidos.getRowCount() > 0) {
                
                ProductosPedidosData ppd = new ProductosPedidosData();
                jtpImporte.setText(""+ ppd.calcularImporte());
            } else {
                jtpImporte.setText(""+0);
            }
            jtpFecha.setText(LocalDate.now().format(fecheF) +" ; "+ LocalTime.now().format(horaF));
        }   
        
        
    }
}
