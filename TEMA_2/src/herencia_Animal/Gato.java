package herencia_Animal;

public class Gato extends Animal{
	private int vidas;
	
	public Gato() {
		
	}
	
	public void maullar() {
		System.out.println("MIAOOO");
	}
	public void morir() {
		System.out.println("he muerto");
	}
}
