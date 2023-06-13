
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ProductoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductoTest
{
    private Producto producto1;
    private int stock;
    private float precioUnitario;

    /**
     * Default constructor for test class ProductoTest
     */
    public ProductoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        this.producto1 = new Producto("1", "Queso", "Queso delicioso unico en la vida", 8000, 33);
        this.stock = producto1.getStock();
        this.precioUnitario = producto1.getPrecioUnitario();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void stockTest()
    {
        producto1.setStock(-10);
        assertEquals(this.stock, producto1.getStock());
        producto1.setStock(0);
        assertEquals(0, producto1.getStock());
        producto1.setStock(10);
        assertEquals(10, producto1.getStock());
    }

    @Test
    public void precioUnitarioTest()
    {
        producto1.setPrecioUnitario(-10);
        assertEquals(this.precioUnitario, producto1.getPrecioUnitario());
        producto1.setPrecioUnitario(0);
        assertEquals(0, producto1.getPrecioUnitario());
        producto1.setPrecioUnitario(10);
        assertEquals(10, producto1.getPrecioUnitario());
    }
}


