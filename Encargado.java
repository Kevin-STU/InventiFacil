import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * La clase Encargado representa a un encargado que realiza diversas acciones en el inventario.
 * Estas acciones incluyen agregar y eliminar productos, así como modificar información de los productos.
 * También puede registrar la entrada y salida de productos en el inventario.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class Encargado
{
    // instance variables - replace the example below with your own
    private Inventario inventario;
        /**
     * Constructor de la clase Encargado.
     */
    public Encargado()
    {
        this.inventario = Inventario.getInstance();
    }
        /**
     * Agrega un producto al inventario.
     * 
     * @param producto El producto a agregar.
     * @return true si el producto se agregó correctamente, false de lo contrario.
     */

    public boolean agregarProducto(Producto producto) {
        boolean productoAgregado = inventario.addProduct(producto);
        if (productoAgregado) {
            return true;
        } else {
            return false;
        }
    }
        /**
     * Elimina un producto del inventario.
     * 
     * @param codigo El código del producto a eliminar.
     * @param razon La razón para eliminar el producto.
     * @return Un mensaje indicando si el producto se eliminó correctamente o no.
     */
    public String eliminarProducto(String codigo, String razon) {
        Producto producto = inventario.obtenerProducto(codigo);
        if (producto != null){
            Date fechaRetiro = producto.getFechaRetiro();
            String razonRetiro = producto.getRazonRetiro(razon);
            boolean eliminado = inventario.eliminarProducto(codigo);
            if (eliminado) {
                System.out.println("Producto eliminado correctamente");
                System.out.println("Fecha de retiro: " + fechaRetiro);
                System.out.println("Razon de retiro: " + razonRetiro);
                return "Producto eliminado correctamente";
            }else {
                System.out.println("No se pudo eliminar el producto");
                return "No se pudo eliminar el producto";
            }
        }
        else {
            System.out.println("El producto con el código " + codigo + " no existe en el inventario.");
            return "El producto con el código " + codigo + " no existe en el inventario.";
        }
    }
    /**
     * Modifica la información de un producto en el inventario.
     * 
     * @param codigo El código del producto a modificar.
     * @param nStock El nuevo stock del producto.
     * @param nuevaInformacion La nueva información del producto.
     * @return Un mensaje indicando si el producto se modificó correctamente o no.
     */
    public String modificarProducto(String codigo, int nStock, String nuevaInformacion) {
        Producto producto = inventario.obtenerProducto(codigo);
        if (producto != null) {
            producto.setStock(nStock);
            producto.setInformacion(nuevaInformacion);
            System.out.println("Producto modificado correctamente");
            return "Producto modificado correctamente";
        }
        else {
            System.out.println("El producto con el código " + codigo + " no existe en el inventario.");
            return "El producto con el código " + codigo + " no existe en el inventario.";
        }
    }
        /**
     * Registra la entrada o salida de productos en el inventario.
     * 
     * @param codigo El código del producto.
     * @param cantidad La cantidad
     * @param estado El estado del producto.
     * @param permiteDevolucion true si el producto permite devolución, false de lo contrario.
     */
    public void registrarEntradaSalida(String codigo, int cantidad, String estado, boolean permiteDevolucion) {
        
    }
    
}
