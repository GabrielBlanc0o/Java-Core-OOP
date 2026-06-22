
import java.util.HashMap;
import java.util.Scanner;

interface Opciones {

    void registrarGasto(String categoria);
    void mostrarReporte();
}

class Menu implements Opciones
{
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> datos = new HashMap<>();

    @Override
    public void registrarGasto(String categoria)
    {
        if (!datos.containsKey(categoria))
        {
            datos.put(categoria, 1);
            System.out.println("Categoría '" + categoria + "' registrada por primera vez.");
            
        } 
        else
        {
            int contadorViejo = datos.get(categoria);
            int contadorNuevo = contadorViejo + 1;
            datos.put(categoria, contadorNuevo);
            System.out.println("Gasto acumulado en '" + categoria + "'. Total: " + contadorNuevo);
        }
    }

    @Override
    public void mostrarReporte()
    {
        if (datos.isEmpty()) 
        {
            System.out.println("No hay gastos registrados hoy.");
            return;
        }
        
        System.out.println("\n=== REPORTE CONSOLIDADO DE GASTOS ===");

        for (HashMap.Entry<String, Integer> entrada : datos.entrySet()) {
            System.out.println("- " + entrada.getKey() + ": " + entrada.getValue() + " veces.");
        }
    }
}

public class main extends Menu
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        Menu opciones = new Menu();
        

        while (true) 
        {

            System.out.println("Ingresa 1 para registrar nuevo gasto ");
            System.out.println("Ingresa 2 para mostrar reporte consolidado ");
            String opcion = sc.nextLine();

            if (opcion.equals("1")) 
            {
                System.out.println("Registrar gasto (Nombre Categoria): ");
                String categoriaElegida = sc.nextLine();
                opciones.registrarGasto(categoriaElegida);    
            }
            else if (opcion.equals("2"))
            {
                opciones.mostrarReporte();
            } else {
                System.out.println("Saliendo...");
            }
        }
    
    }
}