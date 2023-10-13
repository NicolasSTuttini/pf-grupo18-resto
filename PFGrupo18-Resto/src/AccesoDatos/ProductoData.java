/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Pedido;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nstut
 */
public class ProductoData {
    private Connection con;

    public ProductoData() {
        this.con = Conexion.conectar();
    }
    
    public void agregarProducto (String nombre,double precio) {
        String sql = "INSERT INTO producto VALUES (DEFAULT,?,?,true)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString (1,nombre);
            ps.setDouble (2,precio);
            
            int insertado = ps.executeUpdate();
            
            if ( insertado > 0){
                JOptionPane.showMessageDialog (null, "Producto agregado");
            } else {
                JOptionPane.showMessageDialog (null, "Error al cargar el producto");
            }
            
        } catch (SQLException ex) {
            /*if (ex.getClass() == SQLIntegrityConstraintViolationException ) {
                JOptionPane.showMessageDialog (null, "El producto ya existe.");
            } else {*/
                 JOptionPane.showMessageDialog (null, "Error al ejecutar la consulta sql");
            /*}*/
           
        }
        
    }
    
     public int eliminarProducto(int id) {
        String sql = "UPDATE producto SET estado = false WHERE id_producto = ? AND estado = true";
        int retorno = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int eliminar = ps.executeUpdate();
            if (eliminar > 0) {
                /*JOptionPane.showMessageDialog(null, "Se eliminó el producto.");*/
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
     
     public void modificarProducto(String nombre, double precio, int id) {
        String sql = "UPDATE producto "
                + "SET nombre = ?, precio = ? WHERE id_producto = ? AND estado = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, id);
            int modif = ps.executeUpdate();
            if (modif == 1) {
                JOptionPane.showMessageDialog(null, "Se modificó el producto exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El producto no esta disponible");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El producto no esta disponible");
        }
        
    }
     public int altaProducto(int id) {
        
        String sql = "UPDATE producto SET estado = true WHERE id_producto = ? AND estado = false";
        int retorno = 0;    
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int alta = ps.executeUpdate();
            if (alta > 0) {
                /*JOptionPane.showMessageDialog(null, "Producto dado de alta.");*/
                retorno = alta;
            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No existe el producto");
        }

        return retorno;
    }
     
     public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM producto ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Producto producto;
            while (rs.next()) {
                producto = new Producto();
                producto.setId_producto(rs.getInt("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setEstado(rs.getBoolean("estado"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta");
        }
        return productos;
    }
    
     public Producto getProducto (int id_prod) {
         String sql = "SELECT * FROM producto WHERE id_producto = ?";
         Producto prod = new Producto();
         try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_prod);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                prod.setId_producto(rs.getInt("id_producto"));
                prod.setNombre(rs.getString("nombre"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setEstado(rs.getBoolean("estado"));
            }    
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta para devolver un producto");
        }
        return prod;
     }
}
