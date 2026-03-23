package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaGestionProductos;

public class TiendaTest {
    //-Cree 5 productos de diferentes categorías
    //-Demuestre operaciones de stock
    //-Aplique descuentos
    //-Maneje casos de error (valores inválidos)
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      SISTEMA DE GESTIÓN DE PRODUCTOS     ║");
        System.out.println("╚══════════════════════════════════════════╝");

        //-----------------------------------------------
        //1. CREAR 5 productos de diferentes categorías
        //-----------------------------------------------
        System.out.println("\n── 📦 Creando productos ──");
        
        Producto p1 = new Producto("Laptop gaming","COD001" , 129.99, 5, "Electronica");
        Producto p2 = new Producto("Camiseta Dry-Fit", "COD002", 49.99,   20, "Ropa");
        Producto p3 = new Producto("Cafetera Express", "COD003", 199.99,  8,  "Hogar");
        Producto p4 = new Producto("Balón de Fútbol",  "COD004", 35.00,   15, "Deportes");
        Producto p5 = new Producto("Auriculares BT",   "COD005", 89.99,   10, "Electronica");

        System.out.println("Producto creado: " + p1);
        System.out.println("Producto creado: " + p2);
        System.out.println("Producto creado: " + p3);
        System.out.println("Producto creado: " + p4);
        System.out.println("Producto creado: " + p5);

        //-----------------------------------------------
        //2. DEMOSTRAR operaciones de stock
        //-----------------------------------------------
        System.out.println("\n── 📊 Operaciones de Stock ──");

        //Reducir stock - caso valido
        System.out.println("\n[" + p1.getCodigo() + "] " + p1.getNombre());
        System.out.println("Stock inicial: " + p1.getStock());
        p1.reducirStock(2);
        System.out.println("Stock reducido: 2 unidades vendidas");
        System.out.println("Stock actual: " + p1.getStock());

        //Aumentar stock
        System.out.println("\n[" + p2.getCodigo() + "] " + p2.getNombre());
        System.out.println("Stock inicial: " + p2.getStock());
        p2.aumentarStock(10);
        System.out.println("Stock aumentado: +10 unidades recibidas");
        System.out.println("Stock actual: " + p2.getStock());

        //Verificar disponibilidad
        System.out.println("\n¿" + p1.getNombre() + " disponible? → " + p1.estaDisponible());
        System.out.println("¿" + p3.getNombre() + " disponible? → " + p3.estaDisponible());

        //-----------------------------------------------
        //3. APLICAR descuentos
        //-----------------------------------------------
        System.out.println("\n── 🏷️  Aplicando Descuentos ──");

        //Descuento valido en laptop
        System.out.println("\n[" + p1.getCodigo() + "] " + p1.getNombre());
        System.out.printf("Precio original : $%.2f%n", p1.getPrecio());
        p1.aplicarDescuento(10);
        System.out.println("Descuento aplicado: 10%");
        System.out.printf("Precio con descuento: $%.2f%n", p1.getPrecio());

        //Descuento valido auriculares
        System.out.println("\n[" + p5.getCodigo() + "] " + p5.getNombre());
        System.out.printf("Precio original : $%.2f%n", p5.getPrecio());
        p5.aplicarDescuento(25);
        System.out.println("Descuento aplicado: 25%");
        System.out.printf("Precio con descuento: $%.2f%n", p5.getPrecio());

        //-----------------------------------------------
        //4. MANEJO casos de error(valores invalidos) no se pueden
        //-----------------------------------------------
        System.out.println("\n── ⚠️  Probando Validaciones ──");

        // Nombre inválido (menos de 3 caracteres)
        System.out.println("\n→ Intentar setNombre con 'AB' (menos de 3 caracteres):");
        String nombreAntes = p1.getNombre();
        p1.setNombre("AB");
        System.out.println("  Nombre sigue siendo: " + p1.getNombre()
                + (p1.getNombre().equals(nombreAntes) ? " ✅ validación OK" : " ❌ falló"));

        // Precio inválido (negativo)
        System.out.println("\n→ Intentar setPrecio con -500:");
        double precioAntes = p1.getPrecio();
        p1.setPrecio(-500);
        System.out.println("  Precio sigue siendo: $" + p1.getPrecio()
                + (p1.getPrecio() == precioAntes ? " ✅ validación OK" : " ❌ falló"));

        // Stock inválido (negativo)
        System.out.println("\n→ Intentar setStock con -10:");
        int stockAntes = p1.getStock();
        p1.setStock(-10);
        System.out.println("  Stock sigue siendo: " + p1.getStock()
                + (p1.getStock() == stockAntes ? " ✅ validación OK" : " ❌ falló"));
        
        
        // Categoría inválida
        System.out.println("\n→ Intentar setCategoria con 'Juguetes' (no válida):");
        String catAntes = p1.getCategoria();
        p1.setCategoria("Juguetes");
        System.out.println("  Categoría sigue siendo: " + p1.getCategoria()
                + (p1.getCategoria().equals(catAntes) ? " ✅ validación OK" : " ❌ falló"));

        // Descuento fuera de rango
        System.out.println("\n→ Intentar aplicarDescuento con 80% (máx es 50%):");
        double precioAntes2 = p2.getPrecio();
        p2.aplicarDescuento(80);
        System.out.println("  Precio sigue siendo: $" + p2.getPrecio()
                + (p2.getPrecio() == precioAntes2 ? " ✅ validación OK" : " ❌ falló"));

        // Reducir más stock del disponible
        System.out.println("\n→ Intentar reducirStock en " + p4.getNombre()
                + " con 999 (stock actual: " + p4.getStock() + "):");
        int stockAntes2 = p4.getStock();
        p4.reducirStock(999);
        System.out.println("  Stock sigue siendo: " + p4.getStock()
                + (p4.getStock() == stockAntes2 ? " ✅ validación OK" : " ❌ falló"));

        //-----------------------------------------------
        //5. ESTADO FINAL todos los productos
        //-----------------------------------------------
        System.out.println("\n── 📋 Estado Final de Productos ──");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }

    
}
