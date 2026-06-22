import java.util.TreeMap;

public class TreeMapExample 
{
    public static void main(String []args) 
    {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        // agregar valores
        treeMap.put("Banana", 2);
        treeMap.put("Manzana", 1);
        treeMap.put("Cereza", 3);

        // acceder a los valores

        System.out.println("Valor para la llave 'Manzana':  " + treeMap.get("Manzana"));

        // iterar igual en el tree map

        for (String fruta : treeMap.keySet())
        {
            System.out.println(fruta + ": " + treeMap.get(fruta));
        }

        // checking si una llave existe 
        if (treeMap.containsKey("Cereza"))
        {
            System.out.println("cereza existe en el treeMap");
        }

        // remover elemento del treemap
        treeMap.remove("Cereza");
    }
}
