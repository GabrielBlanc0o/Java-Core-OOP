class DogAnimal{ //clase secundaria

    String name; // atributo

    DogAnimal(String dogName){ // constructor parametrizado
        name = dogName;
    }

    void mostrar(){ // metodo usando constructor
        System.out.println("El nombre del perro es: " + name);
    }
}

public class ConstructorParametrizado{
    public static void main(String[]args){
        DogAnimal dog1 = new DogAnimal("Buddy"); // crear objeto
        dog1.mostrar();
    }
}