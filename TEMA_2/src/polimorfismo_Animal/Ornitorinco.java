package polimorfismo_Animal;

public class Ornitorinco extends Animal{
	private boolean enReserva;
			
	public void comer() {
		System.out.println("comiendo...");
	}
	
	public Ornitorinco() {
		
	}
	@Override
	public String parir() {
		return  "lamentablemente no tengo huevos para poder parir";
	}

	@Override
	public String toString() {
		return "Ornitorinco [enReserva=" + enReserva + "]";
	}
}
