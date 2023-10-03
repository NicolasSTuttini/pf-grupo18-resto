/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author nstut
 */
public class ProductosPedidos {
    private int id_productoPedido;
    private int id_producto;
    private int id_pedido;
    private int cantidad;

    public ProductosPedidos() {
    }

    public ProductosPedidos(int id_producto, int id_pedido, int cantidad) {
        this.id_producto = id_producto;
        this.id_pedido = id_pedido;
        this.cantidad = cantidad;
    }

    public ProductosPedidos(int id_productoPedido, int id_producto, int id_pedido, int cantidad) {
        this.id_productoPedido = id_productoPedido;
        this.id_producto = id_producto;
        this.id_pedido = id_pedido;
        this.cantidad = cantidad;
    }

    public int getId_productoPedido() {
        return id_productoPedido;
    }

    public void setId_productoPedido(int id_productoPedido) {
        this.id_productoPedido = id_productoPedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
