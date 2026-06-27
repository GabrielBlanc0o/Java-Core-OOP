import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
         //definir el directorio de ruta
         String rutaDirectorio = "admon_archivos/Directorios/nuevo";

         // instanciamos la clase File creando un objeto
         File directorio = new File(rutaDirectorio);

         if (!directorio.exists()) {
            boolean creado = directorio.mkdir();
            // mkdirs() para crear directorios anidados
            if (creado) {
                System.out.println("Directorio ya creado " + directorio);
            } else {
                System.out.println("Error al crear el directorio.");
            }
        } else {
            System.out.println("El directorio ya existe: " + directorio);
        }
    }
}
