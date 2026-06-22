
class caja{

    double ancho;
    double alto;
    double profundidad;

    caja(){ 
        // este es el constructor para la caja.
        System.out.println("Caja constructora");
        alto = 10;
        ancho = 10;
        profundidad = 10;
    }

    // procesar y devolver volumen
    double volumen(){
       return ancho *alto*profundidad;
    }
    
}

class metodoReturnconConstructor{
    public static void main(String[] args){
        caja micaja1 = new caja();
        caja micaja2 = new caja();

        double volumen;

        // obtener el volumen de la primera caja
        volumen = micaja1.volumen();
        System.out.println("Volumen es " + volumen);
        volumen = micaja2.volumen();
        System.out.println("Volumen es " + volumen);
    }
}