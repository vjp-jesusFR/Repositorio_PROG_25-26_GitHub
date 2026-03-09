package pkg15_t10__;

public class Empleados {
    //Atributos
    private String nombreEmpleado;
    private int sueldo;
    
    //Constructores
    public Empleados() {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    public Empleados(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    //Getters y Setters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Empleado: " + nombreEmpleado + "  Sueldo: " + sueldo;
    }

}