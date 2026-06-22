
import java.util.TreeMap;

public class LeaderBoard {
    public static void main(String []args){
        TreeMap<String,Integer> leaderboard = new TreeMap<>();

        leaderboard.put("Charlie" ,100);
        leaderboard.put("Alice" ,150);
        leaderboard.put("Bob" ,200);

        // mostar el leaderboard
        for (String player : leaderboard.keySet()){
            System.out.println(player + ": " + leaderboard.get(player));
        }

        //entonces los treeMap son ordenados por sus llaves
        // no permiten valores vacios 
        // usan estructura de ordenamiento el arbol rojo negro
        // usa mas memoria
        // itera en el orden de las llave

        /*
            recorderis, usar .put() para agregar sus valores llave valor
            .keySet() para iterar sobre el mapa
        */
   }
}
