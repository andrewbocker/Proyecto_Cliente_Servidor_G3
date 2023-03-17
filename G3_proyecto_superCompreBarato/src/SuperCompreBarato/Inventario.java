package SuperCompreBarato;

import java.util.ArrayList;

/**
 *
 * @author Bryan Calvo Fonseca
 */
public class Inventario {

    private final ArrayList<Producto> listInventario = new ArrayList<>();

    public void añadirProducto(String nombreProducto, String idProducto, String descripcion, double precio, int stack) {

        // VERIFICA PRIMERO SI EXISTE UN PRODUCTO EN LA LISTA CON EL MISMO ID
        if (buscarProducto(idProducto) != -1)
        {

            // SI EXISTE UN PRODUCTO CON EL MISMO ID, AVISA AL USUARIO Y NO AÑADE EL PRODUCTO EN LA LISTA
            System.out.println("No se puede añadir varios productos con un mismo id.");
            return;

        }

        // DE LO CONTRARIO CREA UN NUEVO PRODUCTO Y LO AÑADE A LA LISTA
        Producto producto = new Producto(nombreProducto, idProducto, descripcion, precio, stack);
        listInventario.add(producto);
        System.out.println("Se ha añadido correctamente el nuevo Producto");

    }

    public void modificarProducto(String nombreProducto, String idProducto, String descripcion, double precio, int stack) {

        // BUSCA LA POSICION DEL OBJETO EN LA LISTA
        int index = buscarProducto(idProducto);

        // MODIFICA LOS VALORES DEL PRODUCTO EN LA LISTA
        listInventario.get(index).setNombreProducto(nombreProducto);
        listInventario.get(index).setDescripción(descripcion);
        listInventario.get(index).setPrecio(precio);
        listInventario.get(index).setStack(stack);

        System.out.println("El producto con el id = " + idProducto + " ha sido modificado correctamente");

    }

    public int buscarProducto(String idProducto) {

        // SE CREA UNA VARIABLE "index" PARA SABER EN QUE POSICION DE LA LISTA NOS ENCONTRAMOS
        int index = 0;

        // RECORRE TODA LA LISTA
        for (Producto actProduto : listInventario)
        {

            // VERIFICA EN CADA PRODUCTO EL ID BUSCANDO EL QUE COINCIDA
            if (actProduto.getIdProducto().equals(idProducto))
            {

                // SI ENCUENTRA UN ID COINCIDENTE ENTONCES RETORNA SU POSICION EN LA LISTA
                return index;

            }

        }

        // SI RETORNA -1 SIGNIFICA QUE NO SE ENCONTRO NINGUN PRODUCTO CON ESE ID
        return -1;

    }

    public Producto getProducto(String idProducto) {

        int index = buscarProducto(idProducto);

        // PRIMERO VERIFICAMOS SI EL PRODUCTO EXISTE
        if (index == -1)
        {

            // SI NO EXISTE, AVISAMOS AL USUARIO Y RETORNA NULL
            System.out.println("No se encontro ningun producto con le id = " + idProducto);
            return null;                       
            
        }
        
        // DE LO CONTRARIO RETORNA EL PRODUCTO ENCONTRADO EN LA LISTA
        return listInventario.get(index);

    }

    public void eliminarProducto(String idProducto) {

        int index = buscarProducto(idProducto);

        // PRIMERO SE VERIFICA SI EL PRODUCTO EXISTE
        if (index == -1)
        {

            // SI NO EXISTE, AVISAMOS AL USUARIO Y SE SALE DEL METODO
            System.out.println("No se encontro ningun producto con le id = " + idProducto);
            return;

        }

        // DE LO CONTRARIO, ELIMINAMOS EL PRODUCTO DE LA LISTA
        System.out.println("Se ha eliminado el producto = " + listInventario.get(index).getNombreProducto() + ", con el id = " + idProducto);
        listInventario.remove(index);

    }

    public void restarStackProducto(String idProducto) {

        listInventario.get(buscarProducto(idProducto)).restarStack();

    }

    public void clearInventario() {

        listInventario.clear();

    }

    public boolean isInventarioEmpty() {

        return listInventario.isEmpty();

    }
}
