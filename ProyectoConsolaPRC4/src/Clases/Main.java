
package Clases;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Login login = new Login();
        
        login.iniciarSesion();
    
    Scanner leer = new Scanner(System.in);
    int opcion;
    
    System.out.println("Menu de Opciones");
    System.out.println("1. Venta nueva");
    System.out.println("2.Consultar inventarios");
    System.out.println("3.Cambiar contrasena");
    System.out.println("4.Salir del sistema");
    
    opcion=leer.nextInt();
}
    }
    
