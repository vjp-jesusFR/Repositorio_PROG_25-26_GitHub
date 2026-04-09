/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6_t11_;

/**
 *
 * @author alumno
 */
public class Donacion {
    //Atributos
    private String nombre;
    private int cantidad;
    
    //Constructores
    public Donacion() {
        this.nombre = "";
        this.cantidad = 0;
    }

    public Donacion(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "(" + "nombre " + nombre + ", cantidad " + cantidad + " euros" + ')';
    }
    
    
    
    
}
