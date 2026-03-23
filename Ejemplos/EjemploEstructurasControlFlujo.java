package Ejemplos;
class EjemploEstructurasControlFlujo {

    //ejemplos de estructuras de control de flujo en Java
    public static void main(String[] args) {

        // Ejemplo de if-else
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        // Ejemplo de switch-case
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }

        // Ejemplo de bucle for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // Ejemplo de bucle while
        int contador = 0;
        while (contador < 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        
    }
}