import java.io.IOException;
import java.nio.file.*;

public class FileOrganizer {
    public static void main(String[] args) {
        try {
            Path dir = Files.createDirectories(Path.of("descargas"));
            Path origen = Path.of("foto_perfil.jpeg");
            Path destino = dir.resolve(origen.getFileName());
            if (Files.exists(origen))
            {
                if (Files.notExists(destino)){
                    Files.copy(origen, destino);
                    System.out.println("Archivo copiado");
                } else {
                    System.out.println("Ya existe");
                }
            } else {
                System.out.println("Error , el archivo no existe");
            }
        } catch (IOException e){
            System.out.println("Ocurrió un fallo en el disco: " + e.getMessage());
        }
    }
}
