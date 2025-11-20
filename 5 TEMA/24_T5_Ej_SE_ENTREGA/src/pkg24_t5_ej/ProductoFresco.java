/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24_t5_ej;

/**
 *
 * @author alumno
 */
public class ProductoFresco extends Producto{ 
    //Se crea la sub clase ProductoFresco que hereda los atrivutos fechaCaducidad y numeroLote de Producto con "extends"
    //Atributos
    private int fechaEnvasado;//Atributos exclusivos de esta subclase
    private String paisOrigen;
    
    //Constructores

    ProductoFresco(int fechaCaducidad, int numeroLote) {//Atributos de Super Clase Producto que son heredados
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado=fechaEnvasado;
        this.paisOrigen=paisOrigen;
    }

    public int ObtenerFechaEnvasado() {
        return fechaEnvasado;
    }
    
    public void EstablecerFechaEnvasado(int fechaEnvasado){
        this.fechaEnvasado=fechaEnvasado;
    }
    
    //Mostrar
    public void MostrarFechaEnvasado(){
        super.mostrarEstado();
        System.out.println("Estado producto fresco: "+this.fechaEnvasado);
    } 

    public String ObtenerPaisOrigen() {
        return paisOrigen;
    }
    
    public void EstablecerPaisOrigen(String paisOrigen){
        this.paisOrigen=paisOrigen;
    }
    
    //Mostrar
    public void MostrarPaisOrigen(){
        super.mostrarEstado();
        System.out.println("Estado producto fresco: "+this.fechaEnvasado);
    } 
    
   
}
