
public class Desarrollador {

    private String nombre;
    private String stack;
    private int experienciaAnios;
    // constructor

    public Desarrollador(String nombre,String stack, int experienciaAnios){
        this.nombre = nombre;
        this.stack = stack;

        if (experienciaAnios < 0){ // si la experiencia es un valor negativo la deja en 0 automaticamente
            this.experienciaAnios = 0;
            System.out.println("La experiencia no puede ser negativa, declarada como " +this.experienciaAnios + " anios de experiencia.");
        } else {
            System.out.println("Guardando datos...");
            this.experienciaAnios = experienciaAnios;
        }

    }
    // getter para leer datos privados

    public String getNombre() {return nombre;}
    public String getStack() {return stack;}
    public int getAnios() {return experienciaAnios;}
   // metodos old en memoria getters :v



    // alternativa a los getter de arriba y imprime todo de una siempre usar ovverride para evitar
    // crear un getter por cada variable
    @Override
        public String toString(){
        return "[ Dev: " + nombre + " | Stack: " + stack + " | Exp: " + experienciaAnios + " anios ]";
    }

}