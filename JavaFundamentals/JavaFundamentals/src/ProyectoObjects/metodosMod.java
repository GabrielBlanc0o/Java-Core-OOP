package ProyectoObjects;

import java.util.ArrayList;

public class metodosMod{
    public static void main(String[] args){
        // nueva lista de arrays
        ArrayList<Desarrollador> equipo = new ArrayList<>();

        equipo.add(new Desarrollador("Gabriel","Java/Spring Boot",3));
        equipo.add(new Desarrollador("Pepe","Pascal",5));

        buscarPorStack(equipo,"Java/SpringBoot");
   }

   public static void buscarPorStack(ArrayList<Desarrollador> lista, String stackBuscado){
        for (Desarrollador dev : lista){
            // accedemos al atributo a traves del metodo getter
            if (dev.getStack().equals(stackBuscado)){
                System.out.println("Encontrado: " + dev.getNombre() + " domina " + stackBuscado );

            }
        }
   }
}