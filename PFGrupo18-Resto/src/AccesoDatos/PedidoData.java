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
    
    public int agregarPedido (int id_pedido, int id_mesa, int id_mesero, LocalDate fecha, LocalTime hora, double importe) {
        String sql = "UPDATE pedido SET id_mesa = ?, id_mesero = ?, fecha = ?, hora = ?, importe = ?, entregado = false, pagado = false "
                    + "WHERE id_pedido = ?";
         int insertar = 0;
        try {
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1,id_mesa);
            ps.setInt(2,id_mesero);
            ps.setDate(3,Date.valueOf(fecha));
            ps.setTime(4,Time.valueOf(hora));
            ps.setDouble(5, importe);
            ps.setInt(6, id_pedido);
            
            insertar = ps.executeUpdate();
            if (insertar > 0 ) {
                JOptionPane.showMessageDialog(null, "Pedido agregado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el pedido");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta sql");
        }
        return insertar;
    }
    
    public int eliminarPedido (int id) {
        String sql1 = "DELETE FROM productospedidos WHERE id_pedido = ?" ;   
        String sql = "DELETE FROM pedido WHERE id_pedido = ?";
        int eliminado = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setInt(1, id);
            
            if(ps.executeUpdate() > 0) {
                ps.close();
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                if (ps.executeUpdate() > 0) {
                    eliminado++;
                }
                ps.close();
            
            }else {
                JOptionPane.showMessageDialog(null, "El pedido no existe en prodpedidos.");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en consulta sql");
        }
        return eliminado;
    }
    
    public int entregarPedido (int id) {
        String sql = "UPDATE pedido SET entregado = true WHERE id_pedido = ? AND entregado = false";
        int entregado = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            entregado = ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontro el pedido (sql).");
        }
        return entregado;
    }
    
    public void pagarPedido (int id) {
        String sql = "UPDATE pedido SET pagado = true WHERE id_pedido = ? AND pagado = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int alta = ps.executeUpdate();
            if (alta > 0) {
//                JOptionPane.showMessageDialog(null, "Pedido pagagado.");
            } else {
//                JOptionPane.showMessageDialog(null, "El pedido ya habia sido pagado.");
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
     public List<Pedido> listarPedidos(Mesero mesero) {
        MesaData md = new MesaData();
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE id_mesero = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mesero.getId_mesero());
            ResultSet rs = ps.executeQuery();
            Pedido pedido;
            while (rs.next()) {
                pedido = new Pedido();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setMesa(md.getMesa(rs.getInt("id_mesa")));
                pedido.setMesero(mesero);
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
     
     public List<Pedido> listarPedidos(LocalDate fecha) {
        MesaData mesaD = new MesaData();
        MeseroData meseroD = new MeseroData();
        
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido WHERE fecha = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            Pedido pedido;
            while (rs.next()) {
                pedido = new Pedido();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaD.getMesa(rs.getInt("id_mesa")));
                pedido.setMesero(meseroD.getMesero(rs.getInt("id_mesero")));
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
        List<Integer> ids = new ArrayList<>();
        String sql1 = "SELECT id_pedido FROM pedido "
                + "WHERE id_mesa IS NULL OR id_mesero IS NULL OR fecha IS NULL OR hora IS NULL OR importe IS NULL";
        
        
        String sql2 = "DELETE FROM productospedidos WHERE id_pedido = ?" ; 
        String sql3 = "DELETE FROM pedido WHERE id_pedido = ?";
        int eliminado = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ids.add(rs.getInt("id_pedido"));
            }
            ps.close();
            rs.close();
                   
            if(!ids.isEmpty()) {
                for (int aux: ids) {
                    ps = con.prepareStatement(sql2);
                    ps.setInt(1, aux);
                    ps.executeUpdate();
                    
                    ps.close();
                    ps = con.prepareStatement(sql3);
                    ps.setInt(1, aux);

                    if (ps.executeUpdate() > 0) {
                        eliminado++;
                    }
                }
                if (eliminado > 0) {
//                    JOptionPane.showMessageDialog(null, "Pedido eliminado exitosamente");
                } else {
//                    JOptionPane.showMessageDialog(null, "El pedido no exite en pedidos");
                }
                ps.close();
            } else {
//                JOptionPane.showMessageDialog(null, "El pedido no existe en prodpedidos.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con consulta sql al eliminar pedido vacio.");
        }
    }
    
    public Pedido getPedido (int id_pedido) {
        MeseroData meseroD = new MeseroData();
        MesaData mesaD = new MesaData();
        
        String sql = "SELECT * FROM pedido WHERE id_pedido = ? ";
        Pedido pedido = new Pedido();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setMesa(mesaD.getMesa(rs.getInt("id_mesa")));
                pedido.setMesero(meseroD.getMesero(rs.getInt("id_mesero")));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setImporte(rs.getDouble("importe"));
                pedido.setEntregado(rs.getBoolean("entregado"));
                pedido.setPagado(rs.getBoolean("pagado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return pedido;
        
    }
    
    public int pedidosSinEntregar (int id_mesa) {
        String sql = "SELECT entregado FROM pedido WHERE id_mesa = ?";
        int sinEntregar = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_mesa);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getInt("entregado") == 0) {
                    sinEntregar++;
                }
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return sinEntregar;
    }
    
    public int pedidoSinPagar (int id_mesa) {
        String sql = "SELECT id_pedido FROM pedido WHERE id_mesa = ? AND pagado = 0";
        int sinPagar = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_mesa);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                sinPagar = rs.getInt("id_pedido");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return sinPagar;
    }
    
}
