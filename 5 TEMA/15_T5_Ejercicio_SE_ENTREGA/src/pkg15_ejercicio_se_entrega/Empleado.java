/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15_ejercicio_se_entrega;

/**
 *
 * @author alumno
 */
public class Empleado {
    //Se declaran los Atributos del objeto "Empleado"
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Se crean los Constructores
    public Empleado(){
        nombre="";
        salario=0;
           
    }
     public Empleado(String m, String c,int s ){
        nombre="";
        salario=0;
     
    }
     
     //Se crean los Getters/Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
     public int getSalario(){
        return salario;
    }
    
    public void setSalario(int s){
        salario = s;
    }
    
     public Direccion getDireccion(){
        return direccion;
    }
    
    public void setDireccion(Direccion d){
        direccion = d;
    }
    
    //Mostrar usando "to string" -> Click derecho -> insert code -> to String -> selccionar deseado y aceptar

    @Override
    public String toString() {
        return "" + "\nNombre=" + nombre + "\nSalario=" + salario + "\nDireccion=" + direccion + '}';
    }


}
