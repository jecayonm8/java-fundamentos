package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaEmpleadosJerarquia;

public abstract class Empleado implements Trabajable{
    //atributos protegidos - las clases hijas pueden accederlos directamente.
    protected String nombre;
    protected String id;
    protected double salarioBase;
    protected String fechaIngreso;

    //constructor
    public Empleado(String nombre, String id, double salarioBase, String fechaIngreso) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    //Metodo abstracto - cada hijo OBLIGADO a implementarlo a su manera
    public abstract double calcularSalario();

    //toString base - los hijos lo pueden sobreescribir
    @Override
    public String toString() {
        return String.format("ID: %s | Nombre: %s | Ingreso: %s | Salario: $%.2f",
                id, nombre, fechaIngreso, calcularSalario());
    }


}
