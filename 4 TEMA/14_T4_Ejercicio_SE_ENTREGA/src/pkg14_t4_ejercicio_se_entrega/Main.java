/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_t4_ejercicio_se_entrega;

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
        pedir();
    }
    
    public static int pedir() {
        
        int num;
        int uno=1, multi=3;
        
        boolean comprobar=false;
        
        Scanner entrada = new Scanner(System.in);
        
        do {      
         
            System.out.println("Introduzca un numero mayor que 0: ");
            num=entrada.nextInt();
            
            comprobar(comprobar, num, uno);
                
        } while (num<=1);
        
        return num;   
    }
    
    public static boolean comprobar(boolean comprobar, int num, int uno) {
        
        do {
            
            if (num<=0) {
                
                System.err.println("Error. Introduzca un numero mayor que 0");
                
                
            }if ( num>0) {
                comprobar=true;
                mostrar(uno, num, uno);               
            }
    
        } while (comprobar=false);
        
        return comprobar;
    }
    
    public static int mostrar(int uno, int num, int multi) {
        
        int contador=0;
        
        System.out.println("Los multiplos de 3 entre el " + num + " y el 1 son: ");
        
        do {
            
            System.out.println(multi);
            uno=uno+1;
            multi=uno*3;
            contador++;

        } while (multi<num);
        
        System.out.println("La cantidad total de cifras mostradas a sido: " + contador);
        
        return num;  
    }
    
    //Primero en el Main se invoca al método pedir, en él se pide una cifra al usuario, si es menor o igual a 0 da error y se repite
    //la petición usando un "do while". Si la cifra es mayor 0 se pasa al método comprobar que con "if" revisa
    //Si la cifra es mayor que 0 o no. Si es mayor de 0 se pasa al último método, "mostrar", que con un "do while" muestra
    //todos los múltiplos de 3 entre el 1 y el número indicado por el usuario sumando al valor de la variable "uno" un 1 cada iteración
    //y así hasta llegar a la cifra deseda obteniendo de esta manera todas los múltiplos de 3 intermedios.
}



