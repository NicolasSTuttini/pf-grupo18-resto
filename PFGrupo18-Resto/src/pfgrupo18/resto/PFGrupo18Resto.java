package pfgrupo18.resto;

import AccesoDatos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

public class PFGrupo18Resto {

    public static void main(String[] args) {

        Connection conn = Conexion.conectar();

        if (conn != null) {
            System.out.println("Anda la conexion");

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("no funca");
        }
    }

}
