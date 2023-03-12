/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperCompreBarato;

/**
 *
 * @author andre
 */
public class Productos {
    
    private String idProducto;
    private String descripción;
    private int precio;
    

    public Productos(String idProducto, String descripción, int precio) {
        this.idProducto = idProducto;
        this.descripción = descripción;
        this.precio = precio;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getDescripción() {
        return descripción;
    }

    public int getPrecio() {
        return precio;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
