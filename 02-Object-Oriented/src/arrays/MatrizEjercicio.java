public class MatrizEjercicio {
    public static void main(String []args){
        int[][] matriz= {
            {1,3,8},
            {2,6,9},
            {5,4,7}
        };

        System.out.println("Matriz Original: ");                
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");                
            }
            System.out.println();
        }

        System.out.println("Matriz con cada numero multiplicado por 2: ");
        
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] *= 2;             
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println();
        }
        

    }
    
}
