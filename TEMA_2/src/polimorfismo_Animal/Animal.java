package polimorfismo_Animal;

import java.util.ArrayList;

public class Animal {
	private String clase;
	private int numpatas;
	
	public Animal() {
		
	}
	
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getNumpatas() {
		return numpatas;
	}

	public void setNumpatas(int numpatas) {
		this.numpatas = numpatas;
	}

	@Override
	public String toString() {
		return "Animal [clase=" + clase + ", numpatas=" + numpatas + "]";
	}

	public String parir() {
		return "waaa waaa waaa soy un bebe " + this.clase;
	}
	
}
