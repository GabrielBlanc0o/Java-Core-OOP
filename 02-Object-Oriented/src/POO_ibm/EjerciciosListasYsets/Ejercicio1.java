import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

interface metodos {
    void garantizar(Collection<String> lista);
     
}

class verificador implements metodos
{
    
    @Override
    public void garantizar(Collection<String> coleccion)
    {
        for (String dato : coleccion)
        {
            System.out.println(dato);
        }
    }

}

public class Ejercicio1
{
    public static void main(String[] args) {
        {
            verificador veri = new verificador();
            List<String> listaOK1 = new LinkedList<>();
            
            listaOK1.add("HIJ-789");
            listaOK1.add("ABC-123");
            listaOK1.add("DEF-456");
            listaOK1.add("ABC-123");
            listaOK1.add("DEF-456");
            
            System.out.println("Lista desordenada ");
            veri.garantizar(listaOK1);
            
            Set<String> listaNew = new LinkedHashSet<>(listaOK1);
            System.out.println("Lista ordenada ");
            veri.garantizar(listaNew);

            Set<String> listaOrdenada = new TreeSet<>(listaOK1);
            System.out.println("Lista sin duplicados ");
            veri.garantizar(listaOrdenada);

        }
    }
}