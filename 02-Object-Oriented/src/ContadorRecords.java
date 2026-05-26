import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ContadorRecords {
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean status = true;
        int peso = 1;
        while(status == true && peso <= 5){
            try {
                System.out.println("Ingresa peso "+peso);
                Integer item = scanner.nextInt();
                lista.add(item);

            } catch (InputMismatchException e) {
                System.out.println("Peso no valido "+ e.getMessage());
                scanner.next();
                peso--;
            } finally {
                System.out.println("-------------");
            }
            peso++;
        }

        // calcular peso
        int sumatotal = 0;

        for (int i = 0; i < lista.size()  ;i++){
            sumatotal += lista.get(i);
        }
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio : "+ (double) sumatotal / lista.size() + " kg");    
        

        if (lista.size() > 4 && lista.get(4) > lista.get(0)) {
            System.out.println("¡Progreso Brutal estas aplicando sobrecarga progresiva!");
        } else {
            System.out.println("Ojo, estás estancado, revisa la comida.");
        }
        scanner.close();
    }    
}