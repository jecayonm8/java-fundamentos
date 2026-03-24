package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public abstract class Ave extends Animal {

    protected double envergaduraMetros; // longitud de las alas extendidas
    protected boolean puedeVolar;

    public Ave(String nombre, int edad, String especie, String habitat,
               double envergaduraMetros, boolean puedeVolar) {
        super(nombre, edad, especie, habitat);
        this.envergaduraMetros = envergaduraMetros;
        this.puedeVolar        = puedeVolar;
    }

    public boolean puedeVolar() { return puedeVolar; }

    // Comportamiento común de aves
    public void empollar() {
        System.out.println(nombre + " está empollando sus huevos. 🥚");
    }

    
    
}
