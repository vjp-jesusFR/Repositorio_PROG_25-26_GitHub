/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17.t.pkg7.entregar;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author alumno
 */
public class T7ENTREGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Muestra los resultados al usuario
       int[] diezNumAlAzar = new int[10];//Guarda los 10 números aleatorios creados entre el 0 y 9
      
       numAlAzar(diezNumAlAzar);

       System.out.print("Numeros aleatorios: "); //Mostrará los números sin ordenar
       mostrarVectorNumerosAlAzar(diezNumAlAzar);
       
       ordenarMayoraMenor(diezNumAlAzar);//El "mostrar" debajo de esta línea que invoca al método de ordenar aparecerá con el vector ya ordenado

       System.out.print("Numeros aleatorios ordenados de mayor a menor: ");//Muestra los números ordenados de mayor a menor
       mostrarVectorNumerosAlAzar(diezNumAlAzar);
    }
    
    public static void numAlAzar(int [] numAlazar) {//Crea los 10 números aleatorios
         for (int i = 0; i < numAlazar.length; i++) {
            numAlazar[i] = (int)(Math.random() * 10);   
        } 
    }
    
    public static void ordenarMayoraMenor(int [] numeros) {//Ordena de mayor a menor los 10 números guardados en el vector
      
        int temporal;

        for (int i = 0; i < numeros.length - 1; i++) {//Método Burbuja para ordenar de mayor a menor
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // Cambiar '<' a '>' para orden ascendente
                if (numeros[j] < numeros[j + 1]) {
                    // Intercambiar elementos
                    temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }
    }
    
    public static void mostrarVectorNumerosAlAzar(int [] numeros) {//Muestra las cifras guardadas en el vector
        for (int num : numeros) {//Recorre y muestra el vector 
            System.out.print(num + " ");
        }
        System.out.println("");
    }
    
}
