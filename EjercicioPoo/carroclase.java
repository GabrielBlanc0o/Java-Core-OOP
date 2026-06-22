class Carro {

    private String modelo;
    private int velocidadMaxima;

    public Carro(String modelo,int velocidadMaxima) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setVelocidadMaxima(int nuevaVelocidad){
        if (nuevaVelocidad < 0) {
            System.out.println("Error! La velocidad no puede ser negativa.");   
        } else {
            this.velocidadMaxima = nuevaVelocidad;
        }
    }

    void acelerar(){
        System.out.println("El coche " + modelo + " esta corriendo a " + velocidadMaxima + " km/h");
    }
}

public class carroclase {
    public static void main(String[] args){

        Carro carro1 = new Carro("Lada 1600",80);
        carro1.setVelocidadMaxima(-20);
        carro1.acelerar();
        Carro carro2 = new Carro("Porsche 944", 185);
        carro2.acelerar();
    }

}