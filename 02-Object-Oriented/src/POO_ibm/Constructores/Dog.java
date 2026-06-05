class DogAnimal{ //clase secundaria

    String name; // atributo

    DogAnimal(){ // constructor
        name = "Desconocido";
    }

    void mostrar(){ // metodo usando constructor
        System.out.println("El nombre del perro es: " + name);
    }
}

public class Dog{
    public static void main(String[]args){
        DogAnimal dog1 = new DogAnimal(); // crear objeto
    }
}