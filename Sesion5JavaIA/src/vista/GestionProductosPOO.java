
package vista;
import modelo.Producto;
import controlador.GestorProductos;
import java.util.Scanner;

public class GestionProductosPOO {//inicia clase
    public static void main(String[] args) {//inicia main
        Scanner entradaDato=new Scanner(System.in);//captura cualquier tipo de dato
        GestorProductos gestor =  new GestorProductos();//para uso y llamdo del metodo 
       int ciclo;
       
       do{//inicio do
           System.out.println("Menu Productos\n1. Agregra\n2. consultar\n3. Eliminar\n4. salir\n");
           ciclo=entradaDato.nextInt();//para capturar opcion menu
           switch (ciclo) {//inicio switch
               case 1:
        System.out.println("introduce ID");
        int id=entradaDato.nextInt();
        System.out.println("Captura nombre:");
        String nombre=entradaDato.next();
        System.out.println("Captura Precio");
        double precio=entradaDato.nextDouble();
        System.out.println("Captura stock");
        int stock=entradaDato.nextInt();
        
        gestor.agregarProducto(new Producto (id, nombre, precio, stock));//almacenar datos
                   break;
               case 2:
               gestor.listarProductos();
                   break;
               case 3:
                           //consultar
        //busacrpor id
        System.out.println("Id a buscar:");
        Producto p = gestor.buscarPorId(entradaDato.nextInt());
        System.out.println(p != null? p: "Producto no encontrado");
        System.out.println("Id a eliminar");
        gestor.eliminarProducto(entradaDato.nextInt());
        //consultar para actulizar
        gestor.listarProductos();
                   break;
               case 4:
                   System.out.println("Finalizo programa O:");
                   break;
               case 5:break;
               case 6:break;
               default:System.out.println("Opcion invalida solo puede usar 1,2,3 y 4");
                   break;
           }//termina swicht
       }while(ciclo!=4);
       

        

        
    }
    
}
