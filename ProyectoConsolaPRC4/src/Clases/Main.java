package Clases;

import java.util.Scanner;

public class Main {

    

    public static void main(String[] args) {
        Login login = new Login();
        Menu menu = new Menu();


        login.iniciarSesion();
        menu.menu();


    }
}
