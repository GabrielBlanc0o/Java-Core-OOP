
import java.util.ArrayList;

public class EjercicioArray {

	static boolean status = false;
	
	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Gabriel");
		nombres.add(new String("Gabriel"));
				
		if (nombres.get(0) == nombres.get(1)) {
			status = true;
			System.out.println("Por medio de memoria: "+ status);
		} else if (nombres.get(0).equals(nombres.get(1))) {
			status = true;
			System.out.println("Por medio de equal por heap independiente: "+ status);
		}else {
			System.out.println("indiferencia: "+status);
		}
		
		for (String nombre: nombres) {
			System.out.println("Procesando: " + nombre);
		}
	}
}
