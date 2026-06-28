import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copiarDatos {
    public static void main(String[] args) {
        try (BufferedInputStream  bis = new BufferedInputStream(new FileInputStream("foto_perfil.jpeg"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("copia_seguridad.jpeg"))) 
        {
            bis.transferTo(out);
            out.flush();
            
        } catch (IOException e) {
            e.getMessage();
        }
    }
    
}
