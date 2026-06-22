public class matrizDiagonal {

    public static void main(String []args){

        int[][] numeros = {
            {1,3,8},
            {2,6,9},
            {5,4,7}
        };

//        int tamaño = numeros.length * numeros[0].length; // filas * columas

        int sumaDiagonal = 0 ; 

        
        for (int i = 0 ; i < numeros.length ; i++){
            for (int j = 0; j < numeros[i].length; j++) {
                    //System.out.print(numeros[i][j] + " ");
                    if (i + j == 2){
                        System.out.println( numeros[i][j]);
                        sumaDiagonal += numeros[i][j];
                    }
                    
                   

            }
        }

        System.out.println("Suma total: " + sumaDiagonal);
    }
    
}
