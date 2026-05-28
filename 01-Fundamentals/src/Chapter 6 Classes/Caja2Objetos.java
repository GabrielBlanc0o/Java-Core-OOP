class medidasCaja{
    double alto;
    double ancho;
    double profundidad;
}

public class Caja2Objetos {
    
    public static void main (String[] args){
        double vol;
        medidasCaja caja1 = new medidasCaja();
        medidasCaja caja2 = new medidasCaja();

        caja1.alto = 10;
        caja1.ancho = 20;
        caja1.profundidad = 15;

        caja2.alto = 3;
        caja2.ancho = 6;
        caja2.profundidad = 9;

        vol = caja1.ancho * caja1.alto * caja1.profundidad;
        System.out.println("Volumen Caja 1: " + vol );

        vol = caja2.ancho * caja2.alto * caja2.profundidad;
        System.out.println("volumen Caja 2: " + vol);
    }
}
