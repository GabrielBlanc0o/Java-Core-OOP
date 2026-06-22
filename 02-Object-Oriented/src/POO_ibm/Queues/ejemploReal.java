import java.util.LinkedList;
import java.util.Queue;

public class ejemploReal 
{
    public static void main(String []args)
    {
        Queue<String> customerQueue = new LinkedList<>();

        // clientes en la fila de la cola , usando .offer()
        customerQueue.offer("Cliente 1");
        customerQueue.offer("Cliente 2");
        customerQueue.offer("Cliente 3");

        // mostrar la cola actual
        System.out.println("Cliente actual en fila " + customerQueue);

        String clienteServido = customerQueue.poll();
        System.out.println("Cliente servido " + clienteServido);

        // mostrar la cola despues de servir a un cliente
        System.out.println("Cliente cola despues de atender uno: " + customerQueue);

        // sirviendo a otro cliente
        clienteServido = customerQueue.poll();
        System.out.println("Atendiendo: " + clienteServido);

        // estado final de la cola
        System.out.println("Ulitmo cliente de la fila: " + customerQueue);

    }
}
