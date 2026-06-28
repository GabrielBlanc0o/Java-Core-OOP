import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String []args) {
        FileInputStream inputFile = null; // para abrir el archivo de entrada
        FileOutputStream outputFile = null; // para abrir el archivo de salida 

        try {
            inputFile = new FileInputStream("source.txt");
            outputFile = new FileOutputStream("destino.txt");
            int datosByte;

            while ((datosByte = inputFile.read()) != -1 ) {
                outputFile.write(datosByte);
            }
            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // cerrar ambos stream de I/O
            try {
                if (inputFile != null ) inputFile.close();
                if (outputFile != null ) outputFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    } 
}
