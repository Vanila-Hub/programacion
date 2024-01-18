package comparator;

import java.util.ArrayList;

import figuras.Circulo;

public class FigurasApp {

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		Figura circulo = new Figura();
		Figura semicirculo = new Figura();
		
		circulo.setRadio(80);
		semicirculo.setRadio(5);
		
		ArrayList<Figura> figura = new ArrayList<Figura>();
		
		figura.add(circulo);
		figura.add(semicirculo);
		//sin ordenar por areas
		for (Figura figura2 : figura) {
			System.out.println(figura2.getArea());
		}
		//sort
		figura.sort(new CompararAreas());
		//ordenado por areas
		for (Figura figura2 : figura) {
			System.out.println(figura2.toString());
		}	
	}
}
