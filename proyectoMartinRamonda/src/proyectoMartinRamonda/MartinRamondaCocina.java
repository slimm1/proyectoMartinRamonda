package proyectoMartinRamonda;

public class MartinRamondaCocina {
	
	String hobby, plato;
	int numIngredientes;
	public MartinRamondaCocina(String hobby, String plato, int numIngredientes) {
		this.hobby=hobby;
		this.plato=plato;
		this.numIngredientes=numIngredientes;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public String getPlato() {
		return plato;
	}
	
	public int getNumIngredientes() {
		return numIngredientes;
	}
	
	
}
