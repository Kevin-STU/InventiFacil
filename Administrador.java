
import java.util.*;
/**
 * Write a description of class Administrador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Administrador
{
    private List<Usuario> usuarios;
    private Inventario inventario;
    
    /**
     * Constructor for objects of class Administrador
     */
    public Administrador()
    {
        usuarios = new ArrayList<>();
        inventario = Inventario.getInstance();
    }
    
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
    
    public List<Usuario> getUusarios() {
        return usuarios;
    }
    
    public void generarInformeVentas() {
        // generación de informes de las ventas
        
        // acceder a  los datos de las ventas y generar un buen informe detallado 
        // imprimirlo por consola o tal vez exportar un archivo?
        
    }
    
    public void generarInformeInventario() {
        // generación de informes del inventario
        
    }

    public void generarInformeClientes() {
        
    }
    
}
