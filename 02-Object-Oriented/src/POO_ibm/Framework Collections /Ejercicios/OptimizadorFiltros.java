import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class OptimizadorFiltros {
    public static void main(String[] args) {
        ArrayList<String> entradaTaller = new ArrayList<>();
        entradaTaller.add("Porsche");
        entradaTaller.add("BMW");
        entradaTaller.add("Porsche"); // Repetido
        entradaTaller.add("Audi");
        entradaTaller.add("BMW");     // Repetido
        System.out.println("Original: " + entradaTaller);
        // TU LÓGICA AQUÍ: 
        // 1. Pásalo a un HashSet para matar duplicados.
        HashSet<String> mapList = new  HashSet<>(entradaTaller);
        System.out.println("Quitar duplicados: " + mapList);

        // 2. Pásalo a un TreeSet para ordenar alfabéticamente.
        TreeSet<String> treeList = new TreeSet<>(mapList);
        System.out.println("Ordenado sin repeticiones por orden ABC :"+treeList);


        // 3. Imprímelo.



    }
}