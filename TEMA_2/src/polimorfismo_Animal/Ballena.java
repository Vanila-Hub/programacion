package polimorfismo_Animal;

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
	
	@Override
	public String parir() {
		return  "waaa waaa waaa soy un bebe ballena";
	}

	@Override
	public String toString() {
		return "Ballena [oceano=" + oceano + "]";
	}
	@Override
	public void setNumpatas(int numpatas) {
		System.out.println("No tengo patas soy una ballena");
	}
}
