/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13_t12_entregar_;

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
    public static void main(String[] args) {//Muestra los métodos
        pedirDatosBecario();
    }
    
    public static void pedirDatosBecario() {//Pide los datos del becario y los escribe en un fichero .txt
        try (
                Scanner scInt = new Scanner(System.in);//Un scanner para cada tipo de dato
                Scanner scString = new Scanner(System.in);
            
                FileWriter fw = new FileWriter("DatosBeca.txt", true);//(append: true -> Añade el nuevo contenido sin borrar el que ya había en el fichero) Iniciamos el fichero (creándolo si no existe)
                PrintWriter pw = new PrintWriter(fw);
            ){//Try with resources (es un try normal pero Inicializando los elementos dentro de el con paréntesis)
            
            System.out.print("Nombre y apellido del becario: ");
            String nombre=scString.nextLine();
            
            String sexo="";
            
            while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m")) {                
                System.out.print("Sexo (H-M): ");
                sexo = scString.nextLine();
                if (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m")) {
                    System.err.println("\nOpcion no valida (Escribe: H o M)\n");
                } 
            }
            
            System.out.print("Edad: ");
            int edad = scInt.nextInt();
            
            System.out.print("Suspensos curso anterioar: ");
            int suspensos = scInt.nextInt();
            
            String residencia="";
            
            while (!residencia.equalsIgnoreCase("si") && !residencia.equalsIgnoreCase("no")) {
                System.out.print("Residencia familiar: ");
                residencia = scString.nextLine();
                if (!residencia.equalsIgnoreCase("si") && !residencia.equalsIgnoreCase("no")) {
                    System.err.println("\nOpcion no valida (Escribe: Si o No)\n");
                }
            }
            
            System.out.print("Ingresos anuales: ");
            int ingresos = scInt.nextInt();
            
            pw.println(nombre + ", edad: " + edad + ", sexo: " + sexo + ", suspensos curso anterior: " 
                    + suspensos + ", ¿tiene residencia familiar?: " + residencia + ", " + ", ingresos anuales: " + ingresos);//Escribe en el fichero los datos indicados
            
            System.out.println("\nFichero modificado correctamente");
            
        } catch (IOException e) {
            System.err.println("ERROR. " + e.getMessage());//Muestra un mensaje concreto para este error
        }catch(InputMismatchException e) {
            System.err.println("ERROR. " + e.getMessage());//Muestra un mensaje concreto para este error
        }
    }
    
}
