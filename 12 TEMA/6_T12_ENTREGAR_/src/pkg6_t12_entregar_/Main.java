/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_t12_entregar_;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Muestra el menú y los resultados
        int opciones=0;
        Scanner entrada = new Scanner(System.in);
        do {            
            try {
                System.out.println("\n1. Volcado de un array con los 100 primeros números pares a un "
                        + "fichero de texto El nombre del fichero lo elegirá el usuario\n"
                        + "\n2. Mostrar por pantalla el contenido del fichero de texto creado\n"
                        + "\n3. Salir del Programa"); 
                
                System.out.print("\nIntroduzca una opcion: ");
                opciones=entrada.nextInt();
                
                switch (opciones) {
                    case 1:
                        cienParesAUnFichero();
                        break;
                    case 2:
                        mostrarFichero();
                        break;
                    case 3:
                        System.out.println("\nHas salido del programa");
                        break;
                    default:
                        System.err.println("Tipo de dato no valido");;
                }
                
            } catch (InputMismatchException e) {//Muestra un mensaje conceto para esa excepción
                System.err.println("ERROR " + e.getMessage());
            }catch (IOException e) {//Muestra un mensaje conceto para esa excepción
                System.err.println("ERROR " + e.getMessage());
            }
 
        } while (opciones!=3);
    }
    
    public static void cienParesAUnFichero() throws IOException {//Escribe las 100 primeras cifras pares en un fichero .txt 
       try (PrintWriter pw = new PrintWriter(new FileWriter("cienPrimerosPares.txt", true))) {
            for (int i = 1; i < 100; i++) {
            i=i+1;
            pw.println("Linea: " + i);
            }
       
          System.out.println("Fichero guardado con exito");  
        } 
    }
    
    public static void mostrarFichero() throws IOException {//Lee el contenido del fichero y lo muestra por pamtalla
        File fichero = new File("cienPrimerosPares.txt");
        if (!fichero.exists()) {
            System.out.println("Fichero vacio (no existe el fichero).");
        }

        try (Scanner lector = new Scanner(fichero)) {
            System.out.println("\n--- CONTENIDO ---\n");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
        } 
    
        
    }
    
}
