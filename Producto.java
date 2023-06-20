import java.util.Date;
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    private String razonRetiro;
    
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
    
    public Date getFechaIngreso () {
        return fechaIngreso;
    }
    
    public void retirarProducto(String razon) {
        this.fechaRetiro = new Date();
        this.razonRetiro = razon;
        this.stock = 0;
    }
    
    public Date getFechaRetiro() {
        this.fechaRetiro = new Date();
        return fechaRetiro;
    }
    
    public String getRazonRetiro(String razon) {
        return razon;
    }
    
}
