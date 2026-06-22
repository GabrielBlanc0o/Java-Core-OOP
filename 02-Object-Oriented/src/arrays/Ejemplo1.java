import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notas[] = new int[10];

        for (int i = 0 ; i < notas.length ; i++) { 
            notas[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int i = 0 ; i < notas.length  ; i++) { 
           suma += notas[i];
        }

        System.out.println("Suma total : " + suma);
        scanner.close();
    }
    
}
