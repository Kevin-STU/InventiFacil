import java.util.Date;
import java.text.SimpleDateFormat;
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
    
    public Encargado()
    {
        this.inventario = Inventario.getInstance();
    }
    
    public boolean agregarProducto(Producto producto) {
        boolean productoAgregado = inventario.addProduct(producto);
        if (productoAgregado) {
            return true;
        } else {
            return false;
        }
    }
    
    public void eliminarProducto(String codigo, String razon) {
        Producto producto = inventario.obtenerProducto(codigo);
        Date fechaRetiro = producto.getFechaRetiro();
        String razonRetiro = producto.getRazonRetiro(razon);
        boolean eliminado = inventario.eliminarProducto(codigo);
        if (eliminado) {
            System.out.println("Producto eliminado correctamente");
            System.out.println("Fecha de retiro: " + fechaRetiro);
            System.out.println("Razon de retiro: " + razonRetiro);
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
