import java.util.HashMap;
import java.util.Scanner;

class TaskMenu
{
    private String name;
    private String Description;
    private int priority;
    private String status;

    public TaskMenu(String name, String Description, int priority,String status)
    {
        this.name = name;
        this.Description = Description;
        this.priority = priority;
        this.status = status;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setDescription(String Description)
    {
        this.Description = Description;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getName(){
        if (name.isEmpty())
        {
            System.out.println("Nombre vacio.");
        }
        return this.name;
    }

    public String getDescription(){
        return this.Description;
    }

    public int getPriority(){
        return this.priority;
    }
    public String getStatus(){
        return this.status;
    }

    @Override
    public String toString(){
        return name.concat(" Descripcion " + this.Description 
                         + " Prioridad " + this.priority 
                         + " Status " + this.status);
    }

}

public class TaskPropio 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,TaskMenu> mapa = new HashMap<>();    
        System.out.println("Welcome.");
        while (true) { 
            System.out.println("1. Add Task" 
                             + "\n2. View Task" 
                             + "\n3. Delete Task"
                             + "\n4. Update Task"
                             + "\n5. Exit");
        String userOption = sc.nextLine();
        
        if (userOption.equals("1"))
        {
            System.out.println("Enter the name of the task: ");
            String taskName = sc.nextLine();
            System.out.println("Enter the description of the task: ");
            String taskDescr = sc.nextLine();
            System.out.println("Enter the priority of the task: ");
            int taskPriority = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the status of the task: ");
            String taskStatus = sc.nextLine();

            TaskMenu nuevaTarea = new TaskMenu(taskName ,taskDescr,taskPriority,taskStatus);
            mapa.put(taskName, nuevaTarea);
            System.out.println("Successfuly task added");

        }
        else if (userOption.equals("2"))
        {
            System.out.println("To see the task, write the name of the task");
            String taskNameSearch = sc.nextLine();
            
            TaskMenu tareaEncontrada = mapa.get(taskNameSearch);
                 
            if (tareaEncontrada != null) {
                    System.out.println(tareaEncontrada);
            } else {
                    System.out.println("The task doesn't exist.");
            }
        }
        else if (userOption.equals("3"))
        {
            System.out.println("Enter the name of the task to delete: ");
            String deleteName = sc.nextLine();


                if (mapa.containsKey(deleteName)) {
                    mapa.remove(deleteName);
                    System.out.println("Successfully task deleted.");
                } else {
                    System.out.println("The task doesn't exist.");
                }
                
            } else if (userOption.equals("4")) {
                System.out.println("Enter the name of the task to update: ");
                String updateName = sc.nextLine();
                
                // Buscamos si la tarea existe para poder modificarla
                TaskMenu tareaAEditar = mapa.get(updateName);
                
                if (tareaAEditar != null) {
                    System.out.println("Enter new description: ");
                    tareaAEditar.setDescription(sc.nextLine());
                    System.out.println("Enter new priority: ");
                    tareaAEditar.setPriority(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter new status: ");
                    tareaAEditar.setStatus(sc.nextLine());
                    
                    System.out.println("Task updated successfully!");
                } else {
                    System.out.println("The task doesn't exist.");
                }
                
            } else if (userOption.equals("5")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}