package pkg7_t10_;

public class Alumno {
    //Atributos
    private String nombre;
    private Asignatura[] asignaturas;
    
    //Constructores
    public Alumno() {
        this.nombre = "";
    }
    
    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }
    
    //Método propio
    public double media() {//Calcula la nota media del alumno

        double suma = 0;

        for (Asignatura a : asignaturas) {
            suma += a.getNota();
        }
        
        return suma / asignaturas.length;
    }
    
    //Mostrar
    @Override
    public String toString() {

        String texto = "Alumno: " + nombre + "\n";

        for (Asignatura a : asignaturas) {//Recorre el vector asignaturas y muestra cada asignatura y la nota del alumno en ella
            texto += a + "\n";
        }

        texto += "Media: " + media() + "\n";//Muestra la nota media

        return texto;
    }
}