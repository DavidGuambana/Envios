package modelo;

import vista.Principal;

public class Main {
    public static void main(String [] args){
        Conexion con = new Conexion();
        con.conectar();
        Principal p = new Principal();
        p.setVisible(true);
    }
}
