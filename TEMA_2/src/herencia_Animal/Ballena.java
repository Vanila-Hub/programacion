package herencia_Animal;

public class Ballena extends Animal{
	private String oceano;
	
	public Ballena() {
		
	}
	
	public void nadar() {
		System.out.println("nadando");
	}

	public String getOceano() {
		return oceano;
	}

	public void setOceano(String oceano) {
		this.oceano = oceano;
	}
	
}
