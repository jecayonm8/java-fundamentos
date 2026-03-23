package JavaJuniorDeveloper.EjerciciosyProyectosPracticos;

import java.util.Scanner;

// Proyecto: Biblioteca de Funciones Matemáticas
// Desarrollar una aplicacion modular que demuestre el uso de metodos.
// Objetivo: Aplicar modularidad y reutilización de código mediante funciones/métodos.
public class ProyectoBibliotecaFuncionesMate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("=== PROYECTO: BIBLIOTECA DE FUNCIONES MATEMÁTICAS ===");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Verificar si es numero par");
            System.out.println("3. Convertir temperatura");
            System.out.println("4. Calcular el factorial de un número");
            System.out.println("5. Generar tabla de multiplicar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;
                case 2:
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    if (esPar(numero)) {
                        System.out.println(numero + " es un número par.");
                    } else {
                        System.out.println(numero + " es un número impar.");
                    }
                    break;
                case 3:
                    if (opcion == 3) {
                        
                        System.out.println("1. Celsius a Fahrenheit");
                        System.out.println("2. Fahrenheit a Celsius");
                        System.out.println("Selecciona la conversion deseada: ");

                        int conversion = scanner.nextInt();

                        if(conversion == 1) {
                            System.out.println("Ingresa una temperatura en grados Celsius: ");
                            double celsius = scanner.nextDouble();
                            double fahrenheit = convertirCelsiusAFahrenheit(celsius);
                            System.out.println(celsius + " °C es igual a " + fahrenheit + " °F.");

                        } else if(conversion == 2) {
                            System.out.println("Ingresa una temperatura en grados Fahrenheit: ");
                            double fahrenheit = scanner.nextDouble();
                            double celsius = convertirFahrenheitACelsius(fahrenheit);
                            System.out.println(fahrenheit + " °F es igual a " + celsius + " °C.");
                        }
                    }
                    break;
                   
                case 4:
                    System.out.println("Ingrese un número para calcular su factorial: ");
                    long n = scanner.nextLong();
                    long resultadoFactorial = calcularFactorial(n);
                    System.out.println("El factorial de " + n + " es: " + resultadoFactorial);
                    break;
                case 5:
                    System.out.println("Ingrese un número para generar su tabla de multiplicar: ");
                    int tabla = scanner.nextInt();
                    generarTablaMultiplicar(tabla);
                    break;

                case 0:
                    System.out.println("Hasta pronto! Gracias por usar la biblioteca de funciones matemáticas.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
        

    }

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Función para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    //Funcion para convertir temperatura de Celsius a Fahrenheit.
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Funcion para convertir temperatura de Fahrenheit a Celsius.
    public static double convertirFahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Función para calcular el factorial de un número
    public static long calcularFactorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException( "El número debe ser no negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

    // Función para generar la tabla de multiplicar de un número
    // con void porque solo imprime resultados, no devuelve nada.
    public static void generarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}
