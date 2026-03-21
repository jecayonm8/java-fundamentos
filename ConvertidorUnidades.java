import java.util.*;

public class ConvertidorUnidades {
    
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        //Este programa debe solicitar al usuario que ingrese:
        // -Una cantidad en metros(convertir a cm)
        // -Una cantidad en kilómetros(convertir a libras)
        // -Una temperatura en grados Celsius(convertir a Fahrenheit)

        //Realizar los calculos usando las sgts formulas:
        // -Metros a centímetros: cm = metros * 100
        // -Kilómetros a libras: libras = kilómetros * 2.20462
        // -Celsius a Fahrenheit: F = (C * 9/5) + 32

        //Mostrar los resultados con formato claro y legible para el usuario.
        //Usar variables del tipo correcto para cada dato
        //Usar la clase Scanner para obtener la entrada de datos del usuario
        //Resultado esperado: 
        //Ingrese metros: 2.52.5 metros = 250.0 centímetros
        //Ingrese kilogramos: 7070.0 kg = 154.3234 libras
        //Ingrese Celsius: 2525.0 °C = 77.0 °F
        // ------------------------------------------------------------------
        //Declarar o definir variables para almacenar las entradas del usuario y los resultados.
        double metros = 0;
        double kilogramos = 0.0;
        double celsius = 0.0;
        double centimetros = 0.0;
        double libras = 0.0;
        double fahrenheit = 0.0;


        //Importar la clase Scanner
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Bienvenid@ al ¡Convierte tus unidades rapido!" + "\nPor favor, simplemente ingresa los valores que deseas convertir y obtendras resultados al instante." 
            + "\n ¡Recuerda! por ahora solo:" + "\n -Metros a centímetros" + "\n -Kilómetros a libras" + "\n -Celsius a Fahrenheit"
        );
        //Solicitar al usuario que ingrese una cantidad en metros;
        System.out.print("Ingrese una cantidad en metros: ");
        metros = scanner.nextDouble();
        //Solicitar al usuario que ingrese una cantidad en kilógramos;
        System.out.print("Ingrese una cantidad en kilógramos: ");
        kilogramos = scanner.nextDouble();
        //Solicitar al usuario que ingrese una temperatura en grados Celsius;
        System.out.print("Ingrese una temperatura en grados Celsius: ");
        celsius = scanner.nextDouble();

        //Realizar los cálculos
        centimetros = metros * 100;
        libras = kilogramos * 2.20462;
        fahrenheit = (celsius * 9/5) + 32;

        //Mostrar los resultados
        System.out.println("RESULTADOS:");
        System.out.println(metros + " metros son " + centimetros + " centímetros.");
        System.out.println(kilogramos + " kg(Kilogramos) son " + libras + " libras.");
        System.out.println(celsius + " °C(grados Celsius) son " + fahrenheit + " °F(grados Fahrenheit).");

        //Cerrar el scanner
        scanner.close();
    
    }
}
