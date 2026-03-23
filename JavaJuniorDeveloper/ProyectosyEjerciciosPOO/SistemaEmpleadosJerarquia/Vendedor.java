package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaEmpleadosJerarquia;

public class Vendedor extends Empleado {
    //atributos
    private double ventasMes;
    private double comision; // porcentaje ej: 10=10%

    //constructor con super
    public Vendedor(String nombre, String id, double salarioBase, String fechaIngreso, double ventasMes,
            double comision) {
        super(nombre, id, salarioBase, fechaIngreso);
        this.ventasMes = ventasMes;
        this.comision = comision;
    }
    
    //getters
    public double getVentasMes() {
        return ventasMes;
    }

    public double getComision() {
        return comision;
    }


    //metodo formula para calcular salario de vendeddor.
    @Override
    public double calcularSalario() {
       return  salarioBase + (ventasMes * comision / 100);
    }

    // Implementación de la interface Trabajable
    @Override
    public void trabajar() {
        System.out.printf("Trabajando: Vendió $%.0f este mes%n", ventasMes);
    }

    @Override
    public void tomarDescanso() {
        System.out.println(nombre + " toma un descanso revisando sus contactos.");
    }

    @Override
    public String obtenerTareas() {
        return "Contactando clientes y cerrando ventas";
    }

    @Override
    public String toString() {
        return String.format("[VENDEDOR] %s - Salario: $%.2f", nombre, calcularSalario());
    }
    
}
