package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public class Leon extends Mamifero {

    private int horasSuenoDiario;

    public Leon(String nombre, int edad) {
        super(nombre, edad, "Panthera leo", "Sabana africana", 190.0);
        this.horasSuenoDiario = 16;
    }

    @Override
    public void hacerSonido() {
        System.out.println("🦁 " + nombre + ": ¡ROAAAAR!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está cazando en la sabana 🌾");
    }

    @Override
    public String obtenerDieta() {
        return "Carne — caza cebras, ñus y antílopes";
    }

    // Métodos específicos del León
    public void rugir() {
        System.out.println("🦁 " + nombre + " ruge con toda su fuerza. Se escucha a 8 km.");
    }

    public void cazar() {
        System.out.println(nombre + " está cazando su presa sigilosamente. 🎯");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " duerme " + horasSuenoDiario + " horas al día. 💤");
    }

    @Override
    public String toString() {
        return String.format("🦁 León (%s, %d años)", nombre, edad);
    }


    
}
