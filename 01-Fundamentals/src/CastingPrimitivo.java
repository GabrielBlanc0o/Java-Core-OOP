
public class CastingPrimitivo {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Lo que hicimos es convertir el tipo de dato de double a int
		 * asi directamente redondeamos un valor eso si sin reglas
		 * si es 9.99 redondeado es 9, no tenemos condiciones para q fuera 
		 * a algo mas realista
		 * 
		 * */
			
		
		double precioExacto = 19.99;
		int precioRedondeado = (int) precioExacto; // forzamos el cambio
		
		System.out.println("Precio Original: " + precioExacto);
		System.out.println("Precio en int : " + precioRedondeado);

		
		// ahora veamos de tipo de dato String a Int
		
		String edadTexto = "18"; 
		int edadNumero = Integer.parseInt(edadTexto);
		
		/*
		 * aqui usamos el tipo de dato que queremos procesar y que variable
		 * creamos la variable en el dato primitivo luego lo declaramos como
		 * su tipo en objeto y usamos .parseInt en este caso para un int mas la variable
		 * que queremos convertir para que esa la almacene , abajo solo imprimos
		 * la variable mas 1
		 */
		
		System.out.println("El proximo año tendras: " + (edadNumero + 1));
		
		/* ahora intentare pasar de int a string
		 * hice lo mismo pero intercambiando los tipos de datos y usando valueOf mas 
		 * la variable primitiva y imprimi la variable de tipo string
		 * */
		
		int intentoInt = 10;
		String convertir = String.valueOf(intentoInt);
		System.out.println(convertir);
		
		
		
		
	}

}
