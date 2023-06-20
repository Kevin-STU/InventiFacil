import java.util.Map;

/**
 * La clase Vendedor representa a un vendedor en el sistema.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class Vendedor
{
    // instance variables - replace the example below with your own
    private Carrito carrito;
    private Cliente cliente;
    public Carrito carritoActual;

    /**
     * Constructor de la clase Vendedor.
     */
    public Vendedor()
    {
        createCarrito();
    }
        /**
     * Crea un nuevo carrito para el vendedor.
     */
    public void createCarrito(){
        this.carrito = new Carrito();
        this.carritoActual = this.carrito;
    }
       /**
     * Agrega un producto al carrito del vendedor.
     * 
     * @param producto El producto a agregar.
     */
    public void agregarProductoAlCarrito(Producto producto) {
        carrito.addProduct(producto);
        this.mostrarCarrito();
    }
        /**
     * Elimina un producto del carrito del vendedor.
     * 
     * @param producto El producto a eliminar.
     */
    public void eliminarProductoDelCarrito(Producto producto) {
        carrito.removeProduct(producto);
    }
    
    public void vaciarCarrito() {
        carrito.clear();
    }
    
    public boolean realizarVenta() {
        return carrito.sell();
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
   /**
     * Muestra los productos en el carrito del vendedor.
     */
    public void mostrarCarrito() {
        System.out.println("=== Carrito ===");
        for (Map<String, String> producto : carrito.getProductos()) {
            System.out.println("Código: " + producto.get("codigo"));
            System.out.println("Nombre: " + producto.get("nombre"));
            System.out.println("Precio: " + producto.get("precio"));
            System.out.println("Cantidad: " + producto.get("cantidad"));
            System.out.println("------------------------");
            
        }
        double costoTotal = carrito.getTotalCosto();
        System.out.println("Costo total del carrito: " + costoTotal);
    }


}
