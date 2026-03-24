package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public class Jirafa extends Mamifero {

    private double alturaMetros;

    public Jirafa(String nombre, int edad) {
        super(nombre, edad, "Giraffa camelopardalis", "Sabana africana", 800.0);
        this.alturaMetros = 5.5;
    }

    @Override
    public void hacerSonido() {
        System.out.println("🦒 " + nombre + ": (sonido suave y grave) Hmmm...");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " camina elegantemente con sus largas patas. 🦒");
    }

    @Override
    public String obtenerDieta() {
        return "Hojas de acacia y otros árboles altos";
    }

    // Métodos específicos de la Jirafa
    public void comerHojasAltas() {
        System.out.println(nombre + " estira su cuello de 2m para alcanzar hojas a "
                + alturaMetros + "m de altura. 🌿");
    }

    public void observarHorizonte() {
        System.out.println(nombre + " observa el horizonte desde su gran altura. 👀");
    }

    @Override
    public String toString() {
        return String.format("🦒 Jirafa (%s, %d años)", nombre, edad);
    }
    
}
