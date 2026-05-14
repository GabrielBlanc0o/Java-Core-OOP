package app;

public class Usuario {
    private final String nombre;
    private final double peso;
    private final int edad;

    // constructor pàra crear el objeto con datos iniciales

    public Usuario(String nombre,double peso, int edad){
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    // getters para leer los datos de forma segura

    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public double getPeso() {return peso;}
}



