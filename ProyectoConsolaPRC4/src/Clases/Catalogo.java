/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Alejandro Bautista
 */
public class Catalogo {
    
    private String[] NomProductos;
    private String[] PrecioProductos;
    private int[] CantidadProductos;
    
    ///Aca se inicializan los arreglos de productos y precios y precios
    public void Inicializar(){
        NomProductos = new String[10];
        PrecioProductos = new String[10];
        CantidadProductos = new int[10];
        
        NomProductos[0] = "1. Monitor 4k";
        NomProductos[1] = "2. Laptop I51035G1 8gb ram";
        NomProductos[2] = "3. Silla Gamer RG7";
        NomProductos[3] = "4. Cañon UHD";
        NomProductos[4] = "5. Monitor curvado 1080p";
        NomProductos[5] = "6. Tarjeta RTX 3060ti";
        NomProductos[6] = "7. Case Gamer vidrio templado";
        NomProductos[7] = "8. Switch D-Link 24P";
        NomProductos[8] = "9. Teclado y Mouse Gamer luces";
        NomProductos[9] = "10. Laptop Celeron 847 4gb ram";
        
        PrecioProductos[0] = "$699.99";
        PrecioProductos[1] = "$679.00";
        PrecioProductos[2] = "$300.00";
        PrecioProductos[3] = "$725.69";
        PrecioProductos[4] = "$499.99";
        PrecioProductos[5] = "$617.99";
        PrecioProductos[6] = "$139.99";
        PrecioProductos[7] = "$64.95";
        PrecioProductos[8] = "$69.99";
        PrecioProductos[9] = "$300";
        
        CantidadProductos[0] = 2;
        CantidadProductos[1] = 3;
        CantidadProductos[2] = 5;
        CantidadProductos[3] = 4;
        CantidadProductos[4] = 6;
        CantidadProductos[5] = 4;
        CantidadProductos[6] = 3;
        CantidadProductos[7] = 2;
        CantidadProductos[8] = 3;
        CantidadProductos[9] = 4;
        
        
        ///System.out.println("Nombre de producto "+ " Precio ");
        System.out.println("Nombre de producto "+ "                              "+ "    " +" Precio ");

        
        for(int i= 0; i<NomProductos.length; i++)
        {
           ///System.out.println("Nombre de producto "+ "                              "+ "    " +" Precio ");
           System.out.println(NomProductos[i] + "              "+ "    "+PrecioProductos[i] + "    "+CantidadProductos[i] );
    
        }
    }
    
    public static void main(String [] args){
        Catalogo pv = new Catalogo();
        pv.Inicializar();
        
        
    }
        
        
}
