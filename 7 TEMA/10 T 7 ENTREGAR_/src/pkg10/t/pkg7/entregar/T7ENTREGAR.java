/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.t.pkg7.entregar;

/**
 *
 * @author alumno
 */
public class T7ENTREGAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Muestra los resultados
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
        sustituirRepetidos(vector);   
    }
    
    public static void rellenarVector(int[] vector) {//Rellena el vector con cifras al azar entre 1 y 8
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 8 + 1);   
        } 
    }
    
    public static void mostrarVector(int[] vector) {//Muestra el contenido dentro del array vector
        System.out.println("Se han generado los siguientes numeros: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]); 
        }
        System.out.println("");
    }
    
    public static void sustituirRepetidos(int[] vector) {//Sustitiye cada valor repetido con un 0
         // Comparamos cada elemento con los siguientes
        for (int i = 0; i < vector.length; i++) {//Con un bucle for se recorre el vector
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    vector[i]= 0; // Con el segundo bucle for se recorre el vector y se sustituyen las cifras repetidas por un 0
                    vector[j]= 0; 
                }
            }
        }
        
        System.out.println("Sustituimos los elementos repetidos por un 0:");//Muestra el vector con sus cifras duplicadas sustituidas por 0
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i]); 
        }
        System.out.println("");
    }
    
}
