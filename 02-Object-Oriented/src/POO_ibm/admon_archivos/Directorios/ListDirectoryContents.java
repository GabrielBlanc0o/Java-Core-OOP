import java.io.File;
public class ListDirectoryContents {
    public static void main(String[] args) {
        String rutaDirectorio = "Proyectos/Java";
        File directorio = new File(rutaDirectorio);

        //crear arreglo para listar todo el contenido del directorio
        String[] contenido = directorio.list();
        if (contenido !=null) {
            System.out.println("Contenido de  " + rutaDirectorio + ":");
            for (String nombreArchivo : contenido) {
                System.out.println(nombreArchivo);
            }
        }
    }
}
