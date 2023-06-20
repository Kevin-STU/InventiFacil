import java.util.*;
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String identificacion;
    private Map<String, String> preferencias;
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String identificacion)
    {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.preferencias = new HashMap<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    
    public Map<String, String> getPreferencias() {
        return preferencias;
    }
    
    public void agregarPreferencia(String clave,String valor) {
        preferencias.put(clave, valor);
    }
    
    public void eliminarPreferencia(String clave) {
        preferencias.remove(clave);
    }
}
