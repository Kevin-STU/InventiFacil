import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * La clase Carrito representa un carrito de compras con funcionalidades para agregar y eliminar productos,
 * realizar ventas, obtener información sobre los productos en el carrito y generar informes de ventas.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class Carrito {
    // instance variables - replace the example below with your own
    private Map<String, Integer> miCarrito;
    private Inventario inventario;
    private List<Map<String, Integer>> ventas = new ArrayList<>();
    private double totalCosto = 0;
    private double ventasTotales = 0;
    /**
     * Constructor de la clase Carrito.
     */
    public Carrito() {
        this.miCarrito = new HashMap<>();
        this.inventario = Inventario.getInstance();
        // initialise instance variables
    }
    /**
     * Devuelve la lista de ventas realizadas.
     * 
     * @return La lista de ventas realizadas.
     */
    public List<Map<String, Integer>> ventas() {
        return ventas;
    }
    /**
     * Agrega un producto al carrito.
     * 
     * @param producto El producto a agregar.
     * @return true si el producto se agregó correctamente, false si no.
     */
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
        this.totalCosto += producto.getPrecioUnitario();
        return true;
    }
    /**
     * Devuelve el costo total de los productos en el carrito.
     * 
     * @return El costo total de los productos en el carrito.
     */
    public double getTotalCosto() {
        return this.totalCosto;
    }
        /**
     * Devuelve el total de ventas realizadas.
     * 
     * @return El total de ventas realizadas.
     */
    public double getVentasTotales() {
        return this.ventasTotales;
    }
    /**
     * Elimina un producto del carrito.
     * 
     * @param producto El producto a eliminar.
     * @return true si el producto se eliminó correctamente, false si no.
     */
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
            System.out.println("Producto eliminado del carrito.");
            return true;
        } else {
            System.out.println("El producto no existe en el carrito");
            return false;
        }

    }
    /**
     * Vacía el carrito, eliminando todos los productos.
     */
    public void clear() {
        this.miCarrito.clear();
    }
    /**
     * Realiza la venta de los productos en el carrito.
     * 
     * @return true si la venta se realizó correctamente, false si no.
     */
    public boolean sell() {
        if (this.miCarrito.isEmpty()) {
            System.out.println("El carrito está vacío");
            return false;
        }

        Iterator<String> iterator = this.miCarrito.keySet().iterator();
        while (iterator.hasNext()) {
            String codigo = iterator.next();
            Producto producto = this.inventario.obtenerProducto(codigo);

            if (producto == null) {
                System.out.println("El producto con el código " + codigo + " no existe");
                return false;
            }

            int cantidad = this.miCarrito.get(codigo);
            int stock = producto.getStock();

            if (cantidad >= stock) {
                System.out.println("No hay suficiente stock del producto " + producto.getNombre());
                return false;
            }

            producto.setStock(stock - cantidad);
            Map<String, Integer> venta = new HashMap<>();
            venta.put(codigo, cantidad);
            this.ventas.add(venta);
            iterator.remove(); // Remover de forma segura utilizando el iterator
        }
        this.ventasTotales += this.totalCosto;
        this.totalCosto = 0;
        System.out.println("Venta realizada existosamente.");
        return true;
    }
    /**
     * Obtiene la cantidad de un producto en el carrito.
     * 
     * @param codigoProducto El código del producto.
     * @return La cantidad del producto en el carrito.
     */
    public int getCantidadProducto(String codigoProducto) {
        if (miCarrito.containsKey(codigoProducto)) {
            return miCarrito.get(codigoProducto);
        } else {
            return 0;
        }
    }
        /**
     * Obtiene una lista de los productos en el carrito con su información detallada.
     * 
     * @return La lista de productos en el carrito.
     */
    public List<Map<String, String>> getProductos() {
        List<Map<String, String>> productos = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : miCarrito.entrySet()) {
            String codigo = entry.getKey();
            int cantidad = entry.getValue();
            Producto producto = inventario.obtenerProducto(codigo);
            if (producto != null) {
                Map<String, String> productoMap = new HashMap<>();
                productoMap.put("codigo", producto.getCodigo());
                productoMap.put("nombre", producto.getNombre());
                productoMap.put("precio", String.valueOf(producto.getPrecioUnitario()));
                productoMap.put("cantidad", String.valueOf(cantidad));
                productos.add(productoMap);
            }
        }
        return productos;
    }

}
