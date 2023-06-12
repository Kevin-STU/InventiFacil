
/**
 * Write a description of class Encargado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Encargado
{
    // instance variables - replace the example below with your own
    private Inventario inventario;
    private Producto producto;
    
    public Encargado(Inventario inventario)
    {
        this.inventario = inventario;
    }
    
    public void agregarProducto(Producto producto) {
        inventario.agregarProducto(producto);
    }
    
    public void eliminarProducto(String codigo) {
        boolean eliminado = inventario.eliminarProducto(codigo);
        if (eliminado) {
            System.out.println("Producto eliminado correctamente");
        }
        else {
            System.out.println("El producto con el código " + codigo + " no existe en el inventario.");
        }
    }

    public void modificarProducto(String codigo, int nStock, String nuevaInformacion) {
        Producto producto = inventario.obtenerProducto(codigo);
        if (producto != null) {
            producto.setStock(nStock);
            producto.setInformacion(nuevaInformacion);
            System.out.println("Producto modificado correctamente");
        }
        else {
            System.out.println("El producto con el código " + codigo + " no existe en el inventario.");
        }
    }
    
    public void registrarEntradaSalida(String codigo, int cantidad, String estado, boolean permiteDevolucion) {
        
    }
    
}
