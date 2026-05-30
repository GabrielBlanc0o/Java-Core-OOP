import java.util.ArrayList;

class estudiante {

    private String nombre;
    private String lenguaje;
    private boolean activo;

    estudiante(String nombre,String lenguaje){
        this.nombre = nombre;
        this.lenguaje = lenguaje;
        this.activo = true;
    }

    void darDeBaja(){
        this.activo = false;
    }

    void estudiar(){
        if (this.activo == true) {
            System.out.printf("\n %s esta programando duro en %s ",this.nombre,this.lenguaje);            
        }
    }
}

public class ArraylistForE{
    public static void main(String[] args){
        ArrayList<estudiante> aulaVirtual = new ArrayList<>();

        aulaVirtual.add(new estudiante("pepa", "c++"));
        aulaVirtual.add(new estudiante("gabriel", "java"));
        aulaVirtual.add(new estudiante("juan", "go"));

        aulaVirtual.get(0).darDeBaja();

        for (estudiante e : aulaVirtual){
            e.estudiar();
        }
        System.out.println();
    }
}