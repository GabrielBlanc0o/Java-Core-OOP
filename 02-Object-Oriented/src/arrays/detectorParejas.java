
import java.util.Scanner;

public class detectorParejas {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int numeros[]  = new int[5];
        
        for(int i = 0 ; i < numeros.length; i++){
                    numeros[i] = scanner.nextInt();
        }


        for(int i = 0 ; i < numeros.length; i++){
            for (int j = i + 1 ;j < numeros.length;j++){
                if (numeros[i] == numeros[j]){
                    System.out.println("Alerta el numero " + numeros[i] + " esta repetido.");
                }
            }
        }
    }
}
