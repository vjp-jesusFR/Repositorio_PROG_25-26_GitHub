/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4.t6.entregar;

/**
 *
 * @author Jesus
 */
public  class Canidos extends Animal{//Subclase que hereda los atributos con "extends" Super Clase: Animal
    //Atributos propios de esta subclase
    private String sonido;
    private String alimentacion;
    private String habitat;
    private String nombreCientifico;
    
//    Constructores
    public Canidos() {
        this.sonido="";
        this.alimentacion="";
        this.habitat="";
        this.nombreCientifico="";
    }
    public Canidos(String nombre, int edad, int peso, String sonido, String alimentacion, String habitat, String nombreCientifico) {
        super(nombre, edad, peso);//Herencia de atributos de Super Calse: Animal
        this.sonido=sonido;
        this.alimentacion=alimentacion;
        this.habitat=habitat;
        this.nombreCientifico=nombreCientifico;
    }
// Sobreescritura de los métodos abstractos de la Super clase Animal
    @Override
    public String mostrarSonido() {
        return sonido;
    }

    @Override
    public String mostrarAlimentacion() {
        return alimentacion;
    }

    @Override
    public String mostrarHabitat() {
        return habitat;
    }

    @Override
    public String mostrarNombreCientifico() {
        return nombreCientifico;
    }
}

