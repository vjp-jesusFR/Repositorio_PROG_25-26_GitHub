/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_t3_ejercicio;

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
        
        int nota;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduzca una nota entre el 0 y el 10");
        nota = entrada.nextInt();
        
        switch (nota) {
            case 0:
                System.out.println("Suspenso.");
                break;
                case 1:
                System.out.println("Suspenso.");
                break;
                case 2:
                System.out.println("Suspenso.");
                break;
                case 3:
                System.out.println("Suspenso.");
                break;case 4:
                System.out.println("Suspenso.");
                break;
                case 5:
                System.out.println("Bien.");
                break;
                case 6:
                System.out.println("Bien.");
                break;
                case 7:
                System.out.println("Notable.");
                break;
                case 8:
                System.out.println("Notable.");
                break;
                case 9:
                System.out.println("Sobresaliente.");
                break;
                case 10:
                System.out.println("Sobresaliente.");
                break;
                
            default:
                System.out.println("ERROR. Introduzca una cifra entre el 0 y el 10");;
        }
        
        //El usuario introduce las notas y usando el "if" se imprime en pantalla si la nota es: aprobado, suspenso, notable...
        
        
        
    }
    
}
