import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            // para leer un archivo
            fileInputStream = new FileInputStream("example.txt");

            // variable para almacenar los bytes de dato
            int byteData;

            while ((byteData = fileInputStream.read()) != -1) {
                System.out.println((char) byteData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // cerrar el stream para liberar recursos

            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}