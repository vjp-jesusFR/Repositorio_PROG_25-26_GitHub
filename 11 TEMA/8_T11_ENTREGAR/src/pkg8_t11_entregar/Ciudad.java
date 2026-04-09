package pkg8_t11_entregar;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Ciudad {
    //Atributos
    private String nombre;
    private Set<Sede> sedes;
    
    //Constructores
    public Ciudad() {
        this.nombre = "";
        this.sedes = new HashSet<>();
    }
    
    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new HashSet<>();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void añadirSede(Sede s) {
        sedes.add(s);
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }
    

   
}
