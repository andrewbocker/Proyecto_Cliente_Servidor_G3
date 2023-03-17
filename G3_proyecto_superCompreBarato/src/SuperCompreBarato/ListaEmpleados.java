package SuperCompreBarato;

import java.util.ArrayList;

/**
 *
 * @author Bryan Calvo Fonseca
 */
public class ListaEmpleados {

    private final ArrayList<Empleado> listEmpleados = new ArrayList<>();

    public void añadirEmpleado(String nombre, String apellido1, String apellido2, String cedula, int edad, String lugarResidencia, String idEmpleado, String puestoTrabajo, double salario) {

        // VERIFICA PRIMERO SI EXISTE UN EMPLEADO EN LA LISTA CON EL MISMO ID
        if (buscarEmpleado(idEmpleado) != -1)
        {
            
            // SI EXISTE UN EMPLEADO CON EL MISMO ID, AVISA AL USUARIO Y SALE DEL METODO
            System.out.println("No se puede añadir varios empleado con el mismo id");
            return;
            
        }
        
        // DE LO CONTRARIO, CREA UN NUEVO EMPLEADO Y LOS AÑADE A LA LISTA
        Empleado empleado = new Empleado(nombre, apellido1, apellido2, cedula, edad, lugarResidencia, idEmpleado, puestoTrabajo, salario);
        listEmpleados.add(empleado);
        System.out.println("Se ha añadido correctamente el nuevo empleado a la lista");
        
    }

    private int buscarEmpleado(String idEmpleado) {

        // SE CREA UNA VARIABLE "index" PARA SABER EN QUE POSICION DE LA LISTA NOS ENCONTRAMOS
        int index = 0;

        // RECORRE TODA LA LISTA
        for (Empleado actEmpleado : listEmpleados)
        {

            // VERIFICA EN CADA EMPLEADO EL ID BUSCANDO EL QUE COINCIDA
            if (actEmpleado.getIdEmpleado().equals(idEmpleado))
            {

                // SI ENCUENTRA UN ID COINCIDENTE ENTONCES RETORNA SU POSICION EN LA LISTA
                return index;

            }

        }

        // SI RETORNA -1 SIGNIFICA QUE NO SE ENCONTRO NINGUN PRODUCTO CON ESE ID
        return -1;
    }

    public void modificarEmpleado(String nombre, String apellido1, String apellido2, String cedula, int edad, String lugarResidencia, String idEmpleado, String puestoTrabajo, double salario) {

        // BUSCA LA POSICION DEL OBJETO EN LA LISTA
        int index = buscarEmpleado(idEmpleado);
        
        // MODIFIVA LOS DATOS DEL EMPLEADO EN LA LISTA
        listEmpleados.get(index).setNombre(nombre);
        listEmpleados.get(index).setApellido1(apellido1);
        listEmpleados.get(index).setApellido2(apellido2);
        listEmpleados.get(index).setCedula(cedula);
        listEmpleados.get(index).setEdad(edad);
        listEmpleados.get(index).setLugarResidencia(lugarResidencia);
        listEmpleados.get(index).setPuestoTrabajo(puestoTrabajo);
        listEmpleados.get(index).setSalario(salario);
        
        System.out.println("Los datos del Empleado " + listEmpleados.get(index).stringNombreCompleto() + " han sido modificados correctamente");
        
    }

    public Empleado getEmpleado(String idEmpleado) {
        int index = buscarEmpleado(idEmpleado);

        // PRIMERO VERIFICAMOS SI EL EMPLEADO EXISTE
        if (index == -1)
        {

            // SI NO EXISTE, AVISAMOS AL USUARIO Y RETORNA NULL
            System.out.println("No se encontro ningun empleado con le id = " + idEmpleado);
            return null;

        }

        // DE LO CONTRARIO RETORNA EL EMPLEADO ENCONTRADO EN LA LISTA
        return listEmpleados.get(index);
    }

    public void eliminarEmpleado(String idEmpleado) {

        int index = buscarEmpleado(idEmpleado);

        // PRIMERO SE VERIFICA SI EL EMPLEADO EXISTE
        if (index == -1)
        {

            // SI NO EXISTE, AVISAMOS AL USUARIO Y SE SALE DEL METODO
            System.out.println("No se encontro ningun empleado con le id = " + idEmpleado);
            return;

        }

        // DE LO CONTRARIO, ELIMINAMOS EL EMPLEADO DE LA LISTA
        System.out.println("Se ha eliminado el empleado = " + listEmpleados.get(index).stringNombreCompleto() + ", con el id = " + idEmpleado);
        listEmpleados.remove(index);

    }

    public void clearListEmpleados() {
        listEmpleados.clear();
    }

    public boolean isListEmpleadosEmpty() {
        return listEmpleados.isEmpty();
    }

}
