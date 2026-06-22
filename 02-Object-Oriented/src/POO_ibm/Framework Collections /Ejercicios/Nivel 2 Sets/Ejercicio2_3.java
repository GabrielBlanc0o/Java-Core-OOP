import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio2_3 
{
    public static void main(String []args)    
    {
        Set<Integer> conjunto1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        
        Set<Integer> conjunto2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> conjuntoUnion = new HashSet<>(conjunto1); conjuntoUnion.addAll(conjunto2);
        System.out.println("Union:  "+conjuntoUnion);


        // para la interseccion de conjuntos en grupos de HashSet usamos retainAll
        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        System.out.println("Intersección: " + interseccion);

        // para la diferencia
        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);
        System.out.println("Diferencia: " + diferencia);
        
        }
    }

