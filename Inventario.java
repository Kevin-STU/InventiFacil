import java.util.*; 

/**
 * Write a description of class Inventario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventario
{
    private Map<String, Producto> productos;
    private static Inventario inventario;

    private Inventario(){
        this.productos = new HashMap<>(); 
    }
    public static Inventario getInstance(){
        if (Inventario.inventario == null){
            Inventario.inventario = new Inventario();
        }
        return Inventario.inventario;
    }
    
    public boolean addProduct(Producto producto) {
        this.productos.put(producto.getCodigo(), producto);
        return true;
    }
    
    public boolean eliminarProducto(String codigo) {
        if (!this.productos.containsKey(codigo) ) {
            return false;
        }
        this.productos.remove(codigo);
        return true;
    }
    
    public void actualizarStock(String codigo, int cantidad) {
        Producto producto = this.productos.get(codigo); // devuelve el valor 
        if (producto != null) {
            producto.setStock(cantidad);
        }
        else {
            System.out.println("El producto con el código " + codigo + " no existe");
        }

    }
    
    public Producto obtenerProducto(String codigo) {
        return this.productos.get(codigo);
    }
    
    public List<Producto> obtenerTodosLosProductos() {
        return new ArrayList<>(this.productos.values());
    }
    
    public boolean retirarProducto(String codigo, String razon) {
        if (productos.containsKey(codigo)) {
            Producto producto = productos.get(codigo);
            producto.retirarProducto(razon);
            return true;
        } else {
            return false;
        }
    }
    
    public void obtenerProductos() {
        if (this.productos.keySet().isEmpty() == true) {
                System.out.println("No hay productos en el inventario.");
            } 
            else {
                for (Producto producto : this.productos.values() ) {
                        System.out.println("Código: " + producto.getCodigo() );
                        System.out.println("Nombre: " + producto.getNombre() );
                        System.out.println("Stock: " + producto.getStock() );
                        System.out.println("Información: " + producto.getInformacion() );
                        System.out.println("----------------------");
                    }
            }
    
        }
    }


