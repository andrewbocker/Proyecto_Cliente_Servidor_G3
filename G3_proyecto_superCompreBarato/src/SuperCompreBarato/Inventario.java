package SuperCompreBarato;

import java.util.ArrayList;

/**
 *
 * @author Bryan Calvo Fonseca
 */
public class Inventario {

    private ArrayList<Producto> listInventario = new ArrayList<>();

    public void añadirProducto(String nombreProducto, String idProducto, String descripcion, int precio) {

        // CREA UN NUEVO PRODUCTO Y LO AÑADE A LA LISTA
        Producto producto = new Producto(nombreProducto, idProducto, descripcion, precio);
        listInventario.add(producto);
        System.out.println("Se ha añadido correctamente el nuevo Producto");

    }

    public void modificarProducto(String nombreProducto, String idProducto, String descripcion, int precio) {

        // SE CREA UNA VARIABLE "index"  PARA SABER EN QUE POSICION DE LA LISTA NOS ENCONTRAMOS
        int index = 0;

        // RECORRE LA LISTA
        for (Producto actProducto : listInventario)
        {

            // VERIFICA EN CADA PRODUCTO EL ID BUSCANDO EL QUE COINCIDA 
            if (actProducto.getIdProducto().equals(idProducto))
            {

                // SI ENCUENTRA UN ID COINCIDENTE ENTONCES INTERCAMBIA LOS DATOS ANTIGUOS POR LOS NUEVOS
                listInventario.get(index).setNombreProducto(nombreProducto);
                listInventario.get(index).setDescripción(descripcion);
                listInventario.get(index).setPrecio(precio);

                System.out.println("El producto con el id = " + idProducto + " ha sido modificado correctamente");

                // LUEGO SALE DEL METODO
                return;

            }

            // SI EL ID DEL PRODUCTO NO COINCIDE ENTONCES AUMENTA EL "index"  EN 1 Y CONTINUA VERIFICANDO EL SIGUIENTE ELEMENTO EN LA LISTA
            index++;

        }

    }

    public Producto buscarProducto(String idProducto) {

        // RECORRE TODA LA LISTA
        for (Producto actProduto : listInventario)
        {

            // VERIFICA EN CADA PRODUCTO EL ID BUSCANDO EL QUE COINCIDA
            if (actProduto.getIdProducto().equals(idProducto))
            {

                // SI ENCUENTRA UN ID COINCIDENTE ENTONCES LO RETORNA
                return actProduto;

            }

        }

        // SI RETORNA NULL SIGNIFICA QUE NO SE ENCONTRO NINGUN PRODUCTO CON ESE ID
        return null;

    }

    public void eliminarProducto(String idProducto) {

        // SE CREA UNA VARIABLE "index"  PARA SABER EN QUE POSICION DE LA LISTA NOS ENCONTRAMOS
        int index = 0;

        // RECORRE TODA LA LISTA
        for (Producto actProducto : listInventario)
        {

            // VERIFICA EN CADA PRODUCTO EL ID BUSCANDO EL QUE COINCIDA
            if (actProducto.getIdProducto().equals(idProducto))
            {

                // SI ENCUENTRA UN ID COINCIDENTE ENTONCES SE REMUEVE EL PRODUCTO ALMACENADO EN EL "index" ACTUAL
                listInventario.remove(index);
                System.out.println("Se ha eliminado el producto = " + "" + ", con el id = " + actProducto.getIdProducto());

                // LUEGO SALE DEL METODO
                return;

            }

            // SI EL ID DEL PRODUCTO NO COINCIDE ENTONCES AUMENTA EL "index"  EN 1 Y CONTINUA VERIFICANDO EL SIGUIENTE ELEMENTO EN LA LISTA
            index++;

        }

        // SI NO ENCUENTRA UN ID COINCIDENTE ENTONCES SIMPLEMENTE TERMINA LA EJECUCION DEL METODO
        System.out.println("No se Encontro ningun producto con el id = " + idProducto);

    }
    
    public void clearInventario() {
        listInventario.clear();
    }
    
    public boolean isInventarioEmpty() {
        return listInventario.isEmpty();
    }
}
