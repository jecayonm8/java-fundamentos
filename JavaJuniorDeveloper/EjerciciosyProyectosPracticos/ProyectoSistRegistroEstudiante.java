package JavaJuniorDeveloper.EjerciciosyProyectosPracticos;

import java.util.Scanner;

// Proyecto: Sistema de Registro de Estudiantes
// Desarrollar una aplicación de consola que permita gestionar un registro básico de estudiantes.
//El sistema debe integrar todos los conceptos aprendidos en el módulo: variables, operadores, estructuras de control, métodos y buenas prácticas de programación.

public class ProyectoSistRegistroEstudiante {

    //CONSTANTES DEL SISTEMA
    private static final int MAX_ESTUDIANTES = 50;
    private static final double NOTA_APROBACION = 6.0;

    //ARRAYS Y CONTADOR GLOBLAL para almacenar datos de estudiantes
    private static String[] nombres = new String[MAX_ESTUDIANTES];
    private static int[] edades = new int[MAX_ESTUDIANTES];
    private static double[] calificaciones = new double[MAX_ESTUDIANTES];
    private static int totalRegistrados = 0; //cuantos estudiantes se han registrado por ahora.


    //METODOS DE INTERFAZ 
    static void mostrarBienvenida() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE REGISTRO DE ESTUDIANTES   ║");
        System.out.println("║              Versión 1.0  by JECM        ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    static void mostrarMenuPrincipal() {
        System.out.println("\n📚 MENÚ PRINCIPAL");
        System.out.println("──────────────────────────────");
        System.out.println("1. 📝 Registrar nuevo estudiante");
        System.out.println("2. 📋 Mostrar todos los registros");
        System.out.println("3. 🔍 Buscar estudiante por nombre");
        System.out.println("4. 📊 Calcular promedio general");
        System.out.println("5. 📈 Mostrar estadísticas");
        System.out.println("0. 🚪 Salir del sistema");
        System.out.println("──────────────────────────────");
        System.out.print("Seleccione una opción: ");
    }

    static void mostrarDespedida() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   Gracias por usar el sistema. ¡Hasta    ║");
        System.out.println("║               Pronto! 👋                8║");
        System.out.println("╚══════════════════════════════════════════╝\n");
    }

    //METODOS DE VALIDACION
    //------------------------------------------

    //Funcion para solicitar nombre con validacion.
    //Valida que el nombre tenga entre 2 y 30 caracteres y solo contenga letras y espacios.
    static String solicitarNombre (Scanner scanner) {
        String nombre = "";
        boolean nombreValido = false;

        while (!nombreValido) {
            System.out.println("Nombre del estudiante: ");
            nombre = scanner.nextLine().trim();
            if (nombre.length() < 2) {
                System.out.println("❌ El nombre debe tener al menos 2 caracteres. Intenta de nuevo.");
                continue;
            } else if (nombre.length() > 30) {
                System.out.println("❌ El nombre no puede tener más de 30 caracteres. Intenta de nuevo.");
                continue;
            }
            //Verificar que solo tenga letras y espacios
            boolean soloLetras = true;
            for (int i =0; i < nombre.length(); i++) {
                char c = nombre.charAt(i);
                if(!Character.isLetter(c) && c != ' ') {
                    soloLetras = false;
                    break;
                }
            }
            if (!soloLetras) {
                System.out.println("❌ El nombre solo puede contener letras y espacios. Intenta de nuevo.");
            } else {
                nombreValido = true;
            }

        } 
        return nombre;
    }

    //Funcion para solicitar edad con validacion.
    //Valida que la edad este entre 5 y 100 años.
    static int solicitarEdad (Scanner scanner) {
        int edad = -1;

        while (edad < 5 || edad > 100) {
            System.out.println("Edad (5-100): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número entero válido para la edad.");
                scanner.next(); //limpia entrada no valida
                continue;
            }
            edad = scanner.nextInt();
            if (edad < 5 || edad > 100) {
                System.out.println("La edad debe estar entre 5 y 100 años. Intenta de nuevo.");
            }
        }
        return edad;
    }

    //Funcion para solicitar calificacion con validacion.
    //Valida que la calificacion este entre 0.0 y 10.0
    static double solicitarCalificacion (Scanner scanner) {
        double calificacion = -1;

        while(calificacion < 0.0 || calificacion > 10.0) {
            System.out.println("Calificacion (0.0 - 10.0): ");
            if(!scanner.hasNextDouble()) {
                System.out.println("Ingresa un número decimal válido para la calificación.");
                scanner.next(); //limpia entrada no valida
                continue;
            }
            calificacion = scanner.nextDouble();
            scanner.nextLine(); //limpia el buffer de entrada

            if (calificacion < 0.0 || calificacion > 10.0) {
                System.out.println("La calificación debe estar entre 0.0 y 10.0. Intenta de nuevo.");
            }
        }
        return calificacion;
    }

    //Funcion Solictar Opcion del menu con validacion opcion de menu.
    static int solicitarOpcion (Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Opcion no válida. Ingresa un número del menú.");
            scanner.next(); //limpia entrada no valida
            System.out.println("Seleccione una opción: ");
        }
        int opcion = scanner.nextInt();
        scanner.nextLine(); //limpia el buffer de entrada
        return opcion;
    }

    //METODOS AUXILIARES 
    //------------------------------------------

    //Funcion para buscar el indice o estudiante por su nombre.
    static int buscarIndicePorNombre(String nombre) {
        for (int i = 0; i < totalRegistrados; i++) {
            if(nombres[i].equalsIgnoreCase(nombre)) {
                return i; //retorna el indice del estudiante encontrado
            }
        }
        return -1; //en caso de que NO se encuentra:retorna -1
    }

    //Funcion para obtener estado de calificacion estudiante(Excelente, Muy Bueno, Bueno, Aprobado, Reprobado).
    static String obtenerEstadoCalificacion(double calificacion) {
        if(calificacion >= 9.0) return "Excelente";
        else if (calificacion >= 8.0) return "Muy Bueno";
        else if (calificacion >= 7.0) return "Bueno";
        else if (calificacion >= 6.0) return "Aprobado";
        else                          return "Reprobado";
    }

    //metodo para calcular porcentaje evitando division por cero.
    static double calcularPorcentaje(int parte, int total) {
        if (total == 0) return 0.0; //evita division por cero
        return (double) parte / total * 100;
    }

    //METODOS DE FUNCIONALIDAD 
    //------------------------------------------

    // Metodo de Registrar un nuevo estudiante con todas sus validaciones
    static void registrarEstudiante(Scanner scanner) {
        System.out.println("\n── 📝 Registrar Estudiante ──");

        // Verificar si hay espacio
        if (totalRegistrados >= MAX_ESTUDIANTES) {
            System.out.println("¡Lo siento! Se ha alcanzado el límite de " + MAX_ESTUDIANTES + " estudiantes.");
            return;
        }

        // Solicitar y validar nombre
        String nombre = solicitarNombre(scanner);

        // Verificar duplicado
        if (buscarIndicePorNombre(nombre) != -1) {
            System.out.println("⚠️  Ya existe un estudiante con ese nombre.");
            return;
        }

        // Solicitar edad y calificación
        int edad          = solicitarEdad(scanner);
        double calificacion = solicitarCalificacion(scanner);

        // Guardar en los arrays
        nombres[totalRegistrados]        = nombre;
        edades[totalRegistrados]         = edad;
        calificaciones[totalRegistrados] = calificacion;
        totalRegistrados++;

        System.out.println("✅ Estudiante registrado correctamente. Total: " + totalRegistrados);
    }

    //Metodo que muestra lista de todos los estudiantes registrados con su nombre, edad, calificación y estado.
    static void mostrarTodosLosRegistros() {
        System.out.println("\n── 📋 Todos los Registros ──");

        if (totalRegistrados == 0) {
            System.out.println("ℹ️  No hay estudiantes registrados aún.");
            return;
        }

        System.out.println("──────────────────────────────────────────────────────");
        System.out.printf("%-5s %-20s %-8s %-12s %-15s%n",
                          "N°", "Nombre", "Edad", "Calificación", "Estado");
        System.out.println("──────────────────────────────────────────────────────");

        for (int i = 0; i < totalRegistrados; i++) {
            System.out.printf("%-5d %-20s %-8d %-12.2f %-15s%n",
                i + 1,
                nombres[i],
                edades[i],
                calificaciones[i],
                obtenerEstadoCalificacion(calificaciones[i]));
        }

        System.out.println("──────────────────────────────────────────────────────");
        System.out.println("Total: " + totalRegistrados + " estudiante(s)");
    }

    //Metodo para buscar un estudiante por su nombre e imprimir sus datos.
    static void buscarEstudiantePorNombre(Scanner scanner) {
        System.out.println("\n── 🔍 Buscar Estudiante ──");
        System.out.print("Ingresa el nombre a buscar: ");
        String nombreBusqueda = scanner.nextLine().trim();

        int indice = buscarIndicePorNombre(nombreBusqueda);

        if (indice == -1) {
            System.out.println("❌ No se encontró ningún estudiante con ese nombre.");
            return;
        }

        // Mostrar datos del estudiante encontrado
        System.out.println("\n✅ Estudiante encontrado:");
        System.out.println("──────────────────────────");
        System.out.println("Nombre       : " + nombres[indice]);
        System.out.println("Edad         : " + edades[indice] + " años");
        System.out.printf( "Calificación : %.2f%n", calificaciones[indice]);
        System.out.println("Estado       : " + obtenerEstadoCalificacion(calificaciones[indice]));
    }

    // Metodo para calcular y mostrar el promedio general del grupo.
    static void calcularPromedioGeneral() {
        System.out.println("\n── 📊 Promedio General ──");

        if (totalRegistrados == 0) {
            System.out.println("ℹ️  No hay estudiantes registrados aún.");
            return;
        }

        double suma = 0;
        for (int i = 0; i < totalRegistrados; i++) {
            suma += calificaciones[i];
        }

        double promedio = suma / totalRegistrados;
        System.out.printf("Promedio general del grupo: %.2f%n", promedio);
        System.out.println("Estado: " + obtenerEstadoCalificacion(promedio));
    }

    //Metodo para mostrar estadisticas completas del grupo: cantidad de estudiantes aprobados, reprobados, porcentaje de cada estado.
    static void mostrarEstadisticas() {
        System.out.println("\n── 📈 Estadísticas del Grupo ──");

        if (totalRegistrados == 0) {
            System.out.println("ℹ️  No hay estudiantes registrados aún.");
            return;
        }

        // Calcular datos
        double sumaCalif = 0, sumaEdades = 0;
        double notaMasAlta = calificaciones[0];
        double notaMasBaja = calificaciones[0];
        int aprobados = 0, reprobados = 0;

        for (int i = 0; i < totalRegistrados; i++) {
            sumaCalif  += calificaciones[i];
            sumaEdades += edades[i];

            if (calificaciones[i] > notaMasAlta) notaMasAlta = calificaciones[i];
            if (calificaciones[i] < notaMasBaja) notaMasBaja = calificaciones[i];
            if (calificaciones[i] >= NOTA_APROBACION) aprobados++;
            else reprobados++;
        }

        double promedioCalif = sumaCalif / totalRegistrados;
        double promedioEdad  = sumaEdades / totalRegistrados;
       
        // Mostrar estadísticas
        System.out.println("══════════════════════════════════════");
        System.out.println("  📌 CALIFICACIONES");
        System.out.printf("  Promedio general : %.2f (%s)%n", promedioCalif, obtenerEstadoCalificacion(promedioCalif));
        System.out.printf("  Nota más alta    : %.2f%n", notaMasAlta);
        System.out.printf("  Nota más baja    : %.2f%n", notaMasBaja);

        System.out.println("──────────────────────────────────────");
        System.out.println("  👥 ESTUDIANTES");
        System.out.println("  Total registrados: " + totalRegistrados);
        System.out.printf("  Aprobados : %d (%.1f%%)%n", aprobados, calcularPorcentaje(aprobados, totalRegistrados));
        System.out.printf("  Reprobados: %d (%.1f%%)%n", reprobados, calcularPorcentaje(reprobados, totalRegistrados));

        System.out.println("──────────────────────────────────────");
        System.out.println("    EDADES");
        System.out.printf("  Promedio de edad : %.1f años%n", promedioEdad);
        System.out.println("══════════════════════════════════════");

    }

    //----------------------------------
    //MAIN - orquesta todo el sistema
    //----------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mostrarBienvenida();

        int opcion = -1;

        while (opcion != 0) {
            mostrarMenuPrincipal();
            opcion = solicitarOpcion(scanner);

            switch (opcion) {
                case 1: registrarEstudiante(scanner);      break;
                case 2: mostrarTodosLosRegistros();         break;
                case 3: buscarEstudiantePorNombre(scanner); break;
                case 4: calcularPromedioGeneral();           break;
                case 5: mostrarEstadisticas();               break;
                case 0: mostrarDespedida();                  break;
                default:
                    System.out.println(" Opción no válida. Elige entre 0 y 5.");
            }
        }
        scanner.close();
    }
}
