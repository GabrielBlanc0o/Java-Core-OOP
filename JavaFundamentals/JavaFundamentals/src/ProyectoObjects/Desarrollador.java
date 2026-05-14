package ProyectoObjects;

public class Desarrollador {

    private String nombre;
    private String stack;
    private int experienciaAnios;
    // constructor

    public Desarrollador(String nombre,String stack, int experienciaAnios){
        this.nombre = nombre;
        this.stack = stack;
        this.experienciaAnios = experienciaAnios;
    }
    // getter para leer datos privados

    public String getNombre() {return nombre;}
    public String getStack() {return stack;}

}