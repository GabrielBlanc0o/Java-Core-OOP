// ocurre cuando una subclase nos da implementacion 
// especifica de un metodo definido en una superclase

/* Runtime Polimorfismo */

class Animal
{
    void sonido()
    {
        System.out.println("Animal hace un sonido.");    
    }
}

class Perro extends Animal
{
    @Override
    void sonido()
    {
        System.out.println("Perro ladra");
    }
}

class Gato extends Animal
{
    @Override
    void sonido()
    {
        System.out.println("Gato Miau");
    }
}

public class RuntimePoly
{
    public static void main(String[] args) 
    {
        Animal miAnimal; // Declaramos una referencia Animal
        miAnimal = new Perro();
        miAnimal.sonido();

        miAnimal = new Gato();
        miAnimal.sonido();
    }
}