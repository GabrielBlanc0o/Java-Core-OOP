abstract class Shape
{
    abstract void draw();
    void display() 
    {
        System.out.println("Esto es un forma.");
    }
}

// subclase concreta
class Circulo extends Shape
{
    void draw()
    {
        System.out.println("Dibujando Circulo");
    }
}

public class clasesAbs
{
    public static void main(String []args)
    {
        Shape shape = new Circulo();
        shape.draw();
        shape.display();
    }
}