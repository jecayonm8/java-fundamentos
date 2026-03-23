package JavaJuniorDeveloper.Ejemplos;

public class EjemploBasicoMetodosJavapublic {
    
    // Método sin retorno (void)
    public static void saludar() {
        System.out.println("¡Hola desde un método!");
    }

    // Método con retorno
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método con parámetros múltiples
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    // Método principal
    public static void main(String[] args) {
        // Llamadas a métodos
        saludar();

        int resultado = sumar(5, 3);
        System.out.println("La suma es: " + resultado);

        double area = calcularArea(5.0);
        System.out.printf("El área es: %.2f%n", area);
    }

}
