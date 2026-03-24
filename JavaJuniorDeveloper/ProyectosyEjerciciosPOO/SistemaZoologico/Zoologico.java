package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public class Zoologico {
    
    private Animal[] animales;
    private int      totalAnimales;
    private String   nombre;

    public Zoologico(String nombre, int capacidadMaxima) {
        this.nombre        = nombre;
        this.animales      = new Animal[capacidadMaxima];
        this.totalAnimales = 0;
    }

    // Agrega un animal al zoológico
    public void agregarAnimal(Animal animal) {
        if (totalAnimales >= animales.length) {
            System.out.println("⚠️  El zoológico está lleno. Capacidad máxima: " + animales.length);
            return;
        }
        animales[totalAnimales] = animal;
        totalAnimales++;
        System.out.println("✅ " + animal.getNombre() + " agregado al zoológico.");
    }

    // Alimenta a todos los animales — polimorfismo en acción
    public void alimentarTodos() {
        System.out.println("\n🍖 Hora de alimentar a todos los animales...\n");
        for (int i = 0; i < totalAnimales; i++) {
            animales[i].comer(); // cada uno ejecuta su propia versión
        }
    }

    // Recorre el zoológico mostrando cada animal
    public void hacerRecorrido() {
        System.out.println("\n=== RECORRIDO POR EL ZOOLÓGICO: " + nombre + " ===\n");
        for (int i = 0; i < totalAnimales; i++) {
            System.out.println(animales[i]);       // toString de cada animal
            animales[i].hacerSonido();             // sonido específico
            animales[i].moverse();                 // movimiento específico
            System.out.println();
        }
    }

    // Todos duermen
    public void dormirTodos() {
        System.out.println("\n💤 Todos los animales están durmiendo...\n");
        for (int i = 0; i < totalAnimales; i++) {
            animales[i].dormir();
        }
    }

    // Muestra info completa de todos
    public void mostrarCenso() {
        System.out.println("\n📋 CENSO DEL ZOOLÓGICO — " + nombre);
        System.out.println("Total de animales: " + totalAnimales);
        System.out.println("─────────────────────────────────────");
        for (int i = 0; i < totalAnimales; i++) {
            animales[i].obtenerInfo();
        }
    }
}
