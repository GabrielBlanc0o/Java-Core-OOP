
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

interface metodo {
    void escribir();
    void leer();
    void copiar();
}

class accionEjecutable implements metodo {

    @Override
    public void escribir(){
        try (FileOutputStream archivo = new FileOutputStream("salida.txt",true))
        {
            archivo.write("Hola, Java!".getBytes());
        } catch(IOException e) {
            System.out.println("Error" + e.getLocalizedMessage());
        }
    }

    @Override
    public void leer() {
        String b = "salida.txt";
        try (FileInputStream bytes = new FileInputStream(b)) {
            int dato;
            while ((dato = bytes.read()) != -1) {
                System.out.print((char) dato);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }
    }

    @Override
    public void copiar() {
            try (FileInputStream i = new FileInputStream("salida.txt");
                FileOutputStream o = new FileOutputStream("copia.txt"
            )) {
            byte[] buffer = new byte[1024];
            int bytesLeidos;
            
            while ((bytesLeidos = i.read(buffer)) != -1) {
                o.write(buffer, 0, bytesLeidos);
            }
            } catch(IOException e) {
                    System.out.println("Error" + e.getLocalizedMessage());
            }
    } 
}

public class Ejercicio1 {
    public static void main(String[] args) {
        
        accionEjecutable Menu = new accionEjecutable();
        Menu.escribir();
        Menu.leer();
        Menu.copiar();
    }
}