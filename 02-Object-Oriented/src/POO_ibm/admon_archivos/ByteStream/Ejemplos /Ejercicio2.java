
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

interface metodos {
    void escribir();
    void leer();
}

class opciones implements metodos {

    public opciones() {}
    
    @Override
    public void escribir() {
        int contador = 1;
        try(BufferedWriter archivo = new BufferedWriter(new FileWriter("notas.txt",true))){
            archivo.write(contador + ". Java");
            archivo.newLine();
            contador++;
            archivo.write(contador + ". PostgreSQL");
            archivo.newLine();
            contador++;
            archivo.write(contador + ". Python");
        } catch (IOException e) {
            System.out.println("Error " + e.getLocalizedMessage());
        }
    }

    @Override
    public void leer() {
        try (BufferedReader leer = new BufferedReader(new FileReader("notas.txt"))){
            String linea;
            int contador = 1;
            while((linea = leer.readLine()) != null) {
                System.out.println(contador + linea);
                contador++;
            }
            System.out.println("Total lineas: " + (contador - 1));
        } catch (IOException e) {
            System.out.println("Error "  + e.getLocalizedMessage());
        }
    } 
}

public class Ejercicio2 {
    public static void main(String []args) {

        opciones menu = new opciones();
        menu.escribir();
        menu.leer();

    }
}