
import java.util.Scanner;

public class matrices {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

    // una matriz vacia    
    int[][] matriz = new int[2][3];


        // lenamos nuestra matriz bidimensional, bucle anidados doble para filas columas
    for (int i = 0; i < matriz.length ; i++){
        for (int j = 0; j < matriz[i].length ; j++){ // q sea menor al tamaño de la matriz en indice i 
            matriz[i][j] = scanner.nextInt(); // y recibe uno por uno
        }
        System.out.println();
    }

    for (int i = 0; i < matriz.length ; i++){
        for (int j = 0; j < matriz[i].length ; j++){ 
            System.out.print(matriz[i][j] + " "); // lo mismo pero imprime
        }
        System.out.println();
    }
    
    }
}
