package otros;

public class Pokemon {

	String nombre;
	int level;
	
	Pokemon(){
		level = 1;
	}
	
	Pokemon(String nombre, int level){
		this.nombre = nombre;
		this.level = level;
	}
	
	
	void ataque() {
		System.out.println(nombre + " ataca!");
	}
	
	
}
