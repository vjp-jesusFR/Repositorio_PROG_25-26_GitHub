/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_t11_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import pkg6_t11_.Donacion;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Muestra los resultados y el menú
       
        Campania c1 = new Campania("c0");//Objeto campaña con valores por defecto
        
        Donacion d1 = new Donacion("n",1);//Objeto donación con valores por defecto
        
        ArrayList<Donacion> donaciones = new ArrayList<>(); //ArrayList para guardar las donaciones

        Scanner entrada = new Scanner(System.in);
        int opciones=0;
        try {
            do {                
                System.out.println(
                "\n1. Aniadir donacion.\n" +
                "2. Mostrar donaciones.\n" +
                "3. Mostrar donaciones por nombre de donante (Pediremos un nombre y mostraremos las\n" +
                "donaciones cuyo donante coincida con el nombre dado).\n" +
                "4. Mostrar numero de donaciones.\n" +
                "5. Mostrar total dinero recaudado.\n" +
                "6. Ordenar donaciones (de mayor a menor importe de las donaciones)\n" +
                "7. Salir.");
                System.out.print("\nIntroduzca una opcion: ");
                opciones=entrada.nextInt();
                
                switch (opciones) {
                    case 1:
                        aniadirDonacion(donaciones, c1, d1);
                        break;
                    case 2:
                        mostrarDonaciones(c1);
                        break;
                    case 3:
                        mostrarDonacionesPorNombreDonante(donaciones);
                        break;
                    case 4:
                        mostrarNumeroDeDonaciones(donaciones);
                        break;
                    case 5:
                        mostrarTotalDineroRecaudado(donaciones);
                        break;
                    case 6:
                        ordenarDonaciones(donaciones);
                        break;
                    case 7:
                        System.out.println("Has salido del programa");
                        break;
                    default:
                        System.out.println("Opcion no aceptada");;
                }
            } while (opciones!=7);
        } catch (InputMismatchException e) {//Muestra un mensaje de error si el tipo de dato introducido no es válido
            System.err.println("Tipo de dato no aceptado");
        }
    }
    
    public static void aniadirDonacion(ArrayList<Donacion> donaciones, Campania c1, Donacion d1) {//Pide a los datos los datos de la donación y los almacena
         Scanner entrada = new Scanner(System.in);
        
        boolean bucle=true;
        
        String seguir="";
        
        System.out.println("\n -- HACER DONACIONES -- \n");
        
        System.out.println("Introduzca el nombre de la campania: ");
        String nombreCampania=entrada.nextLine();
        
        do { 
            System.out.println("Introduzca el nombre de la persona donante: ");
            String nombreDonante=entrada.nextLine();
            entrada.nextLine();//Limpia el Buffer
            
            System.out.println("Introduzca la cantidad de la donacion: ");
            int cantidad=entrada.nextInt();
            entrada.nextLine();//Limpia el Buffer
          
            d1 = new Donacion(nombreDonante, cantidad);

            donaciones.add(d1);
            
            c1.setNombreCampania(nombreCampania);

            c1.insertarDonacion(c1, d1);
            
            entrada.nextLine();//Limpia el Buffer
             
            System.out.println("\nIntroducir otra donacion (s/n): \n");
            seguir=entrada.nextLine();
            entrada.nextLine();//Limpia el Buffer
            
            if (seguir.equalsIgnoreCase("n")) {
                bucle=false;
            }
            
        } while (bucle!=false);//Si la variable "bucle" es distinta de false el bucle que pide los datos se repite  
    }
    
    public static void mostrarDonaciones(Campania c1) {//Muestra las donaciones guardadas en el conjunto junto con el nombre de su campaña
        System.out.println(c1.toString());
    }
    
    public static void mostrarDonacionesPorNombreDonante(ArrayList<Donacion> donaciones) {//Muestra las donaciones hechas por la persona cuyo nombre introduzca el usuario
       Scanner entrada = new Scanner(System.in);
       String nombreDonante;

       System.out.println("\nBuscar donaciones por nombre de la persona donante: ");
       nombreDonante = entrada.nextLine();

       boolean encontrado = false;

       for (Donacion d : donaciones) {
           if (nombreDonante.equalsIgnoreCase(d.getNombre())) {
               System.out.println("\n" + d.getNombre() + " ha donado: " + d.getCantidad() + " euros");
               encontrado = true;
           }
       }

       if (!encontrado) {
           System.out.println("\nNo se encontraron donaciones para ese nombre.");
       }
   }
    
    public static void mostrarNumeroDeDonaciones(ArrayList<Donacion> donaciones) {//Muestra el número de donaciones registradas
        int total = donaciones.size();
        System.out.println("\nTotal de donaciones: " + total);
    }
    
    public static void mostrarTotalDineroRecaudado(ArrayList<Donacion> donaciones) {//Suma el dinero de todas las donaciones y muestra el total
        int total = 0;
        for (Donacion d : donaciones) {
            total += d.getCantidad(); // Recorre la lista de donaciones y suma sus cantidades
        }
        
        System.out.println("\nTotal recaudado " + total + " euros");//Muestra el total recaudado
    }
    
    public static void ordenarDonaciones(ArrayList<Donacion> donaciones) {//Ordena las donaciones a mayor a menor
        donaciones.sort(Comparator.comparing(Donacion::getCantidad).reversed());//Ordena los objetos de mayor a menor según el valor de su atributo "cantidad"

        System.out.println(donaciones);//Muestra la lista ya ordenada
    }
    
}
