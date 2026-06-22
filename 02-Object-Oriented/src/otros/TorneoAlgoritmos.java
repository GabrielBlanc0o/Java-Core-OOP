package otros;
class controles{
    int puntos ;
    
    void generarPuntos(){
        puntos = (int)(Math.random()*10) + 1;
    }
}

public class TorneoAlgoritmos{
    public static void main(String[] args){

        System.out.println("=== ¡INICIA EL TORNEO DE BACKEND! ===");
        controles A = new controles();
        controles B= new controles();
        int energiaMaxA = 100;
        int energiaMaxB = 100;
        int ronda = 1;

        while (energiaMaxA > 0 && energiaMaxB > 0) {
            A.generarPuntos();
            B.generarPuntos();

        try {
                System.out.printf("\n--- Ronda %d --- \n",ronda);
                System.out.println("Programador A compila un algoritmo de nivel: " + A.puntos);
                System.out.println("Programador B compila un algoritmo de nivel: " + B.puntos);
                
                if (A.puntos > B.puntos) {
                    int operacion = A.puntos - B.puntos;
                    energiaMaxB -= operacion;
                    System.out.printf("¡Ganó el Programador A! El Programador B pierde %d de energía.",A.puntos - B.puntos);                    
                }
                else if (B.puntos > A.puntos) {
                    int operacion = B.puntos - A.puntos;
                    energiaMaxA -= operacion;
                    System.out.printf("¡Ganó el Programador B! El Programador A pierde %d de energía.",B.puntos - A.puntos);                    

                } else {
                   System.out.println("¡Empate de lógica!"); 
                }
                ronda++;
        } 
         catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.printf("\n[Energia actual -> A: %d %% | B: %d %% ]\n",energiaMaxA,energiaMaxB);
            System.out.println("---------------");
        }
        }
        System.out.println("\n=================================");
        if (energiaMaxA <= 0) {
            System.out.println(" ¡EL GANADOR ABSOLUTO ES EL PROGRAMADOR B! ");
        } else {
            System.out.println(" ¡EL GANADOR ABSOLUTO ES EL PROGRAMADOR A! ");
        }
        System.out.println("=================================");
    }
}
    
