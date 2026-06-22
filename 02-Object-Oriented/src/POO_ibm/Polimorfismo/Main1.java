
// tiempo de compilacion Polimorfismo

class OperacionesMatematicas 
{
    // metodo para agregar 2 numeros enteros 
    int agregar(int a, int b)
    {
        return a + b;
    }

    // Metodo para agregar 3 enteros
    int agregar(int a, int b,int c)
    {
        return a + b + c;
    }

    // metodo para agregar 2 numeros enteros dobles
    double agregar(double a, double b)
    {
        return a + b;
    }
}

public class Main1 
{
    public static void main(String []args)
    {
        OperacionesMatematicas mates = new OperacionesMatematicas();
        System.out.println("Suma de 2 y 3: " + mates.agregar(2, 3));
        System.out.println("Suma de 2 , 3 y 4: " + mates.agregar(2, 3,4));



    }
}
