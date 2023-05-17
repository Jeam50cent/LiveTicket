package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Banco {
    public String Banco() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String database ="Proyecto";
        String user = "root";
        String password = "root";

        String url="jdbc:mysql://localhost:3306/"+database+"?user="+user+"&password="+password;

        Connection con = DriverManager.getConnection(url);
        Statement statement = con.createStatement();
        String scriptSql = "CREATE TABLE Banco (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "name VARCHAR(50) NOT NULL," +
                "ruc BIGINT NOT NULL," +
                "PRIMARY KEY (id))";

        String scriptInsert = "INSERT INTO Banco (name, ruc) VALUES ('BANCO DE CREDITO DEL PERU', '20100047218')";
        //String scriptInsert2 = "INSERT INTO Banco (name, ruc) VALUES ('BANCO CONTINENTAL','20100130204')";
        //String scriptInsert3 = "INSERT INTO Banco (name, ruc) VALUES ('SCOTIABANK PERÚ SAA','20100043140')";
        //String scriptInsert4 = "INSERT INTO Banco (name, ruc) VALUES ('BANCO INTERNACIONAL DEL PERU-INTERBANK','20100053455')";
        //String scriptInsert5 = "INSERT INTO Banco (name, ruc) VALUES ('BANCO DE LA NACIÓN','20100030595')";

        int result = statement.executeUpdate(scriptInsert);
        System.out.println("Base actualizada"+ result);

        return database;
    }

}

