import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample {
    public static void main(String[] args) {
        // obtener la fecha actualS
        LocalDate fechaActual = LocalDate.now();
        //definir el formato

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // formatear el formato de la fecha con un string 
        String fechaFormateada = fechaActual.format(formateador);

        //imprimir el formato nuevo
        System.out.println("Fecha formateada " + fechaFormateada);


    }    
}
