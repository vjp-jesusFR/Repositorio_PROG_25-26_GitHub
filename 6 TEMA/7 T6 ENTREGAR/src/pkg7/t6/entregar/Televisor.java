/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.t6.entregar;

/**
 *
 * @author alumno
 */
public  class Televisor implements ControlRemoto{
// Atributos
    private boolean encencido; 
    private int canal;
    private int volumen;
   
// Constructores
   public Televisor(){
    encencido=false;
    canal=1;
    volumen=10;
   }
   public Televisor(boolean e, int c, int v ){
    encencido=e;
    canal=c;
    volumen=v;
   }
   
// Getters y Setters - de todos los atributos excepto del booleano "encendido" a petición del enunciado
   public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
// Mostrar: con toString
    @Override
    public String toString() {
        return "Televisor{" + "encencido=" + encencido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    
// Implementación de todos los métodos de la interfaz ControlRemoto
    @Override
    public void apagar() {//Muestra un mensaje sobre el apagado de la tele en 10s si esta está encendida, usando un if
        if (encencido==true) {
            System.err.println("La TV se apagara en 10s");
            encencido=!encencido;
        } 
    }

    @Override
    public void encender() {//Enciende la tele si esta apagada, usando un if
        if (!encencido) {
            encencido=true;
        }
    }

    @Override
    public void bajarVolumen() {//Baja el volumen
        volumen=volumen-1;
    }

    @Override
    public void subirVolumen() {//Sube el volumen
        volumen=volumen+1;
    }

    @Override
    public void cambiarCanal(float canal) {//Cambia el canal
        if (encencido==true) {
            this.canal=(int) canal;
        }
    }
    

   
    
     
    
   
    
    
    
}
