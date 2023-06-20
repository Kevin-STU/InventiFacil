import java.util.Date;
/**
 * La clase Producto representa un producto en el inventario.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class Producto
{
    private String codigo;
    private String nombre;
    private int stock;
    private String informacion;
    private float precioUnitario;
    private Date fechaIngreso;
    private Date fechaRetiro;
        /**
     * Constructor de la clase Producto.
     * 
     * @param codigo El código del producto.
     * @param nombre El nombre del producto.
     * @param informacion La información del producto.
     * @param precioUnitario El precio unitario del producto.
     * @param stock El stock del producto.
     */
    public Producto(String codigo, String nombre, String informacion, float precioUnitario, int stock)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.informacion = informacion;
        this.fechaIngreso = new Date();
    }
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getInformacion() {
        return informacion;
    }
    
    public void setInformacion(String nuevaInformacion) {
        this.informacion = nuevaInformacion;
    }
    
    public float getPrecioUnitario(){
        return precioUnitario;
    }
    public void setPrecioUnitario(float precioUnitario){
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }
    public int getStock(){
        return stock;
    }
    
    public void setStock(int stock){
        if (stock >= 0) {
            this.stock = stock;
        }
    }
        /**
     * Obtiene la fecha de ingreso del producto.
     * 
     * @return La fecha de ingreso del producto.
     */
    public Date getFechaIngreso () {
        return fechaIngreso;
    }
        /**
     * Retira el producto del inventario.
     * 
     * @param razon La razón del retiro del producto.
     */
    public void retirarProducto(String razon) {
        this.fechaRetiro = new Date();
        this.stock = 0;
    }
        /**
     * Obtiene la fecha de retiro del producto.
     * 
     * @return La fecha de retiro del producto.
     */
    public Date getFechaRetiro() {
        this.fechaRetiro = new Date();
        return fechaRetiro;
    }
        /**
     * Obtiene la razón de retiro del producto.
     * 
     * @param razon La razón de retiro del producto.
     * @return La razón de retiro del producto.
     */
    public String getRazonRetiro(String razon) {
        return razon;
    }
    
}
