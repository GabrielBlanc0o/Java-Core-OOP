import java.util.Scanner;

class sesion {

    String[] tokens = new String[4];
    int activeCount;

    sesion(){
        activeCount = -1;
    }

    boolean loginUser(String userToken){
        if (activeCount == tokens.length - 1) {
            System.out.println("Servidor lleno. Intente mas tarde");
            return false;
        } else {
            tokens[++activeCount] = userToken;
            return true;
        }
    }

    String logoutUser(){
        if (activeCount < 0) {
            System.out.println("No hay sesiones activas para cerrar");
        } else {
            return tokens[activeCount--];
        }
        return  "";
    }
}

public class SesioManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sesion server = new sesion();
        boolean running = true;

        System.out.println("=== SERVIDOR DE AUTENTICACIÓN CORPORATIVO ===");

        while (running) {
            try {
                System.out.println("1 Iniciar Sesión (Login)");
                System.out.println("2 Cerrar Última Sesión (Logout)");
                System.out.println("3 Salir");
                System.out.print("Seleccione opción: ");
                int op = sc.nextInt();

                if (op == 1) {
                    System.out.print("Ingrese nombre de usuario: ");
                    String username = sc.next();
                    String token = "TOKEN-" + username.toUpperCase();
                    
                    if (server.loginUser(token)) {
                        System.out.println(" Conectado con éxito: " + token);
                    }
                } else if (op == 2) {
                    String logoutUser = server.logoutUser();
                    if (!logoutUser.equals("")) {
                        System.out.println(" Sesión finalizada para: " + logoutUser);
                    }
                } else if (op == 3) {
                    running = false;
                    System.out.println("Cerrando servidor...");
                } else {
                    System.out.println("Opción inválida.");
                }

            } catch (Exception e) {
                System.out.println(" Error en la entrada de datos.");
                sc.next();
            }
            System.out.println("----------------------------------------\n");
        }
        sc.close();
    }
}