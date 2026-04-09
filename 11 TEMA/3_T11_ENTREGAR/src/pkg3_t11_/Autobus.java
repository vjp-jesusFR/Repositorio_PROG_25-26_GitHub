package pkg3_t11_;


import java.util.HashMap;
import java.util.Map;

class Autobus {
    //Atributos
    private String matricula;
    private Map<String, String> conductores; // DNI -> Nombre
    
    //Constructores
    public Autobus() {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }
    
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }
    
    //Getters y Setters
    public String getMatricula() { return matricula; }
    public Map<String, String> getConductores() { return conductores; }
    
    public void aniadirConductor(String dni, String nombre) {
        conductores.put(dni, nombre);
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "\nMatricula: " + matricula + " | Conductores: " + conductores;
    }
}