public abstract class claseabstractra {
    abstract  void draw();
}

public class Circle extends claseabstractra {
    @Override
    void draw(){
        System.out.println("Dibujando Circulo");
    }
}