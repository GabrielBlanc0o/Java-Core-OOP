class medidasDeLaCaja{
    double alto;
    double ancho;
    double profundidad;
    // metodo a la clase medidasCaja
    void volumen(){
        System.out.print("Volumen es ");
        System.out.println(alto * ancho * profundidad);
    }
}

public class CajaMetodos {
    public static void main(String[] args){
        medidasDeLaCaja caja = new medidasDeLaCaja();
        medidasDeLaCaja caja2 = new medidasDeLaCaja();

        caja.ancho = 10;
        caja.alto = 20;
        caja.profundidad = 23;

        caja2.ancho = 14;
        caja2.alto = 16;
        caja2.profundidad = 15;

        caja.volumen();
        caja2.volumen();
    }
}

