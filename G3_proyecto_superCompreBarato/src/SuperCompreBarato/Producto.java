/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperCompreBarato;

/**
 *
 * @author andre
 */
public class Producto {
    
    private String nombreProducto;
    private String idProducto;
    private String descripcion;
    private int precio;
    

    public Producto(String nombreProducto, String idProducto, String descripcion, int precio) {
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public String getNombreProducto() {
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripción(String descripción) {
        this.descripcion = descripción;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
