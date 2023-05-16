package org.example;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Usuario {
    private Integer dni;
    private String Nombre;
    private String Apellido;
    private String Ciudad;
    private Integer NumeroTarjeta;
    private String Preferencias;
    private String Beneficios;
    private String TipoUsuario;

    private String Password;


    public String Clientes (Integer dni, String nombre, String preferencias, String beneficios, String TipoUsuario,  String Password) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String database = "Proyecto";
        String user = "root";
        String password = "root";

        String url = "jdbc:mysql://localhost:3306/" + database + "?user=" + user + "&password=" + password;
        Connection conexion = DriverManager.getConnection(url);

        Statement state = conexion.createStatement();


        String sql = "CREATE TABLE Cliente (\n" +
                "    dni INT PRIMARY KEY,\n" +
                "    nombre VARCHAR(80) NOT NULL,\n" +
                "    preferencias VARCHAR(100),\n" +
                "    beneficios VARCHAR(80),\n" +
                "    tipoUsuario VARCHAR(50),\n" +
                "    password VARCHAR(50)\n" +
                ");";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {


            stmt.executeUpdate(sql);
            System.out.println("La tabla 'cliente' se creó exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return("Cliente Logeado correctametne");
    }




    public String Administrador (Integer dni, String nombre, String preferencias, String beneficios, String TipoUsuario,  String Password){

        return("Administrador logeado correctamente");

    }

    public String Proveedor (Integer dni, String nombre, String preferencias, String beneficios, String TipoUsuario,  String Password){

        return("Proveedor logeado correctamente");
    }


}
