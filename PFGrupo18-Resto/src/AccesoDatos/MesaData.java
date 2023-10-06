/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Mesa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nstut
 */
public class MesaData {
    private Connection con;

    public MesaData() {
        this.con = Conexion.conectar();
    }
    
    public void agregarMesa (int capacidad) {
        String sql = "INSERT INTO mesa VALUES (DEFAULT,?,true)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt (1,capacidad);
            
            int insertado = ps.executeUpdate();
            
            if ( insertado > 0){
                JOptionPane.showMessageDialog (null, "Mesa agregado");
            } else {
                JOptionPane.showMessageDialog (null, "Error al cargar la mesa");
            }
            
        } catch (SQLException ex) {
                 JOptionPane.showMessageDialog (null, "Error al ejecutar la consulta sql");
           
        }
    }
    private int eliminarMesa (int id) {
        String sql = "UPDATE mesa SET estado = false WHERE id_mesa = ? AND estado = true";
        int retorno = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int eliminar = ps.executeUpdate();
            if (eliminar > 0) {
                retorno = eliminar;
            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No existe el producto");
        }
        return retorno;
    }
    
    private int altaMesa (int id) {
          
        String sql = "UPDATE mesa SET estado = true WHERE id_mesa = ? AND estado = false";
        int retorno = 0;    
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int alta = ps.executeUpdate();
            if (alta > 0) {
                retorno = alta;
            } else {
                JOptionPane.showMessageDialog(null, "No existe la mesa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }

        return retorno;
    }
    
    public List<Mesa> listarMesas() {
        List<Mesa> mesas = new ArrayList<>();
        String sql = "SELECT * FROM mesa ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Mesa mesa;
            while (rs.next()) {
                mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return mesas;
    }
    
    
    
    
}
