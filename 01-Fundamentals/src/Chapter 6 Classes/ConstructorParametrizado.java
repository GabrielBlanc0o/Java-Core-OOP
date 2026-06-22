class caja {

    double ancho;
    double alto;
    double profundidad;

    // es lo mismo que el constructor que hice anteriormente pero ahora tiene
    // parametros de entrada 

    caja(double a, double al, double prof){
        ancho = a;
        alto = al;
        profundidad = prof;
    }

    double volumen(){
        return  ancho*alto*profundidad;
    } 
}

public class ConstructorParametrizado {
    public static void main(String[] args) {
        caja caja1 = new caja(10, 20, 15);
        caja caja2 = new caja(3, 6, 9);
        double volumen;

        volumen = caja1.volumen();
        System.out.println("Volumen caja 1 : " + volumen);
        volumen = caja2.volumen();
        System.out.println("Volumen caja 2 : " + volumen);
    }
}