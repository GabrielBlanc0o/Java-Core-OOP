/**Caracteristicas del metodo virtual:
 * Permite a los metodos ser recorridos con Override en las subclases.
 * Cosidera a todos los metodos nonstatic como virtuales por defecto
 * habilita la resolucion de metodo dinamico  
 * determina el metodo de ejecucion basando en el tipo de objeto
 * Ejemplo
 */

class Animal 
{
    void sound()
    {
        System.out.println("Animal hace un sonido");
    }
}

class Perro extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Perro ladra");
    }
}

public class MetodoVirtual
{
    public static void main(String[] args) 
    {
        Animal miAnimal = new Perro();    // para crear un objeto haciendo referencia 
                                          // a una clase de tipo herencia
    }
}