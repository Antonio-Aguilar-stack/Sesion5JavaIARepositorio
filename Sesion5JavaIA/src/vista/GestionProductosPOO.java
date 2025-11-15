
package vista;
import modelo.Producto;
import controlador.GestorProductos;
import java.util.Scanner;

public class GestionProductosPOO {//inicia clase
    public static void main(String[] args) {//inicia main
        Scanner entradaDato=new Scanner(System.in);
        GestorProductos gestor =  new GestorProductos();
        System.out.println("bienvenido Sistema de Gestion");
        System.out.println("introduce ID");
        int id=entradaDato.nextInt();
        System.out.println("Captura nombre:");
        String nombre=entradaDato.next();
        System.out.println("Captura Precio");
        double precio=entradaDato.nextDouble();
        System.out.println("Captura stock");
        int stock=entradaDato.nextInt();
        
        gestor.agregarProducto(new Producto (id, nombre, precio, stock));//almacenar datos
        
        //consultar
        gestor.listarProductos();
        //busacrpor id
        System.out.println("Id a buscar:");
        Producto p = gestor.buscarPorId(entradaDato.nextInt());
        System.out.println(p != null? p: "Producto no encontrado");
        System.out.println("Id a eliminar");
        gestor.eliminarProducto(entradaDato.nextInt());
        //consultar para actulizar
        gestor.listarProductos();
        
    }
    
}
