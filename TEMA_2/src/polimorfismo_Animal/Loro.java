package polimorfismo_Animal;

public class Loro extends Animal{
	
	public Loro() {
		
	}
	
	public void hablar(String frase) {
		System.out.println(frase);
	}
	@Override
	public String parir() {
		return  "waaa waa soy bebe loro";}

	@Override
	public String toString() {
		return "Loro []";
	}
}
