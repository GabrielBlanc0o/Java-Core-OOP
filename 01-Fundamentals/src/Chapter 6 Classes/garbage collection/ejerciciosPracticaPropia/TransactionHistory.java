import java.util.Scanner;

class sistema {

    double[] historial = new double[3];
    int pop;

    sistema() {
        pop = -1;
    }

    boolean registrarPago(double monto){
        if (pop ==  historial.length - 1){
            System.out.println("Historial lleno. Limpie registros.");
            return false;
        } else {
            historial[++pop] = monto;
            return  true;
        }
    }


    double deshacerPago(){
        if (pop < 0){
            System.out.println("No hay transaccipnes para revertir");
            return 0.0;
        } else {
            return historial[pop--];
        }
    
    }
}


public class TransactionHistory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        sistema user1 = new sistema();

        while(status){
            System.out.println("1. Registrar pago ");
            System.out.println("2. Deshacer ultimo pago ");
            System.out.println("3. Salir");
            int opcion;
                System.out.println("Ingresa una opcion: ");
                opcion = sc.nextInt();
            try {
                if (opcion == 1){
                    System.out.println("Ingrese el monto: ");
                    double registrar = sc.nextDouble();   
                    user1.registrarPago(registrar);
                } else if (opcion == 2){
                    System.out.println("Deshaciendo ultimo monto.");
                    double procesado = user1.deshacerPago();   
                    System.out.println("Monto revertido: " + procesado);
                     
                } else if (opcion == 3){
                    break;
                } 
            } 
                catch (Exception e) {
                        System.out.println(" Error en la entrada de datos o desbordamiento");    
                        sc.next();                              
            } finally {
                System.out.println("------------------------");
            }          
        }
        sc.close();
    }
}