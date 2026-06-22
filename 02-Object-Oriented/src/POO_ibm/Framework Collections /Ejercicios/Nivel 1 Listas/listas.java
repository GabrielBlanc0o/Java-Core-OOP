import java.util.ArrayList;
import java.util.LinkedList;

public class listas 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arrayAL = new ArrayList<>();

        arrayAL.add(2);
        arrayAL.add(4);
        arrayAL.add(2);
        arrayAL.add(9);

        
        System.out.println("Crear " + arrayAL);
        System.out.println("Recorrer elemento " + arrayAL.get(2));
        System.out.print("Remover ");
        arrayAL.remove(1);
        System.out.println(arrayAL);

        LinkedList<Integer> arrayL = new LinkedList<>();

        arrayL.add(2);
        arrayL.add(4);
        arrayL.add(6);
        System.out.println("Crear Lista "+arrayL);

        arrayL.addFirst(1);
        System.out.println("Agregar Primero " + arrayL);
        arrayL.addLast(7);
        System.out.println("Agregar Ultimo " + arrayL);

        System.out.println("Remover Primero " + arrayL);
        arrayL.removeFirst();

        System.out.println("Lista actualizada "+arrayL);

    }
}
