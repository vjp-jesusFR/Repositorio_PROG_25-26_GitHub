/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6_t8_;

/**
 *
 * @author alumno
 */
public class Empleados {
    
    //Atributos
    private String nombre; 
    private int horasTrabajo;
    private int tarifa;
    
    //Constructores
    public Empleados() {
        this.nombre = "";
        this.horasTrabajo = 0;
        this.tarifa = 0;
    }
    public Empleados(String nombre, int horasTrabajo, int tarifa) {
        this.nombre = nombre;
        this.horasTrabajo = horasTrabajo;
        this.tarifa = tarifa;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    //Calcula el sueldo bruto
    public static void calcularSueldo() {
        
    }
   
    //Mostrar con toString
    @Override
    public String toString() {//Calcula y muestra el sueldo bruto según la tarifa del empleado
        int sueldo = horasTrabajo*tarifa;//Calcula el sueldo
        if (sueldo>40) {//Si las horas trabajadas superan las 40 se aplica la tarifa especial
            int tarifaExtra = tarifa-40/2 + tarifa;//Se calcula la tarifa especial (Tarifa noemal + tarifa normal + la mitad de la tarifa normal)
            sueldo=sueldo+tarifaExtra;
        }
        return "" + nombre + " ha trabajado " + horasTrabajo + " horas, cobra " + tarifa + " euros la hora por lo que le corresponde un sueldo de " + sueldo + " euros" + '.';
    }
    
    
    
}
