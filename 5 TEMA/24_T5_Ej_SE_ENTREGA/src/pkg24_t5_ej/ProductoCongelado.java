/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24_t5_ej;

/**
 *
 * @author alumno
 */
public class ProductoCongelado extends Producto{
//Se crea la sub clase ProductoCongelado que hereda los atrivutos fechaCaducidad y numeroLote de Producto con "extends"
    //Atributos
    private int temperaturaRecomendada;//Atributo exclusivo de esta subclase
    
    //Constructores

    ProductoCongelado(int fechaCaducidad, int numeroLote) {//Atributos de Super Clase Producto que son heredados
        super(fechaCaducidad, numeroLote);
        this.temperaturaRecomendada=temperaturaRecomendada;
    }

    public int ObtenerTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }
    
    public void EstablecerTemperaturaRecomendada(int temperaturaRecomendada){
        this.temperaturaRecomendada=temperaturaRecomendada;
    }
    
    //Mostrar
    public void MostrarEstado(){
        super.mostrarEstado();
        System.out.println("Temperatura de congelación recomendada "+this.temperaturaRecomendada);
    } 
}
