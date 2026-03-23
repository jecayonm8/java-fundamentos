package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaEmpleadosJerarquia;

public class Vendedor extends Empleado {
    //atributos
    private double ventasMes;
    private double comision;

    //constructor con super
    public Vendedor(String nombre, String id, double salarioBase, String fechaIngreso, double ventasMes,
            double comision) {
        super(nombre, id, salarioBase, fechaIngreso);
        this.ventasMes = ventasMes;
        this.comision = comision;
    }

    @Override
    public void calcularSalario(double salarioBase) {
        // TODO Auto-generated method stub
        super.calcularSalario(salarioBase);
        salarioBase += (ventasMes * comision / 100);
    }

    @Override
    void trabajar() {
        // TODO Auto-generated method stub
        //super.trabajar();
        System.out.println("Contactando clientes y cerrando ventas");
    }

    

    

    
    
}
