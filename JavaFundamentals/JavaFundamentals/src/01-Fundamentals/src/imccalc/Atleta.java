package imccalc;

public class Atleta {

    /*clases de datos antes pore ejemplo q la llamamaos usuario*/

    private final String nombre;
    private final double peso;
    private final int edad;
    private final double altura;

    public Atleta(String nombre, double peso, int edad, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;

    }

    //getters para obtener datos
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }
}