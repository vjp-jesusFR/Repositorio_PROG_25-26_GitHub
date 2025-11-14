/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20_t5_ej_se_entrega;

/**
 *
 * @author alumno
 */
public class Empleado {
     //Se declaran los atributos de Empleado
    private String nombre;
    private int horas=0;
     private String tarifa;
    
     //Se crean los Constructores
    public Empleado(){
        nombre="";
        horas=0;
        tarifa="";
    }
    public Empleado(String n, int h, String t){
        nombre="";
        horas=0;
        tarifa="";
    }
    
    //Se crean los Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
    
     //Mostrar: usando "to string" -> Click derecho -> insert code -> to String -> selccionar deseado y aceptar
    @Override
    public String toString() {
        return "" + "nombre: " + nombre + ", horas: " + horas + ", tarifa: " + tarifa + '.';
    }
    
    
    
}
