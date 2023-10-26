/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nstut
 */
public class LoginData {
    private Connection con;

    public LoginData() {
        this.con = Conexion.conectar();
    }
    
    public int verificarDni(int dni) {
        String sql = "SELECT dni FROM administracion";
        PreparedStatement ps;
        int user = 0;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                   if (rs.getInt("dni") == dni) {
                        user = 1;
                   }
               }
            ps.close();
            if (user != 1){
                sql = "SELECT dni FROM mesero";
                ps =  con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    if (rs.getInt("dni") == dni) {
                        user = 2;
                    }
                }
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql al comprobar dni ");
        }
        return user;        
    }
    
    public boolean verificarContraAdmin(String pass) {
        String sql = "SELECT contrasenia FROM administracion";
        PreparedStatement ps;
        boolean contra = false;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                   if (rs.getString("contrasenia").equals(pass)) {
                        contra = true;
                   }
               }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql al comprobar contraseña de admin");
        }
        return contra;
    }
    
    public boolean verificarContraMesero(String pass) {
        String sql = "SELECT contrasenia FROM mesero";
        PreparedStatement ps;
        boolean contra = false;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
               while (rs.next()) {
                   if (rs.getString("contrasenia").equals(pass)) {
                        contra = true;
                   }
               }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error sql al comprobar contraseña de mesero");
        }
        return contra;
    }
}
