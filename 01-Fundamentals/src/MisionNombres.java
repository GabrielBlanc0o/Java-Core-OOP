
public class MisionNombres {
	
	static int nivelGlobal = 1;
	public static void main(String[] args) {
		
		
		// dos variables q apuntan al string pool pa ahorrar memoria
		
		int a = 5;
		int b = 5;
		
		// cuando necesitamos que el dato entero no sea primitivo si no como un nuevo espacio en memoria del heap
		
		Integer a1 = 10;
		Integer b2 = 10;
		
		System.out.println("¿Iguales con Autoboxing?: "+ (a1 == b2));
		
		String nombre1 = "Gabriel";
		String nombre2 = "Gabriel";
		
		// forzar un nuevo objeto en el heap
		
		String nombre3 = new String("Gabriel");
		
		System.out.println("¿Nombre 1 y 2 son la misma direccion?: " + (nombre1 == nombre2));
		System.out.println("¿Nombre 1 y 3 son la misma direccion? : " + (nombre1 == nombre3));
		
		// comprar el contenido con equal
		
		System.out.println("¿Nombre 1 y 3 tienen el mismo texto?: " + nombre1.equals(nombre3));
		
		if (true) {
			
			nivelGlobal = 50;
			
		}
		System.out.println(nivelGlobal);
		
	}
	

}
