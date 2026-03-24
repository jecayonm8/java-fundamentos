package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public abstract class Animal {
    
    //atributos protegidos - accesibles por todas las clases hijas
    protected String nombre;
    protected int edad;
    protected String especie;
    protected String habitat;

    //constructor
    public Animal(String nombre, int edad, String especie, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.habitat = habitat;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getHabitat() {
        return habitat;
    }


    //Metodos abstractos
    public abstract void hacerSonido();
    public abstract void moverse();
    public abstract String obtenerDieta();

    //Metodos concretos
    public void dormir() {
        System.out.println(nombre + "esta durmiendo");
    }

    public void comer() {
        System.out.println(nombre + "esta comiendo" + obtenerDieta());
    }

    public void obtenerInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Especie: " + especie);
        System.out.println("Habitat: " + habitat);
    }


}
