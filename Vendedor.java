
/**
 * Write a description of class Vendedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vendedor
{
    // instance variables - replace the example below with your own
    private Carrito carrito;
    private Cliente cliente;

    /**
     * Constructor for objects of class Vendedor
     */
    public Vendedor()
    {
        carrito = new Carrito();
    }
    
    public void createCarrito(){
        this.carrito = new Carrito();
    }
    
    public void agregarProductoAlCarrito(Producto producto) {
        carrito.addProduct(producto);
    }
    
    public void eliminarProductoDelCarrito(Producto producto) {
        carrito.removeProduct(producto);
    }
    
    public void vaciarCarrito() {
        carrito.clear();
    }
    
    public void realizarVenta() {
        carrito.sell();
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
}
