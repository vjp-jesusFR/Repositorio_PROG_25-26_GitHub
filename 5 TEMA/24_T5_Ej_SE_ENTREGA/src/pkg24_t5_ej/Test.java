/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24_t5_ej;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Se crea la clase Test, donde esta el main para crear y mostrar los objetos
        verProductosClaseTest();
    }
    public static void verProductosClaseTest() {//Se crean los objetos para luego asignar, obtener y mostrar sus datos
        
        ProductoCongelado helados = new ProductoCongelado(2028, 99);//Se crea el ProductoCongelado helados y se le aisgnan sus datos
        helados.EstablecerTemperaturaRecomendada(-1);
        
        System.out.println("Helados: " + helados.toString() + " temperatura de congelacion recomendada: " + helados.ObtenerTemperaturaRecomendada());
        
        ProductoFresco fresas = new ProductoFresco(2026, 200);//Se crea el ProductoFresco fresas y se le aisgnan sus datos
        fresas.EstablecerFechaEnvasado(2025);
        fresas.EstablecerPaisOrigen("Espania");
        
        System.out.println("Fresas: " + fresas.toString() + " fecha de envasado: " + fresas.ObtenerFechaEnvasado() + " pais de origen: " + fresas.ObtenerPaisOrigen());
        
        ProductoRefrigerado gazpacho = new ProductoRefrigerado(2027, 770);//Se crea el ProductoRefrigerado gazpacho y se le aisgnan sus datos
        gazpacho.EstablecerCodOrgSuperv(555);
        
        System.out.println("Gazpacho: " + gazpacho.toString() + " codigo organizacion de supervision alimentaria: " + gazpacho.ObtenerCodOrgSuperv());
    }
    
    
}
