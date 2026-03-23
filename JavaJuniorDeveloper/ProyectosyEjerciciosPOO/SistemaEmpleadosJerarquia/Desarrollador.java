package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaEmpleadosJerarquia;

public class Desarrollador extends Empleado{
    //atributos
    private String lenguajePrincipal;
    private int experienciaAños;


    public Desarrollador(String nombre, String id, double salarioBase, String fechaIngreso, String lenguajePrincipal,
            int experienciaAños) {
        super(nombre, id, salarioBase, fechaIngreso);
        this.lenguajePrincipal = lenguajePrincipal;
        this.experienciaAños = experienciaAños;
    }

    //getters
    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public int getExperienciaAños() {
        return experienciaAños;
    }



    //metodo formula calcular salario desarrollador
    @Override
    public double calcularSalario() {
        return salarioBase + (experienciaAños*100);
    }


   // Implementación de la interface Trabajable
    @Override
    public void trabajar() {
        System.out.println("Trabajando: Programando en " + lenguajePrincipal
                + " con " + experienciaAños + " años de experiencia");
    }

    @Override
    public void tomarDescanso() {
        System.out.println(nombre + " toma un descanso");
    }

    @Override
    public String obtenerTareas() {
        return "Escribiendo código y resolviendo bugs";
    }

    @Override
    public String toString() {
        return String.format("[DESARROLLADOR] %s - Salario: $%.2f", nombre, calcularSalario());
    }
    

    
    
}
