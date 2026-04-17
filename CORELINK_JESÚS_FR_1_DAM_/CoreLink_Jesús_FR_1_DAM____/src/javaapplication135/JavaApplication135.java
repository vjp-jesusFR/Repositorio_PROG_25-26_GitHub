package javaapplication135;

import java.io.*;

public class JavaApplication135 {

    public static void main(String[] args) {
        
        //Fase 1
       
        // Nombres de archivos según el protocolo
        String archivoEntrada = "datos_empleados.txt";
        String archivoSalida = "sospechosos_zona_cero.txt";
        String criterio = "Zona Cero";
        
        int contadorSospechosos = 0;

       
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
             PrintWriter pw = new PrintWriter(new FileWriter(archivoSalida))) {

            String linea;
            
            String cabecera = br.readLine();
            if (cabecera != null) {
                pw.println(cabecera);
            }

            
            while ((linea = br.readLine()) != null) {
                if (linea.contains(criterio)) {
                    pw.println(linea);
                    contadorSospechosos++;
                }
            }

            System.out.println("--- RECONSTRUCCION COMPLETADA ---");
            System.out.println("Archivo generado: " + archivoSalida);
            System.out.println("NUMERO DE EMPLEADOS EN ZONA CERO: " + contadorSospechosos);
            System.out.println("---------------------------------");

        } catch (FileNotFoundException e) {
            System.err.println("Error: No se encontró el archivo " + archivoEntrada);
        } catch (IOException e) {
            System.err.println("Error de lectura/escritura: " + e.getMessage());
        }
        
       
        
    }
}
