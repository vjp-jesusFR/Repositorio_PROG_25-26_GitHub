/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_t12_;

import java.io.File;
import java.io.FileNotFoundException;
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
        try {
            Scanner entrada = new Scanner(System.in);
            
            do {                
            System.out.println("\n -- MENU -- \n1. Aniadir un contacto a un fichero de texto ('agenda txt') \nen el que indiques en cada linea" +
                "\nUn Nombre \nUna Edad \nUn numero de telefono\n" +
                "\n2. Mostrar por pantalla el contenido del fichero de texto creado\n" +
                "\n3. Salir del Programa");
            
            System.out.print("\nIntroduzca una opcion: ");
            opciones=entrada.nextInt();
            
            switch (opciones) {
                case 1:
                    aniadirContacto();
                    break;
                case 2:
                    mostrarContactos();
                    break;
                case 3:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.err.println("Opcion no valida");
            }
            } while (opciones!=3);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());//Muestra un mensaje de error específico
        }
    }
    
    public static void aniadirContacto() {//Añade un contacto dado por el usuario a un ficheto de texto .txt
        String ruta="";
        Scanner sc = new Scanner(System.in);
        
       try (PrintWriter pw = new PrintWriter(new FileWriter("agenda.txt", true))) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Telefono: ");
            String tel = sc.nextLine();

            pw.println(nombre + ", " + edad + " anios, Tel: " + tel);
            System.out.println("Contacto guardado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        } 
    }
    
    public static void mostrarContactos() {
        File fichero = new File("agenda.txt");
        if (!fichero.exists()) {
            System.out.println("La agenda esta vacia (no existe el fichero).");
            return;
        }

        try (Scanner lector = new Scanner(fichero)) {
            System.out.println("\n--- CONTENIDO DE LA AGENDA ---");
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado.");
        }
    }
    
}
