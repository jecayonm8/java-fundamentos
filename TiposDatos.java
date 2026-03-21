public class TiposDatos {
    public static void main(String[] args) {
        
        //Tipos de datos primitivos
        int numeroEntero = 8;
        double numeroDecimal = 3.14159;
        boolean esVerdadero = true;
        char letra = 'J';

        //Tipos referencia
        String texto = "Hola Java, soy un tipo de dato referencia";

        //Tipo constante
        final double numeroPI = 3.14159;
        final int DIAS_AÑO = 365;

        //operadores aritmeticos
        int suma1 = 4 + 4; //8
        int suma2= numeroEntero + 4; //12
        double suma3= numeroDecimal + 8.0; //11.14159
        int resta1 = 10 - 2; //8
        int resta2 = numeroEntero - 3; //5
        int multiplicacion1 = 5 * 6; //30
        double multiplicacion2 = numeroDecimal * 2; //6.28318
        int division1 = 20 / 2; //10
        double division2 = numeroDecimal / 2; //1.570795
        int modulo1 = 10 % 3; //1
        int modulo2 = numeroEntero % 3; //2

        //Operadores relacionales
        boolean mayor = 10 > 5; //true
        boolean menor = 3 < 7; //true
        boolean igual = 5 == 5; //true
        boolean esMayor = numeroEntero > 5; //true
        boolean diferente1 = 10 != 5; //true
        boolean diferente2 = 10 != 10; //false

        //operadores logicos
        boolean and = true && false; //false
        boolean or = true || false; //true
        boolean not = !true; //false
        boolean and2 = (numeroEntero > 5) && (numeroDecimal < 4.0); //true
        boolean or2 = (10 < 5) || (4.0 > 3.0); //true
        boolean not2 = !(9 > 5); //false

        //conversiones de tipos
        double decimalDesdeEntero = numeroEntero; //8.0  --> Implicita
        int enteroDesdeDecimal = (int) numeroDecimal; //3  --> Explicita

        //Salidas por consola de algunas variables
        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Numero decimal:" + numeroDecimal);
        System.out.println("Es verdadero: " + esVerdadero);
        System.out.println("Letra: " + letra);
        System.out.println("Texto: " + texto);
        System.out.println("Número PI: " + numeroPI);
        System.out.println("Días en un año: " + DIAS_AÑO);
        System.out.println("Suma1: " + suma1);
        System.out.println("Resta1: " + resta1);
        System.out.println("Multiplicación1: " + multiplicacion1);
        System.out.println("División1: " + division1);
        System.out.println("Módulo1: " + modulo1);
        System.out.println("Mayor: " + mayor);
        System.out.println("And: " + and);
        System.out.println("Decimal desde entero: " + decimalDesdeEntero);
        System.out.println("Entero desde decimal: " + enteroDesdeDecimal);

    }
}
