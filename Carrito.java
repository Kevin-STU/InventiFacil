import java.util.HashMap;
import java.util.Map;

/**
 * Write a description of class Carrito here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carrito {
    // instance variables - replace the example below with your own
    private Map<String, Integer> miCarrito;
    private Inventario inventario;

    /**
     * Constructor for objects of class Carrito
     */
    public Carrito() {
        this.miCarrito = new HashMap<>();
        this.inventario = Inventario.getInstance();
        // initialise instance variables
    }

    public boolean addProduct(Producto producto) {
        if (!(producto instanceof Producto)) {
            return false;
        }
        // Revisar si el producto ya existe en el carrito
        if (this.miCarrito.containsKey(producto.getCodigo())) {
            // Si existe, aumentar la cantidad
            int cantidad = this.miCarrito.get(producto.getCodigo());
            this.miCarrito.put(producto.getCodigo(), cantidad + 1);
        } else {
            // Si no existe, agregarlo al carrito
            this.miCarrito.put(producto.getCodigo(), 1);
        }
        return true;
    }

    public boolean removeProduct(Producto producto) {
        if (!(producto instanceof Producto)) {
            return false;
        }
        // Revisar si el producto ya existe en el carrito
        if (this.miCarrito.containsKey(producto.getCodigo())) {
            // Si existe, disminuir la cantidad
            int cantidad = this.miCarrito.get(producto.getCodigo());
            if (cantidad > 1) {
                this.miCarrito.put(producto.getCodigo(), cantidad - 1);
            } else {
                this.miCarrito.remove(producto.getCodigo());
            }
            return true;
        } else {
            System.out.println("El producto no existe en el carrito");
            return false;
        }

    }

    public void clear() {
        this.miCarrito.clear();
    }

    public void sell() {
        for (String codigo : this.miCarrito.keySet()) {
            Producto producto = this.inventario.obtenerProducto(codigo);
            if (producto == null) {
                System.out.println("El producto con el código " + codigo + " no existe");
                continue;
            }
            int cantidad = this.miCarrito.get(codigo);
            int stock = producto.getStock();
            if (cantidad >= stock) {
                System.out.println("No hay suficiente stock del producto " + producto.getNombre());
                continue;
            }
            producto.setStock(stock - cantidad);
            this.miCarrito.remove(codigo);
        }
    }

}
