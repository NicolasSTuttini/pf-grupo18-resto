/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedido;
import Entidades.Producto;
import Entidades.ProductosPedidos;
import Vistas.PedidosCargar;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nstut
 */
public class ProductosPedidosData {
    
    private Connection con;

    public ProductosPedidosData() {
        this.con = Conexion.conectar();
    }
    
   public int agregarProductosPedidos (int id_pedido,int id_producto, int cantidad) {
       String sql = "INSERT INTO productospedidos VALUES (DEFAULT, ?, ?, ?)";
       /*PedidoData pd = new PedidoData();*/
       int insertar = 0;
       try {
            if (id_pedido != 0) {
                PreparedStatement ps = con.prepareStatement(sql);
            
                ps.setInt(1, id_producto);
                ps.setInt(2, id_pedido);
                ps.setInt(3, cantidad);

                insertar = ps.executeUpdate();
                if (insertar == 0 ) {
                    JOptionPane.showMessageDialog(null,"Error al agregar el producto al pedido.");
                }
            } else {
                JOptionPane.showMessageDialog(null,"El id pedido es 0");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en consulta sql");
        }
       return insertar;
   }
   
   public List<ProductosPedidos> listarProductosPedidos(int id_pedido) {
        List<ProductosPedidos> ppList = new ArrayList<>();
        String sql = "SELECT * FROM productospedidos WHERE id_pedido = ? GROUP BY id_producto; ";
        String sqlCant = "SELECT SUM(cantidad) cantidad FROM  productospedidos "
                        + "WHERE id_pedido = ? GROUP BY id_producto";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_pedido);
            ResultSet rs = ps.executeQuery();
            
            PreparedStatement ps2 = con.prepareStatement(sqlCant);
            ps2.setInt(1, id_pedido);
            ResultSet rs2 = ps2.executeQuery();
            
            ProductosPedidos pp ;
            
            while (rs.next() && rs2.next()) {
                
                    pp = new ProductosPedidos();
                    pp.setId_productoPedido(rs.getInt("id_prodPedido"));
                    pp.setId_pedido(rs.getInt("id_pedido"));
                    pp.setId_producto(rs.getInt("id_producto"));
                    pp.setCantidad(rs2.getInt("cantidad"));
                    ppList.add(pp);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con sql al listar prodpedidos.");
        }
        return ppList;
    }
    
   public double calcularImporte() {
       List<ProductosPedidos> ppLista = listarProductosPedidos( new PedidosCargar().getId_pedido());//accedemos a la lista de productos del pedido en gestion que estan en la bd
       ProductoData pd = new ProductoData(); // necesitamos traer el precio de cada producto para calcular el importe. Como prodPedido no tiene el precio, solo el id_producto, usamos ese id para buscar el producto en la base de datos y traer su precio
       double importe = 0;
       
       for (ProductosPedidos aux : ppLista) {
           importe += (aux.getCantidad()* pd.getProducto(aux.getId_pedido()).getPrecio());
       }
       return importe;
   }
}
