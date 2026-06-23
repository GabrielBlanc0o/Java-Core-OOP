import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

interface menu {
    int pedirDatos(Scanner sc);
}

class procesarDatos implements menu {
    Scanner sc = new Scanner(System.in);

    public procesarDatos(){}
    @Override
    public int pedirDatos(Scanner sc) {
        while (true) { // Un ciclo para repetir la pregunta hasta que ponga una edad válida
            try {
                System.out.println("Ingresa tu edad: ");
                int edadUser = sc.nextInt();
                sc.nextLine(); 
                
                if (edadUser <= 0){
                    throw new IllegalArgumentException("La edad debe ser mayor a 0.");
                }
                return edadUser; 
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Ingresa un número válido.");
                sc.nextLine(); 
            }
        }
    }
}

public class RegistroUsuarios {
    public static void main(String []args) {
        HashMap<String, Integer> dato = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        procesarDatos mapa = new procesarDatos();
        
        while(true) {
            System.out.println("\n1 para agregar datos\n" + "2 para salir");
            int opcion = sc.nextInt();
            sc.nextLine(); 

            if (opcion == 1) {
                try(BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))){
                    
                    System.out.println("Ingresa el nombre : ");
                    String nombre = sc.nextLine();
                    
                    int edad = mapa.pedirDatos(sc);
                    
                    dato.put(nombre, edad);
                    writer.write("Nombre: " + nombre + " | Edad: " + edad);
                    writer.newLine();
                    System.out.println("¡Guardado en el archivo!");

                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
                
            } else if (opcion == 2) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}