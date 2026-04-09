package pkg8_t11_entregar;

import java.util.*;
import pkg8_t11_entregar.Ciudad;
import pkg8_t11_entregar.Sede;

public class Main { 
   
    static ArrayList<Ciudad> listaCiudades = new ArrayList<>(); // Lista global para almacenar los objetos de tipo Ciudad
    static Scanner sc = new Scanner(System.in);// Escáner para leer la entrada del usuario por consola

    public static void main(String[] args) {// Muestra el menú y los resultados
        int opcion;
        do {
            System.out.println("\n1. Aniadir ciudad y sedes");
            System.out.println("2. Mostrar todas las ciudades y sedes");
            System.out.println("3. Sedes con ingresos superiores a la media");
            System.out.println("4. Buscar sede por nombre");
            System.out.println("5. Aniadir sede a ciudad existente");
            System.out.println("6. Mostrar sedes ordenadas (Mayor a Menor ingresos)");
            System.out.println("7. Salir");
            System.out.print("\nSelecciona una opcion: ");
            
            opcion = Integer.parseInt(sc.nextLine());// Lee la opción y la convertimos a entero

            // Menú para ejecutar la acción elegida
            switch (opcion) {
                case 1: 
                    aniadirCiudad(); 
                    break;
                case 2: 
                    mostrarTodo(); 
                    break;
                case 3: 
                    mostrarSuperioresMedia(); 
                    break;
                case 4: 
                    System.out.print("Nombre de sede a buscar: ");
                    System.out.println("Existe?: " + buscarSede(sc.nextLine()));// El método buscarSede devuelve un booleano (true/false)
                    break;
                case 5: 
                    aniadirSedeACiudad(); 
                    break;
                case 6: 
                    mostrarOrdenadas(); 
                    break;
                case 7: 
                    System.out.println("Has salido del programa.");; 
                    break;
            }
        } while (opcion != 7); // El programa se repite hasta que el usuario pulsa 7
    }

    public static void aniadirCiudad() {//Solicita el nombre de una ciudad y permite añadir una o varias sedes. Al terminar cada sede, pregunta al usuario si desea continuar añadiendo más.
        System.out.print("Nombre de la nueva ciudad: ");
        Ciudad nuevaCiudad = new Ciudad(sc.nextLine());
        
        boolean masSedes = true;
        while (masSedes) {
            System.out.print("Nombre de la sede: ");
            String nom = sc.nextLine();
            System.out.print("Ingresos anuales: ");
            double ing = Double.parseDouble(sc.nextLine());
            
            nuevaCiudad.añadirSede(new Sede(nom, ing));// Crea el objeto Sede y lo añade al conjunto de la ciudad
            
            System.out.print("Desea aniadir otra sede en " + nuevaCiudad.getNombre() + "? (s/n): ");
            masSedes = sc.nextLine().equalsIgnoreCase("s");
        }
        
        listaCiudades.add(nuevaCiudad);//Añade la ciudad completa al ArrayList global de ciudades
    }

    public static void mostrarTodo() {//Recorre el ArrayList de ciudades y muestra el nombre de cada una y el listado de todas sus sedes almacenadas
        for (Ciudad c : listaCiudades) {
            System.out.println("\nCIUDAD: " + c.getNombre());
            for (Sede s : c.getSedes()) {
                System.out.println("  - " + s);
            }
        }
    }

    public static void mostrarSuperioresMedia() {//Calcula la media de ingresos de todas las sedes de todas las ciudades y el nombre de las sedes que superen el valor medio
        double sumaTotal = 0;
        int totalSedes = 0;
        
        for (Ciudad c : listaCiudades) {// Primer recorrido para calcular la media
            for (Sede s : c.getSedes()) {
                sumaTotal += s.getIngresos();
                totalSedes++;
            }
        }

        if (totalSedes == 0) return; // Evita la división por cero si no hay sedes
        double media = sumaTotal / totalSedes;
        System.out.println("La media es: " + media + "euros. Sedes que la superan:");
        
        // Segundo recorrido para comparar cada sede con la media calculada
        for (Ciudad c : listaCiudades) {
            for (Sede s : c.getSedes()) {
                if (s.getIngresos() > media) System.out.println("- " + s.getNombre());
            }
        }
    }

   
    public static boolean buscarSede(String nombreSede) {// Recorre todas las sedes buscando una coincidencia por nombre devuelve true si la encuentra y false si no
        for (Ciudad c : listaCiudades) {
            for (Sede s : c.getSedes()) {
                if (s.getNombre().equalsIgnoreCase(nombreSede)) return true;
            }
        }
        return false;
    }

    public static void aniadirSedeACiudad() {// Pide el nombre de una ciudad. Si la encuentra en el ArrayList, registra una nueva sede y la añade al conjunto de sedes
        System.out.print("Introduce el nombre de la ciudad donde quieres aniadir la sede: ");
        String nombreC = sc.nextLine();
        for (Ciudad c : listaCiudades) {
            if (c.getNombre().equalsIgnoreCase(nombreC)) {
                System.out.print("Nombre de la nueva sede: ");
                String nomS = sc.nextLine();
                System.out.print("Ingresos: ");
                double ingS = Double.parseDouble(sc.nextLine());
                c.añadirSede(new Sede(nomS, ingS));
                System.out.println("Sede aniadida correctamente.");
                return; // Salimos del método tras encontrar la ciudad
            }
        }
        System.out.println("La ciudad no existe en nuestro registro.");
    }

    public static void mostrarOrdenadas() {//Pide el nombre de una ciudad. Si la encuentra en el ArrayList, registra una nueva sede y la añade al conjunto de sedes
        List<Sede> listaAuxiliar = new ArrayList<>();
       
        for (Ciudad c : listaCiudades) { // Ingresa todas las sedes de todas las ciudades en una lista plana
            listaAuxiliar.addAll(c.getSedes());
        }
        
        Collections.sort(listaAuxiliar);// Ordena usando la lógica definida en la clase Sede (Comparable)
        
        System.out.println("\n--- SEDES ORDENADAS POR INGRESOS (MAYOR A MENOR) ---");
        for (Sede s : listaAuxiliar) {
            System.out.println(s);
        }
    }
}
