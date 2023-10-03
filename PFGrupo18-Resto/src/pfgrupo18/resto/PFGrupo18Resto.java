package pfgrupo18.resto;

import AccesoDatos.Conexion;
import AccesoDatos.ProductoData;
import java.sql.Connection;
import java.sql.SQLException;

public class PFGrupo18Resto {

    public static void main(String[] args) {

        Connection conn = Conexion.conectar();

//        if (conn != null) {
//            System.out.println("Anda la conexion");
//
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("no funca");
//        }
    ProductoData prod = new ProductoData();
    /*prod.agregarProducto("hamburguesa", 100000);*/
//    prod.eliminarProducto(1);
//    prod.modificarProducto(3,"coca", 1);
    prod.altaProducto(1);
    }

}
