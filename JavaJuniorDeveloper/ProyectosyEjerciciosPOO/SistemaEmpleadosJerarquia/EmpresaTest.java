package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaEmpleadosJerarquia;


public class EmpresaTest {
    //Sistema completo con herencia, interfaces y polimorfismo funcionando.

    //-Cree array de tipo Empleado[] con objetos de diferentes tipos
    //-Use polimorfismo para llamar métodos comunes
    //-Demuestre cast de objetos cuando sea necesario
    //-Calcule nómina total de la empresa

    public static void main(String[] args) {

        // ─────────────────────────────────────────
        // Array de tipo Empleado[] — polimorfismo
        // Cada posición puede ser Gerente, Desarrollador o Vendedor
        // ─────────────────────────────────────────
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Gerente      ("Ana García",   "G001", 1200.0, "2020-01-15", 10);
        empleados[1] = new Desarrollador("Carlos López", "D001", 2300.0, "2021-03-10", "Java", 5);
        empleados[2] = new Vendedor     ("María Ruiz",   "V001", 1500.0, "2022-06-01", 15000.0, 6.33);

        // ─────────────────────────────────────────
        // Se reccorre con polimorfismo — mismo código,
        // comportamiento diferente según el tipo real
        // ─────────────────────────────────────────
        System.out.println("=== EMPLEADOS DE LA EMPRESA ===\n");

        double nominaTotal = 0;

        for (Empleado emp : empleados) {
            System.out.println(emp);        // toString() de cada hijo
            emp.trabajar();                 // trabajar() de cada hijo
            System.out.println("Tareas: " + emp.obtenerTareas());
            System.out.println();

            nominaTotal += emp.calcularSalario();
        }

        System.out.printf("Nómina total: $%.2f%n", nominaTotal);

        // ─────────────────────────────────────────
        // Cast — Para acceder a métodos específicos
        // que Empleado no conoce
        // ─────────────────────────────────────────
        System.out.println("\n=== DETALLES ESPECÍFICOS (Cast) ===\n");

        for (Empleado emp : empleados) {

            if (emp instanceof Gerente) {
                Gerente g = (Gerente) emp;       // cast a Gerente
                System.out.println(g.getNombre() + " maneja un equipo de "
                        + g.getEquipoACargo() + " personas.");

            } else if (emp instanceof Desarrollador) {
                Desarrollador d = (Desarrollador) emp; // cast a Desarrollador
                System.out.println(d.getNombre() + " programa en "
                        + d.getLenguajePrincipal() + " con "
                        + d.getExperienciaAños() + " años de experiencia.");

            } else if (emp instanceof Vendedor) {
                Vendedor v = (Vendedor) emp;     // cast a Vendedor
                System.out.printf(v.getNombre() + " tiene comisión del %.2f%%%n",
                        v.getComision());
            }
        }
        
    }
}
