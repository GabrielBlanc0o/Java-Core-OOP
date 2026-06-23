import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File miArchivo = new File("ejm.txt");

        // verificar si el archivo existe

        if (miArchivo.exists()) {
            System.out.println("Archivo existe.");
        } else {
            System.out.println("Archivo no existe");
        }
    }
}