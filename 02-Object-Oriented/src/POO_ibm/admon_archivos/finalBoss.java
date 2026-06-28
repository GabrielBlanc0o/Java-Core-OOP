import java.io.FileInputStream;
import java.io.FileWriter;

public class finalBoss {
    public static void main(String[] args) {
        try (FileInputStream org = new FileInputStream("foto_perfil.jpeg");
            FileWriter tamanio = new FileWriter("info.txt"))
            {
                int tamaño = org.available();
                tamanio.write("El archivo binario pesa: " + tamaño + " bytes");
            } catch (Exception e) {
                e.getLocalizedMessage();
            }
    }    
}
