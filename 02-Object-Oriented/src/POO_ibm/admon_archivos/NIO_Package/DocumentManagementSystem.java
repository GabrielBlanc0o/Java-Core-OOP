import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

interface Opciones {
    void createDirectories(Scanner scanner);
    void listDirectory(Scanner scanner);
    void deleteDirectory(Scanner scanner);
}

class BaseMenu implements Opciones {
    private static final String DIRECTORIO_BASE = "Documentos";

    public String getDirectorio() {
        return DIRECTORIO_BASE;
    }

    @Override
    public void createDirectories(Scanner scanner){
        System.out.println("Nuevo nombre del directorio: ");
        Path directorio = Paths.get(DIRECTORIO_BASE, scanner.nextLine());
        try {
            System.out.println("Creado: " + Files.createDirectories(directorio));
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    @Override
    public void listDirectory(Scanner scanner){
        System.out.println("Directorio de la lista: ");
        Path directorio = Paths.get(DIRECTORIO_BASE, scanner.nextLine());
        try (Stream<Path> stream = Files.list(directorio)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void deleteDirectory(Scanner scanner){
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

public class DocumentManagementSystem {
    public static void main(String []args)   {
        
        BaseMenu opti = new BaseMenu();
        String rutaDirectorio = opti.getDirectorio();
        try {
            Files.createDirectories(Paths.get(rutaDirectorio));
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
                case "1": opti.createDirectories(scanner); break;
                case "2": opti.listDirectory(scanner); break;
                case "3": opti.deleteDirectory(scanner); break;
                case "4": scanner.close(); continuar = false ; break;
                default: System.out.println("Opcion Invalida");  
            }
        }
    }
}