
import java.util.LinkedList;

public class administradorTareas {
    private LinkedList<String> tareas;
    public administradorTareas(){
        tareas = new LinkedList<>();
    }
    public void agregarTarea(String tarea){
        tareas.add(tarea);
    }
    public void completarTarea(){
        if (!tareas.isEmpty()){
            String tareaCompletada = tareas.removeFirst();
            System.out.println("Tarea completada : " + tareaCompletada);
        } else {
            System.out.println("No hay tareas para completar.");
        }
    }
    public void mostrarTareas() {
        System.out.println("Tareas actuales. ");
        tareas.forEach(tarea -> System.out.println(tarea));
    }

    public static void main(String[] args) {
        administradorTareas manager = new administradorTareas();
        manager.agregarTarea("Finalizar reporte");
        manager.agregarTarea("Email cliente");
        manager.mostrarTareas();
        manager.completarTarea();
        manager.mostrarTareas();
    }
}
