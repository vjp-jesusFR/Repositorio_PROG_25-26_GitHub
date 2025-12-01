/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.t6.entregar;

/**
 *
 * @author alumno
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      crearYMostrarAnimales();
    }
    public static void crearYMostrarAnimales(){
    //Se crea el objeto que contiene la información de cada animal
    
//Subclase Canidos:
       Animal perro;
       perro = new Felinos("perro", 6, 5, "ladrido", "carne", "domestico", "Canis lupus familiaris");
       System.out.println(perro);
       System.out.println("Sonido: " + perro.mostrarSonido());
       System.out.println("Alimentacion: " + perro.mostrarAlimentacion());
       System.out.println("Habitat: " + perro.mostrarHabitat());
       System.out.println("Nombre cientifico: " + perro.mostrarNombreCientifico());
       System.out.println();
       
       Animal lobo;
       lobo = new Felinos("lobo", 3, 4, "aullido", "carne", "bosque", "Canis lupus");
       System.out.println(lobo);
       System.out.println("Sonido: " + lobo.mostrarSonido());
       System.out.println("Alimentacion: " + lobo.mostrarAlimentacion());
       System.out.println("Habitat: " + lobo.mostrarHabitat());
       System.out.println("Nombre cientifico: " + lobo.mostrarNombreCientifico());
       System.out.println();

//Subclase Felinos:
       Animal leon;
       leon = new Felinos("leon", 9, 80, "rugido", "carne", "sabana", "Panthera leo");
       System.out.println(leon);
       System.out.println("Sonido: " + leon.mostrarSonido());
       System.out.println("Alimentacion: " + leon.mostrarAlimentacion());
       System.out.println("Habitat: " + leon.mostrarHabitat());
       System.out.println("Nombre cientifico: " + leon.mostrarNombreCientifico());
       System.out.println();
       
       Animal gato;
       gato = new Felinos("gato", 2, 3, "maullido", "ratones", "domestico", "Felis silvestris catus");
       System.out.println(gato);
       System.out.println("Sonido: " + gato.mostrarSonido());
       System.out.println("Alimentacion: " + gato.mostrarAlimentacion());
       System.out.println("Habitat: " + gato.mostrarHabitat());
       System.out.println("Nombre cientifico: " + gato.mostrarNombreCientifico());
       System.out.println();
       
       }
    }              