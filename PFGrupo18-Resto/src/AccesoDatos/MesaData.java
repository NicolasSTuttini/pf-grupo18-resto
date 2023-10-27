/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Mesa;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void agregarMesa (int capacidad, int numero){
        String sql = "INSERT INTO mesa VALUES (DEFAULT,?,?,true,0)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt (1,numero);
            ps.setInt(2, capacidad);
            
            int insertado = ps.executeUpdate();
            
            if ( insertado > 0){
                JOptionPane.showMessageDialog (null, "Mesa agregada exitosamente");
            } else {
                JOptionPane.showMessageDialog (null, "Error al cargar la mesa");
            }
            
        } catch (SQLException ex) {
                 JOptionPane.showMessageDialog (null, "Error al ejecutar la consulta sql");
           
        }
    }
    public int eliminarMesa (int id) {
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
    
    public int altaMesa (int id) {
          
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
        String sql = "SELECT * FROM mesa ORDER BY numero ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Mesa mesa;
            while (rs.next()) {
                mesa = new Mesa();
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setOcupada(rs.getInt("ocupada"));
                mesas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return mesas;
    }
    
    public int obtenerNumero () {
        int nro = 0;
        String sql = "SELECT max(numero) numero FROM mesa";
        
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
            if (rs.next()) {
               nro = rs.getInt("numero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas con sql al obtener el ultimo numero.");
        }
        return nro + 1;
    }
    
    public void cambiarNumero (int id, int nuevo) {
         String sql = "UPDATE mesa SET numero = ? WHERE id_mesa = ?";
         try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nuevo);
            ps.setInt(2, id);
            ResultSet rs =  ps.executeQuery();
            if (rs.next()) {
               JOptionPane.showMessageDialog(null, "Número actualizado exitosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas con sql al modificar el numero.");
        }
    }
    
    public Mesa getMesa (int id_mesa) {
        String sql = "SELECT * FROM mesa WHERE id_mesa = ? ";
        Mesa mesa = new Mesa();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_mesa);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                mesa.setId_mesa(rs.getInt("id_mesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setOcupada(rs.getInt("ocupada"));
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return mesa;
    }
    
    public void setOcupadaMesa(int ocupada, int id) {
        String sql = "UPDATE mesa SET ocupada = ? WHERE id_mesa = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ocupada);
            ps.setInt(2, id);
            
            int ocupar = ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al setear ocupacion en sql");
        }
        
    }
    
}
