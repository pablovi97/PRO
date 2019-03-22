/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Main {

    static Universidad agregarUniversidad(HashMap<String, Universidad> universidades) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la universidad: ");
        String nombre = sc.nextLine().toUpperCase();
        System.out.println("Introduce la ciudad donde esta la universidad: ");
        String ciudad = sc.nextLine();
        Universidad uni = new Universidad(nombre, ciudad);
        universidades.put(nombre, uni);
        return uni;
    }

    static String listadoUniversidades(HashMap<String, Universidad> unis) {
        String resultado = "";
        for (Universidad uni : unis.values()) {
            resultado += uni + "\n";
        }
        if (resultado.equals("")) {
            resultado = "No hay universidades.";
        }
        return resultado;
    }

    static void agregarEstudiante(Universidad uni) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (uni.titulacionesDisponibles().size() > 0) {
            System.out.println("introduce dni");
            String dni = sc.nextLine();

            System.out.println("introducir nombre");
            String nombre = sc.nextLine();

            System.out.println("introducir expediente");
            String expediente = sc.nextLine();

            System.out.println("Titulaciones disponibles:");

            System.out.println(uni.titulacionesDisponibles());

            System.out.println("¿Titulación?");
            String titulacion = sc.nextLine();

            boolean existeTitulacion = uni.crearEstudianteDeGrado(titulacion, expediente, dni, nombre);

            if (!existeTitulacion) {
                System.out.println("No tenemos esa titulacion.");
            }
        } else {
            System.out.println("Aun no hay titulacion en la universidad. Cree departamentos.");
        }

    }

    static void agregarTrabajadores(Universidad uni) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce dni");
        String dni = sc.nextLine();

        System.out.println("introducir nombre");
        String nombre = sc.nextLine();

        System.out.println("introducir fecha inicio trabajo: formato(yyyy-MM-dd)");
        String fechaIni = sc.nextLine();

//        if (fechaIni.matches("^[1-2][09]{1}[0-9]{2}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$")) {
//            
//        }
        try {
            if (fechaIni.matches("^[1-2][0-9]{3}-((((0[13578])|(1[02]))-(([0-2][0-9])|(3[01])))|(((0[469])|(11))-(([0-2][0-9])|(30)))|(02-[0-2][0-9]))$")) {
                Trabajador t = new Trabajador(fechaIni, new Dni(dni), nombre, uni);
            } else {
                System.out.println("Fecha inicio no valida.");
            }
        } catch (Exception exception) {
            System.out.println("Dni no válido.");
        }
    }

    static void agregarDepartamento(Universidad uni) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre departamento: ");
        String nombre = sc.nextLine();

        Universidad.Departamento departamento = uni.crearDepartamento(nombre);
        uni.departamentos.put(departamento.nombre, departamento);

        System.out.println(Titulaciones.mostrarTitulaciones());

        System.out.println("\n¿Que titulacion agregas al departamento? (Escribir fin para finalizar)");
        String opcion = "";

        while (!"FIN".equals(opcion)) {
            System.out.print("intro: ");
            opcion = sc.nextLine().toUpperCase();
            boolean existeTitulacion = uni.agregarTitulacionesDepartamento(departamento, opcion);
            if (!existeTitulacion && !"FIN".equals(opcion)) {
                System.out.println("No existe esa titulación.");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Universidad> universidades = new HashMap<>();
        Titulaciones.agregarTitulación("ADE");
        Titulaciones.agregarTitulación("IngInformatica");
        Titulaciones.agregarTitulación("ArqNaval");
        Titulaciones.agregarTitulación("BellasArtes");
        Titulaciones.agregarTitulación("Biologia");
        Titulaciones.agregarTitulación("Enfermeria");
        Titulaciones.agregarTitulación("Estadistica");
        Titulaciones.agregarTitulación("Farmacia");
        Titulaciones.agregarTitulación("Filologia");
        Titulaciones.agregarTitulación("Fisica");
        Titulaciones.agregarTitulación("Matematicas");
        Titulaciones.agregarTitulación("Quimica");
        Titulaciones.agregarTitulación("Veterinaria");

        int opcion = 0;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1) Agregar universidad: ");
            System.out.println("2) Listado Universidades: ");
            System.out.println("3) Opciones universidad: ");
            System.out.println("20) Salir. ");

            boolean numeroCorrecto = false;
            do {
                try {
                    opcion = sc.nextInt();
                    sc.nextLine();
                    numeroCorrecto = true;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número válido.");
                    sc.nextLine();
                }
            } while (!numeroCorrecto);

            switch (opcion) {
                case 1:
                    Universidad univer = agregarUniversidad(universidades);
                    System.out.println(univer);
                    break;
                case 2:
                    System.out.println(listadoUniversidades(universidades));
                    break;
                case 3:
                    System.out.println("¿Universidad?");
                    String universidad = sc.nextLine().toUpperCase();
                    Universidad uni = universidades.get(universidad);
                    if (uni != null) {
                        int option = 0;
                        do {
                            System.out.println("1) Agregar estudiante: ");
                            System.out.println("2) Agregar trabajadores: ");
                            System.out.println("3) Agregar departamento: ");
                            System.out.println("4) Quitar trabajadores");
                            System.out.println("5) Quitar departamento");
                            System.out.println("6) Quitar Universidad");
                            System.out.println("7) Quitar Estudiante");
                            System.out.println("8) Listado Trabajadores");
                            System.out.println("9) Listado departamentos");
                            System.out.println("10) Listado Estudiantes");
                            System.out.println("20)Atras");

                            boolean numeroCorrecto2 = false;

                            do {
                                try {
                                    option = sc.nextInt();
                                    sc.nextLine();
                                    numeroCorrecto2 = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Introduce un número válido.");
                                    sc.nextLine();
                                }
                            } while (!numeroCorrecto2);

                            switch (option) {
                                case 1:
                                    agregarEstudiante(uni);
                                    break;
                                case 2:
                                    agregarTrabajadores(uni);
                                    break;
                                case 3:
                                    agregarDepartamento(uni);
                                    break;
                                case 7:
                                    System.out.println("¿Cual es su dni?");
                                    String dni = sc.nextLine();

                                    try {
                                        if (uni.estudiantes.get(dni) != null) {
                                            uni.estudiantes.remove(dni);
                                        } else {
                                            System.out.println("No existe ese estudiante.");
                                        }
                                    } catch (NullPointerException e) {
                                        System.out.println("No existe ese estudiante.");
                                    }

                                    // El siguiente seria especifico para estudiante de grado
//                        if (uni.estudiantes.get(dni) instanceof Universidad.EstudianteDeGrado) {
//                            if (uni.estudiantes.get(dni) != null) {
//                                uni.estudiantes.remove(dni);
//                            }
//                        }
                                    break;
                                case 4:

                                    System.out.println("¿Cual es su dni?");
                                    String dni1 = sc.nextLine();

                                    try {
                                        if (uni.trabajadores.get(dni1) != null) {
                                            uni.trabajadores.remove(dni1);
                                        } else {
                                            System.out.println("No existe ese trabajador.");
                                        }

                                    } catch (NullPointerException r) {
                                        System.out.println("No existe ese trabajador");
                                    }

                                    break;

                                case 5:

                                    System.out.println("Cual es el nombre del departamento?");
                                    String nom = sc.nextLine();

                                    try {
                                        if (uni.departamentos.get(nom) != null) {
                                            uni.departamentos.remove(nom);
                                        } else {
                                            System.out.println("No existe ese departamento");
                                        }

                                    } catch (NullPointerException e) {
                                        System.out.println("No existe ese departamento");
                                    }

                                    break;

                                case 6:
                                    universidades.remove(uni.nombre);
                                    option = 21;
                                    break;
                                case 10:
                                    System.out.println(uni.listarEstudiantes());
                                    break;
                                case 8:
                                    System.out.println(uni.listarTrabajadores());
                                    break;
                                case 9:
                                    System.out.println(uni.listarDepartamento());
                                    break;
                                case 20:
                                    System.out.println("Volviendo al menu principal.");
                                    break;
                                default:
                                    System.out.println("Elija una opcion válida.");
                            }
                        } while (option != 20);
                    } else {
                        System.out.println("No existe esa universidad.");
                    }
                    break;

                case 20:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Elija una opcion válida.");
            }

        } while (opcion != 20);

    }
}
