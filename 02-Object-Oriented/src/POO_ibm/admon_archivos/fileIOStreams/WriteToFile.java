import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, World");
            writer.newLine();
            writer.write("This is a java file handling example.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
            e.printStackTrace();
        }
    }
}

/*
 * entonces instanciamos los dos paquetes y este si crea el archivo
 * luego con el metodo escribimos y insertamos lineas y usamos
 * la excepcion para manejar los errores.
 */