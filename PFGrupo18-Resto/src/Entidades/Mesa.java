package Entidades;

public class Mesa {

    private int id_mesa;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(boolean estado) {
        this.estado = estado;
    }

    public Mesa(int id_mesa, boolean estado) {
        this.id_mesa = id_mesa;
        this.estado = estado;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
