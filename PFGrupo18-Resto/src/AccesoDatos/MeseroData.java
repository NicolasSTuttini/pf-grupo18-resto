/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;


import Entidades.Mesero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nstut
 */
public class MeseroData {
    private Connection con;

    public MeseroData() {
        this.con = Conexion.conectar();
    }
    public void agregarMesero(int dni, String nombre, String apellido, String contrasenia){
        String sql = "INSERT INTO mesero VALUES (DEFAULT,?,?,?,?,true)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt (1,dni);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, contrasenia);
            
            int insertado = ps.executeUpdate();
            
            if ( insertado > 0){
                JOptionPane.showMessageDialog (null, "Mesero/a agregado/a exitosamente");
            } else {
                JOptionPane.showMessageDialog (null, "Error al cargar el/la mesero/a");
            }
            
        } catch (SQLException ex) {
                 JOptionPane.showMessageDialog (null, "Error al ejecutar la consulta sql");
           
        }
    
    }
    
    public int eliminarMesero (int id) {
        String sql = "UPDATE mesero SET estado = false WHERE id_mesero = ? AND estado = true";
        int retorno = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int eliminar = ps.executeUpdate();
            if (eliminar > 0) {
                retorno = eliminar;
            } else {
                JOptionPane.showMessageDialog(null, "El/la mesero/a no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El/la mesero/a no existe");
        }
        return retorno;
    }
    
    public int altaMesero (int id) {
          
        String sql = "UPDATE mesero SET estado = true WHERE id_mesero = ? AND estado = false";
        int retorno = 0;    
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int alta = ps.executeUpdate();
            if (alta > 0) {
                retorno = alta;
            } else {
                JOptionPane.showMessageDialog(null, "El/la mesero/a no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }

        return retorno;
    }
    
    public int bajaMesero (int id) {
          
        String sql = "UPDATE mesero SET estado = false WHERE id_mesero = ? AND estado = true";
        int retorno = 0;    
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int alta = ps.executeUpdate();
            if (alta > 0) {
                retorno = alta;
            } else {
                JOptionPane.showMessageDialog(null, "El/la mesero/a no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }

        return retorno;
    }
    
    public void modificarMesero(int id, int dni, String nombre, String apellido) {
        String sql = "UPDATE mesero "
                + "SET dni = ?, nombre = ?, apellido = ? WHERE id = ? AND estado = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setInt(4,id);
            int modif = ps.executeUpdate();
            if (modif == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el/la mesero/a exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El/la mesero/a no esta disponible");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El DNI ya se encuentra registrado");
        } 
    }
    public List<Mesero> listarMeseros() {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Mesero mesero;
            while (rs.next()) {
                mesero = new Mesero();
                mesero.setId_mesero(rs.getInt("id_mesero"));
                mesero.setDni(rs.getInt("dni"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setContrasenia(rs.getString("contrasenia"));
                mesero.setEstado(rs.getBoolean("estado"));
                meseros.add(mesero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return meseros;
    }
    
    public Mesero getMesero (int id_mesero) {
        PedidoData pd = new PedidoData();
        String sql = "SELECT * FROM mesero WHERE id_mesero = ?";
        Mesero mesero = new Mesero();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id_mesero);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                mesero.setId_mesero(rs.getInt("id_mesero"));
                mesero.setDni(rs.getInt("dni"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setContrasenia(rs.getString("contrasenia"));
                mesero.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return mesero;
    }
}
