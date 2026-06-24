import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


class Producto {

    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {}

    public Producto(String nombre, int cantidad , double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCantidad (int cantidad) {
        this.cantidad = cantidad;
    } 

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public double getPrecio(){
        return this.precio;
    }
    
    public String getString(){
        return nombre.concat(" Cantidad " + this.cantidad + " Precio " + this.precio);
    }
}

interface Operaciones {
    void agregar();
    void buscar();
    void listar();
}

class Inventario implements Operaciones {
    HashMap<String,Integer> mapa;
    Scanner sc = new Scanner(System.in);
    LinkedList<Double> precioP = new LinkedList<>();

    public Inventario() {
        mapa = new HashMap<>();
    }

    @Override 
    public void agregar(){
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        
        try (BufferedWriter archivo = new BufferedWriter(new FileWriter("resultados.txt",true))){
            System.out.println("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();
                if (cantidad > 0 && precio > 0){
                    mapa.put(nombre, cantidad);
                    precioP.add(precio);
                    archivo.write("Nombre : "+ nombre + " Cantidad : " +  cantidad + " Precio : " + precio);
                } else {
                    System.out.println("La cantidad y precio no pueden ser negativas.");
                    sc.nextLine();
                }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }


    @Override
    public void buscar() {
        System.out.println("Ingrese el nombre a buscar : ");
        String nombreBuscar = sc.nextLine();

        boolean elementos = mapa.containsKey(nombreBuscar);
        if (elementos) {
            System.out.println("Elementos encontrados por nombre:  ");
            System.out.println(mapa.get(nombreBuscar));
        } else {
            System.out.println("Elementos no encontrado o inexistente.");
        }
    } 

    @Override
    public void listar() {
        try (BufferedReader leer = new BufferedReader(new FileReader("resultados.txt"))) {
            System.out.println("Contenido : ");
            leer.lines().forEach(System.out::println);
        } catch (IOException e ) {
            System.out.println(" Error " +  e.getMessage());
        }
    }
}

public class InventarioProductos {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    Inventario  opciones = new Inventario();

        while (true) {
            System.out.println("1 - Agregar producto\n"  
                            +"2 - Buscar producto por nombre\n"
                            +"3 - Listar todos los productos\n"
                            +"4 - Salir");
            int opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1){
                opciones.agregar();
            } else if (opcion == 2) {
                opciones.buscar();
            } else if (opcion == 3) {
                opciones.listar();
            } else {
                break;
            }
        } 
        sc.close();
    }
}