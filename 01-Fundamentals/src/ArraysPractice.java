
// siempre para usar arrays usamos util arrayList

import java.util.ArrayList;

public class arrays {

	public static void main(String[] args) {
		
		
		// las listas no aceptan datos primitivos y esto vive en el heap
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(500);

		// para acceder a un dato del array
		System.out.println("El primer numero es: "+ numeros.get(0));
		
		// para saber el tamaño dinamico
		System.out.println("Total de elementos: "+ numeros.size());
		
		// para borrar un dato
		numeros.remove(0);
		System.out.println("Ahora el primer numero es: "+ numeros.get(0));
		
		
	}
	
	
}
