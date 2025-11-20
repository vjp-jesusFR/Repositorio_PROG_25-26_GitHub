/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24_t5_ej;

/**
 *
 * @author alumno
 */
public class ProductoRefrigerado extends Producto {
    //Se crea la sub clase Productorefrigerado que hereda los atrivutos fechaCaducidad y numeroLote de Producto con "extends"
     //Atributos
    private int codOrgSuperv;//Atributo exclusivo de esta subclase
    
    //Constructores
    ProductoRefrigerado( int fechaCaducidad, int numeroLote) {//Atributos de Super Clase Producto que son heredados
        super(fechaCaducidad, numeroLote);
        this.codOrgSuperv=codOrgSuperv;
    }

    public int ObtenerCodOrgSuperv() {
        return codOrgSuperv;
    }
    
    public void EstablecerCodOrgSuperv(int codOrgSuperv){
        this.codOrgSuperv=codOrgSuperv;
    }
    
    //Mostrar
    public void MostrarEstadoCodOrgSuperv(){
        super.mostrarEstado();
        System.out.println("Cod org superv: "+this.codOrgSuperv);
    } 
    
}
