import java.util.HashMap;

public class HashMapExample 
{
    public static void main(String[] args) 
    {
        //creando el hashMap
        HashMap<String,Integer> mapa = new HashMap<>();
        
        //agregar valores al hashmap
        mapa.put("Manzana" , 1);
        mapa.put("Banano" , 2);
        mapa.put("Cereza" , 3);

        // acceder a los valores
        System.out.println("Valor de la llave 'Manzana': " + mapa.get("Manzana"));

        // iterar por el hashmap y mostrar todo el contenido que tiene

        for (String llave : mapa.keySet())
        {
            System.out.println(llave + ": " + mapa.get(llave));
        }

        // para ver si existe la llave 

        if(mapa.containsKey("Cereza"))
        {
            System.out.println("Cereza si existe.");
        }

        // remover la llave:valor pares
        mapa.remove("Cereza");

        // acceder a los valores
        System.out.println("Valor de la llave a 'Manzana': " + mapa.get("Manzana"));

        /**
         * Entonces los HashMaps son de clave valor para buscar elementos en el 
         * usamos .get(), luego para iterar en sus elementos internos
         * el Hashmap debe tener keySet() para volverse iterable
         * 
         * para buscar si un elemento existe usamos containsKey() dentro de los
         * parentesis lo que queremos corroborar
         * 
         * .remove() para eliminar un elemeto del diccionario
         * 
         * ahora hare un ejemplo que cuenta la cantidad de palabras en un string
         */
    }
}

