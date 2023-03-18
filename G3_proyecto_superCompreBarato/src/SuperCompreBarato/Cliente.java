/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperCompreBarato;

/**
 *
 * @author Minor
 */
public class Cliente extends Persona {
     
    private String idCliente;    
    private String tipoCliente;
    private int puntos = 0;
    
    public static final String[] TIPOS_CLIENTES = {"Casual", "Regular", "VIP"};

    public Cliente(String nombre, String apellido1, String apellido2, String cedula, int edad, String lugarResidencia, String idCliente, String tipoCliente) {
        super(nombre, apellido1, apellido2, cedula, edad, lugarResidencia);
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public void sumarPuntos(int nuevosPuntos){
        puntos += nuevosPuntos;
    }
                
}
