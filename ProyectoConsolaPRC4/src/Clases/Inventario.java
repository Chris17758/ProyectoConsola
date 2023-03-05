/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Inventario {
    
    private String[] NomProductos;
    private String[] PrecioProductos;
    private int[] CantidadProductos;
    
    public void Inicializar(){
        // ... código previo ...
    }
    
    public void mostrarProductos(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println(NomProductos[0] + "    " + PrecioProductos[0] + "    " + CantidadProductos[0]);
                break;
            case 2:
                System.out.println(NomProductos[1] + "    " + PrecioProductos[1] + "    " + CantidadProductos[1]);
                break;
            case 3:
                System.out.println(NomProductos[2] + "    " + PrecioProductos[2] + "    " + CantidadProductos[2]);
                break;
            case 4:
                System.out.println(NomProductos[3] + "    " + PrecioProductos[3] + "    " + CantidadProductos[3]);
                break;
            case 5:
                System.out.println(NomProductos[4] + "    " + PrecioProductos[4] + "    " + CantidadProductos[4]);
                break;
            case 6:
                System.out.println(NomProductos[5] + "    " + PrecioProductos[5] + "    " + CantidadProductos[5]);
                break;
            case 7:
                System.out.println(NomProductos[6] + "    " + PrecioProductos[6] + "    " + CantidadProductos[6]);
                break;
            case 8:
                System.out.println(NomProductos[7] + "    " + PrecioProductos[7] + "    " + CantidadProductos[7]);
                break;
            case 9:
                System.out.println(NomProductos[8] + "    " + PrecioProductos[8] + "    " + CantidadProductos[8]);
                break;
            case 10:
                System.out.println(NomProductos[9] + "    " + PrecioProductos[9] + "    " + CantidadProductos[9]);
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                break;
        }
    }
    
    public static void main(String [] args){
        Inventario pv = new Inventario();
        pv.Inicializar();
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Ver Monitor 4k");
            System.out.println("2. Ver Laptop I51035G1 8gb ram");
            System.out.println("3. Ver Silla Gamer RG7");
            System.out.println("4. Ver Cañon UHD");
            System.out.println("5. Ver Monitor curvado 1080p");
            System.out.println("6. Ver Tarjeta RTX 3060ti");
            System.out.println("7. Ver Case Gamer vidrio templado");
            System.out.println("8. Ver Switch D-Link 24P");
            System.out.println("9. Ver Teclado y Mouse Gamer luces");
            System.out.println("10. Ver Laptop Celeron 847 4gb ram");
            System.out.println("11. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            
            if (opcion >= 1 &&
   
}

