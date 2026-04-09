package pkg8_t11_entregar;

public class Sede implements Comparable<Sede> {
    //Atrubutos
    private String nombre;
    private double ingresos;
    
    //Constructores
    public Sede() {
        this.nombre = "";
        this.ingresos = 0;
    }
    
    public Sede(String nombre, double ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getIngresos() {
        return ingresos;
    }
    
    //Método propio para comparar
    @Override
    public int compareTo(Sede otra) {
        // Orden descendente: comparamos la otra sede con esta
        return Double.compare(otra.getIngresos(), this.ingresos);
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Sede: " + nombre + " | Ingresos: " + ingresos + " euros ";
    }
}
