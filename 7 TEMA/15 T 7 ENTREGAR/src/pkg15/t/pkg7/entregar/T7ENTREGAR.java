/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15.t.pkg7.entregar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7ENTREGAR {

    /**
     * @param args the command line arguments
     */
    public static boolean repetirMenu=true;//Variables globales para controlar la repetición del menú
    public static int opcionMenu=0;
    
    public static void main(String[] args) {//Muestra los resultados
        int[] vectorVentas = new int[6];
        
        while (repetirMenu==true) {            
            try {//Muestra un mensaje de error si el usuario introduce un carácter no válido
                menu(vectorVentas);
            } catch (InputMismatchException e) { 
                System.err.println("Introduzca solo numeros del 1 al 7, no letras u otros caracteres");
            }
        }
    }
    
    public static void menu(int [] vector) {//Muestra un texto con las opciones del menú y las realiza con el switch con el cual responde a la instruccón dada por el usuario
        
        Scanner entrada = new Scanner(System.in);//Opciones del menú
        System.out.println("1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches mensuales. Estas ventas serán números aleatoriosentre 10 y 100.");
        System.out.println("2. Mostrar las ventas introducidas en el punto anterior.");
        System.out.println("3. Mostrar las ventas introducidas al revés.");
        System.out.println("4. Que muestre la suma total de ventas del año.");
        System.out.println("5. Que muestre las ventas totales de los meses pares.");
        System.out.println("6. Que muestre el nombre del mes con más ventas.");
        System.out.println("7. Salir del programa.");
        System.out.println("\n Pulse un numero para seleccionar una opcion: \n");
        opcionMenu=entrada.nextInt();
        
        switch (opcionMenu) {//Responde a la opción seleccionada por el usuario invocando a su método correspondiente para realizar la acción deseada
            case 1:
                rellenarVectorVentas(vector);
                break;
            case 2:
                mostrarVectorVentas(vector);
                break;
            case 3:
                mostrarVentasAlReves(vector);
                        
                break;
            case 4:
                sumarVentas(vector);
                        
                break;
            case 5:
                sumarVentasMesesPares(vector);       
                break;
            case 6:
                mostrarNombreMesMasVentas(vector);
                break;
            case 7:
                repetirMenu=false;
                System.out.println("El programa ha terminado de ejecutarse. Gracias por usar este programa.");
                break;
            default:
                System.err.println("ERROR. Introduzca solo una cifra del 1 al 7");;
        }
        
    }
    
    public static int[] rellenarVectorVentas(int [] vector) {//Rellenar vector de 12 posiciones con números al azar
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 91) + 10;
        }
        System.err.println("Vector rellenado");
        return vector;
    }
    
    public static void mostrarVectorVentas(int [] vector) {//Muestra los datos dentro del vectorVentas
        for (int i = 0; i < vector.length; i++) {
            System.err.print(vector[i] + "");
            
        }
        System.err.println(" Ventas Totales");
    }
    
    public static void mostrarVentasAlReves(int [] vector) {//Recorre el array y va extrayendo las cifras del número para ponerlas luego al revés
        for (int i = vector.length - 1; i >= 0; i--) {
            System.err.print(vector[i]);
        }
        
        System.err.println(" Ventas Totales Al Reves");  
    }
    
    public static void sumarVentas(int[] vector) {//Suma todas las cifras dentro del vectorVentas
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {//Recorre el vector y va sumando sus cifras
            suma += vector[i];
        }

        System.err.println("La suma total de las ventas es: " + suma);//Muestra el resultado 
    }
    
    public static void sumarVentasMesesPares(int [] vector) {
        int suma = 0;

        for (int i = 1; i < vector.length; i+=2) {//Recorre el vector y va sumando sus cifras
            suma += vector[i];
        }

        System.err.println("La suma total de las ventas de los meses pares es: " + suma);//Muestra el resultado 
    }
    
    public static void mostrarNombreMesMasVentas(int[] vector) {//Muestra el mes con mas ventas
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",//Contiene los nombres de los meses
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int mayor = vector[0];//Inicializa mayor y su índice
        int indiceMayor = 0;

        for (int i = 1; i < vector.length; i++) {//Recorre el vector y busca la cifra mayor
            if (vector[i] > mayor) {
                mayor = vector[i];
                indiceMayor = i;
            }
        }
        System.err.println("La cifra mayor es " + mayor + " y corresponde al mes de " + meses[indiceMayor]);//Muestra el valor mayor y a que mes corresponde
    }
}
