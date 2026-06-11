class OuterClass // clase externa
{
    int variableAfuera = 10; 

    class InnerClass // clase interna con su metodo 
    // llamando a una variable de la clase externa
    {
        void display()
        {
            System.out.println("Valor variableAfuera: " + variableAfuera);
        }   
    }
}

public class Main1 
{
    public static void main(String[] args) 
    {
        {
            OuterClass afuera = new OuterClass(); // crea una instancia del clase E
            OuterClass.InnerClass dentro = afuera.new InnerClass();
            /*
                Para poder instanciar la clase interna debemos 
                llamar la clase de afuera con un punto con su nombre, y para
                crearla sobre su metodo , primero el nombre de la instancia exterior con un .new 
                y el nombre de la clase.
            */
            dentro.display(); // usar metodo
        }
    }
}

