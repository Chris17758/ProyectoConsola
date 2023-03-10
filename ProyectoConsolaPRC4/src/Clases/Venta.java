/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Alejandro Bautista
 */
public class Venta {
    

    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();
        catalogo.Catalogo();
        String[] productos = catalogo.Productos();

        Scanner teclado = new Scanner(System.in);
        String codigo = "";
        String cantidad = "";

        FileWriter fichero = null;
        PrintWriter pw = null;

        System.out.print("Ingrese su venta :");
        codigo = teclado.nextLine();

        ///System.out.print("Digite la cantidad  :");
        ///cantidad = teclado.nextLine();
        for (int j = 0; j < productos.length; j++) {
            if (productos[j].equals(codigo)) {
                System.out.println("Digita la cantidad :");
                cantidad = teclado.nextLine();

                if (productos[j].equals(cantidad)) {

                }

            } else {
                System.out.println("El Producto seleccionado no esta disponible ");
            }
        } 
        
        
        

    
}

}
