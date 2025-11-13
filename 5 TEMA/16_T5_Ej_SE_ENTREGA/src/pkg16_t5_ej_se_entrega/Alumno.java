/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg16_t5_ej_se_entrega;

/**
 *
 * @author alumno
 */
public class Alumno {
    //Se declaran los atributos de Alumno
    private String nombre;
    private int nota=0;
    
     //Se crean los Constructores
    public Alumno(){
        nombre="";
        nota=0;     
    }
     public Alumno(String m, String c,int s ){
        nombre="";
        nota=0;
    }
      //Se crean los Getters/Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public int getNota(){
        return nota;
    }
    
    public void setNota(int no){
        nota = no;
    }
    
    //Mostrar: usando "to string" -> Click derecho -> insert code -> to String -> selccionar deseado y aceptar
    @Override
    public String toString() {
        return "Alumno " + "nombre: " + nombre + ", nota: " + nota + '.';
    }
   
    
    
    
}
