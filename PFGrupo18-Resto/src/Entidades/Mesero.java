package Entidades;

public class Mesero {

    private int id_mesero;
    private int dni;
    private String nombre;
    private String apellido;
    private String contrasenia;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(int dni, String nombre, String apellido, String contrasenia, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public Mesero(int id_mesero, int dni, String nombre, String apellido, String contrasenia, boolean estado) {
        this.id_mesero = id_mesero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
