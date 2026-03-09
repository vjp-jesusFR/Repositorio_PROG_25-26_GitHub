package pkg15_t10__;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {//Muestra los resultados y el menú

        Scanner entrada = new Scanner(System.in);

        ArrayList<Empresa> listaEmpresas = new ArrayList<>();

        int opcion = 0;

        do {
            try {//Muestra las opciones del menú
                System.out.println("\n1. Aniadir empresas junto a sus empleados a una lista");
                System.out.println("2. Mostrar las empresas de la lista junto a sus empleados");
                System.out.println("3. Mostrar los empleados cuyo nombre contenga la letra 'A'");
                System.out.println("4. Mostrar todos los empleados ordenados por el sueldo que cobran");
                System.out.println("5. Salir");

                System.out.print("\nSeleccione una opcion: ");
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {//Controla la interacción con el menú

                    case 1:
                        introducirEmpresaYEmpleado(listaEmpresas);
                        break;

                    case 2:
                        mostrarEmpresasYEmpleados(listaEmpresas);
                        break;

                    case 3:
                        buscarEmpleadoPorLetra(listaEmpresas);
                        break;

                    case 4:
                        mostrarEmpleadosOrdenados(listaEmpresas);
                        break;

                    case 5:
                        System.out.println("Has salido del programa.");
                        break;

                    default:
                        System.out.println("Opcion no válida.");
                }

            } catch (InputMismatchException e) {//Si se introduce un tipo de dato no válido muestra un mensaje
                System.err.println("\nTipo de dato incorrecto.");
                entrada.next();
            }
        } while (opcion != 5);//Repite el bucle que muestra el menú si la opción seleccionada es distinta de 5

    }

    public static void introducirEmpresaYEmpleado(ArrayList<Empresa> listaEmpresas) {//Pide los datos de los empleados cada vez para crealos y el nom bre de la empresa

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nIntroduzca el nombre de la empresa: ");
        String nombreEmpresa = entrada.nextLine();

        Empresa empresa = new Empresa(nombreEmpresa);

        String seguir;

        do {//Pide los datos al usuario
            System.out.print("Nombre del empleado: ");
            String nombreEmpleado = entrada.nextLine();

            System.out.print("Sueldo del empleado: ");
            int sueldo = entrada.nextInt();
            entrada.nextLine();

            Empleados empleado = new Empleados(nombreEmpleado, sueldo);

            empresa.aniadirEmpleado(empleado);

            System.out.print("Aniadir otro empleado? (S/N): ");
            seguir = entrada.nextLine();

        } while (seguir.equalsIgnoreCase("s"));//Si no se pulsa "s" el bucle se repite

        listaEmpresas.add(empresa);//Se añade los datos de la empresa a la lista de empresas

    }

    public static void mostrarEmpresasYEmpleados(ArrayList<Empresa> listaEmpresas) {//Muestra los datos de la emplesa y sus empleados

        for (Empresa empresa : listaEmpresas) {

            System.out.println("\nEmpresa: " + empresa.getNombreEmpresa());

            for (Empleados emp : empresa.getListaEmpleados()) {//Recorre la lista y muestra los datos de los empleados y el nombre de la empresa
                System.out.println(emp);
            }
        }
    }

    public static void buscarEmpleadoPorLetra(ArrayList<Empresa> listaEmpresas) {//Busca si hay un empleado con un nombre con la letra "A"

        for (Empresa empresa : listaEmpresas) {

            for (Empleados emp : empresa.getListaEmpleados()) {//Recorre la lista

                if (emp.getNombreEmpleado().toLowerCase().contains("a")) {//Si un nombre contiene "a" lo muestra junto al nombre de la empresa
                    System.out.println("");
                    System.out.println(emp + ", Empresa: " + empresa.getNombreEmpresa());
                }
            }
        }
    }

    public static void mostrarEmpleadosOrdenados(ArrayList<Empresa> listaEmpresas) {//Muestra los empleados de la empresa en orden

        ArrayList<Empleados> todos = new ArrayList<>();

        for (Empresa empresa : listaEmpresas) {//Recorre la lista y le añade los empleados
            todos.addAll(empresa.getListaEmpleados());
        }

        todos.sort((e1, e2) -> Integer.compare(e1.getSueldo(), e2.getSueldo()));//Ordena los empleados (.sort) junto a su sueldo

        for (Empleados e : todos) {//Recorre la lista y muestra los datos
            System.out.println(e);
        }

    }

}