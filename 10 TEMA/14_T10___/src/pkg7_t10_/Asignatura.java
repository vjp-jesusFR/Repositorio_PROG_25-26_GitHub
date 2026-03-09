package pkg7_t10_;

public class Asignatura {
    //Atributos
    private String nombre;
    private double nota;
    
    //Constructores
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return nombre + ": " + nota;
    }
}