import java.util.*; 

/**
 * La clase Inventario representa un inventario que contiene productos.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class Inventario
{
    private Map<String, Producto> productos;
    private static Inventario inventario;
    /**
     * Constructor privado de la clase Inventario.
     */
    private Inventario(){
        this.productos = new HashMap<>(); 
    }
        /**
     * Obtiene una instancia del inventario (patrón Singleton).
     * 
     * @return La instancia del inventario.
     */
    public static Inventario getInstance(){
        if (Inventario.inventario == null){
            Inventario.inventario = new Inventario();
        }
        return Inventario.inventario;
    }
        /**
     * Agrega un producto al inventario.
     * 
     * @param producto El producto a agregar.
     * @return true si el producto se agregó correctamente, false de lo contrario.
     */
    public boolean addProduct(Producto producto) {
        this.productos.put(producto.getCodigo(), producto);
        return true;
    }
        /**
     * Elimina un producto del inventario.
     * 
     * @param codigo El código del producto a eliminar.
     * @return true si el producto se eliminó correctamente, false de lo contrario.
     */
    public boolean eliminarProducto(String codigo) {
        if (!this.productos.containsKey(codigo) ) {
            return false;
        }
        this.productos.remove(codigo);
        return true;
    }
        /**
     * Actualiza el stock de un producto en el inventario.
     * 
     * @param codigo El código del producto.
     * @param cantidad La nueva cantidad de stock.
     */
    public void actualizarStock(String codigo, int cantidad) {
        Producto producto = this.productos.get(codigo); // devuelve el valor 
        if (producto != null) {
            producto.setStock(cantidad);
        }
        else {
            System.out.println("El producto con el código " + codigo + " no existe");
        }

    }
        /**
     * Obtiene un producto del inventario.
     * 
     * @param codigo El código del producto.
     * @return El producto correspondiente al código, o null si no existe.
     */
    public Producto obtenerProducto(String codigo) {
        return this.productos.get(codigo);
    }
        /**
     * Obtiene una lista de todos los productos en el inventario.
     * 
     * @return La lista de productos.
     */
    public List<Producto> obtenerTodosLosProductos() {
        return new ArrayList<>(this.productos.values());
    }
        /**
     * Retira un producto del inventario.
     * 
     * @param codigo El código del producto.
     * @param razon La razón del retiro.
     * @return true si se retiró correctamente, false si el producto no existe en el inventario.
     */
    public boolean retirarProducto(String codigo, String razon) {
        if (productos.containsKey(codigo)) {
            Producto producto = productos.get(codigo);
            producto.retirarProducto(razon);
            return true;
        } else {
            return false;
        }
    }
        /**
     * Muestra los detalles de los productos en el inventario.
     */
    public void obtenerProductos() {
        if (this.productos.keySet().isEmpty() == true) {
                System.out.println("No hay productos en el inventario.");
            } 
            else {
                for (Producto producto : this.productos.values() ) {
                        System.out.println("Código: " + producto.getCodigo() );
                        System.out.println("Nombre: " + producto.getNombre() );
                        System.out.println("Stock: " + producto.getStock() );
                        System.out.println("----------------------");
                    }
            }
    
        }
    }


