/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16_t5_ej_se_entrega;

import java.util.InputMismatchException;
import java.util.Scanner;
    
/**
 *
 * @author alumno
 */
public class Test {
    
    public static String nombreEntrante;//Se declaran las variables globales necesarias
    public static int notaEntrante;
    public static int bucle=0;//Incluida la variable "bucle" para el bucle que pedirá los datos de los 3 objetos "Alumno" requeridos
    
    public static void main(String[] args) {
        do {            
            pedirDatosAlumno();//bucle que muestra los métodos pedirDatosAlumno y comprobarNota para pedir los datos 3 veces, 1 porcada objeto
            comprobarNota();
        } while (bucle<3);
    }
    public static void pedirDatosAlumno() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del alumno:");
        nombreEntrante=entrada.nextLine();
        
        try {//Usamos un try para el error de introducir letra en lugar de número
            System.out.println("Introduzca la nota del alumno:");
            notaEntrante=entrada.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("ERROR. Introduzca solo numeros");
        } 
    }
    
    public static void comprobarNota() {
        
        bucle=bucle+1;//Con este método se cuemprueba si la nota es suspenso, bien, notable o sobresaliente con un switch
        Alumno alumno1 = new Alumno();//Se crean los 3 objetos Alumno que se requieren
        alumno1.setNombre(nombreEntrante);
        alumno1.setNota(notaEntrante);
           
        Alumno alumno2 = new Alumno();
        alumno2.setNombre(nombreEntrante);
        alumno2.setNota(notaEntrante);
           
        Alumno alumno3 = new Alumno();
        alumno3.setNombre(nombreEntrante);
        alumno3.setNota(notaEntrante);
           
        switch (notaEntrante) {//Según la nota introducida, que guarda la variable "notaEntrante" se mostrará su correspondiente mensaje
            case 0,1,2,3,4:
                System.out.println(alumno1 + " Suspenso");
                break;
            case 5,6:
                System.out.println(alumno1 + " Bien");
                break;
            case 7,8:
                System.out.println(alumno1 + " Notable");
                break;
            case 9,10:
                System.out.println(alumno1 + " Sobresaliente");
                break;
            default:
                System.err.println("ERROR. Introduzca una cifra entre el 0 y el 10"); 
        }
    }
    
}
