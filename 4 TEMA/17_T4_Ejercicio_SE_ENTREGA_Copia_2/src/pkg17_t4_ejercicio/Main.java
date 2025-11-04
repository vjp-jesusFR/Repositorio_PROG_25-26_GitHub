/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17_t4_ejercicio;

import java.util.Random;
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
        
        generarletra();
        
        //Se llama al método deseado desde el Main para que genere la letra al azar
    }
    
    public static double generarletra() {
        
        int intentos=0;
     
        int numeroAleatorio = (int) (Math.random() * 26) + 97;
        char letraAleatoria = (char) numeroAleatorio;
        System.out.println("Adivina la letra aleatoria: " + letraAleatoria);
        
        pedirletra(letraAleatoria, numeroAleatorio, intentos);
        return intentos;
        
        //Primero con el "Math.random" se genera un numero entre el 26 y 97
        //Luego se "traduce" ese número al valor ASCI de cada letra usando un "casting" 
        //pasando el dato de tipo "int" (número entero) a "char" (letra) y se invoca al siguiente método: "pedirletra"
    }
    
    public static char pedirletra(char letraAleatoria, int numeroAleatorio, int intentos) {
        
        char letraintroducida;
         
        do {   
             
            Scanner entrada = new Scanner(System.in);
        
            System.out.println("Introduzca una letra minuscula: ");
        
            letraintroducida= entrada.nextLine().charAt(0);
        
            numeroAleatorio = (char) letraintroducida;
             
                if (letraAleatoria==letraintroducida) {
            
                    intentos=intentos+1;
                    comprobarletra(letraAleatoria, numeroAleatorio, intentos, letraintroducida);
            
                }if (letraAleatoria<letraintroducida) {
            
                    intentos=intentos+1;
                    comprobarletra(letraAleatoria, numeroAleatorio, intentos, letraintroducida);
            
                }if (letraAleatoria>letraintroducida) {
            
                    intentos=intentos+1;
                    comprobarletra(letraAleatoria, numeroAleatorio, intentos, letraintroducida);
            
                }
            
        } while (letraAleatoria!=letraintroducida);
        
        return letraAleatoria;
        
        //Luego se le pide al usuario que introduzca una letra para intentar que coincida 
        //con la generada al azar para ganar. Con cada "if" se actua según cada caso (la letra introducida es correcta o es incorrecta
        // y posterior a la correcta o es anterior) y en cada caso se suma un intento al contador: la variable "intentos"
        
    }
    
    public static int comprobarletra(char letraAleatoria, int numeroAleatorio, int intentos, char letraintroducida) {
        
        do {   
            
            numeroAleatorio = (char) letraintroducida;
             
                if (letraAleatoria==letraintroducida) {
            
                    
                    System.out.println("Enhorabuena, has adivinado la letra. Numero de intentos: " + intentos);
                    pedirletra(letraAleatoria, numeroAleatorio, intentos);
            
                }if (letraAleatoria<letraintroducida) {
            
                    System.out.println("Incorrecto, la letra que debes adivinar va antes en el alfabeto que " + letraintroducida);
                    pedirletra(letraAleatoria, numeroAleatorio, intentos);
                    
                }if (letraAleatoria>letraintroducida) {
            
                    System.out.println("Incorrecto, la letra que debes adivinar va despues en el alfabeto que " + letraintroducida);
                    pedirletra(letraAleatoria, numeroAleatorio, intentos);
                }
            
        } while (letraAleatoria!=letraintroducida);
        
        return letraAleatoria;
        
        //Finalmente, en el subprograma "comprobarletra" se realiza el proceso inverso, ahora se pasa el dato numérico (variable numeroAleatorio)
        //a alfabético con un "casting" al tipo de dato alfabético "char" para comprobar si el valor de esta variable (numeroAleatorio) 
        //coincide con el de la letra introducida por el usuario según su código ASCI de la letra
        //generada al azar para poder comparar dichos elementos a pesar de ser tipos de datos diferentes.
        //si coinciden el usuario gana, si no, se repite el proceso y se le vuelve a pedir al usuario que introduzca una letra
       
    }
}
