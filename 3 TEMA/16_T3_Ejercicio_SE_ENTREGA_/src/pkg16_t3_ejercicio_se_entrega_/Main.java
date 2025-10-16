/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16_t3_ejercicio_se_entrega_;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i=20; //Se declara la variable para las cifras
        
        int cantidad=0; //Se declara la variable para contar el numero de bucles para saber la cantidad de resultados en pantalla
        
        do {
             if (i%2==1) {
                
                System.out.println("Los números impares existentes entre el número 20 y el 160 son:" + i); 
                cantidad=cantidad+1; 
                //Cada vez que se cumpla la condicion se muestra el numero impar en "i" y se suma 1 a 
                // la variable "cantidad"
            } 
        i=i+1;
        } while (i<=160);
        
        System.out.println("La cantidad de números impares impresos han sido:" + cantidad);
        
        //Se hace crea un bucle que saca el modulo de i entre 2 y si es igual a 1 "==1" significa que el número es impar
        //y lo mostrará por pantalla, después sumará 1 a "i" para que el bucle continue y así hasta que "i" llegue
        // al número 160
    }
    
}
