/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24_t5_ej;

/**
 *
 * @author alumno
 */
public class Producto {//Se crea la Super Clase Producto
    //Atributos
    private int fechaCaducidad;
    private int numeroLote;
    
    //Constructores
    //Por defecto
    public Producto(){
        fechaCaducidad=0;
        numeroLote=0;
    }
    //Parametrizado
    public Producto(int f, int n){
        fechaCaducidad=f;
        numeroLote=n;
    }
    
    //Getters/Setters
    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    //Mostrar 
    //con toString
    @Override
    public String toString() {
        return "" + "fechaCaducidad: " + fechaCaducidad + ", numeroLote: " + numeroLote + ",";
    }
    //con this.
    void mostrarEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
