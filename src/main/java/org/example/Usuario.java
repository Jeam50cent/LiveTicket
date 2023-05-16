package org.example;

public class Usuario {
    Integer dni;
    String Nombre;
    String Apellido;
    String Ciudad;
    Integer NumeroTarjeta;

    String Preferencias;
    String Beneficios;
    String TipoUsuario;

    public String Clientes (Integer dni, String nombre, String preferencias, String beneficios, String TipoUsuario){


        return("Cliente Logeado correctametne");

    }

    public String Administrador (Integer dni, String nombre, String preferencias, String beneficios, String TipoUsuario){

        return("Administrador logeado correctamente");

    }

    public String Proveedor (Integer dni, String nombre, String preferencias, String beneficios, String TipoUsuario){

        return("Proveedor logeado correctamente");
    }


}
