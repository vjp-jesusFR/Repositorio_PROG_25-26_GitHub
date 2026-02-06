/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_t8_entregar_;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {
    
    public static int opcionMenu=0;//Variables globales para controlar el menú
    public static boolean repetirMenu=true;
    
    public static void main(String[] args) {//Muestra los resultados
        Alumno alum1 = new Alumno("Pepe", 20, 8);
        Alumno alum2 = new Alumno("Ana", 22, 9);
        
        Alumno[] vectorAlumnos = new Alumno[5];//Vector de alumnos con 5 celdas
        
        //Introduce los alumnos anteriores dentro del vector:
        vectorAlumnos[0] = alum1;
        vectorAlumnos[1] = alum2;
        
        while (repetirMenu!=false) {            
            try {
                menu(vectorAlumnos);
            } catch (InputMismatchException e) {
                System.err.println("ERROR. INTRODUZCA UNA CIFRA ACEPTADA");
            }
        }
    }
    
    public static void menu(Alumno[] vector) {//Muestra el menú
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("1. Rellenar un alumno (pediremos posición e insertaremos al nuevo\n" +
        "alumno en esa posición Si la posición está ya rellena, volveremos a\n" +
        "pedir una nueva posición las veces que sean necesarias)\n" +
        "•\n" +
        "2. Mostrar vector de alumnos (si una celda todavía no está rellena, no\n" +
        "mostraremos nada de esa celda)\n" +
        "•\n" +
        "3. Mostrar alumnos con nota media por encima de una nota dada\n" +
        "•\n" +
        "4. Mostrar cuántos alumnos hay con la nota media suspensa\n" +
        "•\n" +
        "5. Buscar alumnos (pediremos nombre y mostraremos si está\n" +
        "matriculado o no)");
        
        System.out.print("\n Introduzca opcion: ");
        opcionMenu=entrada2.nextInt();
        
        switch (opcionMenu) {
            case 1:
                rellenarVectorAlumnos(vector);
                break;
            case 2:
                mostrarVectorAlumnos(vector);
                break;
            case 3:
                mostrarNotaMayorALaDada(vector);
                break;
            case 4:
                mostrarNotaSuspensa(vector);
                break;
            case 5:
                buscarAlumno(vector);
                break;
            default:
                System.err.println("ERROR. DATO NO ACEPTADO");//Si no se cumple el criterio se muestra este mensaje
        }
    }
    
    public static void rellenarVectorAlumnos(Alumno[] vector) {//Rellena el vector de alumnos con los datos dados por el usuario
        Scanner entrada = new Scanner(System.in);

        int posicion=2;
        
        System.out.println(" ");

        if (vector[posicion] == null) {//Bucle para solicitar datos y rellenar el vector según la celda que quiera el usuario solo si esta está vacía
             for (int i = 0; i < vector.length; i++) {
            System.out.println("\nIntroduce los datos del alumno " + (i+1) + ":");
           
       
                System.out.println("Nombre: ");
                String nombre = entrada.nextLine();

                System.out.println("Edad: ");
                int edad = entrada.nextInt();

                System.out.println("Nota media: ");
                double notaMedia = entrada.nextDouble();
                
                
                System.out.print("Poscion dentro del vector: ");
                posicion = entrada.nextInt();

                entrada.nextLine(); // Consumir el salto de línea pendiente

                // Crea el objeto y lo inserta en el vector
                vector[posicion] = new Alumno(nombre,edad,notaMedia);
                
            }
        }else{
            System.err.println("ERROR. LA CELDA YA ESTA OCUPADA");//Si no se cumple el criterio se muestra este mensaje
        }
        
    }
    public static void mostrarVectorAlumnos(Alumno[] vector) {//Muestra solo las celdas llenas del vector de alumnos
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                System.err.println(vector[i]);
            }else{
                System.err.println("");
            }
        }
    }
    
     public static void mostrarNotaMayorALaDada(Alumno[] vector) {//Muestra la nota media que sea mayor a la introducida por el usuario 
        Scanner entrada = new Scanner(System.in);
        
       //Pide el precio de la búsqueda
        System.out.print("Mostrar notas mayores a: ");
        int notaMaxima = entrada.nextInt();

        //Muestra los muebles con precio igual o inferior al solicirado
        System.out.println("\nNotas medias disponibles (" + notaMaxima + " ):");
        boolean encontrado = false;
        for (Alumno a : vector) {
            if (a.getNotaMedia() > notaMaxima) {
                System.err.println(a.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay notas medias que cumplan con ese criterio.");//Si no se cumple el criterio se muestra este mensaje
        }
    }
     
     public static void mostrarNotaSuspensa(Alumno[] vector) {//Muestra los alumnos con notas medias suspensas, solo si hay suspensos
         
         if (vector == null ) {
            System.out.println("\nNotas medias suspensas disponibles:");
            boolean encontrado = false;
            for (Alumno a : vector) {
                if (a.getNotaMedia() <5) {
                System.err.println(a.toString());
                encontrado = true;
                }
            }

            if (!encontrado) {
            System.out.println("No hay notas medias que cumplan con este criterio.");
            }
            
       }else{
             System.err.println("No hay suspensos");//Si no hay suspensos se muestra este mensaje
       }
    }
     
     public static void buscarAlumno(Alumno[] vector) {//Pide al usuario un nombre y comprueba si ese alumno está matriculado y responde con un mensaje 
        Scanner entrada = new Scanner(System.in);

        System.out.print("Buscar alumno: ");
        String nombreAlumno = entrada.nextLine();

        int contador = 0;//Cuenta cuantas veces aparece el nombre introducido dentro del vector de alumnos

        for (Alumno p : vector) {//Recorre el vector y cuenta
            
            if (p != null && p.getNombre().equals(nombreAlumno)) {//Verifica si el objeto no es nulo antes de llamar a getNombre()
                contador++;
            }
        }
        
         if (contador>0) {
             System.err.println("MATRICULADO: El nombre '" + nombreAlumno + "' aparece " + contador + " veces.");//Muestra que sí está matriculado y el número de veces que aparece el nombre dentro del vector de alumnos
         }else{
              System.err.println("No matriculado: El nombre '" + nombreAlumno + "' aparece " + contador + " veces.");//Muestra que no está matriculado y el número de veces que aparece el nombre dentro del vector de alumnos
         }

    }

}
