package EjerciciosPracticos;
import java.util.Scanner;

public class ValidadorContraseña {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        //Este programa debe solicitar al usuario que ingrese una contraseña y luego validar si cumple con los siguientes criterios:
        // -La contraseña debe tener al menos 8 caracteres.
        // -La contraseña debe contener al menos una letra mayúscula.
        // -La contraseña debe contener al menos una letra minúscula.
        // -La contraseña debe contener al menos un número.

        //Mostrar resultado de cada validación utilizando(true o false)
        //Mostrar si la contraseña es segura o no.
        //Opcional: mensaje claro indicando si la contraseña es válida o no, y en caso de no ser válida, indicar qué criterios no se cumplen.
        //Usar la clase Scanner para obtener la entrada de datos del usuario
        //Resultado esperado: 
        //
        // ------------------------------------------------------------------

        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la contraseña al usuario
        System.out.print("Ingrese una contraseña: ");
        String password = scanner.nextLine();

        // ─────────────────────────────────────────
        // 2. VALIDACIÓN 1 — Longitud mínima de 8
        // ─────────────────────────────────────────
        boolean longitudValida = password.length() >= 8;

        // ─────────────────────────────────────────
        // 3. VALIDACIÓN 2 — Tiene mayúscula
        // Si al convertir a minúscula cambia → había mayúsculas
        // ─────────────────────────────────────────
        boolean tieneMayuscula = !password.equals(password.toLowerCase());

        // ─────────────────────────────────────────
        // 4. VALIDACIÓN 3 — Tiene minúscula
        // Si al convertir a mayúscula cambia → había minúsculas
        // ─────────────────────────────────────────
        boolean tieneMinuscula = !password.equals(password.toUpperCase());

        // ─────────────────────────────────────────
        // 5. VALIDACIÓN 4 — Tiene número
        // Se Recorre cada carácter buscando algún dígito
        // ─────────────────────────────────────────
        boolean tieneNumero = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                tieneNumero = true;
                break; // Con encontrar uno es suficiente
            }
        }

        // ─────────────────────────────────────────
        // 6. RESULTADO FINAL password — Aca se debe cumplir TODAS las validaciones anteriores.
        // ─────────────────────────────────────────
        boolean contrasenaSegura = longitudValida && tieneMayuscula && tieneMinuscula && tieneNumero;

        // ─────────────────────────────────────────
        // 7. MOSTRAR RESULTADOS
        // ─────────────────────────────────────────
        System.out.println("Longitud válida (>=8): " + longitudValida);
        System.out.println("Tiene mayúscula: "       + tieneMayuscula);
        System.out.println("Tiene minúscula: "       + tieneMinuscula);
        System.out.println("Tiene número: "          + tieneNumero);
        System.out.println("Contraseña segura: "     + contrasenaSegura);
        System.out.println();
        if (contrasenaSegura) {
            System.out.println("¡Muy Bien, Contraseña segura y valida!");
        } else {
            System.out.println("Contraseña no válida. Recuerda cumplir con TODOS los criterios anteriores.");
        }
        
        scanner.close();



    }
    
}
