package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Beneficios {

    int precio;
    int Dsct;
    int IGV;

    public void beneficios(int precio, int Dsct, int IGV){
        this.precio= precio;
        this.Dsct= Dsct;
        this.IGV= IGV;
    }
    public double getPrecioTotal (){
        if(true) {
            return (this.precio + (precio * 0.19) + (precio * Dsct));
        }
        return 0;/*revisar la logica posteriormente*/
    }

}
