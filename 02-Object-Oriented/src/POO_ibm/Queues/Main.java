import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    public static void main(String []args)
    {
        //creando la cola
        Queue<String> queue = new LinkedList<>(); // para q pueda almacenar cadenas

        // agregar elementos a la cola por la lista entrelazada
        queue.offer("manzana");
        queue.offer("banana");
        queue.offer("cereza");

        // mostrar la cola
        System.out.println("queue: " + queue);

        // remover elemento de la cola
        String elementoRemovido = queue.poll();
        System.out.println("Elemento removido: " + elementoRemovido);

        // mostrar la cola despues de remover
        System.out.println("Queue despues de remover el elemento " + queue);
    }
}