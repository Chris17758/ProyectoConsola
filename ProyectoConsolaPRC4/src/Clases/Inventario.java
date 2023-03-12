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
public class Inventario {
    
    public void inventario(){
        Catalogo catalogo = new Catalogo();
        catalogo.Catalogo();
        String[] productos = catalogo.Productos();

        Scanner teclado = new Scanner(System.in);
        String codigo = "";
        
        
        try {

            System.out.print("Ingrese el ID del producto ");
            String id = teclado.nextLine();
            
            
            boolean encontrado = false;
            for (int j = 0; j < productos.length; j++) {
                if (productos[j].startsWith(id)) {
                    String[] detalles = productos[j].split(",");
                    
                    String nombre = detalles[1];   
                    String cantidad = detalles[3];
                  
                    System.out.println("Producto "+"    "+ "Cantidad");
                    System.out.println(id + nombre + cantidad);
                    encontrado = true;
                    break;
                    
                }
            }
            if (!encontrado) {
                System.out.println("El producto no encontrado.");
            }
           
         
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            
        }
    }
    public static void main(String[] args) {
        Inventario inv = new Inventario();


        inv.inventario();


    }
    
    }
