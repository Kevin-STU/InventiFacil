
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
    
    public Producto(String codigo, String nombre, int stock, String informacion)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.informacion = informacion;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getStock(){
        return stock;
    }
    
    public String getInformacion() {
        return informacion;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public void setInformacion(String nuevaInformacion) {
        this.informacion = nuevaInformacion;
    }
    
}
