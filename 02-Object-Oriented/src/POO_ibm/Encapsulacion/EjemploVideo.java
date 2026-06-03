
class Person{

    //atributos privados

    private String name;
    private int age;

    //constructor

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // metodo publico getter para obtener el nombre
    public String getName(){
        return name;
    }

    // metodo publico setter para indicar el nombre

    public void setName(String name){
        this.name = name;
    }

     // metodo publico getter para obtener la edad

    public int getAge(){
        return age;
    }
    // metodo publico para poner la edad 
    public void setAge(int age){ // validacion simple
        if (age >= 0 ){
            this.age = age;
        } else {
            System.out.println("Numero de edad no puede ser negativa .");
        }
    }

}

public class EjemploVideo{
    public static void main(String[] args) {
        // creacion del objeto persona
        Person person = new Person("Gabriel", 18);
        System.out.println("Nombre: " + person.getName());        
        System.out.println("Edad: " + person.getAge());        
        // modificar las propiedades usando setters
        person.setName("Bob");
        person.setAge(25);
        // mostrar la informacion actualizada
        System.out.println("Nombre actualizado: "+person.getName());
        System.out.println("Edad actualizada: "+person.getAge());
        person.setAge(-5);

    }
}