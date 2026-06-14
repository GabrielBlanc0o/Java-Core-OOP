import java.util.HashMap;


interface Opciones {
    void verificarStock(String codigo);
}

class GestorInventario implements Opciones { 
    private HashMap<String, Integer> stockRepuestos = new HashMap<>();

    public void registrarRepuesto(String codigo, int cantidad) {
        stockRepuestos.put(codigo, cantidad);
    }

    @Override
    public void verificarStock(String codigo) {
        if (stockRepuestos.containsKey(codigo)) {
            int unidades = stockRepuestos.get(codigo);
            System.out.println("Unidades disponibles del repuesto [" + codigo + "]: " + unidades);
        } else {
            System.out.println("Alerta: El repuesto [" + codigo + "] no está registrado en el inventario");
        }
    }
}

public class buscadorInventario {
    public static void main(String[] args) {
        GestorInventario taller = new GestorInventario();

        taller.registrarRepuesto("P944-BOMBA", 2);
        taller.registrarRepuesto("BZ4-PASTILLAS", 12);
        taller.registrarRepuesto("M3-FILTRO", 0);

        System.out.println("--- Ejecutando Búsquedas ---");
        taller.verificarStock("P944-BOMBA");    // Existe
        taller.verificarStock("AUDI-TURBO");    // No existe
    }
}