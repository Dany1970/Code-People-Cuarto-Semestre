package UTN.presentacion;

import UTN.conexion.Conexion;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var conexion = Conexion.getConnection();
        if (conexion != null)
            System.out.println("Conexión existosa = " + conexion);
        else
            System.out.println("Error al conectarse");
    }//Fin main

}//Fin de clase