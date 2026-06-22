package excepcionesTema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class errorConBasesDeDatos {
    public static void main(String[] args){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        } catch (SQLException e){
            System.out.println("Error en la base de datos: " + e.getMessage());
        } finally {
            try {
                if (connection != null){
                    connection.close();
                    System.out.println("Conexion terminada. ");
                }
            } catch (SQLException e ){
                System.out.println("Error cerrando la conexion: " + e.getMessage());
            }
        }




    }
}
