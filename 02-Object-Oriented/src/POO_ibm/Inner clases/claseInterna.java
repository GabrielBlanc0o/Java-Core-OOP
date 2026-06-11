class OuterClass 
{
    void miMetodo() 
    {
        class metodoLocalInner 
        {
            void display()
            {
                System.out.println("Metodo interior local en una clase interior.");
            }
        }
        metodoLocalInner interno = new metodoLocalInner(); // instancia
        interno.display(); // llamar metodo
    }
}