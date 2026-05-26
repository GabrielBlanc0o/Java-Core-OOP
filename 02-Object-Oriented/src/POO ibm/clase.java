class carro {
    // atributos de un carro
    String color;
    String modelo;
    int año;

    // metodo para mostrar la info del carro

    void mostrarInfo(){
        System.out.println("Modelo del auto : " + modelo);
        System.out.println("Color del auto : " + color);
        System.out.println("Año del auto : " + año);
    }
}


//  creamos un objeto en base a la construccion de una clase

public class clase {
    public static void main(String[] args){
        carro miCarro = new carro();

        // asignamos los valores de atributo del objeto
        miCarro.color = "Rojo";
        miCarro.modelo = "Mustang";
        miCarro.año = 2025;

        miCarro.mostrarInfo();
    }
}


