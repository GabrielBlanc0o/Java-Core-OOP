class OuterClass
{
    static int variableEstatica = 20;

    static class claseEstatica
    {
        void mostrar()
        {
            //las clases estaticas pueden accedes a variables  staticas
            System.out.println("Valor de la variable statica: " + variableEstatica);
        }
    }

}

public class estaticas 
{
    public static void main(String []args)
    {
        // si la llamamos directamente por lo que es estatica anidada
        OuterClass.claseEstatica nested = new OuterClass.claseEstatica();
        nested.mostrar();      
    }
}
