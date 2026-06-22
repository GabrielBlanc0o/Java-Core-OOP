
import java.util.HashSet;

public class Ejercicio2_1{
    public static void main(String []args)
    {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Beatriz");
        nombres.add("Carlos");

        System.out.println(nombres);

        // HashSet quita los duplicados pero no ordena de manera alfabetica

    }
}