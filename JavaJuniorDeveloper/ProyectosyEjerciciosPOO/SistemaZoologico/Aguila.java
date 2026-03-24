package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public class Aguila extends Ave{

    private double alturaVueloMetros;

    public Aguila(String nombre, int edad) {
        super(nombre, edad, "Aquila chrysaetos", "Montañas y cielos abiertos", 2.3, true);
        this.alturaVueloMetros = 3000.0;
    }

    @Override
    public void hacerSonido() {
        System.out.println("🦅 " + nombre + ": ¡SCREECH!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " vuela a gran altura planeando sin esfuerzo. 🌤️");
    }

    @Override
    public String obtenerDieta() {
        return "Peces, pequeños mamíferos y reptiles";
    }

    // Métodos específicos del Águila
    public void volarAlto() {
        System.out.println(nombre + " asciende a " + alturaVueloMetros
                + "m de altura con sus alas de " + envergaduraMetros + "m. ✈️");
    }

    public void cazarDesdeElAire() {
        System.out.println(nombre + " divisa su presa desde el aire y se lanza en picada. 🎯");
    }

    @Override
    public String toString() {
        return String.format("🦅 Águila (%s, %d años)", nombre, edad);
    }
    
}
