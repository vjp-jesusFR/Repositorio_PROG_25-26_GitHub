/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20_t5_ej_se_entrega;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static String nombreEmpleado1;//Se declaran las variables globales necesarias
    public static String nombreEmpleado2;
    public static String nombreEmpleado3;
    public static int horasEmpleado1;
    public static int horasEmpleado2;
    public static int horasEmpleado3;
    public static int bucle=0;//Incluida la variable "bucle" para el bucle que pedirá los datos de los 3 objetos "Empleado" requeridos
    
    public static void main(String[] args) {       
          pedirDatosEmpleado1();
          pedirDatosEmpleado2();
          pedirDatosEmpleado3();
          mostrarResultadoEmpleados(horasEmpleado1, horasEmpleado2, horasEmpleado3);
    }
    public static void pedirDatosEmpleado1() {
        
        Scanner entrada = new Scanner(System.in);//Se importa el objeto Scanner
        
        System.out.println("Introduzca el nombre del empleado 1");//Se pide el nombe del empleado al usuario
        nombreEmpleado1=entrada.nextLine();
        try {//Se captura el error de "introducir una letra en lugar de un número" con try, catch y se avisa al usuario con un  mensaje
           System.out.println("Introduzca las horas trabajadas del empleado 1");//Se pide las horas trabajadas del empleado al usuario
            horasEmpleado1=entrada.nextInt();        
        } catch (InputMismatchException e) {
            System.err.println("ERROR. Debe introducir solo numeros");
        }
    }
    public static void pedirDatosEmpleado2() {
        Scanner entrada = new Scanner(System.in);//Se importa el objeto Scanner
        
        System.out.println("Introduzca el nombre del empleado 2");//Se pide el nombe del empleado al usuario
        nombreEmpleado2=entrada.nextLine();
        try {//Se captura el error de "introducir una letra en lugar de un número" con try, catch y se avisa al usuario con un  mensaje
           System.out.println("Introduzca las horas trabajadas del empleado 2");//Se pide las horas trabajadas del empleado al usuario
            horasEmpleado2=entrada.nextInt();    
        } catch (InputMismatchException e) {
            System.err.println("ERROR. Debe introducir solo numeros");
        }
    }
     public static void pedirDatosEmpleado3() {
        Scanner entrada = new Scanner(System.in);//Se importa el objeto Scanner
       
        System.out.println("Introduzca el nombre del empleado 3");//Se pide el nombe del empleado al usuario
        nombreEmpleado3=entrada.nextLine();
        try {//Se captura el error de "introducir una letra en lugar de un número" con try, catch y se avisa al usuario con un  mensaje
           System.out.println("Introduzca las horas trabajadas del empleado 3");//Se pide las horas trabajadas del empleado al usuario
            horasEmpleado3=entrada.nextInt();   
        } catch (InputMismatchException e) {
            System.err.println("ERROR. Debe introducir solo numeros");
        }   
    }
      //Con este método se realiza la operación para calcular el sueldo del empleado según las horas trabajadas y la tarifa correspondiente
    public static void mostrarResultadoEmpleados(int resultado1, int resultado2, int resultado3) {
       
        Empleado empleado1 = new Empleado();//Se crean los 3 objetos Alumno que se requieren
        empleado1.setNombre(nombreEmpleado1);
        empleado1.setHoras(horasEmpleado1);
 
         if (horasEmpleado1>40) {
            int tarifaEspecial=horasEmpleado1-40;
            resultado1=horasEmpleado1*20+tarifaEspecial*10;
            empleado1.setTarifa("Tarifa especial");
            System.out.println(nombreEmpleado1 + " trabajó " + horasEmpleado1 + " horas, cobra 20 euros la hora por lo que le corresponde un sueldo de " + resultado1 + " euros."); 
        }else{
            resultado1=horasEmpleado1*20;
            empleado1.setTarifa("Tarifa normal");
            System.out.println(nombreEmpleado1 + " trabajó " + horasEmpleado1 + " horas, cobra 20 euros la hora por lo que le corresponde un sueldo de " + resultado1 + " euros.");   
        }
       
        Empleado empleado2 = new Empleado();
        empleado2.setNombre(nombreEmpleado2);
        empleado2.setHoras(horasEmpleado2);
        
        if (horasEmpleado2>40) {
            int tarifaEspecial=horasEmpleado2-40;
            resultado2=horasEmpleado2*20+tarifaEspecial*10;
            empleado2.setTarifa("Tarifa especial");
            System.out.println(empleado2.getNombre() + " trabajó " + horasEmpleado2 + " horas, cobra 20 euros la hora por lo que le corresponde un sueldo de " + resultado2 + " euros."); 
        }else{
            resultado2=horasEmpleado2*20;
            empleado2.setTarifa("Tarifa normal");
            System.out.println(nombreEmpleado2 + " trabajó " + horasEmpleado2 + " horas, cobra 20 euros la hora por lo que le corresponde un sueldo de " + resultado2 + " euros.");   
        }
        
        Empleado empleado3 = new Empleado();
        empleado3.setNombre(nombreEmpleado3);
        empleado3.setHoras(horasEmpleado3);
        
        if (horasEmpleado2>40) {
            int tarifaEspecial=horasEmpleado3-40;
            resultado3=horasEmpleado3*20+tarifaEspecial*10;
            empleado3.setTarifa("Tarifa especial");
            System.out.println(nombreEmpleado3 + " trabajó " + horasEmpleado3 + " horas, cobra 20 euros la hora por lo que le corresponde un sueldo de " + resultado3 + " euros."); 
        }else{
            resultado3=horasEmpleado3*20;
            empleado3.setTarifa("Tarifa normal");
            System.out.println(nombreEmpleado3 + " trabajó " + horasEmpleado3 + " horas, cobra 20 euros la hora por lo que le corresponde un sueldo de " + resultado3 + " euros.");   
        }
    }
}
