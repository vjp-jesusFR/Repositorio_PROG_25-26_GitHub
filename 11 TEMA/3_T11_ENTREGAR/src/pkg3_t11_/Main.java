package pkg3_t11_;

import java.util.Scanner;

public class Main {//Muestra los resultados y el menú
    private static final Autobus[] darsenas = new Autobus[6];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- ESTACION DE PLASENCIA ---");
            System.out.println("1. Aparcar");
            System.out.println("2. Mostrar darsenas libres");
            System.out.println("3. Buscar autobus por matricula");
            System.out.println("4. Buscar conductor");
            System.out.println("5. Darsena con mas conductores");
            System.out.println("6. Salir");
            System.out.print("Seleccione opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> aparcar();
                case 2 -> mostrarLibres();
                case 3 -> buscarAutobus();
                case 4 -> buscarConductor();
                case 5 -> System.out.println("\nDarsena con mas conductores: " + posicionMaxConductores());
                case 6 -> System.out.println("Has salido del programa");
            }
        } while (opcion != 6);//Repite el menú si la opción elegida es distinta de 6
    }

    static void aparcar() {
        int pos;
        do {
            System.out.print("Introduzca posicion (entre 0 y 5): ");//Pide al usuario la posición dónde se aparcará el autobús
            pos = sc.nextInt();
            sc.nextLine();
            if (pos < 0 || pos > 5) System.out.println("Posicion no valida.");//Si la posicion no está dentro del rango dado muestra un mensaje de error
            else if (darsenas[pos] != null) System.out.println("Darsena ocupada.");//Si la posición no está vacía lo indica con un mensaje
        } while (pos < 0 || pos > 5 || darsenas[pos] != null);

        System.out.print("Matricula: ");
        Autobus bus = new Autobus(sc.nextLine());//Pide la matrícula del autobús creado
        
        System.out.print("Cuantos conductores tiene?: ");//Pide el número de conductores del autobús y sus datos
        int numCond = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < numCond; i++) {
            System.out.print("DNI: "); String dni = sc.nextLine();
            System.out.print("Nombre: "); String nom = sc.nextLine();
            bus.aniadirConductor(dni, nom);
        }
        darsenas[pos] = bus;
    }

    static void mostrarLibres() {//Muestra las dársenas libres
        System.out.print("\nDarsenas libres: ");
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) System.out.print(i + " ");
        }
        System.out.println();
    }

    static void buscarAutobus() {//Muestra el autobús al que corresponde la matrícula introducida por el usuario
        System.out.print("Matricula a buscar: ");
        String m = sc.nextLine();
        for (Autobus b : darsenas) {
            if (b != null && b.getMatricula().equalsIgnoreCase(m)) {
                System.out.println(b);
                return;
            }
        }
        System.err.println("\nNo encontrado.");//Si el autobús no existe o la matrícula es incorrecta muestra este mensaje
    }

    static void buscarConductor() {//Muestra el conductor al que corresponde el DNI introducido por el usuario
        System.out.print("DNI del conductor: ");
        String dni = sc.nextLine();
        for (Autobus b : darsenas) {
            if (b != null && b.getConductores().containsKey(dni)) {
                System.out.println("\nConductor asignado al autobus: " + b.getMatricula());
                return;
            }
        }
        System.out.println("\nConductor no localizado.");
    }

    static int posicionMaxConductores() {//Muestra la dársena con más conductores
        int max = -1, pos = -1;
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null && darsenas[i].getConductores().size() > max) {
                max = darsenas[i].getConductores().size();
                pos = i;
            }
        }
        return pos;
    }
}