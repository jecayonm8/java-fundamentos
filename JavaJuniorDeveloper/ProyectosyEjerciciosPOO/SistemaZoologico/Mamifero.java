package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaZoologico;

public abstract class Mamifero extends Animal {

    protected double pesoKg;

    

    public Mamifero(String nombre, int edad, String especie, String habitat, double pesoKg) {
        super(nombre, edad, especie, habitat);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }


    @Override
    public void hacerSonido() {
        
    }

    @Override
    public void moverse() {
        
    }



    
    
    
}
