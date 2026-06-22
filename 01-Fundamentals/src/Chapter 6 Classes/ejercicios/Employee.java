class Empleado{

    String name;
    String role;
    double salary;
    boolean isActive;

    Empleado(String name ,String role, double salary){
        isActive = true;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    void displayInfo(){
        System.out.println("Empleado "+ name 
            + ", Rol: " + role + " ,Salario: " + salary + ", Activo: " + isActive); 
    }
}

public class Employee {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Gabriel", "Backend", 1000);
        Empleado empleado2 = new Empleado("Pepe", "Frontend", 800);
        empleado1.displayInfo();
        empleado2.displayInfo();
    }
}
