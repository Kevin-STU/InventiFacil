import java.util.*;
/**
 * La clase Cliente representa a un cliente con su nombre, identificación y preferencias.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String identificacion;
    private Map<String, String> preferencias;
    /**
     * Constructor de la clase Cliente.
     * 
     * @param nombre El nombre del cliente.
     * @param identificacion La identificación del cliente.
     */
    public Cliente(String nombre, String identificacion)
    {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.preferencias = new HashMap<>();
    }
        /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }
        /**
     * Obtiene la identificación del cliente.
     * 
     * @return La identificación del cliente.
     */
    public String getIdentificacion() {
        return identificacion;
    }
        /**
     * Obtiene las preferencias del cliente.
     * 
     * @return Las preferencias del cliente.
     */
    public Map<String, String> getPreferencias() {
        return preferencias;
    }
        /**
     * Agrega una preferencia al cliente.
     * 
     * @param clave La clave de la preferencia.
     * @param valor El valor de la preferencia.
     */
    public void agregarPreferencia(String clave,String valor) {
        preferencias.put(clave, valor);
    }
        /**
     * Elimina una preferencia del cliente.
     * 
     * @param clave La clave de la preferencia a eliminar.
     */
    public void eliminarPreferencia(String clave) {
        preferencias.remove(clave);
    }
}
