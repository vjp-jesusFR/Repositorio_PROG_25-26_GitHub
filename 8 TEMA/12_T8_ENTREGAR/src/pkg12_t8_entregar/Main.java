/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_t8_entregar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {
    
        public static int opcionMenu=0;//Variables globales para controlar el menú
        public static boolean repetirMenu=true;
        
    public static void main(String[] args) {//Muestra los datos
        Mueble silla = new Mueble();//Objeto creado con constructor por defecto.
        Mueble mesa = new Mueble(0, "");//Constructor parametrizado
        
        Mueble[] mueblesVector = new Mueble[4];//Vector de 4 celdas

        silla.setDescripcion("Silla de metal"); //cambio de la descripción y el precio de los objetos utilizando los setters
        mesa.setDescripcion("Silla de madera");
        silla.setPrecio(60);
        mesa.setPrecio(100);
       
        System.out.println("Silla: " + silla.toString() + "\n" + "Mesa: " + mesa.toString());//muestra la información de los objetos por pantalla

        while (repetirMenu|=false) { 
            try {
                menu(mueblesVector);
            } catch (InputMismatchException e) {
                System.err.println("ERROR. INTRODUZCA SOLO CIFRAS: 1, 2, 3 O 4");
            }
        } 
    }
    
    public static void menu(Mueble[] vector) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n1. Rellenar muebles (todos los muebles del vector)\n" + "\n" + "2. Mostrar muebles\n" + "\n" + 
            "3. Mostrar muebles por precio (pediremos un precio al\n" +
            "usuario y mostraremos todos los muebles con igual o\n" +
            "menor precio) \n");
        
        System.out.print("Introduzca la opcion deseada: ");
        opcionMenu=entrada.nextInt();
        
        switch (opcionMenu) {
            case 1:
                rellenarMuebles(vector);
                break;
            case 2:
                mostrarMuebles(vector);
                break;
            case 3:
                mostrarMueblesPorPrecio(vector);
                break;
            default:
                System.err.println("ERROR. DATO INCORRECTO");;
        }
    }
    
    public static void rellenarMuebles(Mueble[] vector) {//Guarda los datos sobre los muebles introducidos por el usuario
        Scanner scanner = new Scanner(System.in);
        //Crea el vector (array) de clase mueble con 4 objetos
        Mueble[] inventario = new Mueble[4];

        System.out.println("--- Relleno de inventario de Muebles ---");

        //Bucle para solicitar datos y rellenar el vector
        for (int i = 0; i < inventario.length; i++) {
            System.out.println("\nIntroduce los datos del mueble " + (i + 1) + ":");
       
            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();
            
            System.out.print("Precio: ");
            int precio = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            // Crear el objeto y lo inserta en el vector
            vector[i] = new Mueble(precio,descripcion);
        }
        
    }
    
    public static void mostrarMuebles(Mueble[] vector) {//Muestra los datos introducidos de los muebles
        int contador=1;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Mueble " + contador + " " + vector[i]);
            contador=contador+1;
        }
    }
    
    public static void mostrarMueblesPorPrecio(Mueble[] vector) {//Muestra los precios de los muebles según si su precio es igual o menor al introducido por el usuario 
        Scanner entrada = new Scanner(System.in);
        
       //Pide el precio de la búsqueda
        System.out.print("Mostrar muebles con precio igual o menor a: ");
        int precioMaximo = entrada.nextInt();

        //Muestra los muebles con precio igual o inferior al solicirado
        System.out.println("\nMuebles disponibles (" + precioMaximo + " euros o menos):");
        boolean encontrado = false;
        for (Mueble m : vector) {
            if (m.getPrecio() <= precioMaximo) {
                System.out.println(m.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay muebles que cumplan con ese criterio.");
        }
  
    }
    
    
}
