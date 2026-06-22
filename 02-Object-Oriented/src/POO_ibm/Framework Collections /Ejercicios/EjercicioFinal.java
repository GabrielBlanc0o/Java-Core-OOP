import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Libro {

    private String titulo;
    private String genero;


    public Libro(){
        // opcinal para poder llamar a la clase constructor sin parametros
    }
    public Libro(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getgenero(){
        return this.genero;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }


    class Autor {
        private String author;
        private int cantidad;

        public Autor(){

        }

        public Autor(String author, int cantidad) {
            this.author = author;
            this.cantidad = cantidad;
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public int getCantidad(){
            return this.cantidad;
        }

        public String getAuthor(){
            return this.author;
        }


    }

    Autor clase2 = new Autor();

    @Override
    public String toString(){
        return titulo.concat(" Autor : " + clase2.getAuthor() + " genero : " + getgenero());
    }
    
}

interface Gestionable {
    public void agregar(String nombre);
    public void eliminar(String nombre);
    public void mostrarLibros();
}


class Biblioteca implements Gestionable {

    Scanner sc = new Scanner(System.in);

    ArrayList<String> listaLibros = new ArrayList<>();
    HashMap<String, Integer> stockLibros = new HashMap<>();
    HashSet<String> generos = new HashSet<>();
    
    public boolean stockMaxPerAuthor(String author){
        Integer cantidad = stockLibros.get(author);
        return cantidad != null && cantidad > 3;
    }

    public Biblioteca(){
        generos.add("Terror");
        generos.add("Accion");
        generos.addAll(stockLibros.keySet());
    }
    
    @Override
    public void agregar(String nombre){
        try {

            String generoElegir = null;
            
            try {
                System.out.println("generos Disponibles: ");
                generos.forEach(genero -> System.out.println(genero));
                System.out.println("Ingrese el genero del Libro " + nombre );
                generoElegir = sc.nextLine();
                if (!generos.contains(generoElegir)) {
                    System.out.println("genero no valido.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
        System.out.println("Ingrese el autor del Libro:");
        String autor = sc.nextLine();
        System.out.println("Ingrese cantidad de unidades a agregar :");
        int cantidadStock = Integer.parseInt(sc.nextLine());
        Libro nombreygenero = new Libro(nombre,generoElegir);
        Libro.Autor AutorYCantidad = nombreygenero.new Autor(autor,cantidadStock);
        stockLibros.put(autor,cantidadStock);
        listaLibros.add(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("Ok");
        }
    }

    @Override
    public void eliminar(String nombre){
        System.out.println("Ingrese el nombre del titulo del libro a eliminar : ");
        String nombreLibro = sc.nextLine();
    
        boolean eliminado = listaLibros.removeIf(libro -> libro.equalsIgnoreCase(nombreLibro));
        
        if (eliminado) {
            System.out.println("Libro '" + nombreLibro + "' eliminado.");
        } else {
            System.out.println("Libro '" + nombreLibro + "' no encontrado.");
        }
    }   
        
    @Override
    public void mostrarLibros(){
        System.out.println("Lista de libros: ");
        for (String libroInd : listaLibros){
            System.out.println(libroInd);
        }
    }
}

public class EjercicioFinal{
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("1. para agregar libros\n" 
                            +  "2. para eliminar libros\n"
                            +  "3. para mostrar todos los libros.\n"
                            +  "4. Autores con mas de 3 libros.\n"
                            +  "Otro numero para salir.");
            String userAction = sc.nextLine();

                if (userAction.equals("1")){
                    System.out.println("Ingrese el nombre del libro: ");
                    String nombre = sc.nextLine();
                    biblioteca.agregar(nombre);
                }
                else if (userAction.equals("2"))
                {
                    System.out.println("Ingrese el nombre del libro.");
                    String nombreLibro = sc.nextLine();
                    biblioteca.eliminar(nombreLibro);
                }
                else if (userAction.equals("3")){
                    biblioteca.mostrarLibros();
                }
                else if (userAction.equals("4")){
                    System.out.println("Ingresa el nombre del autor.");
                    String authorVerificar = sc.nextLine();
                    boolean resultado = biblioteca.stockMaxPerAuthor(authorVerificar);
                    if (resultado) {
                        System.out.println(authorVerificar + " tiene más de 3 libros.");
                    } else {
                        System.out.println(authorVerificar + " no tiene más de 3 libros.");
                    }
                }
                else {
                    break;
                }
        } 
        sc.close();            
    }
}
