class area {

    double base ;
    double altura;

    area(){
        base = 0.0;
        altura = 0.0;
    }

    double areatotal (double b, double a){
        return b * a / 2.0;
    }
}

class areaTriangulo{
    public static void main(String[] args){

        area triangulo1 = new area();
        System.out.println("Area : " + triangulo1.areatotal(4.5, 6.5));


    }

}
