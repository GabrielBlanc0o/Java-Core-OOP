import java.util.ArrayList;
import java.util.Scanner;

interface opciones {
    void addStudent(); 
    void deleteStudent();
    void updateStudent();
    void sortStudents();
}

class Student {

    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major)
    {
        this.name = name;
        this.age = age; 
        this.major = major;
    }

    public String getName(){
        return this.name;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public void setMajor(String major)
    {
        this.major = major;
    }


    public String getMajor()
    {
        return this.major;
    }

    @Override
    public String toString(){
        return name.concat(" Age " + this.age + " Major " + this.major);
    }
}

public class Students implements opciones
{
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        

    @Override
    public void addStudent() 
    {
        System.out.println("Enter the name of the student.");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter major: ");
        String major = sc.nextLine();
        Student newStudent = new Student(name, age, major);
        System.out.println("Added: " + newStudent);
        list.add(newStudent);
    }
    
    @Override
    public void deleteStudent() 
    {
        System.out.println("Enter index of the student to delete.");
        int indxUsr = Integer.parseInt(sc.nextLine());
        if (indxUsr > list.size()) {
            System.out.println("Posicion fuera de rango inexistente.");
        }
        list.remove(indxUsr);
        System.out.println("Student Erased");


    }
    

   @Override
    public void updateStudent() {
        System.out.println("Enter index of the student to update.");
        int indx = Integer.parseInt(sc.nextLine());

        
        if (indx < 0 || indx >= list.size()) {
            System.out.println("Posición fuera de rango.");
            return;
        }

        Student estudianteActual = list.get(indx);
        System.out.println("Current student: " + estudianteActual);

        System.out.println("Ingresa el nuevo nombre para " + estudianteActual.getName() + ":");
        String nuevoNombre = sc.nextLine();
        
        System.out.println("Ingresa la nueva edad:");
        int nuevaEdad = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingresa la nueva carrera (major):");
        String nuevaCarrera = sc.nextLine();

        
        estudianteActual.SetName(nuevoNombre);
        estudianteActual.setAge(nuevaEdad);
        estudianteActual.setMajor(nuevaCarrera);

        System.out.println("Student updated successfully!");
    }
    
    @Override
    public void sortStudents() {
        if (list.isEmpty()) {
            System.out.println("La lista está vacía. Nada que ordenar.");
            return;
        }
        
        list.sort((s1, s2) -> Integer.compare(s2.getAge(), s1.getAge()));
        
        System.out.println("Students sorted by age (High to low):");
        list.forEach(estudi -> System.out.println(estudi));
    }
    public static void main(String [] args)
    {
        System.out.println("Welcome");
        Scanner scMain = new Scanner(System.in);
        Students gestor = new Students();


        while(true)
        {
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Delete student (By index) ");
            System.out.println("4. Sort by  age (High to low)");
            int userOption = Integer.parseInt(scMain.nextLine());

            switch (userOption) {
            case 1 -> gestor.addStudent();
            case 2 -> gestor.updateStudent();
            case 3 -> gestor.deleteStudent();
            case 4 -> gestor.sortStudents();
            default -> System.out.println("Opción no válida");
 
            }
        }
    }
}   
