import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // obtener el nombre del usuario
        System.out.println("Ingresa tu nombre : ");
        String nombre = scanner.nextLine();

        // obtener el cumpleaños del usuario
        System.out.println("Ingresa tu cumpleaños (yyyy-MM-dd): ");
        String cumpleaniosInput = scanner.nextLine();

        // parsear el string input a un objetoi LocalDate
        LocalDate cumpleanios = LocalDate.parse(cumpleaniosInput);

        //definir el formato del output
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

        // formatear el cumpleaños usando el formateador definido
        String fechaFormateada = cumpleanios.format(formateador);

        System.out.println("Hola " + nombre + "! tu cumpleaños es: " + fechaFormateada );

        scanner.close();
    }    
}
