/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_t9_entregar;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Muestra los resultados
        verificarContrasenia(pedirNombreUsuario(), pedirContrasenia());
    }
    
    public static String pedirNombreUsuario() {//Pide un nombre de usuario
        String contraseniaUsuario="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca su nombre de usuario: ");
        contraseniaUsuario=entrada.nextLine();
        
        return contraseniaUsuario;  
    }
    
    public static String pedirContrasenia() {//Pide la contraseña al usuario
        String contraseniaUsuario="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduzca la contrasenia: ");
        contraseniaUsuario=entrada.nextLine();
        
        return contraseniaUsuario;
    }
    
    public static void verificarContrasenia(String nombreUsuario, String contrasenia) {//Verifica la contraseña dada por el usuario
//        • La contraseña no puede tener menos de seis caracteres.
//        • Al menos dos de esos caracteres deben ser dígitos.
//        • El nombre del usuario no puede formar parte de la contraseña.

        if (contrasenia.length() < 6 ) {//Verifica que se cumpla el criterio de longitud mínima
             System.err.println("La contrasenia no puede tener menos de seis caracteres.");
        }
        
        int contador = 0;//Almacena la la cifra correspondiente a la cantidad de números que tiene la contraseña
        for (char c : contrasenia.toCharArray()) {//Divide la contraseña en cáracteres y revisa si al menos 2 de ellos son números
            if (Character.isDigit(c)) {
                contador++;//Si la contraseña contiene un dígito se le suma un uno
            } 
        }
        if (contador <= 2) {//Si el contador indica que tiene 2 o más números la contraseña será válida, sino el siguiente texto dice porque no lo es
                System.err.println("Al menos dos de los caracteres de la contrasenia deben ser digitos.");
        }
        
        if (contrasenia.contains(nombreUsuario)) {//Verifica que se cumpla el criterio de no contener el nombre de usuario
           System.err.println("El nombre de usuario no puede formar parte de la contrasenia.");
        }
      
    }
    
}
