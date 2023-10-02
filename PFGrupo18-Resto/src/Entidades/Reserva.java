package Entidades;


import Entidades.Mesa;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    private int id_reserva;
    private Mesa mesa;
    private String nombre;
    private int dni;
    private LocalDate fecha;
    private LocalTime hora;

    public Reserva() {
    }

    public Reserva(Mesa mesa, String nombre, int dni, LocalDate fecha, LocalTime hora) {
        this.mesa = mesa;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Reserva(int id_reserva, Mesa mesa, String nombre, int dni, LocalDate fecha, LocalTime hora) {
        this.id_reserva = id_reserva;
        this.mesa = mesa;
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    
    
}
