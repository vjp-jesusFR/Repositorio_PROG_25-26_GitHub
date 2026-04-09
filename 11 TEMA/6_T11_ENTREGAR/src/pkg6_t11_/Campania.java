/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6_t11_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Campania {
    //Atributos
    private Set<Donacion> conjuntoDonaciones = new HashSet<>();
    private String nombreCampania;
    
    //Constructores
    public Campania() {
        this.nombreCampania = "";
    }

    public Campania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }
    
   //Getters y Setters
    public Set<Donacion> getConjuntoDonaciones() {
        return conjuntoDonaciones;
    }

    public void setConjuntoDonaciones(Set<Donacion> conjuntoDonaciones) {
        this.conjuntoDonaciones = conjuntoDonaciones;
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }
    
    //Método(s)
    public void insertarDonacion(Campania campania, Donacion donacion) {//Añade la donacion al conjunto
       
        conjuntoDonaciones.add(donacion);
        
    }
    
   
    
    //Mostrar
    @Override
    public String toString() {
        return "" + "Nombre de la campania: " + nombreCampania + ", conjunto de sus donaciones: " + conjuntoDonaciones +  ' ';
    }
    
    
    
    
}
