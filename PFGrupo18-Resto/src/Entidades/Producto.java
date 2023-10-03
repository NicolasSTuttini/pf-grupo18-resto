package Entidades;

public class Producto {

    private int id_producto;
    private String nombre;
    private double precio;
    private boolean estado;

    public Producto() {
    }

    public Producto(String nombre, double precio, boolean estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public Producto(int id_producto, String nombre, double precio, boolean estado) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

