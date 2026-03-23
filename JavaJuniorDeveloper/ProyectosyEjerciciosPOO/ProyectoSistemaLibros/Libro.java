package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.ProyectoSistemaLibros;

public class Libro {
    //atributos private
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private boolean disponible;

    //constructor por defecto y parametrizado
    public Libro() {
        this.titulo = "No hay título";
        this.autor = "Es Desconocido";
        this.isbn = "000-00000000";
        this.precio = 0.0;
        this.disponible = true;
    }

    public Libro(String titulo, String autor, String isbn, double precio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.disponible = disponible;
    }

    //getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn.matches("\\d{3}-\\d{10}")) {
            this.isbn = isbn;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio >= 0)
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //metodos de comportamiento
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Este libro no está disponible para préstamo.");
            } else {
            System.out.println("Este libro ha sido prestado exitosamente.");
            }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("Este libro ha sido devuelto exitosamente.");
        } else {
            System.out.println("Este libro ya está disponible en la biblioteca.");
        }
    }

    public void aplicarDescuento(double porcentaje) {
        if(porcentaje > 0 && porcentaje < 100) {
            precio = precio * (porcentaje / 100);
        }
    }    

}
