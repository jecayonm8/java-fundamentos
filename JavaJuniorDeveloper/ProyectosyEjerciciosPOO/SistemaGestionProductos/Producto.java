package JavaJuniorDeveloper.ProyectosyEjerciciosPOO.SistemaGestionProductos;

public class Producto {
    //atributos private
    private String nombre;
    private String codigo;
    private double precio;
    private int stock;
    private String categoria;

    //constructores vacio y parametrizado
    public Producto(){
        this.nombre = "Sin nombre";
        this.codigo = "SIN-COD";
        this.precio = 0.01;
        this.stock = 0;
        this.categoria = "Electronica";
    }
    public Producto(String nombre, String codigo, double precio, int stock, String categoria) {
        this.codigo = codigo;  //codigo si directo(No tiene setter)
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
        setCategoria(categoria);
    }

    //getters 
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        if(nombre.trim().length() >= 3 ) {
            this.nombre = nombre;
        }
    }
    //setters
    
    //setCodigo --> NO se pone, ya que dice UNICO, NO MODIFICABLE DESPUES DE CREACION.
    
    public void setPrecio(double precio) {
        if(precio > 0) {  //validacion precio
            this.precio = precio;
        }
    }
    
    public void setStock(int stock) {
        if(stock >= 0){  //validacion stock
        this.stock = stock;
        }
    }
    
    public void setCategoria(String categoria) {
        if(categoria.equals("Electronica") ||
            categoria.equals("Ropa") || 
            categoria.equals("Hogar") ||
            categoria.equals("Deportes")) {  //validacion categorias
            this.categoria = categoria;
        }
    }

    //METODOS especificos
    //----------------------

    //metodo para reducir el stock de un producto, valida Reducir stock si hay suficiente.
    public void reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
        }
    }

    //metodo para aumentar el stock de un producto, valida Aumentar stock si la cantidad es positiva.
    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    //metodo para aplicar un descuento(0-50%)
    public void aplicarDescuento(double porcentaje) {
        if(porcentaje >= 0 && porcentaje <= 50) {
            double descuento = precio * (porcentaje / 100);
            precio -= descuento;
        }
    }

    //metodo para mostrar si hay stock disponible
    public boolean estaDisponible() {
        return stock > 0;
    }

    //metodo toString para mostrar la información del producto, con formato valido.
    @Override
    public String toString() {
    return String.format("[%s] %s - $%.2f (Stock: %d) [%s]",
            codigo, nombre, precio, stock, categoria);
    }

    // //metodo toString para mostrar la información del producto
    // @Override
    // public String toString() {
    //     return "Producto: " + nombre + "\n" +
    //            "Código: " + codigo + "\n" +
    //            "Precio: $" + precio + "\n" +
    //            "Stock: " + stock + "\n" +
    //            "Categoría: " + categoria;
    // }

}
