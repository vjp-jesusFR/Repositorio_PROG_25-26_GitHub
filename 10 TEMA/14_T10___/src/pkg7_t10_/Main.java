package pkg7_t10_;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {//Muestra los resultados y el menú

        ArrayList<Alumno> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {//Muestra el menú y permite al usuario interactuar con el
            try {
                System.out.println("\n1. Introducir nuevo alumno");
                System.out.println("2. Mostrar alumnos y sus notas");
                System.out.println("3. Mejor alumno de la clase (mayor media)");
                System.out.println("4. Asignatura mas dificil (mas suspensos)");
                System.out.println("5. Salir");

                System.out.print("\n Seleccione una opcion: ");

                opcion = entrada.nextInt();

                switch (opcion) {

                    case 1:
                        introducirAlumno(lista);
                        break;

                    case 2:
                        mostrarLista(lista);
                        break;

                    case 3:
                        mejorAlumno(lista);
                        break;

                    case 4:
                        asignaturaMasDificil(lista);
                        break;

                    case 5:
                        System.out.println("\n Has salido del programa.");
                        break;

                    default:
                        System.err.println("\n Opcion no valida.");
                }
            } catch (InputMismatchException e) {
                System.err.println("\n Tipo de dato incorrecto.");
                entrada.next();
            }

        } while (opcion != 5);//Repite el menú en bucle si la opción introducida es diferente de 5
    }

    public static void introducirAlumno(ArrayList<Alumno> lista) {//Pide los datos del alumno al usuario y lo crea

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("");

        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();

        Asignatura[] asignaturas = new Asignatura[3];

        System.out.print("Nota Matematicas: ");
        double mates = entrada.nextDouble();

        System.out.print("Nota Lengua: ");
        double lengua = entrada.nextDouble();

        System.out.print("Nota Fisica: ");
        double fisica = entrada.nextDouble();

        asignaturas[0] = new Asignatura("Matematicas", mates);
        asignaturas[1] = new Asignatura("Lengua", lengua);
        asignaturas[2] = new Asignatura("Fisica", fisica);

        Alumno a = new Alumno(nombre, asignaturas);
        lista.add(a);

        System.out.println("\n Alumno insertado correctamente.");
    }

    public static void mostrarLista(ArrayList<Alumno> lista) {//Muestra los datos de la lista de alumnos
        
        System.out.println("");

        if (lista.isEmpty()) {
            System.out.println("No hay alumnos registrados.");//Avisa con un mensaje si la lista está vacía
            return;
        }

        for (Alumno a : lista) {
            System.out.println(a);//Si la lista no está vacía muestra su contenido
        }
    }

    public static void mejorAlumno(ArrayList<Alumno> lista) {//Muestra quien es el alumno con la mejor nota media
        
        System.out.println("");

        if (lista.isEmpty()) {//Muestra los datos de la lista de alumnos
            System.out.println("No hay alumnos.");
            return;
        }

        Alumno mejor = lista.get(0);

        for (Alumno a : lista) {
            if (a.media() > mejor.media()) {//Si la lista no está vacía muestra la mejor nota media
                mejor = a;
            }
        }

        System.out.println("El mejor alumno es:");
        System.out.println(mejor.getNombre() + " con media " + mejor.media());
    }

    public static void asignaturaMasDificil(ArrayList<Alumno> lista) {//Muestra la asignatura con mayor cantidad de suspensos
        
        System.out.println("");

        int suspensosMates = 0;//Variables para contar la cantidad de suspensos de cada asignatura
        int suspensosLengua = 0;
        int suspensosFisica = 0;

        for (Alumno a : lista) {//Si una asignatura cuenta con una nota menor a 5 se suma 1 al contador de suspensos de esa asignatura

            Asignatura[] asig = a.getAsignaturas();

            if (asig[0].getNota() < 5)
                suspensosMates++;

            if (asig[1].getNota() < 5)
                suspensosLengua++;

            if (asig[2].getNota() < 5)
                suspensosFisica++;
        }

        if (suspensosMates >= suspensosLengua && suspensosMates >= suspensosFisica) {//Indica cual es la asignatura más dificl con un mensaje
            System.out.println("La asignatura mas dificil es Matematicas.");
        } else if (suspensosLengua >= suspensosFisica) {
            System.out.println("La asignatura mas dificil es Lengua.");
        } else {
            System.out.println("La asignatura mas dificil es Fisica.");
        }
    }
}