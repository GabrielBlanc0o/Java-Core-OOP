import java.util.LinkedList;
import java.util.Queue;

public class EjemploPropio {
    public static void main(String []args)
    {
        // 1. Cree una cola (Queue) que almacene cadenas (String) llamada 'colaReportes'
        Queue<String> colaReportes = new LinkedList<>();

        // 2. Llegaron 4 solicitudes de reportes en este orden. Intégrelas a la cola:
        //    - "Reporte Financiero Mensual - Empresa A"
        //    - "Métricas de Tráfico SQL - Empresa B"
        //    - "Auditoría de Seguridad - Empresa C"
        //    - "Reporte de Ventas Trimestral - Empresa D"
        colaReportes.offer("Reporte Financiero Mensual - Empresa A");
        colaReportes.offer("Métricas de Tráfico SQL - Empresa B");
        colaReportes.offer("Auditoría de Seguridad - Empresa C");
        colaReportes.offer("Reporte de Ventas Trimestral - Empresa D");
        
        
        // 3. Muestre en consola cuántos reportes hay pendientes por procesar actualmente
        //    (Tip: Use el método .size() que ya conoce de las listas)
        System.out.println("Reportes pendientes " + colaReportes.size());


        // 4. EL ESPÍA: Use el método 'colaReportes.peek()' para guardar en una variable String
        //    cuál es el SIGUIENTE reporte en la fila, e imprímalo en consola. 
        //    (Ojo: La cola no debe modificarse todavía).
        
        for (int i = 0 ; i < colaReportes.size() - 1 ; i++) 
            {
            {
                String siguiente = colaReportes.peek();
                System.out.println("Procesando con éxito: " + siguiente);
                colaReportes.poll();
            }
            }
        

        
        // 5. PROCESAMIENTO: Saque (atienda) los primeros DOS reportes de la cola usando .poll()
        //    E imprima un mensaje en consola simulando el proceso, por ejemplo:
        //    "Procesando con éxito: [Nombre del reporte]"
            
                //System.out.println("Procesando con éxito: " + colaReportes.peek());
                //colaReportes.poll();
                
            System.out.println("Reportes que quedaron atrapados en la cola: \n" + colaReportes);


        // 6. ESTADO FINAL: Muestre en consola los reportes que quedaron atrapados en la cola
        //    esperando a que el servidor se desocupe.

    }
    
}
