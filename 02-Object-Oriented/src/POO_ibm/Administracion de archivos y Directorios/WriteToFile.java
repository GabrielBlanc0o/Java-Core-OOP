/*
    Usaremos las siguientes librerias para escribir en archivos
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String []args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hola, mundo!");
            bufferedWriter.newLine();
            bufferedWriter.write("Esto es un ejemplo del manejo de un archivo en java ");
            bufferedWriter.close();
            System.out.println("Datos correctamente escritos.");
        } catch (IOException e) {
            System.out.println("Un error ocurrio: " + e.getMessage());
        }
    }
}