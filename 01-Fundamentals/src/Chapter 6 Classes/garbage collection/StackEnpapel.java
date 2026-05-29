class Stack {

    int stack[] = new int[10];
    int topStack;

     Stack() {
        topStack = -1;
    }

    void EmpujarStack(int item){
        if (topStack == 9){
            System.out.println("Stack Lleno");
        } else {
            stack[++topStack] = item;
        }
    }

    int retrocesoPop(){
        if (topStack < 0){
            System.out.println("Stack desbordado");
            return 0; 
        } else {
            return stack[topStack--];
        }
     }
}


public class StackEnpapel{
    public static void main(String[] args){
        Stack obj1 = new Stack();
        Stack obj2 = new Stack();

        for (int i =0 ; i < 10; i++) obj1.EmpujarStack(i);
        for (int i = 10; i < 20; i++) obj2.EmpujarStack(i);


        for (int i =0 ; i < 10; i++) System.out.println(obj1.retrocesoPop());
        System.out.println();
        for (int i = 0; i < 10; i++) System.out.println(obj2.retrocesoPop());
        
        
    }
}
