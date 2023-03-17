package SuperCompreBarato;

import java.util.ArrayList;

/**
 *
 * @author Bryan Calvo Fonseca
 */
public class ListaEmpleados {

    private final ArrayList<Empleado> listEmpleados = new ArrayList<>();

    public void añadirEmpleado() {

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

    public void modificarEmpleado(String idEmpleado) {

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
