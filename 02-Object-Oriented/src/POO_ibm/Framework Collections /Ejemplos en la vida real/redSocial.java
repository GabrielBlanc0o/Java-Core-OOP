
import java.util.HashMap;
import java.util.HashSet;
/*
usar hashmap y hashset
hashmap permite ver los seguidores de manera rapida y el hashset 
ayuda amirar otros perfiles tambien rapido y evitar seguidores duplicados

*/
public class redSocial {
    private HashMap<String,HashSet<String>> seguidoresUser;
    public redSocial() {
        seguidoresUser = new HashMap<>();
    }
    public void agregarSeguidores(String user, String seguidor){
        seguidoresUser.putIfAbsent(user, new HashSet<>());
        seguidoresUser.get(user).add(seguidor);
    }
    public void mostrarSeguidores(String user){
        System.out.println("Seguidores de " + user + ":");
        HashSet<String> seguidores = seguidoresUser.get(user);
        if (seguidores != null){
            seguidores.forEach(seguidor -> System.out.println(seguidor));
        } else {
            System.out.println("No hay seguidores encontrados.");
        }
    }

    public static void main(String[] args) {
        redSocial socialMedia = new redSocial();
        socialMedia.agregarSeguidores("Pepe", "Pepa");
        socialMedia.agregarSeguidores("Pepe", "Gabo");
        socialMedia.mostrarSeguidores("Pepe");
    }
}
