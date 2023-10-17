/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nstut
 */
public class PedidoData {
    private Connection con;

    public PedidoData() {
        this.con = Conexion.conectar();
    }
    
    public int crearPedido () {
        String sql = "INSERT INTO pedido(id_pedido,entregado,pagado) VALUES (DEFAULT,false, false)";
        int id = 0;
        try {
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            int insertar = ps.executeUpdate();
            if (insertar > 0 ) {
                /*JOptionPane.showMessageDialog(null, "Pedido creado exitosamente.");*/
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    id = rs.getInt(1);
                }
            } /*else {
                JOptionPane.showMessageDialog(null, "No se pudo crear el pedido");
            }*/
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta sql");
        }
        return id;
    }
    
    public void agregarPedido (int id_pedido, int id_mesa, int id_mesero, LocalDate fecha, LocalTime hora, double importe) {
        String sql = "UPDATE pedido SET id_mesa = ?, id_mesero = ?, fecha = ?, hora = ?, importe = ?, entregado = false, pagado = false "
                    + "WHERE id_pedido = ?";
        
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1,id_mesa);
            ps.setInt(2,id_mesero);
            ps.setDate(3,Date.valueOf(fecha));
            ps.setTime(4,Time.valueOf(hora));
            ps.setDouble(5, importe);
            ps.setInt(6, id_pedido);
            
            int insertar = ps.executeUpdate();
            if (insertar > 0 ) {
                JOptionPane.showMessageDialog(null, "Pedido agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el pedido");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta sql");
        }
        
    }
    
    public void eliminarPedido (int id) {
        String sql = "DELETE FROM pedido WHERE id_pedido = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int eliminar = ps.executeUpdate();
            if (eliminar > 0) {
                JOptionPane.showMessageDialog(null, "Pedido eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta sql");
        }
    }
    
    public void entregarPedido (int id) {
        String sql = "UPDATE pedido SET entregado = true WHERE id_pedido = ? AND entregado = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int alta = ps.executeUpdate();
            if (alta > 0) {
                JOptionPane.showMessageDialog(null, "Pedido entregado.");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido ya habia sido entregado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el pedido (sql).");
        }
    }
    
    public void pagarPedido (int id) {
        String sql = "UPDATE pedido SET pagado = true WHERE id_pedido = ? AND pagado = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int alta = ps.executeUpdate();
            if (alta > 0) {
                JOptionPane.showMessageDialog(null, "Pedido pagagado.");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido ya habia sido pagado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el pedido (sql).");
        }
    }
    
    public List<Pedido> listarPedidos(Mesa mesa) {
        MeseroData md = new MeseroData();
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE id_mesa = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getId_mesa());
            ResultSet rs = ps.executeQuery();
            Pedido pedido;
            while (rs.next()) {
                pedido = new Pedido();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesa);
                pedido.setMesero(md.getMesero(rs.getInt("id_mesero")));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEntregado(rs.getBoolean("entregado"));
                pedido.setPagado(rs.getBoolean("pagado"));
                pedidos.add(pedido);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return pedidos;
    }
        
    public void eliminarPedidosVacios () {
        String sql = "DELETE FROM pedido "
                + "WHERE id_mesa IS NULL OR id_mesero IS NULL OR fecha IS NULL OR hora IS NULL OR importe IS NULL";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con consulta sql al eliminar pedido vacio.");
        }
    }
     public int getId_mesero (int id_pedido) {
         String sql = "SELECT id_mesero FROM pedido WHERE id_pedido = ? ";
         int id_mesero = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id_mesero = rs.getInt("id_mesero");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con consulta sql al eliminar pedido vacio.");
        }
        return id_mesero;
     }
    
}
