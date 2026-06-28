import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File miArchivo = new File("example.txt");
        if (miArchivo.exists())
        {
            System.out.println("Archivo existe.");
            } else {
                System.out.println("Archivo no existe");
            }
    }
}

/**
 * Primero instanciamos la clase creando 
 * un nuevo objeto que va a buscar si existe, mas no lo crea en el disco
 * 
 * con un condicional si existe q imprima q si , si no q no
 */