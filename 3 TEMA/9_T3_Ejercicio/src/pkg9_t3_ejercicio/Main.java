/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_t3_ejercicio;

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
     
        int n1, n2, n3, n4, auxiliar = 0;
     
        Scanner entrada = new Scanner(System.in);
        
       
        
        System.out.println("Por favor, introduzca el primer numero:");
        n1 = entrada.nextInt();
        System.out.println("Ahora introduzca el segundo numero:");
        n2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero:");
        n3 = entrada.nextInt();
        System.out.println("Por último, introduzca un cuarto numero:");
        n4 = entrada.nextInt();
        
        
        //Se intercambia la unidad mayor al puesto de la cifra siguiente si esta es menor a la siguente (contando de izquierda a derecha)
        //pasando antes por la variable "auxiliar" y asi hasta 3 veces (n -1 veces) 
        //n1->auxiliar->n2 / n2->auxiliar->n1
        //n2->auxiliar->n3-> / n3->auxiliar->n2-> 
        //n3->auxiliar->n4-> / n4->auxiliar->n3-> 
        //X3 veces
        //(Método Burbuja)
        
        if (n1>n2) {
            auxiliar=n1;
            n1=n2;
            n2=auxiliar;
            auxiliar=n2;
         
        } if (n2>n3) {
            auxiliar=n2;
            n2=n3;
            n3=auxiliar;
            auxiliar=n3;
         
        } if (n3>n4) {
            auxiliar=n3;
            n3=n4;
            n4=auxiliar;
            auxiliar=n4;
         
        }  if (n1>n2) {
            auxiliar=n1;
            n1=n2;
            n2=auxiliar;
            auxiliar=n2;
         
        } if (n2>n3) {
            auxiliar=n2;
            n2=n3;
            n3=auxiliar;
            auxiliar=n3;
         
        } if (n3>n4) {
            auxiliar=n3;
            n3=n4;
            n4=auxiliar;
            auxiliar=n4;
         
        }  if (n1>n2) {
            auxiliar=n1;
            n1=n2;
            n2=auxiliar;
            auxiliar=n2;
         
        } if (n2>n3) {
            auxiliar=n2;
            n2=n3;
            n3=auxiliar;
            auxiliar=n3;
         
        } if (n3>n4) {
            auxiliar=n3;
            n3=n4;
            n4=auxiliar;
            auxiliar=n4;
         
        } 
        
        System.out.println("El orden de los números introducidos es el " + n1 + n2 + n3 + n4);
        
    }
    
}
