class areaTriangulo {

    double ancho ;
    double alto;

    areaTriangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    double calcularArea (){
        return (ancho * alto) / 2;
    }
}

public class area {

    public static void main(String[] args){

        areaTriangulo triangulo1 = new areaTriangulo(2.5,6.5);

        double total = triangulo1.calcularArea();

        System.out.println("El area es : "+total);


    }

}