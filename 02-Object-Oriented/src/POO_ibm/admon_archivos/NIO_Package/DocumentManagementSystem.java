import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DocumentManagementSystem {
    private static final String DIRECTORIO_BASE = "Documentos";

    public static void main(String []args)   {
        
        try {
            Files.createDirectories(Paths.get(DIRECTORIO_BASE));
        } catch (IOException e) {
            System.out.println("No se pudo inicializar el directorio base: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        String comando;
        boolean continuar = true;
        
        while (continuar) { 
            System.out.println("1. Crear Directorio\n2. Listar documentos\n 3. Borrar Directorio\n4. Salir");
            comando = scanner.nextLine();
            switch (comando) {
                case "1": createDirectory(scanner); break;
                case "2": listDirectory(scanner); break;
                case "3": deleteDirectory(scanner); break;
                case "4": scanner.close(); continuar = false ; break;
                default: System.out.println("Opcion Invalida");  
            }
        }
    }
    private static void createDirectory(Scanner scanner){
        System.out.println("Nuevo nombre del directorio: ");
        Path directorio = Paths.get(DIRECTORIO_BASE, scanner.nextLine());
        try {
            System.out.println("Creado: " + Files.createDirectories(directorio));
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    private static void listDirectory(Scanner scanner){
        System.out.println("Directorio de la lista: ");
        Path directorio = Paths.get(DIRECTORIO_BASE, scanner.nextLine());
        try {
            Files.list(directorio).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

        private static void deleteDirectory(Scanner scanner){
        System.out.println("Directorio a borrar: ");
        Path directorio = Paths.get(DIRECTORIO_BASE, scanner.nextLine());
        try {
            try {
                Files.delete(directorio);
                System.out.println("Eliminado: " + directorio);
            } catch (DirectoryNotEmptyException e) {
                System.out.println("El directorio no esta vacio");
            }
            
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
