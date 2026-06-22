
import java.util.Scanner;

class tarjetas {
    int tarjetas[] = new int[5];
    int disponibles;

    tarjetas(){
        disponibles = -1;
    }

    int comprarTarjeta(){
        if (disponibles < 0){
            System.out.println("Maquina vacia.");
            return -1;
        } else {
            return tarjetas[disponibles--]; 
        }
    }

    void recargarBandeja(int tarjetasEnBandeja){
        if (tarjetasEnBandeja  == 4 ) {
            System.out.println("Maquina con maxima capacidad de tarjetas. (5)");
        } else {
            tarjetas[++disponibles] = tarjetasEnBandeja;
            System.out.println("Tarjeta " + tarjetasEnBandeja +" recargada.");
        }
    }
}


public class boletosTransmilenio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tarjetas user1 = new tarjetas();
        boolean status = true;

        while (status){
            try {
                System.out.println("1. Comprar Tarjeta");
                System.out.println("2. Recargar Máquina (Operario)");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = sc.nextInt();

                if (opcion == 1) {
                    int tarjetaEntregada = user1.comprarTarjeta();
                    if (tarjetaEntregada != -1) {
                        System.out.println("Tarjeta entregada. ID: " + tarjetaEntregada);
                    }
                } else if (opcion == 2) {
                    System.out.print("Ingrese el ID de la nueva tarjeta a meter: ");
                    int nuevoId = sc.nextInt();
                    user1.recargarBandeja(nuevoId);
                } else if (opcion == 3) {
                    status = false;
                    System.out.println("Apagando máquina...");
                } else {
                    System.out.println("Opción no válida.");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida. Ingrese solo números.");
                sc.next();
            } finally {
                System.out.println("----------------------------------------\n");
            }
        }
        sc.close();
    }
}