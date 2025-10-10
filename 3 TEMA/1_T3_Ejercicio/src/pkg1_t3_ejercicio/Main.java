/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_t3_ejercicio;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca un numero:");
        num = entrada.nextInt();
        
        if (num >= 0) {
            System.out.println("El número introducido es positivo");
            
        }else if(num <= 0) {
            System.out.println("El número introducido es negativo");
        }
    }
   
    //Usando un "if" se indica por pantalla si el número introducido por el usuario es positivo o negativo
}
