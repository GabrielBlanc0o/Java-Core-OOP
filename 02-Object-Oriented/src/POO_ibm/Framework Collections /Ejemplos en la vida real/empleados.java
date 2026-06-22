import java.util.HashSet;

public class empleados{
    private HashSet<String> empleadosLista;
    public empleados(){
        empleadosLista = new HashSet<>();
    }
    public void agregarEmpleado(String empleado){
        empleadosLista.add(empleado);
    }
    public void mostrarEmpleados(){
        System.out.println("Empleados en la compañia: ");
        empleadosLista.forEach(empleado -> System.out.println(empleado));
    }
    public static void main(String[] args) {
        empleados manager = new empleados();
        manager.agregarEmpleado("Gabriel");
        manager.agregarEmpleado("Pepe");
        manager.agregarEmpleado("Every");

        manager.mostrarEmpleados();
    }
}