/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26_t2_ejercicio_se_entrega;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
      int n1 , resultado1, resultado2, resultado3, resultado4;
      
  
        Scanner entrada = new Scanner(System.in);
        
       
         
            System.out.println("Por favor, introduzca un número de 4 cifras:");
            n1 = (int) entrada.nextInt();
      
        
                resultado1 = n1 /1000 %10 ;
                resultado2 = n1 /100 %10 ;
                resultado3 = n1 /10 %10 ;
                resultado4 = n1 /1 %10 ;
            
                    //Cada variable "resultado" muestra la cifra que indica su numero 
                    //(Por ejemplo, resultado1 muestra la cifra 1 contando de izquierda a derecha)
     
            
            
                System.out.println("La primera cifra es: " + resultado1);
                System.out.println("La segunda cifra es: " + resultado2);
                System.out.println("La tercera cifra es: " + resultado3);
                System.out.println("La cuarta cifra es: " + resultado4);
            
                    //Muestra de arriva hacia abajo cada cifra por separado del número de 4 dígitos introducido 
                    //empezando a contar de izquierda a derecha
                
        
    }
    
}
