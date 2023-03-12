/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;


/**
 *
 * @author Alejandro Bautista
 */
public class Venta {
    
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;
    
    
    public void setNombre(){
        
    }
    
    
/*    public Venta (String id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }
*/
    /*
    private String pathProductos;
    private String pathFactura;

    public Factura(String pathProductos, String pathFactura) {
        this.pathProductos = pathProductos;
        this.pathFactura = pathFactura;
    }

    
    public void generarFactura() {
        Catalogo catalogo = new Catalogo(pathProductos);
        String[] productos = catalogo.getProductos();

        Scanner teclado = new Scanner(System.in);

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(pathFactura, true);
            pw = new PrintWriter(fichero);

            System.out.println("Productos disponibles:");
            for (int i = 0; i < productos.length; i++) {
                System.out.println(productos[i]);
            }

            System.out.print("Ingrese el ID del producto: ");
            String id = teclado.nextLine();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = Integer.parseInt(teclado.nextLine());

            boolean encontrado = false;
            for (int j = 0; j < productos.length; j++) {
                if (productos[j].startsWith(id)) {
                    String[] detalles = productos[j].split(",");
                    String nombre = detalles[1];
                    double precio = Double.parseDouble(detalles[2]);
                    double total = cantidad * precio;

                    pw.println(id + "," + nombre + "," + precio + "," + cantidad + "," + total);

                    System.out.println("Producto agregado a la factura.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El producto no está disponible.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    
    public void generarFactura() {
    Catalogo catalogo = new Catalogo(pathProductos);
    String[] productos = catalogo.getProductos();

    Scanner teclado = new Scanner(System.in);

    FileWriter fichero = null;
    PrintWriter pw = null;

    try {
        fichero = new FileWriter(pathFactura, true);
        pw = new PrintWriter(fichero);

        System.out.println("Productos disponibles:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }

        System.out.print("Ingrese el ID del producto y la cantidad (separados por una coma): ");
        String compra = teclado.nextLine();

        String[] datosCompra = compra.split(",");
        String id = datosCompra[0];
        int cantidad = Integer.parseInt(datosCompra[1]);

        boolean encontrado = false;
        for (int j = 0; j < productos.length; j++) {
            if (productos[j].startsWith(id)) {
                String[] detalles = productos[j].split(",");
                String nombre = detalles[1];
                double precio = Double.parseDouble(detalles[2]);
                double total = cantidad * precio;

                pw.println(id + "," + nombre + "," + precio + "," + cantidad + "," + total);

                System.out.println("Producto agregado a la factura.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El producto no está disponible.");
        }

    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (null != fichero) {
                fichero.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
     */
    
    
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();
        catalogo.Catalogo();
        String[] productos = catalogo.Productos();

        Scanner teclado = new Scanner(System.in);
        String codigo = "";

        String path = System.getProperty("user.dir");
        path = path + "\\Archivos\\Venta\\Factura.txt";

        FileWriter fichero = null;
        PrintWriter pw = null;
        
        Scanner scanner = new Scanner(path);


        try {

            System.out.print("Ingrese el ID del producto y la cantidad (separados por una coma): ");
            String compra = teclado.nextLine();

            
           /* List<Venta> venta = new ArrayList<>();

            String[] producto = compra.split(";");
            for (String producto : productos) {
                String[] datosProducto = producto.split(",");
                String id = datosProducto[0];
                int cantidad = Integer.parseInt(datosProducto[1]);
                productosCompra.add(new ProductoCompra(id, cantidad));
            }
                */
         /*   String[] datosCompra = compra.split(",");
            for (int j = 0; j < datosCompra.length; j++) {
                String id = datosCompra[0];
                int cantidad = Integer.parseInt(datosCompra[1]);
            }
            String id = datosCompra[0];
            int cantidad = Integer.parseInt(datosCompra[1]);
            */
            String[] productosCompra = compra.split(";");
        for (String producto : productosCompra) {
            String[] datosProducto = producto.split(",");
            String id = datosProducto[0];
            int cantidad = Integer.parseInt(datosProducto[1]);
            
            scanner.useDelimiter(","); // para establecer la coma como separador

while (scanner.hasNextLine()) {
    String linea = scanner.nextLine();
    String[] columnas = linea.split(","); // separa las columnas por la coma
    
    // crea un objeto Producto con los valores de las columnas
    Venta venta = new Venta();
    venta.setNombre(columnas[0]);
    venta.setCantidad(Integer.parseInt(columnas[1]));
    producto.setPrecio(Double.parseDouble(columnas[2]));
    producto.setDescripcion(columnas[3]);
    
    // haz algo con el objeto Producto, como agregarlo a una lista o mostrarlo en pantalla
}
scanner.close();
            
            /*
            boolean encontrado = false;
            for (int j = 0; j < productos.length; j++) {
                if (productos[j].startsWith(id)) {
                    String[] detalles = productos[j].split(",");
                    
                    String nombre = detalles[1];
                    double precio = Double.parseDouble(detalles[2]);
                    
                    double total = cantidad * precio;

                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);

                    pw.println(id + "," + nombre + "," + cantidad + "," + "$" + precio + "," + total);

                    System.out.println("Producto agregado a la factura.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El producto no está disponible.");
            }
          */  
        } 
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        ///          }
    }

    /*
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();
        catalogo.Catalogo();
        String[] productos = catalogo.Productos();

        Scanner teclado = new Scanner(System.in);
        String codigo = "";
        String cantidad = "";
        String venta = codigo + "," + "," + cantidad;

        String path = System.getProperty("user.dir");
        path = path + "\\Archivos\\Venta\\Factura.txt";

        FileWriter fichero = null;
        PrintWriter pw = null;

        System.out.print("Ingrese su venta :");
        venta = teclado.nextLine();

        ///System.out.print("Digite la cantidad  :");
        ///cantidad = teclado.nextLine();
        for (int j = 0; j < productos.length; j++) {
            if (productos[j].equals(venta)) {

         ///       if (cantidad != "0") {

                    System.out.println("Producto agrsegado");
                    try {
                        fichero = new FileWriter(path);
                        pw = new PrintWriter(fichero);

                        pw.println(venta + "\n");

                    } catch (Exception e) {
                        e.printStackTrace();

                    } finally {
                        try {
                            if (null != fichero) {
                                fichero.close();
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }

      ///          }

            } else {
                System.out.println("El Producto seleccionado no esta disponible ");
            }
        }

    }
     */
}
