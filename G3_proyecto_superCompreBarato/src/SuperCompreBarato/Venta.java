/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperCompreBarato;

/**
 *
 * @author andre
 */
public class Venta {
    
    private String descripcion;
    private int cantidad;
    private double precio;
    private double precioTotal;
    private String productosAdquiridos;
    private String metodoPago;
    private String idVendedor;
    private String idCliente;
    private String fechaVenta; 

    public Venta() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public String getProductosAdquiridos() {
        return productosAdquiridos;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setProductosAdquiridos(String productosAdquiridos) {
        this.productosAdquiridos = productosAdquiridos;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    
    
    
    
}
