/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27_t3_ejercicio_se_entrega;

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
        
        int num1=0, num2=0, accion=0, division=0;
        
        Scanner entrada = new Scanner(System.in);
        
        //Se declaran las variables y se crea un do while para que siempre se pida al usuario
        //que introduzca un número, dentro se añade un switch y segun el  numero ( que se guarda en variable "accion")introducido
        //se ejecutará su acción correspondiente
        
        do {
            System.out.println("Introduzca la primera cifra");
            num1=entrada.nextInt();
            System.out.println("Introduzca la segunda cifra");
            num2=entrada.nextInt();
            
            System.out.println("1.- Sumar los numeros.\n" +
                               "2.- Restar los numeros.\n" +
                               "3.- Multiplicar los numeros.\n" +
                               "4.- Dividir los numeros.\n" +
                               "5.- Salir del programa.");
            System.out.println("Pulse la tecla numerica correspondiente a la accion deseada");
            accion=entrada.nextInt();
            
            switch (accion) {
                case 1:
                    num1=num1+num2;
                    System.out.println("La suma de las cifras introducidas es " + num1);
                    break;
                case 2:
                    num1=num1-num2;
                    System.out.println("La resta de las cifras introducidas es " + num1);
                    break;
                case 3:
                    num1=num1*num2;
                    System.out.println("El producto de las cifras introducidas es " + num1);
                case 4:
                        try { 
                            division=num1/num2;
                        } catch (ArithmeticException e) {
                        System.err.println("ERROR. No se puede divir 0 entre otro numero" +e.getMessage());
                        division=0;
                        }
                    System.out.println("La division de las cifras introducidas es " + division);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error. Pulse una tecla valida: (1,2,3,4 o 5)");;
            }
           
        } while (num1!=-1);
        
        //Finalmente se usa el "try" y "catch" para mostrar un mensaje si el usuario intenta dividir una cifra entre 0

    }
    
}
  

