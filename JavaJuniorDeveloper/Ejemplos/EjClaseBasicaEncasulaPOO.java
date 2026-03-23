package JavaJuniorDeveloper.Ejemplos;

public class EjClaseBasicaEncasulaPOO {

    static class Persona {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private int edad;
    private String email;

     // Constructor por defecto
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.email = "sin@email.com";
    }

    // Constructor parametrizado
    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setters con validación
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    // Método de comportamiento
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }

    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear objetos
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Ana", 25, "ana@email.com");

        // Usar métodos
        persona1.presentarse();
        persona2.presentarse();
    }
        
}
