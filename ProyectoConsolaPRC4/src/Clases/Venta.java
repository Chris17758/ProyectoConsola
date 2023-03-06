/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Alejandro Bautista
 */
public class Venta {
    
    public static void main(String[] args){
        
        Catalogo catalogo = new Catalogo();
        String[] productos = catalogo.Catalogo();

        Scanner teclado = new Scanner(System.in);
        String codigo = "";
        String cantidad = "";
        
        
        System.out.print("Ingrese el codigo de producto :");
        codigo = teclado.nextLine();

        System.out.print("Digite la cantidad  :");
        cantidad = teclado.nextLine();

        for (int j = 0; j < productos.length; j++) {
            if (productos[j].equals(codigo)) {
                
                System.out.println("productos[j]");
            }
            else{
                System.out.println("El Producto seleccionado no esta disponible ");
            }
            if (productos[j].equals(cantidad)) {
                
            }
        } 
    }
    
    

    
}
