import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Fabrica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fabrica
{
    private static Scanner scanner = new Scanner(System.in);
    private static Inventario inventario = Inventario.getInstance();
    private static Encargado encargado = new Encargado();
    private static Vendedor vendedor = new Vendedor();
    private static Cliente cliente;
    private static Administrador administrador = new Administrador();

    /**
     * Constructor for objects of class Fabrica
     */
    public static void main(String[] args)
    {
        
        Producto producto1 = new Producto("P001", "Lenteja", "Lenteja Frescampo 500 gr",2980, 25);
        Producto producto2 = new Producto("P002", "Panela", "Panela Cuadrada 400 gr", 1930, 50);
        Producto producto3 = new Producto("P003", "Leche Entera", "Leche Entera 5400 ml", 18840, 38);
        
        encargado.agregarProducto(producto1);
        encargado.agregarProducto(producto2);
        encargado.agregarProducto(producto3);
        
        mostrarMenuPrincipal();

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    private static void mostrarMenuPrincipal() {
        boolean salir = false;
        while (!salir) {
            System.out.println("/¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\\\n" + "|     Menú Principal         |\n" + "\\____________________________/");
            System.out.println("1. Iniciar sesión como Encargado");
            System.out.println("2. Iniciar sesión como Vendedor");
            System.out.println("3. Iniciar sesión como Cliente");
            System.out.println("4. Iniciar sesión como Administrador");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    iniciarSesionEncargado();
                    break;
                case 2:
                    iniciarSesionVendedor();
                    break;
                case 3:
                    break;
                case 4:
                    iniciarSesionAdministrador();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
    
    public static void iniciarSesionEncargado() {
        System.out.println("╔ Sesión Iniciada - Encargado ===");
        mostrarMenuEncargado();
    }
    
    public static void mostrarMenuEncargado() {
        boolean salir = false;
        while (!salir) {
            System.out.println("/¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\\\n" + "|     Menú Encargado         |\n" + "\\____________________________/");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    modificarProducto();
                    break;
                case 4:
                    mostrarInventario();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválidad. Por favor, seleccione una opción válida.");
                    break;          
            }
        }
    }
    
    public static void agregarProducto() {
        System.out.println("=== Agregar Producto ===");
        System.out.println("Ingrese el código del producto: ");
        String codigo = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la descripción/información del producto: ");
        String informacion = scanner.nextLine();
        
        System.out.println("Ingrese el precio unitario del producto: ");
        float precioUnitario = scanner.nextFloat();
        
        System.out.println("Ingrese el stock del producto: ");
        int stock = scanner.nextInt();
        
        Producto producto = new Producto(codigo, nombre, informacion, precioUnitario, stock);
    
        encargado.agregarProducto(producto);
        Date fechaIngreso = producto.getFechaIngreso();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaIngresoFormateada = dateFormat.format(fechaIngreso);

        System.out.println("Fecha de ingreso del producto: " + fechaIngresoFormateada);
    }
    
    public static void eliminarProducto() {
        System.out.println("=== Eliminar Producto ===");
        System.out.println("Ingrese el código del producto a eliminar: ");
        String codigo = scanner.nextLine();
        
        System.out.println("Ingrese la razón de retiro del producto: ");
        String razon = scanner.nextLine();
        
        encargado.eliminarProducto(codigo, razon);
    }
    
    public static void modificarProducto() {
        System.out.println("=== Modificar Producto ===");
        System.out.println("Ingrese el código del producto a modificar: ");
        String codigo = scanner.nextLine();
        
        System.out.println("Ingrese el nuevo stock del producto: ");
        int stock = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Ingrese la nueva descripción/información del producto: ");
        String nuevaInformacion = scanner.nextLine();
        
        encargado.modificarProducto(codigo, stock, nuevaInformacion); 
    }
    
    public static void mostrarInventario() {
        System.out.println("=== Inventario ===");
        inventario.obtenerProductos();
    }
    
    public static void iniciarSesionVendedor() {
        System.out.println("=== Sesión Iniciada - Vendedor ===");
        
        mostrarMenuVendedor();
    }
    
    public static void mostrarMenuVendedor() {
        boolean salir = false;
        while (!salir) {
            System.out.println("/¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\\\n" + "|     Menú Vendedor         |\n" + "\\____________________________/");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Eliminar producto del carrito");
            System.out.println("3. Realizar venta");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarProductoAlCarrito();
                    break;
                case 2:
                    eliminarProductoDelCarrito();
                    break;
                case 3:
                    crearCliente();
                    mostrarDatosCliente();
                    realizarVenta();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por faovr, selecciona una opción válida.");
                    break;
            }
        }
    }
    
    public static void agregarProductoAlCarrito() {
        System.out.println("=== Agregar Producto al Carrito ===");
        System.out.println("Ingrese el código del producto a agregar: ");
        String codigo = scanner.nextLine();
        
        // Obtención del producto del inventario
        Producto producto = inventario.obtenerProducto(codigo);
        if (producto != null) {
            // Agg el producto al carrito
            vendedor.agregarProductoAlCarrito(producto);
            System.out.println("Producto agregado al carrito.");
        } else {
            System.out.println("El producto con el código " + codigo + " no existe en el inventario.");
        }
    }
    
    public static void eliminarProductoDelCarrito() {
        System.out.println("=== Eliminar Producto al Carrito ===");
        System.out.println("Ingrese el código del producto a agregar:");
        String codigo = scanner.nextLine();
        
        Producto producto = inventario.obtenerProducto(codigo);
        if (producto != null) {
            // Agregar el producto al carrito
            vendedor.eliminarProductoDelCarrito(producto);
            System.out.println("Producto eliminado del carrito.");
        } else {
            System.out.println("El producto con el código " + codigo + " no existe en el inventario.");
        }
    }
    
    public static void realizarVenta() {
        System.out.println("=== Realizar Venta ===");
        vendedor.realizarVenta();
        System.out.println("Venta realizada existosamente.");
        
    }
    
    public static void iniciarSesionAdministrador() {
        System.out.println("=== Inicio de Sesión - Administrador ===");
        
        mostrarMenuAdministrador();
    }
    
    public static void mostrarMenuAdministrador() {
        boolean salir = false;
        while (!salir) {
            System.out.println("/¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\\\n" + "|     Menú Administrador         |\n" + "\\____________________________/");
            System.out.println("1. Realizar operaciones administrativas");
            System.out.println("2. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    realizarOperacionesAdministrativas();
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
    
    public static void realizarOperacionesAdministrativas() {
        System.out.println("=== Operaciones Administrativas ===");
    }
    
    private static void crearCliente() {
        System.out.println("=== Crear Cliente === ");
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrse la identificación del cliente: ");
        String identificacion = scanner.nextLine();
        
        cliente = new Cliente(nombre, identificacion);
        
    }
    
    private static void mostrarDatosCliente() {
        if (cliente != null) {
            System.out.println("=== Datos del Cliente ===");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Identificación: " + cliente.getIdentificacion());
        } else {
            System.out.println("No hay un cliente registrado.");
        }
    }
}
