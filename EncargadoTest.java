

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class EncargadoTest.
 *
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class EncargadoTest
{
    private Producto producto1;
    private Encargado encargado;
    /**
     * Default constructor for test class EncargadoTest
     */
    public EncargadoTest()
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
        this.producto1 = new Producto("P001", "Lenteja", "Lenteja Frescampo 500 gr",2980, 25);
        this.encargado = new Encargado();
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
    public void testAgregarProducto()
    {
        assertEquals("El producto con el código P2221 no existe en el inventario.", this.encargado.eliminarProducto("P2221", "Vencido"));
        assertEquals(true, this.encargado.agregarProducto(producto1));
    }

    @Test
    public void testModificarProducto(){
        assertEquals("El producto con el código P2221 no existe en el inventario.", this.encargado.modificarProducto("P2221", 30, "Lenteja Frescampo 500 gr"));
        assertEquals("Producto modificado correctamente", this.encargado.modificarProducto("P001", 1, "Lenteja Frescampo 500 gr"));
    }
}
