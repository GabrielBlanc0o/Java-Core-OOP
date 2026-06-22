class box {
    double alto;
    double ancho;
    double profundidad;

    double volumen() {
        return alto * ancho * profundidad;
    }
}

public class CajaMetodoconReturn {
    public static void main(String[] args){
        double volumen;
        box caja1 = new box();
        box caja2 = new box();

        caja1.alto = 10;
        caja1.ancho = 15;
        caja1.profundidad = 20;

        caja2.alto = 14;
        caja2.ancho = 6;
        caja2.profundidad = 25;

        volumen = caja1.volumen();
        System.out.println("Volumen caja 1 "+volumen);
        volumen = caja2.volumen();
        System.out.println("volumen caja 2 " + volumen);
    }
}
