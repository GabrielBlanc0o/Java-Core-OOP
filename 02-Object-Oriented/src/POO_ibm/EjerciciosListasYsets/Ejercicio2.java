
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 
{
    public static void main(String []args)
    {
        List<String> acciones = new ArrayList<>();
        acciones.add("Login Exitoso");
        acciones.add("Consulta de métricas");
        acciones.add("Generación de reporte");
        acciones.add("Error de conexión en BD");
        acciones.add("Cierre de sesion");

    List<String> accionesInversas = new ArrayList<>(acciones);
        for (int i =  0 ; i < accionesInversas.size()  / 2 ; ++i)
        {
          int j = accionesInversas.size() - 1 - i;
          
          String temporal = accionesInversas.get(i);       // Guardamos el elemento de la izquierda
          accionesInversas.set(i, accionesInversas.get(j)); // Ponemos el de la derecha en la izquierda
          accionesInversas.set(j, temporal);

        }
        System.out.println(accionesInversas  );
    }
}