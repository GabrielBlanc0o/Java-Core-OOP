class caja {
    double ancho;
    double alto;
    double profundidad;

    caja() {
        System.out.println("Caja constructora");
        ancho = 10;
        alto = 10;
        profundidad = 10;
    }
    double volumen(){
        return ancho * alto*profundidad;
    }
}

public class constructoresClase {
    public static void main(String[] args){
        caja caja1= new caja();
        caja caja2= new caja();

        double volumen;
        volumen = caja1.volumen();
        System.out.println("Volumen es: " + volumen);
        volumen = caja2.volumen();
        System.out.println("Volumen es: " + volumen);
    }
}