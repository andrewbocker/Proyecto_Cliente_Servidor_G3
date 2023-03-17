/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperCompreBarato;

//autor minor
public class Empleado extends Persona {

    private String idEmpleado;
    private String puestoTrabajo;
    private double salario;

    public Empleado(String nombre, String apellido1, String apellido2, String cedula, int edad, String lugarResidencia, String idEmpleado, String puestoTrabajo, double salario) {
        super(nombre, apellido1, apellido2, cedula, edad, lugarResidencia);
        this.idEmpleado = idEmpleado;
        this.puestoTrabajo = puestoTrabajo;
        this.salario = salario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
