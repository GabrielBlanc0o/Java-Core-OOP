package excepcionesTema;
/*uso correcto del try catch y finally*/

import java.io.FileReader;
import java.io.IOException;

public class tryC {
    public static void main(String[] args){
        FileReader file = null;

        try{
            file = new FileReader("example.txt");
            // codigo para leer desde el archivo
        }catch (IOException e){
            System.out.println("Error leyendo el archivo: " + e.getMessage());
        } finally {
            try {
                if (file != null){
                    file.close();
        System.out.println("Archivo cerrado correctamente.");
                }
            } catch (IOException e ){
                System.out.println("Error cerrando el archivo: " + e.getMessage());
            }
        }
    }
}

