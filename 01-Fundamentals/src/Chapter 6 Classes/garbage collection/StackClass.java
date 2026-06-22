/*
Clase de tipo stack , en la cual se nos enseña que  es un ejemplo practico de la 
encapsulacion 
*/

// esta clase define un entero stack que puede sostener 10 valores
class Stack {
    int[] stack = new int[10];
    int tos;

    // inicializa el top del stack
    Stack() {
        tos = -1;
    }

    // empuja un item dentro del stack

    void empujar (int item){
        if (tos == 9){
            System.out.println("Stack esta lleno");
        }
        else {
            stack[++tos] = item;
        }
    }

    // un item del stack desbordado
    int pop(){
        if (tos < 0){
            System.out.println("Stack desbordado");

            return 0;
        } else {
            return stack[tos--];
        }
    }
}

public class StackClass {
    public static void main(String[] args) {
        Stack miStack1 = new Stack();
        Stack miStack2 = new Stack();

        // empuja algunos numeros al stack
        for (int i = 0; i < 10; i++) miStack1.empujar(i);
        for (int i = 10; i < 20; i++) miStack2.empujar(i);

        //  lo que hace pop es desde el primero ir restando asi hace el pop

        System.out.println("Stack en miStack 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(miStack1.pop());
        }

        System.out.println("Stack en miStack 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(miStack2.pop());
        }      
    }
}