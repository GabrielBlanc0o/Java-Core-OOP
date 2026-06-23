import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class cargadorBase {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String,Integer> mapa = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("base_datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] texto = linea.split(",");
                if (texto.length >= 2) {
                    String clave = texto[0].trim();
                    int num = Integer.parseInt(texto[1].trim());
                    mapa.put(clave, num);
                }
            }
            System.out.println("Ingresa un nombre de usuario: ");
            String nombreBs = sc.nextLine();
            if (mapa.containsKey(nombreBs)) {
                System.out.println("Usuario encontrado: " + nombreBs + " -> " + mapa.get(nombreBs));
            } else {
                System.out.println("Usuario no encontrado");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
