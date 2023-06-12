import java.util.*; 

/**
 * Write a description of class Inventario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventario
{
    // instance variables - replace the example below with your own
    // private Producto producto;
    private Map<String, Producto> productos;
    public Inventario()
    {
        productos = new HashMap<>(); 
 
    }
    
    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }
    
    public boolean eliminarProducto(String codigo) {
        if (productos.containsKey(codigo) ) {
            productos.remove(codigo);
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public void actualizarStock(String codigo, int cantidad) {
        Producto producto = productos.get(codigo); // devuelve el valor 
        if (producto != null) {
            producto.setStock(cantidad);
        }
        else {
            System.out.println("El producto con el código " + codigo + " no existe");
        }
        
    }
    
    public Producto obtenerProducto(String codigo) {
        return productos.get(codigo);
    }
    
    /*public List<Producto> obtenerTodosLosProductos() {
        return new ArrayList<>(productos.values());
    }*/
    
    public void obtenerProductos() {
        if (productos.keySet().isEmpty() == true) {
                System.out.println("No hay productos en el inventario.");
            } 
            else {
                for (Producto producto : productos.values() ) {
                        System.out.println("Código: " + producto.getCodigo() );
                        System.out.println("Nombre: " + producto.getNombre() );
                        System.out.println("Stock: " + producto.getStock() );
                        System.out.println("----------------------");
                    }
            }
    
        }
    }


