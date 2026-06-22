
import java.util.LinkedList;

class func {
    public int largestAltitude(int[] gain) {
        LinkedList<Integer> mapa = new LinkedList<>();
        for (int obj : gain){
            mapa.add(obj);
        }
        for (int obj1 : mapa){
            obj1 = obj1 + 1;
            mapa.add(obj1);
        }
        System.out.println(mapa);
        return  0 ;
    } 
}

public class main {
    public static void main(String[] args) {
        func func = new func();
        int[] gain ={ -5,1,5,0,-7};

        func.largestAltitude(gain);
    }
}
