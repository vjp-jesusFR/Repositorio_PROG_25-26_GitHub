/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_t8_entregar_;

/**
 *
 * @author alumno
 */
public class Alumno {
    //Atributos
    private String nombre;
    private int edad;
    private double notaMedia;
    
    //Constructores
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0;
    }

    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    //Mostrar

    @Override
    public String toString() {
        return "" + "nombre: " + nombre + ", edad: " + edad + ", nota media: " + notaMedia + '}';
    }
    
    
    
}
