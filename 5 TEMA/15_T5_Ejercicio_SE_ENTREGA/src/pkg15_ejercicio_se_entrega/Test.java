/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15_ejercicio_se_entrega;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion dir1 = new Direccion(); //Se crean los objetos dir1, dir2 y dir3 para almacenar cada uno una dirección
        dir1.setCalle("Rosas");//Se rellenan los apartados de cada dirección 1: Nombre de la Calle, número del bloque, la puerta y la ciudad 
        dir1.setNumero(2);
        dir1.setPiso("2a");
        dir1.setCiudad("Plasencia");
        
        Direccion dir2 = new Direccion();
        dir2.setCalle("Paseo");
        dir2.setNumero(9);
        dir2.setPiso("5b");
        dir2.setCiudad("Salamanca");
        
        Direccion dir3 = new Direccion();
        dir3.setCalle("Molinos");
        dir3.setNumero(7);
        dir3.setPiso("1c");
        dir3.setCiudad("Toledo");
        
        Empleado empleado1 = new Empleado();// Se crean los objetos empleado1, empleado2 y empleado3 para almacenar sus datos
        empleado1.setNombre("Ana");//Se asigna a cada apartado los datos del empleado correspondiente: Nombre, salario y dirección
        empleado1.setSalario(1556);
        empleado1.setDireccion(dir1);//En todos los empleados se asigna una de los objetos con las direcciones (dir1, dir2 y dir3)
        
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Diego");
        empleado2.setSalario(1505);
        empleado2.setDireccion(dir2);
        
        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Alex");
        empleado3.setSalario(1550);
        empleado3.setDireccion(dir3);
        
        System.out.println("Empleado 1 \n" + empleado1.toString());
        System.out.println("");
        System.out.println("Empleado 2 \n" + empleado2.toString());
        System.out.println("");
        System.out.println("Empleado 3 \n" + empleado3.toString());
        
        //Finalmente mostramos la información requerida con System.out.println y un .toString para cada empleado creado
    }
    
}
