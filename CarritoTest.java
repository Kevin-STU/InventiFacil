
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CarritoTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarritoTest {
    private Producto producto1;
    private Carrito carrito1 = new Carrito();

    /**
     * Default constructor for test class CarritoTest
     */
    public CarritoTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        this.producto1 = new Producto("P001", "Lenteja", "Lenteja Frescampo 500 gr", 2980, 25);

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCarrito() {
        assertEquals(true, this.carrito1.addProduct(producto1));
        assertEquals(true, this.carrito1.removeProduct(producto1));
    }
}
