/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20_t4_ejercicio;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    public static final String MADRID="Madrid";
    public static final String COLON="Colon";
    //Se declaran las constantes MADRID y COLON para usar en las respuestas correctas de las preguntas
    
    public static double nota;
    //Tambien una variable común para todos los métodos de la clase: "nota" para calcular la nota
    //final según el número de respuestas correctas
    
    
    public static void main(String[] args) {
        pregunta1();
        pregunta2();
        mostrarnota();
        //Invocamos a todos los métodos en el "main" para mostrar las preguntas y la nota
    }
    
    public static String pregunta1() {
        
        String respuesta;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("1a PREGUNTA: Cual es la capital de Espania?: ");
        respuesta=entrada.nextLine();
        
        if (respuesta.equals(MADRID)) {
            nota=nota+2.5;
            System.out.println("Muy bien, respuesta correcta."); 
        }else{
            System.err.println("No es correcto. La respuesta correcta seria " + MADRID); 
        }
        return respuesta; 
        //Se crea la String "respuesta" para almacenar la respuesta del usuario a la pregunta
        //Se importa el escáner, se formula la pregunta y se asigna la entrada del escáner a "respuesta" para guardarla
        //Usando un "if" si "respuesta" coincide con el valor de la constante MADRID es correcto y se suma 2,5 a "nota" y se da el mensaje
        //si no (else) se le indica al usuario su error y se muestra la respuesta correcta
        //y se devuelve su valor (con un return)
    }
    
    public static double pregunta2() {
       
        String respuesta;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("2a PREGUNTA: Quien descubrio America?:");
        respuesta=entrada.nextLine();
        
        if (respuesta.equals(COLON)) {
            nota=nota+2.5;
            System.out.println("Muy bien, respuesta correcta."); 
        }else{
            System.err.println("No es correcto. La respuesta correcta seria " + COLON); 
        }
        return nota;
        //Se crea la String "respuesta" para almacenar la respuesta del usuario a la pregunta
        //Se importa el escáner, se formula la pregunta y se asigna la entrada del escáner a "respuesta" para guardarla
        //Usando un "if" si "respuesta" coincide con el valor de la constante COLON es correcto y se suma 2,5 a "nota" y se da el mensaje
        //si no (else) se le indica al usuario su error y se muestra la respuesta correcta
        //y se devuelve su valor (con un return)
    }
    
    public static double mostrarnota() {
        
        System.out.println("NOTA DEL EXAMEN: " + nota);
        
        return nota;
        //Finalmente, en "mostrarnota" se imprime por pantalla la nota y se devuelve su valor (con un return)
        
    }
    
}
