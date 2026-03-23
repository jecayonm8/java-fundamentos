package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaEmpleadosJerarquia;

public class Gerente extends Empleado{
    //atributo adicional
    private int equipoACargo;

    //constructor con super
    public Gerente(String nombre, String id, double salarioBase, String fechaIngreso, int equipoACargo) {
        super(nombre, id, salarioBase, fechaIngreso);
        this.equipoACargo = equipoACargo;
    }

    //getters
    public int getEquipoACargo() {
        return equipoACargo;
    }
    

    //metodo de calcularSalario() para Gerente
    @Override
    public double calcularSalario() {
        return salarioBase + (equipoACargo * 200);
    }
    

    //Implementacion de la interface Trabajable
    @Override
    public void trabajar() {
        System.out.println("Gestionando equipo de " + equipoACargo + "personas y tomando decisiones.");
    }

    @Override
    public void tomarDescanso() {
        System.out.println(nombre + "toma un descanso");
    }

    @Override
    public String obtenerTareas() {
        return "Gestionando equipo y tomando decisiones";
    }

    @Override
    public String toString() {
        return String.format("[GERENTE] %s - Salario: $%.2f", nombre, calcularSalario());
    }

    




    



    

    

    
    

    
    
}
