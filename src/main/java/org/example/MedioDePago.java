package org.example;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class MedioDePago {

    public String MedioDePago() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String database = "Proyecto";
        String user = "root";
        String password = "root";

        String url = "jdbc:mysql://localhost:3306/" + database + "?user=" + user + "&password=" + password;

        Connection con = DriverManager.getConnection(url);

        Statement statement = con.createStatement();

        String scriptSql = " Create table medio_de_pago ( " +
                "id INT NOT NULL AUTO_INCREMENT" +
                "bancoId int," +
                "monto DECIMAL(5,2)," +
                "nombreCliente VARCHAR(50)," +
                "beneficios VARCHAR(50)," +
                "PRIMARY KEY (id) )";

        statement.execute(scriptSql);

        String scriptInsert = "INSERT INTO medio_de_pago (bancoId, monto, nombreCliente, beneficios) VALUES (?, 120.00, Carlos, ?)";

        int result = statement.executeUpdate(scriptInsert);

        System.out.println("Resultado del executeUpdate: " + result);
        return database;
    }

}
