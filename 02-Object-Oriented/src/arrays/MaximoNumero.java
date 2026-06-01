
import java.util.Scanner;

public class MaximoNumero {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0 ; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        int maximo = numeros[0];
        int pos = 0;

        for (int i = 0 ; i < numeros.length; i++){
            if (numeros[i]> maximo){
                    maximo = numeros[i];
                    pos = i;
                } 
        }

        System.out.println("El numero campeon en posicion " + pos + " es " + maximo);
        scanner.close();
    }
}