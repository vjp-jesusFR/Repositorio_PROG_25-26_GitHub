/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16.t.pkg7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T7 {

    /**
     * @param args the command line arguments
     */
   public static boolean repetirMenu=true;//Variables globales para controlar la repetición del menú
   public static int opcionMenu=0;
    
    public static void main(String[] args) {//Muestra los resultados
        String[] asignaturas = {"Lengua ", "Mates ", "Historia ", "Fisica "};//Vector con los nombres de las asignaturas
        String[] nombresAlumnado = {"Pepe ", "Juan ", "Ana ", "Marta ", "Pedro ","Maria "};//Vector con los nombres del alumnado
        int[] notasPepe = new int[4];//Vectores para guardar las notas del alumnado:
        int[] notasJuan = new int[4];
        int[] notasAna = new int[4];
        int[] notasMarta = new int[4];
        int[] notasPedro = new int[4];
        int[] notasMaria = new int[4];
        
        while (repetirMenu==true) {//Se muestran las opciones del menú mientras "repetirMenu" sea igual a "true"          
            try {//Muestra un mensaje de error si el usuario introduce un carácter no válido
                menu(asignaturas, nombresAlumnado, notasPepe, notasJuan, notasAna, notasMarta, notasPedro, notasMaria);
            } catch (InputMismatchException e) { 
                System.err.println("Introduzca solo numeros del 1 al 7, no letras u otros caracteres");
            }
        }
    }
    
    public static void menu(String[] asignaturas, String[] nombresAlumnado, int [] vector1, int [] vector2, int [] vector3, int [] vector4, int [] vector5, int [] vector6) {
    //Muestra un texto con las opciones del menú y las realiza con el switch, el cual responde a la instruccón dada por el usuario
        
        Scanner entrada = new Scanner(System.in);//Opciones del menú
        System.out.println("1. Rellenar las notas de los alumnos");
        System.out.println("2. Mostrar las notas introducidas en el punto anterior.");
        System.out.println("3. Mostrar nota media más alta");
        System.out.println("4. Alumno con más suspensos.");
        System.out.println("5. Asignatura más difícil. (nota media más baja).");
        System.out.println("6. Salir del programa.");

        System.out.println("\n Pulse un numero para seleccionar una opcion: \n");
        opcionMenu=entrada.nextInt();
        
        switch (opcionMenu) {//Responde a la opción seleccionada por el usuario invocando a su método correspondiente para realizar la acción deseada
            case 1:
                pedirNotas(asignaturas, vector1, vector2, vector3, vector4, vector5, vector6);
                break;
            case 2:
                mostrarNotas(asignaturas, vector1, vector2, vector3, vector4, vector5, vector6);
                break;
            case 3:
                notaMediaMasAlta(nombresAlumnado, vector1, vector2, vector3, vector4, vector5, vector6);
                break;
            case 4:
                  notaMediaMasBaja(nombresAlumnado, vector1, vector2, vector3, vector4, vector5, vector6);
                break;
            case 5:
                asignaturaMasDificil(asignaturas, nombresAlumnado, vector1, vector2, vector3, vector4, vector5, vector6);
                break;
            case 6:
                repetirMenu=false;
                System.out.println("El programa ha terminado de ejecutarse. Gracias por usar este programa.");//Mensaje al salir
                break;
            default:
                System.err.println("ERROR. Introduzca solo una cifra del 1 al 7");//Mensaje al introducir una cifra o carácter no válido
        }
        
    }
    
    public static void pedirNotas(String[] asignaturas, int [] vector1, int [] vector2, int [] vector3, int [] vector4, int [] vector5, int [] vector6) {
        Scanner entrada = new Scanner(System.in);//Pide las notas al usuario
        
        System.out.println("Introduzca las notas de Pepe: ");
        for (int i = 0; i < 4; i++) {
            System.err.println(asignaturas[i] + ": ");
            vector1[i]=entrada.nextInt();
            
        }
        
        System.out.println("Introduzca las notas de Juan: ");
        for (int j = 0; j < 4; j++) {
            System.err.println(asignaturas[j] + ": ");
            vector2[j]=entrada.nextInt();
        }
        
        System.out.println("Introduzca las notas de Ana: ");
        for (int k = 0; k < 4; k++) {
            System.err.println(asignaturas[k] + ": ");
            vector3[k]=entrada.nextInt();
        }
        
        System.out.println("Introduzca las notas de Marta: ");
        for (int l = 0; l < 4; l++) {
            System.err.println(asignaturas[l] + ": ");
            vector4[l]=entrada.nextInt();
        }
        
        System.out.println("Introduzca las notas de Pedro: ");
        for (int m = 0; m < 4; m++) {
            System.err.println(asignaturas[m] + ": ");
            vector5[m]=entrada.nextInt();
        }
        
        System.out.println("Introduzca las notas de Maria: ");
        for (int p = 0; p < 4; p++) {
            System.err.println(asignaturas[p] + ": ");
            vector6[p]=entrada.nextInt();
        }
    }
    
    public static void mostrarNotas(String[] asignaturas, int [] vector1, int [] vector2, int [] vector3, int [] vector4, int [] vector5, int [] vector6) {
        //Muestra las notas y a quien corresponden
        for (int i = 0; i < vector1.length; i++) {
             System.out.println("Notas de Pepe " + asignaturas[i] + ": "+ vector1[i]);
             System.out.println("");  
        }
        
        System.out.println("");
        for (int j = 0; j < vector2.length; j++) {
             System.out.println("Notas de Juan " + asignaturas[j] + ": "+ vector2[j]);
             System.out.println("");
        }
        
        System.out.println("");
        for (int k = 0; k < vector3.length; k++) {
             System.out.println("Notas de Ana " + asignaturas[k] + ": "+ vector3[k]);
             System.out.println("");
        }
        
         System.out.println("");
        for (int l = 0; l < vector4.length; l++) {
             System.out.println("Notas de Marta " + asignaturas[l] + ": "+ vector4[l]);
             System.out.println("");
        }
         
        System.out.println("");
        for (int m = 0; m < vector5.length; m++) {
             System.out.println("Notas de Pedro " + asignaturas[m] + ": "+ vector5[m]);
             System.out.println("");
        }
        
        System.out.println("");
        for (int p = 0; p < vector6.length; p++) {
             System.out.println("Notas de Maria " + asignaturas[p] + ": "+ vector6[p]);
             System.out.println("");
        }
    }
    
    public static void notaMediaMasAlta(String[] nombresAlumnado, int [] vector1, int [] vector2, int [] vector3, int [] vector4, int [] vector5, int [] vector6) {
        double sumaPepe=0;
        for (int i = 0; i < 4; i++) {//Suma todas la cifra del vector que almacena las notas de cada alumno y calcula su media
            sumaPepe = sumaPepe + vector1[i];
        }
        double mediaPepe = sumaPepe/4;
        
        double sumaJuan=0;
        for (int j = 0; j < 4; j++) {
            sumaJuan = sumaJuan + vector2[j];
        }
        double mediaJuan = sumaJuan/4;
        
        double sumaAna=0;
        for (int k = 0; k < 4; k++) {
            sumaAna = sumaAna + vector3[k];
        }
        double mediaAna = sumaAna/4;
        
        double sumaMarta=0;
        for (int l = 0; l < 4; l++) {
            sumaMarta = sumaMarta + vector4[l];
        }
        double mediaMarta = sumaMarta/4;
        
        double sumaPedro=0;
        for (int p = 0; p < 4; p++) {
            sumaPedro = sumaPedro + vector5[p];
        }
        double mediaPedro = sumaPedro/4;
        
        double sumaMaria=0;
        for (int r = 0; r < 4; r++) {
            sumaMaria = sumaMaria + vector6[r];
        }
        double mediaMaria = sumaMaria/4;
        
        
        
        double[] notasMediasTotales = new double[6];
        
       
        notasMediasTotales[0] = mediaPepe;//Se asignan las notas medias de cada alumno de todas las asignaturas en orden a un vector
        notasMediasTotales[1] = mediaJuan;
        notasMediasTotales[2] = mediaAna;
        notasMediasTotales[3] = mediaMarta;
        notasMediasTotales[4] = mediaPedro;
        notasMediasTotales[5] = mediaMaria;
        
        
        double mayor=1;//Se presupone que el puesto 1 será el mayor
        
        for (int x = 0; x < notasMediasTotales.length; x++) {//Recorre el vector y determina cual de sus cifras es la mayor
             if (notasMediasTotales[x] > mayor) {
                mayor = notasMediasTotales[x];//Se cambia al verdadero puesto mayor
                 System.err.println("La nota media mas alta la tiene " + nombresAlumnado[x] + " y es de: " + mayor);
                }  
        }  
    }  
    
    public static void notaMediaMasBaja(String[] nombresAlumnado, int [] vector1, int [] vector2, int [] vector3, int [] vector4, int [] vector5, int [] vector6) {
        double sumaPepe=0;
        for (int i = 0; i < 4; i++) {//Suma todas las cifras del vector que almacena las notas de cada alumno y calcula su media
            sumaPepe = sumaPepe + vector1[i];
        }
        double mediaPepe = sumaPepe/4;
        
        double sumaJuan=0;
        for (int j = 0; j < 4; j++) {
            sumaJuan = sumaJuan + vector2[j];
        }
        double mediaJuan = sumaJuan/4;
        
        double sumaAna=0;
        for (int k = 0; k < 4; k++) {
            sumaAna = sumaAna + vector3[k];
        }
        double mediaAna = sumaAna/4;
        
        double sumaMarta=0;
        for (int l = 0; l < 4; l++) {
            sumaMarta = sumaMarta + vector4[l];
        }
        double mediaMarta = sumaMarta/4;
        
        double sumaPedro=0;
        for (int p = 0; p < 4; p++) {
            sumaPedro = sumaPedro + vector5[p];
        }
        double mediaPedro = sumaPedro/4;
        
        double sumaMaria=0;
        for (int r = 0; r < 4; r++) {
            sumaMaria = sumaMaria + vector6[r];
        }
        double mediaMaria = sumaMaria/4;
        
        
        
        double[] notasMediasTotales = new double[6];
        
       
        notasMediasTotales[0] = mediaPepe;//Se asignan las notas medias de cada alumno de todas las asignaturas en orden a un vector
        notasMediasTotales[1] = mediaJuan;
        notasMediasTotales[2] = mediaAna;
        notasMediasTotales[3] = mediaMarta;
        notasMediasTotales[4] = mediaPedro;
        notasMediasTotales[5] = mediaMaria;
        
        
        
        double notaMinima = notasMediasTotales[0];// Suponemos que la primera nota es la más baja
        int posicion = 0;//Marca la posicion alcanzada del vector al recorrerlo con el for

        
        for (int i = 1; i < notasMediasTotales.length; i++) { //Se recorre el vector de notas
            if (notasMediasTotales[i] < notaMinima) {
                notaMinima = notasMediasTotales[i];//Se cambia la verdadera nota menor
                posicion = i;//Se guarda la posición de esta nota en el vector
            }
        }

        //Se muestra el resultado
         System.err.println("La mayor cantidad de suspensos la tiene: " + nombresAlumnado[posicion] + " con una nota media de " + notaMinima);  
    }  
    
    public static void asignaturaMasDificil(String[] asignaturas, String[] nombresAlumnado, int [] vector1, int [] vector2, int [] vector3, int [] vector4, int [] vector5, int [] vector6) {
        int lenguaMedia = vector1[0] + vector2[0] + vector3[0] + vector4[0] + vector5[0] + vector6[0];//Se suma la fila correspondinte a cada materia en una variable
        int matesMedia = vector1[1] + vector2[1] + vector3[1] + vector4[1] + vector5[1] + vector6[1];
        int historiaMedia = vector1[2] + vector2[2] + vector3[2] + vector4[2] + vector5[2] + vector6[2];
        int fisicaMedia = vector1[3] + vector2[3] + vector3[3] + vector4[3] + vector5[3] + vector6[3];
        
        
        
        double[] mediasDeAsignaturas = new double[4];
        
        mediasDeAsignaturas[0] = lenguaMedia;//Se asigna la suma de las notas en su respectiva posición a un vector 
        mediasDeAsignaturas[1] = matesMedia;
        mediasDeAsignaturas[2] = historiaMedia;
        mediasDeAsignaturas[3] = fisicaMedia;
        
        
        
       double notaMinima = mediasDeAsignaturas[0];// Suponemos que la primera nota es la más baja
       int posicion = 0;//Marca la posicion alcanzada del vector al recorrerlo con el for

        
        for (int i = 1; i < mediasDeAsignaturas.length; i++) { //Se recorre el vector de las notas y se guarda la nota mínima y su posición dentro del vector
            if (mediasDeAsignaturas[i] < notaMinima) {
                notaMinima = mediasDeAsignaturas[i];//Se cambia la verdadera nota menor
                posicion = i;//Se guarda la posición de esta nota en el vector
            }
        }
        
        double mediaMinima = notaMinima/4;//Se calcula la nota media con la suma de las notas de la asignatura entre el número de asignaturas

        //Se muestra el resultado
         System.err.println("La mayor cantidad de suspensos la tiene: " + asignaturas[posicion] + " con una nota media de " + mediaMinima);  
    
    }
}
