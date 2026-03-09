/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_t10_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static Integer indiceDelMayor=0;//Variables para guardar la posicion de cada cifra que será intercambiada
    public static Integer indiceDelMenor=0;
    
    public static void main(String[] args) {//Muestra los resultados

        ArrayList<Integer> lista = new ArrayList<>();
        pedirDatos(lista);
        System.out.println("Lista: ");
        mostrarLista(lista);
        intercambiaPosicionDeParesMaxYMin(lista, numParMayor(lista), numParMenor(lista));
        System.out.println("Lista modificada: ");//Muestra un mensaje indicativo justo encima de la lista con la posición del par mayor e impar menor intercambiada
        mostrarLista(lista);
       
       
    }
    
    public static void pedirDatos(ArrayList<Integer> lista) {//Muestra y pide cifras al usuario y las guarda en un Array List
        Scanner entrada = new Scanner(System.in);
        
        boolean pedirDatos = true;
        
        System.err.println("Introduzca un numero negativo para que el programa deje de pedir mas cifras");
        
        while (pedirDatos!=false) {              
            System.out.println("Introduzca un numero entero: ");
            lista.add(entrada.nextInt());
        
            for (int i = 0; i < lista.size(); i++) {//Si se introduce un número negativo deja de pedirse introducir cifras al usuario
                if (lista.get(i)<0) {
                    System.out.println("Lista rellenada: " + lista);
                    pedirDatos=false;
                }
            }
        }       
    }
    
    public static Integer numParMayor(ArrayList<Integer> lista) {//Calcula cual es el mayor número par
        Integer mayor=lista.get(0);     
        boolean esPar=false;
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2 == 0 && mayor<lista.get(i)) {
                mayor=lista.get(i);
                esPar=true; 
                indiceDelMayor=i;
            }
        }
        
        if (esPar=!false) {
             System.err.println("Numero par mayor: " + mayor);
        }
        
        return mayor;
    }
    
    public static Integer numParMenor(ArrayList<Integer> lista) {//Calcula cual es el menor número par
        Integer menor=lista.get(0);
        boolean esPar=false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2 > 0 && menor>lista.get(i)) {
                menor=lista.get(i);
                esPar=true; 
                indiceDelMenor=i;
            }
        }
        
        if (esPar=!false) {
             System.err.println("Numero impar menor: " + menor);
        }

        return menor;
    }
    
   public static ArrayList<Integer> intercambiaPosicionDeParesMaxYMin( ArrayList<Integer> lista, Integer mayor, Integer menor) {//Intercambia la posicon de impar menor con la del par mayor
        int indice1 = lista.indexOf(mayor); // Obtiene el número de los índices de los valores
        int indice2 = lista.indexOf(menor);

       
        if (indice1 != -1 && indice2 != -1) { // Valida que ambos valores existen en la lista
            Collections.swap(lista, indice1, indice2);// Collections.swap intercambia los elementos en los índices dados
        } else {
            System.out.println("Uno o ambos valores no existen en la lista.");
        }
        
    return lista;
}
    
    public static void mostrarLista(ArrayList<Integer> lista) {//Muestra la lista por pantalla antes y después de reordenar sus cifras
        System.out.println(lista);
    }
}
