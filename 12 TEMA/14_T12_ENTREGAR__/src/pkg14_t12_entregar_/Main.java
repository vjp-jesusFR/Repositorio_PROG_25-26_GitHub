package pkg14_t12_entregar_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {//Calcula quien recibe beca y su cuantía y la muestra junto al nombre del becario

        String fichero = "DatosBeca.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {//Lectura del fichero con FileReader y BufferedReader

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(",");//Divide cada dato del fichero usando las comas

                String nombre = partes[0].trim();

                int edad = 0;
                int suspensos = 0;
                boolean residenciaFamiliar = true;
                int ingresos = 0;

                // Parseo de datos (Cambiar los datos de tipo)
                for (String p : partes) {
                    p = p.trim();

                    if (p.startsWith("edad")) {
                        edad = Integer.parseInt(p.split(":")[1].trim());
                    }

                    if (p.startsWith("suspensos curso anterior")) {
                        suspensos = Integer.parseInt(p.split(":")[1].trim());
                    }

                    if (p.contains("residencia familiar")) {
                        String valor = p.split(":")[1].trim().toLowerCase();
                        residenciaFamiliar = valor.equals("true") || valor.equals("si");
                    }

                    if (p.startsWith("ingresos anuales")) {
                        ingresos = Integer.parseInt(p.split(":")[1].trim());
                    }
                }

                if (suspensos >= 2) {// Si hay 2 o más suspensos → no hay beca
                    continue;
                }

                int beca = 1500;

                // Ingresos
                if (ingresos <= 12000) {
                    beca += 500;
                }

                // Edad
                if (edad < 23) {
                    beca += 200;
                }

                // Suspensos
                if (suspensos == 0) {
                    beca += 500;
                } else if (suspensos == 1) {
                    beca += 200;
                }

                // Residencia
                if (!residenciaFamiliar) {
                    beca += 1000;
                }

                System.out.println(nombre + " -> Beca: " + beca + " euros");
            }

        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
        }
    }
}