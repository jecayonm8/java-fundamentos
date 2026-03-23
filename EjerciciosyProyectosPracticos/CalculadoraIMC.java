package EjerciciosyProyectosPracticos;
import java.util.Scanner;

public class CalculadoraIMC {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar datos
        double peso, altura, imc;
        boolean datosValidos = false;

        // Validación de peso
        do {
            System.out.print("Ingrese su peso en kg (entre 1 y 500): ");
            peso = scanner.nextDouble();

            if (peso > 0 && peso <= 500) {
                datosValidos = true;
            } else {
                System.out.println("Error: El peso debe estar entre 1 y 500 kg");
                datosValidos = false;
            }
        } while (!datosValidos);

        // Validación de altura
        datosValidos = false;
        do {
            System.out.print("Ingrese su altura en metros (entre 0.5 y 3.0): ");
            altura = scanner.nextDouble();

            if (altura >= 0.5 && altura <= 3.0) {
                datosValidos = true;
            } else {
                System.out.println("Error: La altura debe estar entre 0.5 y 3.0 metros");
                datosValidos = false;
            }
        } while (!datosValidos);

        // Cálculo del IMC
        imc = peso / (altura * altura);

        // Expresiones booleanas complejas para clasificación
        boolean bajoPeso = imc < 18.5;
        boolean pesoNormal = imc >= 18.5 && imc < 25;
        boolean sobrepeso = imc >= 25 && imc < 30;
        boolean obesidad = imc >= 30;

        // Mostrar resultados
        System.out.printf("Su IMC es: %.2f%n", imc);

        if (bajoPeso) {
            System.out.println("Clasificación: Bajo peso");
        } else if (pesoNormal) {
            System.out.println("Clasificación: Peso normal");
        } else if (sobrepeso) {
            System.out.println("Clasificación: Sobrepeso");
        } else if (obesidad) {
            System.out.println("Clasificación: Obesidad");
        }

        scanner.close();

    }
}
