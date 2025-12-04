/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.t6.entregar;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto{
    // Atributos
    boolean encendido;
    float emisora;
    int volumen;
    
    //Constructores
    public Radio(){
        encendido=false;
        emisora=80.0f;
        volumen=15;
    }
    public Radio(boolean e, float emis, int vol){
        encendido=e;
        emisora=emis;
        volumen=vol;
    }
    
    // Getters y Setters - de todos los atributos excepto del booleano "encendido" a petición del enunciado
    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Mostrar con toString
    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
    
    // Implementación de todos los métodos de la interfaz ControlRemoto
    @Override
    public void apagar() {//Se apaga la radio si esta encendida, usando un if
        if (encendido==true) {
            encendido=!encendido;
        }
    }

    @Override
    public void encender() {//Se enciende la radio si esta apagada, usando un if
        if (!encendido) {
            encendido=true;
        }
    }

    @Override
    public void bajarVolumen() {//Baja el volumen
        volumen=volumen-5;
    }

    @Override
    public void subirVolumen() {//Sube el volumen
        volumen=volumen+5;
    }

    @Override
    public void cambiarCanal(float canal) {//Cambia la emisora
         if (encendido==true) {
             emisora=canal;
        }
    }
    
    
    
}
