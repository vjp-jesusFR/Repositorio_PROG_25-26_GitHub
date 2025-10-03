/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg32_t2_ejercicio_se_entrega;

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
        
        int importe;
        
            Scanner entrada = new Scanner(System.in);
            
                System.out.println("Por favor, indique una cantidad de dinero:");
                importe = entrada.nextInt();
      
     //Fórmula: Cada variable "resultado" corresponde a la cantidad en billetes en la que se reparte el importe que indica el usuario.
     //Primero se divide el importe entrte 50 (para optener el número de estos billetes en el que se puede descomponer el importe)
     //Luego el resultado de esa división se multiplica por el tipo de billete (50 en este caso) y el resultado de esa operación
     //se divide por el siguiente tipo de billete en que queremos descomponer ahora el importe y así sucesivamente.
   
     //La variable "importe" contiene la cifra que introduce el usuario y cada variable "resultado" aplica la anterior fórmula.
      
                    System.out.println(importe + " Euros se descomponen en " + importe /50 + " billetes de 50, " + importe %50 /20 + " billetes de 20, " + importe %20 /10 + " billetes de 10, ");
                    System.out.println(importe %10 /5 + " billetes de 5, "  + importe %5 /2 + " monedas de 2 euros y " + importe %2 /1 + " monedas de 1 euro.");
    
    
        
       
    
    
    
    }
    
}
