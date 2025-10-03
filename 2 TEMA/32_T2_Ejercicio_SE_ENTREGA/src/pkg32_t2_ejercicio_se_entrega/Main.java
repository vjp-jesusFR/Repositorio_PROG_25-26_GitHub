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
    
        int importe , uno = 1, resultado1 = 0, resultado2, resultado3, resultado4, resultado5, resultado6, resta1, resta2, resta3, resta4, resta5, resta6;
        
       
  
            Scanner entrada = new Scanner(System.in);
        
       
         
            System.out.println("Por favor, indique una cantidad de dinero:");
                importe = entrada.nextInt();
      
        
        
                resultado1 = importe /50;  
        
                    resta1 = resultado1 * 50 ; 
        
                resultado2 = resta1 - importe ;
        
                    resta2 = resultado2 * 20 ; 
        
        
                resultado3 = + importe /10;
        
                    resta3 = resultado3  * 10  ; 
        
                resultado4 = importe /5;
        
                    resta4 = resultado4 * 5 ; 
         
                resultado5 = importe /2;
        
                    resta5 = resultado5 * 2 ; 
        
                resultado6 = importe /1;
        
                    resta6 = resultado6 * 1 ; 
        
      
     //Fórmula: Cada variable "resultado" corresponde a la cantidad en billetes en la que se reparte el importe que indica el usuario.
     //Primero se divide el importe entrte 50 (para optener el número de estos billetes en el que se puede descomponer el importe)
     //Luego el resultado de esa división se multiplica por el tipo de billete (50 en este caso) y el resultado de esa operación
     //se divide por el siguiente tipo de billete en que queremos descomponer ahora el importe y así sucesivamente.
     
     
     //La variable "importe" contiene la cifra que introduce el usuario y cada variable "resultado" aplica la anterior fórmula.
     
     
     //Cada variable "resta" resta el numero de billetes. (Por ejemplo, del valor total de 232 serían 4 billetes de 50 que son 200, 
     // eso se resta del total y nos quedan unos 32 euros)
      
        
        
            System.out.println(importe + " Euros se descomponen en " + resultado1 + " billetes de 50, " + resultado2 * -1  /20 + " billetes de 20, " + resultado3 * -1 /10 + " billetes de 10, ");
            System.out.println(resultado4 * -1 /5 + " billetes de 5 "  + resultado5 * -1 /2 + " monedas de 2 euros y " + resultado6 * -1 /1 + " monedas de 1 euro.");
    
    
        
       
    
    
    
    }
    
}
