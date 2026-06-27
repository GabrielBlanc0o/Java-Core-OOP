/*
    Usaremos las siguientes librerias para escribir en archivos
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String []args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            writer.write("Hola Mundo");
            
           /*/ FileWriter writer = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hola, mundo!");
            bufferedWriter.newLine();
            bufferedWriter.write("Esto es un ejemplo del manejo de un archivo en java ");
            */
            System.out.println("Datos correctamente escritos.");
        } catch (IOException e) {
             e.printStackTrace();
        }
        
    }
}