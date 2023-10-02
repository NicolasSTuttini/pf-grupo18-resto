package Entidades;


import Entidades.Mesa;

public class Pedido {

    private int id_pedido;
    private Mesa mesa;
    private Mesero mesero;
    private boolean entregado;
    private boolean pagado;

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mesero mesero, boolean entregado, boolean pagado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.entregado = entregado;
        this.pagado = pagado;
    }

    public Pedido(int id_pedido, Mesa mesa, Mesero mesero, boolean entregado, boolean pagado) {
        this.id_pedido = id_pedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.entregado = entregado;
        this.pagado = pagado;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    
}

