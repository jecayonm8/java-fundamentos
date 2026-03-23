package EjerciciosyProyectosPracticos;
//CALCULADORA FUNCIONAL CON TODAS LAS OPERACIONES Y MANEJO ERRORES.
//Enunciado: Desarrollar una calculadora con múltiples operaciones y manejo de errores
//Objetivo: Aplicar estructuras de control complejas y depuración de errores.
//Requisitos a implementar:
//- Implementar un menú con las siguientes opciones: Suma, resta, multiplicación, división, Potencia (usar Math.pow()), Raíz cuadrada (usar Math.sqrt()), Opción para salir.  
//- Manejar casos especiales: División por cero (mostrar error), Raíz cuadrada de número negativo (mostrar error) y Entrada no numérica (manejar el error).
//- Después de cada operación, preguntar si desea continuar
//- Usar switch-case para el menú
//- Mostrar resultados con 2 decimales
//Características requeridas: Menu repetitivo, Validacion de entradas incorrectas, Mensajes de error claros y especificos y Formato profesional en la salida.

import java.util.Scanner;

//Estructura programa en 3 capas logicas: 
// LOOP(while) --> MENU(Switch-case) --> LOGICA cada opcion. 
public class CalculadoraAvanzada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        // LOOP PRINCIPAL
        while (opcion != 0) {
            //mostrar menu
            System.out.println("\n=== Bienvenid@ a CALCULADORA AVANZADA ===");
            System.out.println("1. Suma    (+)");
            System.out.println("2. Resta   (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            System.out.println("5. Potencia (^)");
            System.out.println("6. Raíz cuadrada (√)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            //validar que la opcion sea un numero
            if (!scanner.hasNextInt()){
                System.out.println("Por favor ingresa un numero del menu.");
                scanner.next(); //limpia entrada invalida
                continue; //vuelve al inicio del loop(while)
            }

            opcion = scanner.nextInt();

            //opcion salir
            if (opcion == 0) {
                System.out.println("¡Hasta pronto! Gracias por usar la calculadora.");
                break; //sale del loop(while)
            }

            //opcion invalida
            if (opcion < 0 || opcion > 6) {
                System.out.println("Opcion no valida. Elige solo entre 0 y 6. Por ahora :)");
                continue; //vuelve al inicio del loop(while)
            }

            //Raiz cuadrada - solo pide 1 numero.
            if (opcion == 6) {
                System.out.println("Ingresa el numero: ");

                if(!scanner.hasNextDouble()) {
                    System.out.println("Entrada no numerica. Por favor ingresa un numero valido.");
                    scanner.next(); //limpia entrada invalida
                    continue; //vuelve al inicio del loop(while)
                }

                double numero = scanner.nextDouble();
                
                if (numero < 0) {
                    System.out.println("Error: No existe raiz cuadrada de un numero negativo.");
                } else {
                     double resultado = Math.sqrt(numero);
                     System.out.printf("√%.2f = %.2f%n", numero, resultado);
                }
            } else {
                //Las demas piden 2 numeros.

                System.out.println("Primer numero: ");
                if(!scanner.hasNextDouble()) {
                    System.out.println("Entrada no numerica. ");
                    scanner.next(); //limpia entrada invalida
                    continue; //vuelve al inicio del loop(while)
                }
                double num1 = scanner.nextDouble();

                System.out.println("Segundo numero: ");
                 if(!scanner.hasNextDouble()) {
                    System.out.println("Entrada no numerica. ");
                    scanner.next(); //limpia entrada invalida
                    continue; //vuelve al inicio del loop(while)
                }
                double num2 = scanner.nextDouble();

                //SWITCH-CASE- ejecute la logica de cada opcion
                switch(opcion) {

                    case 1: //suma
                        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                        break;
                    case 2: //resta
                        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                        break;
                    case 3: //multiplicacion
                        System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                        break;
                    case 4: //division
                        if (num2 == 0) {
                            System.out.println("Error: No se puede dividir por cero.");
                        } else {
                            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                        }
                        break;
                    case 5: //potencia
                        double potencia = Math.pow(num1, num2);
                        System.out.printf("%.2f ^ %.2f = %.2f%n", num1, num2, potencia);
                        break;
                }
            }
            //preguntar si desea continuar
            System.out.println("¿Desea realizar otra operación? (s/n)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("¡Hasta pronto! Gracias por usar la calculadora.");
                break; //sale del loop(while)
            }
        }
        scanner.close();
    }
    
}
