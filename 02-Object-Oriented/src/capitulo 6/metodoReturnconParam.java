class caja{

    double ancho;
    double alto;
    double profundidad;

    double volumen(){
        return ancho*alto*profundidad;
    }

    // declarar las dimensiones de la caja
    void asignarDimension(double anch , double alt , double profundid){
        ancho = anch;
        alto = alt;
        profundidad = profundid;
    }
}

class metodoReturnconParam{

    public static void main(String[] args){

        caja caja1 = new caja();
        caja caja2 = new caja();
        double volumen;

        // inicializar cada caja

        caja1.asignarDimension(10, 20, 15);
        caja2.asignarDimension(3, 6, 9);

        volumen = caja1.volumen();
        System.out.println("Volumen es "+volumen);


        volumen = caja2.volumen();
        System.out.println("Volumen es "+ volumen);
    }
}