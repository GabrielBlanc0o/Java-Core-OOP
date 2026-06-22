class caja{
    double ancho;
    double alto;
    double profundidad;

    double volumen(){
        return ancho * alto * profundidad;
    }

    void ponerDimension(double an, double al, double prof){
        ancho = an;
        alto = al;
        profundidad = prof;
    }
}

public class metodoParametrizado {
    public static void main (String[] args){
        caja caja1 = new caja();
        caja caja2 = new caja();
        double volumen;

        caja1.ponerDimension(10, 20, 15);
        caja2.ponerDimension(3, 6, 9);

        volumen = caja1.volumen();
        System.out.println("Volumen caja 1 " + volumen);
        volumen = caja2.volumen();
        System.out.println("Volumen caja 2 " + volumen);
    }
}