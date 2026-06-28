import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class report {
    public static void main(String[] args) {

        try (BufferedReader lector = new BufferedReader(new FileReader("app.log"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("errores_criticos.txt",true))){
            String linea;
            boolean esPrimeraLinea = true;

            while((linea = lector.readLine()) != null ) {
                if (linea.startsWith("[ERROR]")) {
                    if(!esPrimeraLinea)
                    {
                        escritor.newLine();
                    }
                    escritor.append(linea); 
                    esPrimeraLinea = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/**  este ejercicio lo que hace es leer un archivo simulado de tipo log q 
 * separara los errores criticos a otro archivo nuevo, lee linea por linea ya 
 * que este es de tipo string y una variable de tipo bool para q cuando no sea primera linea no agrege una nueva linea
 */
