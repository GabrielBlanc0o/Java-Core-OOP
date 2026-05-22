package imccalc;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;


public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Atleta> listaAtletas = new ArrayList<>();
        // Instanciamos el servicio que tiene la lógica de rangos
        EntrenamientoService service = new EntrenamientoService();

        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("=== Calculadora de Entrenamiento Profesional ===");

                System.out.print("Nombre del atleta: ");
                String nombre = sc.nextLine();

                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                System.out.print("Peso (kg): ");
                double peso = sc.nextDouble();
                sc.nextLine();

                System.out.print("Altura (m): ");
                double altura = sc.nextDouble();
                sc.nextLine();

                // 1. Creamos al Atleta con tus getters ya corregidos
                Atleta atleta = new Atleta(nombre, peso, edad, altura);
                // 2. Guardas el atleta en la lista
                listaAtletas.add(atleta);

                // 3. Preguntas si quiere seguir
                System.out.print("¿Deseas registrar otro atleta? (si/no): ");
                String respuesta = sc.nextLine();

                if (respuesta.equalsIgnoreCase("no")) {
                    continuar = false;
                }
                // 3. Mostramos el veredicto final


            } catch (InputMismatchException e) {
                System.err.println("Error: Datos numéricos inválidos. Usa coma (,) para decimales.");
                sc.nextLine();
            }
        }
        System.out.println("\n=== REPORTE FINAL DE ATLETAS ===");
        for (Atleta a : listaAtletas) {
            // Aquí llamas a tu servicio para cada atleta 'a' de la lista
            String res = service.obtenerRecomendacion(a);
            System.out.println("Atleta: " + a.getNombre() + " -> " + res);
        }

    }
}