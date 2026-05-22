class caja {
    int ancho;
    int alto;
    int profundidad;

    }

class BoxDemo {
    
    public static void main(String[] args){
        caja miCaja = new caja();
        caja mi2Caja = new caja();
        double volumen;

        // primer caja creada
        miCaja.ancho = 10;
        miCaja.alto = 20;
        miCaja.profundidad = 15;

        //segunda caja creada
        mi2Caja.ancho = 3;
        mi2Caja.alto = 6;
        mi2Caja.profundidad = 9;
        
        volumen = miCaja.ancho  * miCaja.alto * miCaja.profundidad;
        System.out.println("Volumen es " + volumen);

        volumen = mi2Caja.ancho  * mi2Caja.alto * mi2Caja.profundidad;
        System.out.println("Volumen es " + volumen);
        
    }
}



