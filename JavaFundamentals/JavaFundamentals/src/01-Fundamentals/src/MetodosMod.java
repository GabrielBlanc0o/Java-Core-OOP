
import java.util.ArrayList;

public class metodosMod {

	static boolean estado = false;
	
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Gabriel");
		nombres.add(new String("Gabriel"));
		nombres.add("Mate"); // uno equivocado para probar el contador
		
		// IMPORTANTE LLAMAR A EL NUEVO METODO
		int total = contarApariciones(nombres,"Gabriel");
		System.out.println("El nombre buscado aparece : "+ total + " veces.");
		transformarMayusculas(nombres);
		
		for (String item : nombres) {
			if (!item.equals(nombres.get(0)) ) {
				System.out.println("LOG: NOMBRE " + item + " NO PERTENECE");
			}
		}
	}
	
	// NUEVO METODO con logica reutilizable
	public static int contarApariciones(ArrayList<String> lista, String nombreBuscado) {
		int contador = 0;
		for (String item: lista) {
			if (item.equals(nombreBuscado)) {
				contador++;
			}
		}	
		return contador;
	}
	
	
	// metodo para convertir a mayusculas todo el contenido de la lista array
	public static void transformarMayusculas(ArrayList<String> lista) {
		for (String item:lista) {
			//.toUpperCase() es un metodo de la clase String
			System.out.println("NOMBRE: "+item.toUpperCase());		
		}	
	}
}