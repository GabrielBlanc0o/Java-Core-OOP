import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2_2 
{
    public static void main(String []args) 
    {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);
        numeros.add(1);
        numeros.add(9);
        System.out.println("HashSet : " + numeros);

        Set<Integer> numerosOrd = new TreeSet<>(numeros);
        System.out.println("TreeSet : " + numerosOrd);
    
    }
}
