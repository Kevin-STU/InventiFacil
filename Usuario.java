
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
