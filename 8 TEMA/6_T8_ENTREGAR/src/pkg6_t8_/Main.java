/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_t8_;

import java.lang.runtime.SwitchBootstraps;
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
        craerEmpleados();
    }
    
    public static void craerEmpleados() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos empleados desea introducir?: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        
         //Creación del array de objetos
        Empleados[] empleados = new Empleados[cantidad];
        
       // Bucle para rellenar la información
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("\nDatos del empleado " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Tarifa: ");
            int tarifa = sc.nextInt();
            
            sc.nextLine(); // Limpia el buffer

            // Crea el objeto y lo mete en el vector
            empleados[i] = new Empleados(nombre, horas, tarifa);

            if (empleados!=null) {//Comprueba si el vector contiene nulos y si no es así muestra su contenido y el mensaje:
                System.out.println("\n--- SUELDO BRuTO DE LOS EMPLEADOS ---");
                
                for (Empleados e : empleados) {
                    if (e!=null) {//Comprueba si el vector contiene nulos y si no es así muestra su contenido
                    System.out.println(e.toString());
                }
            }      
        }     
      }   
    }
    
    
}
