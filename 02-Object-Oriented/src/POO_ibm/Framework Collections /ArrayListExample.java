import java.util.ArrayList;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        // para crear un array list iniciamos la lista
        // con el tipo de dato + nombre y ArrayList
        ArrayList<String> frutas = new ArrayList<>();

        //agregar elementos
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Cereza");

        // mostrar la lista 
        System.out.println("Frutas: "+ frutas);

        // accedemos a un elemento en especial con .get
        String primeraFruta = frutas.get(0);
        System.out.println("Primera fruta: "+ primeraFruta);
    }
}
