import java.util.HashMap;

public class counterString 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> worldCount = new HashMap<>();
        
        String texto = "manzana banana manzana naranja banana manzana";

        String[] palabras = texto.split(" ");

        for (String palabra : palabras)
        {
            worldCount.put(palabra,worldCount.getOrDefault(palabra,0) + 1);
        }

        System.out.println(worldCount);

        // Entonces en este ejercicio aprendimos:
        /*
            1 creamos nuestro hashmap comun con nuestro valor a iterar q seria el string
            2 creamos el arreglo sencillo que volvera cada valor independiente , separandolo
                con espacio detectado (Usamos .split() ) 

            3 iteramos en ese arreglo de string donde esta todo


            4 PASO IMPORTANTE!!!
            llamamos a nuestro hashmap para rellenarlo de datos con .put , luego le indicamos
            que sera con los valores uno por uno de palabras (palabra) ,  y el valor va ser contar

            con .getOrDefault(valorIndividual, 0) + 1 
            
            esto lo q hace es q si el valorIndividual sale mas de una vez le sume 1, si no ,
            no sume nada, en este caso por lo que esta prehecho el minimo puede iniciar en 1
        */
    }    
}
