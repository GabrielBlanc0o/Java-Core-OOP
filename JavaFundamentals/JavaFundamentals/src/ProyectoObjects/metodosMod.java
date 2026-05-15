package ProyectoObjects;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class metodosMod{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Desarrollador> equipo = new ArrayList<>();
        boolean menu = true ;

        while (menu) {
            // nueva lista de arrays

            System.out.println("Ingresa tu nombre: ");
            String nombre = sc.nextLine();


            System.out.println("Ingresa tu lenguaje de programacion favorito: ");
            String stack = sc.nextLine();

            boolean datoValido = false;
            int experiencia = 0;
            while (!datoValido) {
                try {
                    System.out.println("Ingresa tus años de exp: ");
                    experiencia = sc.nextInt();
                    sc.nextLine();
                    datoValido = true; // para romper el bucle y avanzar

                } catch (Exception e) {
                    System.out.println("Error! : ¡Debes ingresar un numero entero!");
                    sc.nextLine(); // limpiar buffer para quitar el hola

                }
            }
            equipo.add(new Desarrollador(nombre, stack, experiencia));

            System.out.println("Agregado exitosamente.");
            System.out.println("Deseas agregar otro? (S/N): ");
            String opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("n")) {
                menu = false;
            }
        }

        // mostrar todo el equipo
        System.out.print("¿Qué stack deseas buscar en el equipo?: ");
        String busqueda = sc.nextLine();
        System.out.print("¿Experiencia minima en años?: ");
        int minimo = sc.nextInt();

        System.out.println("\n--- Equipo final Registrado ---");

        buscarPorStack(equipo,busqueda);
        buscarAvanzado(equipo,busqueda,minimo);
        calcularPromedioExperencia(equipo);
   }

   public static void buscarPorStack(ArrayList<Desarrollador> lista, String stackBuscado){
        boolean encontrado = false;
        for (Desarrollador dev : lista){
                if (dev.getStack().equalsIgnoreCase(stackBuscado)){
                    System.out.printf("Info: \n "+ dev);
                    encontrado = true;
                }
            }
       if (!encontrado) {
           System.out.println("No se encontraron desarrolladores con el stack: " + stackBuscado);
       }
  }

  public static void buscarAvanzado(ArrayList<Desarrollador> lista, String stack, int minAnios){
        for (Desarrollador dev : lista){
            if (dev.getStack().equalsIgnoreCase(stack) && dev.getAnios() >=minAnios){
                System.out.println("Candidato ideal: "+dev);
            }
        }
  }

    public static void calcularPromedioExperencia(ArrayList<Desarrollador> lista){
        double prom = 0.0 ;
        float sumaTotal = 0;

        if (lista == null || lista.isEmpty()){
            System.out.println("No hay datos para calcular el promedio.");
            return;
        }

        for (Desarrollador dev : lista){
                sumaTotal += dev.getAnios();
        }
        prom = (double) sumaTotal / lista.size();
        System.out.printf("\n Promedio de experiencia del equipo: %.2f años\n",prom);
  }
}



