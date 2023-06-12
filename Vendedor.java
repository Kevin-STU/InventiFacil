
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
    }

    public void createCarrito(){
        this.carrito = new Carrito();
    }
}
