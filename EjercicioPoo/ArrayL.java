import java.util.ArrayList;

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


public class ArrayL{
    public static void main(String[] args){

        ArrayList<Carro> parqueaderoDinamico = new ArrayList<>();

        parqueaderoDinamico.add(new Carro("Lada 1600", 80));
        parqueaderoDinamico.add(new Carro("Porsche 944", 185));
        parqueaderoDinamico.add(new Carro("Pontiac 1954", 120));

        for (Carro c : parqueaderoDinamico) {
            c.acelerar();
        }  
    }
}