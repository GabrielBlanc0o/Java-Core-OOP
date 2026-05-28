class cajaMedidas {
    double ancho;
    double alto;
    double profundidad;
}

public class Caja {
    public static void main(String[] args){
        cajaMedidas cajita1 = new cajaMedidas();
        double vol;

        cajita1.ancho = 10;
        cajita1.alto = 20;
        cajita1.profundidad = 15;

        vol = cajita1.ancho * cajita1.alto * cajita1.profundidad;

        System.out.println("Volumen es " + vol);


    }
    
}
