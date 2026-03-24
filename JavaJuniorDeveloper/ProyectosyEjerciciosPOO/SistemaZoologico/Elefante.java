package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public class Elefante extends Mamifero{
    
    private double longitudTrompaMetros;

    public Elefante(String nombre, int edad) {
        super(nombre, edad, "Loxodonta africana", "Sabana y bosque", 5000.0);
        this.longitudTrompaMetros = 2.0;
    }

    @Override
    public void hacerSonido() {
        System.out.println("🐘 " + nombre + ": ¡PFFFRRRR!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " camina pesadamente sacudiendo la tierra. 🌍");
    }

    @Override
    public String obtenerDieta() {
        return "Frutas, vegetales, hojas y corteza de árboles";
    }

    // Métodos específicos del Elefante
    public void usarTrompa() {
        System.out.println(nombre + " usa su trompa de " + longitudTrompaMetros
                + "m para beber agua y recoger comida. 🌊");
    }

    public void recordarCamino() {
        System.out.println(nombre + " recuerda la ruta al pozo de agua. Los elefantes nunca olvidan. 🧠");
    }

    public void trompetear() {
        System.out.println("🐘 " + nombre + " trompetea alertando a la manada.");
    }

    @Override
    public String toString() {
        return String.format("🐘 Elefante (%s, %d años)", nombre, edad);
    }
}
