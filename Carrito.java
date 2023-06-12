import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Carrito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrito
{
    // instance variables - replace the example below with your own
    public List<Producto> miLista;

    /**
     * Constructor for objects of class Carrito
     */
    public Carrito()
    {
        // initialise instance variables
        List<Producto> miLista = new ArrayList<Producto>();
    }

    public void addProduct(Producto producto){
        miLista.add(producto);
    }
}
