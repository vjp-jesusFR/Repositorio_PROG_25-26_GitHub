/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15_ejercicio_se_entrega;

/**
 *
 * @author alumno
 */
public class Direccion {
    //Se declaran los Atributos del objeto "Direccion"
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;
    
    //Se crean los Constructores
    public Direccion(){
        calle="";
        numero=0;
        piso="";
        ciudad="";          
    }
     public Direccion(String m, String c,String t, int a ){
        calle="";
        numero=0;
        piso="";
        ciudad="";         
    }
     
      //Se añaden los Getters/Setters
    public String getCalle(){
        return calle;
    }
    
    public void setCalle(String c){
        calle = c;
    }
    
     public int getNumero(){
        return numero;
    }
    
    public void setNumero(int n){
        numero = n;
    }
     public String getPiso(){
        return piso;
    }
    
    public void setPiso(String p){
        piso = p;
    }
     public String getCiudad(){
        return ciudad;
    }
     
    public void setCiudad(String ci){
        ciudad = ci;
    }
    
    //Mostrar: Usando "to string" -> Click derecho -> insert code -> to String -> selccionar deseado y aceptar
    @Override
    public String toString() {
        return "" + "\nCalle=" + calle + "\nNumero=" + numero + "\nPiso=" + piso + "\nCiudad=" + ciudad + "";
    }
    
    
    
}
