

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class InventarioTest.
 *
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class InventarioTest
{
    private Producto producto1;
    private int stock;
    private float precioUnitario;

    /**
     * Default constructor for test class InventarioTest
     */
    public InventarioTest()
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
    public void testInventarioProducto()
    {
        Inventario inventario = Inventario.getInstance();
        assertNotNull(inventario);
        inventario.actualizarStock("1", 100);
        assertEquals(false, inventario.eliminarProducto("1"));
        assertNull(inventario.obtenerProducto("1"));
        inventario.addProduct(producto1);
        assertEquals(producto1, inventario.obtenerProducto("1"));
        inventario.actualizarStock("1", 100);
        assertEquals(100, inventario.obtenerProducto("1").getStock());
        inventario.actualizarStock("1", -50);
        assertEquals(100, inventario.obtenerProducto("1").getStock());
        assertEquals(true, inventario.eliminarProducto("1"));
    }
}


