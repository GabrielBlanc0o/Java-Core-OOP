class caja{

    double ancho;
    double alto;
    double profundidad;

    double volumen(){
        return ancho *alto*profundidad;
    }

}

class metodoReturn{

    public static void main(String[] args){

        caja caja1 = new caja();
        caja caja2 = new caja();

        // asignar los valores de caja 1 a las variables de instancia
        caja1.ancho = 10;
        caja1.alto = 15;
        caja1.profundidad = 20 ;

        /* asignamos diferentes valores a caja 2 con sus variables de instancia */

        caja2.ancho = 3;
        caja2.alto = 6;
        caja2.profundidad = 9;

        System.out.println("Volumen es " + caja1.volumen());
        System.out.println("Volumen es " + caja2.volumen());

    }
}