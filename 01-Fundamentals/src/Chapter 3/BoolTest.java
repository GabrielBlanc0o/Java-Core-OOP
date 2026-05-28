
class BoolTest {

    public static void main(String[] args){

        boolean b;

        b = false;
        System.out.println("b es " + b);
        b = true;
        System.out.println("b es " + b);

        if(b) System.out.println("Esto se ejecuto");

        b = false;
        if(b) System.out.println("Esto no se ejecuto");

        System.out.println("10 > 9 " + (10>9));

        int x =  0b1101_0101_0001_1010; // binario de a grupos de 4 underscore
        System.out.println(x);
    }
}
