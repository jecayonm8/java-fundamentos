package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public class ZoologicoTest {
    
    public static void main(String[] args) {

        // Crear el zoológico
        Zoologico zoo = new Zoologico("Safari Park", 10);

        // ─────────────────────────────────────────
        // Crear y agregar animales
        // ─────────────────────────────────────────
        System.out.println("── Registrando animales ──\n");

        Leon     simba  = new Leon    ("Simba",  5);
        Elefante dumbo  = new Elefante("Dumbo",  12);
        Jirafa   melman = new Jirafa  ("Melman", 7);
        Aguila   altair = new Aguila  ("Altair", 3);
        Pinguino tux    = new Pinguino("Tux",    4);

        zoo.agregarAnimal(simba);
        zoo.agregarAnimal(dumbo);
        zoo.agregarAnimal(melman);
        zoo.agregarAnimal(altair);
        zoo.agregarAnimal(tux);

        // ─────────────────────────────────────────
        // Recorrido — polimorfismo general
        // ─────────────────────────────────────────
        zoo.hacerRecorrido();

        // ─────────────────────────────────────────
        // Alimentar a todos
        // ─────────────────────────────────────────
        zoo.alimentarTodos();

        // ─────────────────────────────────────────
        // Métodos específicos con cast
        // ─────────────────────────────────────────
        System.out.println("\n── 🎯 Comportamientos específicos ──\n");

        simba.rugir();
        simba.cazar();

        dumbo.usarTrompa();
        dumbo.recordarCamino();

        melman.comerHojasAltas();
        melman.observarHorizonte();

        altair.volarAlto();
        altair.cazarDesdeElAire();

        tux.nadar();
        tux.deslizarse();

        // ─────────────────────────────────────────
        // Dormir todos
        // ─────────────────────────────────────────
        zoo.dormirTodos();

        // ─────────────────────────────────────────
        // Censo completo
        // ─────────────────────────────────────────
        zoo.mostrarCenso();
    }
}
