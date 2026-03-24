package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public class Pinguino extends Ave {

    private double velocidadNadoKmH;

    public Pinguino(String nombre, int edad) {
        super(nombre, edad, "Aptenodytes forsteri", "Antártida", 0.9, false); // no puede volar
        this.velocidadNadoKmH = 36.0;
    }

    @Override
    public void hacerSonido() {
        System.out.println("🐧 " + nombre + ": ¡Squawk! ¡Squawk!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se desliza sobre el hielo y luego nada velozmente. 🌊");
    }

    @Override
    public String obtenerDieta() {
        return "Peces, calamares y kril";
    }

    // Métodos específicos del Pingüino
    public void nadar() {
        System.out.println(nombre + " nada a " + velocidadNadoKmH
                + " km/h bajo el agua. 🏊");
    }

    public void deslizarse() {
        System.out.println(nombre + " se desliza sobre su panza en el hielo. 🧊");
    }

    @Override
    public String toString() {
        return String.format("🐧 Pingüino (%s, %d años)", nombre, edad);
    }
    
}
