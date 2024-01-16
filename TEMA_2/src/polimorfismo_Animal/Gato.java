package polimorfismo_Animal;

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
	@Override
	public String parir() {
		return  "waaa waaa waaa soy un bebe gato";
	}

	@Override
	public String toString() {
		return "Gato [vidas=" + vidas + "]";
	}
}
