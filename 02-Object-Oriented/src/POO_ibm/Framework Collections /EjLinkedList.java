import java.util.LinkedList;

public class EjLinkedList 
{
    public static void main(String[] args)
    {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Perro");
        animals.add("Gato");
        animals.add("Elefante");
        System.out.println("Animales: "+ animals);

        // add para agregar elementos
        // get para obtener de un indice en especial
        // remove para eliminarlo de la lista 

        animals.get(1);
        animals.remove(1);
    }
}