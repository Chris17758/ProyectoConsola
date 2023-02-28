package Clases;

import java.util.Scanner;

public class Login {

    Scanner leer = new Scanner(System.in);
    String sysUsuario = "admin";
    String sysContrasena = "123";

    public void iniciarSesion() {
        
        System.out.print("Bienvenido al sistema ComputadorasDiego\n");
        System.out.print("Favor ingresar credenciales\n\n");
        
        System.out.print("Digite su usuario: ");
        String Usuario = leer.next();
        System.out.print("Digite su contrasena: ");
        String Contrasena = leer.next();

        if (sysUsuario.equals(Usuario)) {
            if (sysContrasena.equals(Contrasena)) {
            System.out.println("Inicio de sesion exitoso\n");
            
            Main main = new Main();
        
            main.Menu();
            
            
        } else{
            System.out.println("Contrasena invalida");
            }
        }else{
            System.out.println("Usuario invalido");
        }   
        
    }
}
