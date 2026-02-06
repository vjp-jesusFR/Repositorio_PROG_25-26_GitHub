/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12_t8_entregar;

/**
 *
 * @author alumno
 */
public class Mueble {
    //Atributos
    private int precio;
    private String descripcion;
    
    //Constructores
    public Mueble() {
        this.precio = 0;
        this.descripcion = "";
    }
    
    public Mueble(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return " " + "precio: " + precio + " euros, descripcion: " + descripcion + '.';
    }
    
    
    
    
    
}
