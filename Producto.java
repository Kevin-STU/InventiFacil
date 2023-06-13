
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
    
    public Producto(String codigo, String nombre, int stock, String informacion, float precioUnitario)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.informacion = informacion;
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
    
    public int getStock(){
        return stock;
    }
    
    public void setStock(int stock){
        this.stock = stock;
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
        this.precioUnitario = precioUnitario;
    }
    
}
