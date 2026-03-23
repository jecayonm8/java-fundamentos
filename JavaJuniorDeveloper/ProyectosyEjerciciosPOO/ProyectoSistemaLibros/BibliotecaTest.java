package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.ProyectoSistemaLibros;

import java.util.Scanner;

public class BibliotecaTest {
    public static void main(String[] args) {
        //Crear al menos 3 objetos de la clase Libro
        //Demostrar uso de todos los métodos de la clase Libro
        //Simular una operación de préstamo y devolución de un libro, mostrando el cambio en la disponibilidad del libro.
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Poder de la mente", "JM", "123-453454345", 100.0, true);
        Libro libro3 = new Libro("El arte de la guerra", "Sun Tzu", "456-123456789", 50.0, false);

        libro1.setTitulo("Cien años de soledad");
        libro1.setAutor("Gabriel García Márquez");
        libro1.setIsbn("123-456789012");

        System.out.println("=== Información de los libros ===\n " );
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
        // Simular préstamo de libro2
        System.out.println("\nPréstamo de libro: " + libro2.getTitulo());
        libro2.prestar();
        libro2.mostrarInfo();

        //simular devolución de libro2
        System.out.println("\nDevolución de libro: " + libro2.getTitulo());
        libro2.devolver();
        libro2.mostrarInfo();

        libro3.aplicarDescuento(20);
        libro3.mostrarInfo();
        
    }
    
}
