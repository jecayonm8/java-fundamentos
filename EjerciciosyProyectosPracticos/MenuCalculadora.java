package EjerciciosyProyectosPracticos;

import java.util.Scanner;

// ------------------------------------------------------------------
    //Este programa debe mostrar un menú al usuario con las siguientes opciones y/o requisitos:
    //- Calcular área de un círculo (π × radio²)
    //- Calcular área de un rectángulo (base × altura)
    //- Calcular área de un triángulo ( base × altura x 0.5) o ((base × altura) / 2)
    //- Calcular área de un cuadrado (lado × lado) o (lado²)
    //- Verificar si un numero es primo o no
    //- Calcular edad futura (edad actual + años a sumar)
    //- Salir del programa
    //Caracteristicas tecnicas:
    //- Usar switch-case para manejar las opciones del menú
    //- implementar validacion basica de entradas
    //- El programa debe repetirse hasta que el usuario elija salir
    //- Para numeros primos: validar que solo numeros mayores a 1 puedan ser primos
    //- Usar la constante Math.PI para el calculo del area del circulo
    //Algoritmo para numero primo: Un número es primo si solo es divisible por 1 y por sí mismo, Verificar divisiones desde 2 hasta la raíz cuadrada del número,
    //Si encuentra algún divisor, no es primo.
    //Resultado esperado:
    //Bienvenid@ a la Calculadora GEOMETRICA(Áreas y Primos).
    //1. Área de un círculo
    //2. Área de un rectángulo
    //3. Área de un triángulo
    //4. Área de un cuadrado
    //5. Verificar si un número es primo
    //6. Calcular edad futura
    //0. Salir
    //Ingrese su opción: 1
    //Ingrese el radio del círculo: 5
    //El área del círculo es: 78.54
    // ------------------------------------------------------------------

public class MenuCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        // ─────────────────────────────────────────
        // LOOP PRINCIPAL — se repite hasta elegir 0
        // ─────────────────────────────────────────
        while (opcion != 0) {

            // Mostrar menú
            System.out.println("\n=== CALCULADORA GEOMÉTRICA ===");
            System.out.println("1. Área de un círculo");
            System.out.println("2. Área de un rectángulo");
            System.out.println("3. Área de un triángulo");
            System.out.println("4. Verificar si un número es primo");
            System.out.println("5. Calcular edad futura");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // ─────────────────────────────────────────
            // SWITCH — dirige a cada funcionalidad
            // ─────────────────────────────────────────
            switch (opcion) {

                // ── OPCIÓN 1: Área del círculo ──
                case 1:
                    System.out.print("Ingrese el radio: ");
                    double radio = scanner.nextDouble();

                    if (radio <= 0) {
                        System.out.println("❌ El radio debe ser mayor a 0.");
                    } else {
                        double areaCirculo = Math.PI * radio * radio;
                        System.out.printf("El área del círculo es: %.2f%n", areaCirculo);
                    }
                    break;

                // ── OPCIÓN 2: Área del rectángulo ──
                case 2:
                    System.out.print("Ingrese la base: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double alturaRect = scanner.nextDouble();

                    if (baseRect <= 0 || alturaRect <= 0) {
                        System.out.println("❌ La base y la altura deben ser mayores a 0.");
                    } else {
                        double areaRectangulo = baseRect * alturaRect;
                        System.out.printf("El área del rectángulo es: %.2f%n", areaRectangulo);
                    }
                    break;

                // ── OPCIÓN 3: Área del triángulo ──
                case 3:
                    System.out.print("Ingrese la base: ");
                    double baseTri = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double alturaTri = scanner.nextDouble();

                    if (baseTri <= 0 || alturaTri <= 0) {
                        System.out.println("❌ La base y la altura deben ser mayores a 0.");
                    } else {
                        double areaTriangulo = baseTri * alturaTri * 0.5; // o (baseTri * alturaTri) / 2
                        System.out.printf("El área del triángulo es: %.2f%n", areaTriangulo);
                    }
                    break;

                // ── OPCIÓN 4: Número primo ──
                case 4:
                    System.out.print("Ingrese un número entero: ");
                    int numero = scanner.nextInt();

                    // Validar que sea mayor a 1
                    if (numero <= 1) {
                        System.out.println("❌ Solo números mayores a 1 pueden ser primos.");
                    } else {
                        boolean esPrimo = true;

                        // Verificar divisores desde 2 hasta √numero
                        for (int i = 2; i <= Math.sqrt(numero); i++) {
                            if (numero % i == 0) {
                                esPrimo = false;
                                break; // Ya encontramos un divisor, no necesitamos seguir
                            }
                        }

                        if (esPrimo) {
                            System.out.println(numero + " ✅ ES un número primo.");
                        } else {
                            System.out.println(numero + " ❌ NO es un número primo.");
                        }
                    }
                    break;

                // ── OPCIÓN 5: Edad futura ──
                case 5:
                    System.out.print("Ingrese su edad actual: ");
                    int edadActual = scanner.nextInt();
                    System.out.print("¿En cuántos años quiere calcular su edad? ");
                    int anios = scanner.nextInt();

                    if (edadActual <= 0 || anios <= 0) {
                        System.out.println("❌ La edad y los años deben ser mayores a 0.");
                    } else {
                        int edadFutura = edadActual + anios;
                        System.out.println("En " + anios + " años tendrás: " + edadFutura + " años.");
                    }
                    break;

                // ── OPCIÓN 0: Salir ──
                case 0:
                    System.out.println("👋 ¡Hasta luego!");
                    break;

                // ── Opción inválida ──
                default:
                    System.out.println("⚠️  Opción no válida. Por favor elige entre 0 y 5.");
            }
        }

        scanner.close();
    }

}
