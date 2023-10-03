package AccesoDatos;

import org.mariadb.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "pf-resto-grupo18";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conn;

    private Conexion() {
    }

    public static Connection conectar() {
        if (conn == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + USUARIO + "&password=" + PASSWORD);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers " + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos " + ex.getMessage());
            }
        }
        return conn;
    }
}
