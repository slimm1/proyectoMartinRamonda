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
	
	public void setHobby(String newHobby) {
		this.hobby = newHobby;
	}
	
	public void setPlato(String newPlato) {
		this.plato = newPlato;
	}
	
	public void setNumIngredientes(int num) {
		this.numIngredientes=num;
	}
	
	private void loop() {
		for(int pos=1;pos<=1000; pos++) {
			System.out.println(hobby);
		}
	}
	
	
}
