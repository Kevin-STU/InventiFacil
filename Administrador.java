
import java.util.*;

/**
 * La clase Administrador representa a un administrador con la capacidad de gestionar usuarios y generar informes.
 * Contiene métodos para agregar y eliminar usuarios, generar informes de ventas y generar informes de inventario.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */

public class Administrador {
    private List<Usuario> usuarios;
    private Inventario inventario;
    /**
     * Construye un objeto Administrador con una lista vacía de usuarios e inicializa el inventario.
     */
    public Administrador() {
        usuarios = new ArrayList<>();
        inventario = Inventario.getInstance();
    }
    /**
     * Agrega un usuario a la lista de usuarios.
     * 
     * @param usuario El usuario que se va a agregar.
     */

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
   /**
     * Elimina un usuario de la lista de usuarios.
     * 
     * @param usuario El usuario que se va a eliminar.
     */
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    /**
     * Devuelve la lista de usuarios.
     * 
     * @return La lista de usuarios.
     */
    public List<Usuario> getUusarios() {
        return usuarios;
    }
    /**
     * Genera un informe de ventas.
     * 
     * Este método accede a los datos de ventas y genera un informe detallado.
     * El informe se puede imprimir en la consola o exportar a un archivo.
     */
    public void generarInformeVentas() {
        // generación de informes de las ventas

        // acceder a los datos de las ventas y generar un buen informe detallado
        // imprimirlo por consola o tal vez exportar un archivo?
        


    }
    /**
     * Genera un informe de inventario.
     * 
     * Este método accede a los datos de inventario y genera un informe de productos con bajo stock.
     * El informe lista los productos con niveles de stock por debajo de 10.
     * Si no hay productos con stock por debajo de 10, se muestra un mensaje correspondiente.
     */
    public void generarInformeInventario() {
        // generación de informes del inventario
        this.inventario.obtenerProductos();
        List<Producto> productos = this.inventario.obtenerTodosLosProductos();
        List<String> productosStock = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getStock() < 10) {
                productosStock.add("Codigo: " + producto.getCodigo() + " - Nombre: " + producto.getNombre() + " - Stock: "
                        + producto.getStock());
            }
        }
        if (productosStock.size() == 0) {
            System.out.println("No hay productos con stock menor a 10");
            return;
        }
        System.out.println("Productos con stock menor a 10: ");
        for (String producto : productosStock) {
            System.out.println(producto);
        }
    }


}
