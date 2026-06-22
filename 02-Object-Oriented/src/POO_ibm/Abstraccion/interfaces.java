interface Animal 
{
    void sound();
}

class Dog implements Animal
{
    public void sound(){
        System.out.println("Bark");
    }
}


class Cat implements Animal
{
    public void sound(){
        System.out.println("Meow");
    }
}

// muestra como diferentes clases pueden dar una 
// implementacion unica del metodo

public class interfaces
{
    
    public static void main(String []args)
    {
        Animal dog = new Dog();
        Animal cat = new Cat();
        // Demostracion de polimorfismo por el metodo
        dog.sound();
        cat.sound();
    }
}