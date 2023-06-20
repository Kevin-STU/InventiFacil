
/**
 * La clase Usuario representa un usuario en el sistema.
 * 
 * author (Kevin Gallardo y Kevin Prada)
 * version (1.0)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private Encargado encargado;
    private Cliente cliente;
    private Vendedor vendedor;
    private Administrador administrador;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario()
    {
        // initialise instance variables
    }
    
    public Encargado getEncargado() {
        return encargado;
    }
    
    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public Administrador getAdministrador() {
        return administrador;
    }
    
    public void setAdministrador(Administrador administrador) { 
        this.administrador = administrador;
    }
}
