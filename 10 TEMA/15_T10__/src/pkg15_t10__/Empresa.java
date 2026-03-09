package pkg15_t10__;

import java.util.ArrayList;

public class Empresa {
    //Atributos
    private String nombreEmpresa;
    private ArrayList<Empleados> listaEmpleados;
    
    //Constructores
    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        listaEmpleados = new ArrayList<>();
    }
    
    //Getters y Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }
    
    //Método propio de esta clase
    public void aniadirEmpleado(Empleados e) {
        listaEmpleados.add(e);
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", listaEmpleados=" + listaEmpleados + '}';
    }
    

}