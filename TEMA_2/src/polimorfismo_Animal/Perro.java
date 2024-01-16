package polimorfismo_Animal;

public class Perro extends Animal{
	private String raza;
	
	public Perro() {
		
	}
	
	public void ladrar() {
		System.out.println("wuf wuf wuf....");
	}
	@Override
	public String parir() {
		return  "lamentablemente no tengo huevos para poder parir";}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + "]";
	}
}
