

import java.util.LinkedList;
import java.util.Scanner;

interface Opciones{
    void visitarSeccion(String seccion);
    void retroceder();
    void mostrarHistorial();
}

class menuInterface implements Opciones
{
    LinkedList<String> lista = new LinkedList<>();
    
    @Override
    public void visitarSeccion(String seccion){
        lista.add(seccion);
        System.out.println("Visitaste: " + seccion);
    }

    @Override
    public void retroceder()
    {
        if (lista.isEmpty()) {
            System.out.println("Ya estás en la página de inicio. No puedes retroceder más.");
            return;
        }
        String seccionEliminada = lista.removeLast();
        System.out.println("Saliendo de: " + seccionEliminada);

        if (!lista.isEmpty()) {System.out.println("Ahora esta en: " + lista.getLast()); } 
        else { System.out.println("historial vacio. ");}
         
    }
    @Override
    public void mostrarHistorial() {
        if (lista.isEmpty()) {
            System.out.println("Historial vacío.");
            return;
        }
        System.out.println("Historial actual: " + lista);
    }
}   
    


public class HistorialNavegacion 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         menuInterface menu = new menuInterface();

        while (true){
            System.out.println("Opcion 1 : Agregar seccion ");
            System.out.println("Opcion 2 : Retroceder seccion ");
            System.out.println("Opcion 3 : ver historial ");
            int opt = sc.nextInt();
            sc.nextLine();

            if (opt == 1){
                        System.out.println("Ingresa el nombre de la seccion: ");
                        String nombreSeccion = sc.next();
                        menu.visitarSeccion(nombreSeccion);
                        System.out.println("OK");
                    }
            else if (opt == 2){ menu.retroceder();}
            else if (opt == 3){menu.mostrarHistorial();}
            else { System.out.println("Saliendo"); break;}

            }
            sc.close();
        }
        
    }
