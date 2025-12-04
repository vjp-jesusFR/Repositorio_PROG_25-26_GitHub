/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.t6.entregar;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Se invoca al método pruebasTelevisorYRadio para mostrar e interactuar con los objetos
        pruebasTelevisorYRadio();
    }
    
    public static void pruebasTelevisorYRadio () {//En este método se crean los objetos de la clase Televisor y Radio y se prueban
        Televisor tele1 = new Televisor();
        System.out.println("tele1: " + tele1);
        tele1.encender();
        System.out.println("tele1: " + tele1);
        for (int i = 0; i < 3; i++) {
            tele1.subirVolumen();
        }
        System.out.println("Volumen de tele1: " + tele1.getVolumen());
        Scanner entrada = new Scanner(System.in);//Scanner para cambiar el canal segun la cifra introducida
        System.out.println("Introduzca un numero para cambiar de canal: ");
        float cambiodecanal = entrada.nextFloat();
        tele1.cambiarCanal(cambiodecanal);//Se pasa por parámetros la cifra introducida al método de Televisor: CambiarCanal
        tele1.bajarVolumen();
        tele1.apagar();
        System.out.println("tele1: " + tele1);
        
        System.err.println("");//System.out vacío para separar
        
        Radio radio1 = new Radio();
        System.out.println("radio1: " + radio1);
        radio1.encender();
        System.out.println("radio1: " + radio1);
        for (int i = 0; i < 3; i++) {
            radio1.subirVolumen();
        }
        System.out.println("Volumen de radio1: " + radio1.getVolumen());
        Scanner entrada2 = new Scanner(System.in);//Scanner para cambiar el canal segun la cifra introducida
        System.out.println("Introduzca un numero para cambiar de emisora: ");
        float cambiodeEmisora = entrada2.nextFloat();
        radio1.cambiarCanal(cambiodeEmisora);//Se pasa por parámetros la cifra introducida al método de Radio: CambiarCanal
        radio1.bajarVolumen();
        radio1.apagar();
        System.out.println("radio1: " + radio1);
        
        
    }
    
}
