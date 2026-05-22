
public class LimiteCache {

	
	public static void main (String[] args) {
		
		// caso a dentro del rango del cache -128 aa 127
		
		Integer pequeño1 = 100;
		Integer pequeño2 = 100;
		System.out.println("¿Pequeños son iguales con ==?: " + (pequeño1 == pequeño2));
		
		
		// caso b fuera del rango del cache
		
		Integer grande1 = 500;
		Integer grande2 = 500;
		System.out.println("¿Grandes son iguales con ==?: " + (grande1 == grande2));
		
		System.out.println("Equivalencia con equal : " + grande1.equals(grande2));
		
		
		// da false porque el valor se desborda en la memoria
		
		/*
		 * Recomendaciones, cuando interactue a comprar objetas SIEMPRE usar
		 * .equals()
		 * 
		 * */
		
	}
}
