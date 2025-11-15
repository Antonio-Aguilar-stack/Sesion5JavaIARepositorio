
package controlador;
import java.util.ArrayList;
import modelo.Producto;//llamada del paquete modelo y clase producto
import java.util.List;

public class GestorProductos {//inicia clase
    
    //arraylist almacenamiento
    List<Producto> productos = new ArrayList<>();
    public void agregarProducto(Producto p){//inicia metodo agregar objetos productos Lista
        productos.add(p);//agrega objetos productos a la lista 
        
        
    }//termina agregarProducto
    public void listarProductos(){//inicia metodo consultar
        if (productos.isEmpty()) {
            System.out.println("No hay Productos registrados :c");
            return;
            
        }
        productos.forEach(System.out::println);//imprimirr lista producto
    }//termina meotdo para consultar
    
public Producto buscarPorId(int id){//inicia metodo buscar por cammpo distintivo
    for (Producto p : productos){ //inicia if
        if (p.getId()==id){ 
            return p;
        }
    }//termina foreach
                return null;
}
public void eliminarProducto(int id){//inicia metodo eliminar
    Producto p = buscarPorId(id);
    if (p != null) {
        productos.remove(p);
        System.out.println("Producto(s) eliminados");
    } else {
                System.out.println("Error Producto(s) existente(s)");

    }
    
}//termina metodo producto
    
}//termina clase
