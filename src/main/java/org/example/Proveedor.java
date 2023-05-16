package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Proveedor {
    public String Proveedor() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String database = "develop";
        String user = "root";
        String password = "";

        String url ="jdbc:mysql://localhost:3306/"+database+"?user="+user+"&password"+password;

        Connection con = DriverManager.getConnection(url);

        Statement statement = con.createStatement();


        //tabla

        String crearTabla = "CREATE TABLE proveedor (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "RUC VARCHAR(11) NOT NULL," +
                "nombre VARCHAR(100) NOT NULL," +
                "categoria VARCHAR(50) NOT NULL," +
                "productos VARCHAR(200)," +
                "PRIMARY KEY (id)" +
                ")";

        statement.executeUpdate(crearTabla);

        System.out.println("Tabla 'proveedor' creada exitosamente");


        //insertar
        String insertarDatos = "INSERT INTO proveedor (ruc, nombre, categoria, productos) VALUES " +
                "('123456789', 'Proveedor 1', 'Categor�a 1', 'Producto 1'), " +
                "('123456708', 'Proveedor 2', 'Categor�a 2', 'Producto 2'), " +
                "('987654321', 'Proveedor 3', 'Categor�a 3', 'Producto 3')";

        int filasInsertadas = statement.executeUpdate(insertarDatos);
        System.out.println("Se han insertado " + filasInsertadas + " filas en la tabla 'proveedor'");


        return database;
    }

}
