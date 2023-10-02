package Entidades;

public class Producto {

    private int id_producto;
    private Pedido pedido;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(Pedido pedido, String nombre, int cantidad, double precio) {
        this.pedido = pedido;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto(int id_producto, Pedido pedido, String nombre, int cantidad, double precio) {
        this.id_producto = id_producto;
        this.pedido = pedido;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

