package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TicketDetalle {

    public String TicketDetalle(){
        String url = "jdbc:mysql://localhost:3306/develop";
        String username = "root";
        String password = "root";


        String sql = "CREATE TABLE ticket ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "asunto VARCHAR(100) NOT NULL,"
                + "descripcion TEXT,"
                + "prioridad VARCHAR(10),"
                + "estado VARCHAR(20),"
                + "fecha_vencimiento DATE,"
                + "responsable VARCHAR(50),"
                + "comentarios TEXT,"
                + "categoria VARCHAR(50)"
                + ")";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {


            stmt.executeUpdate(sql);
            System.out.println("La tabla 'ticket' se creó exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
