package figuras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("1. Calcular area de rectangulo - 2.Calcular area de circulo ");
		
		switch (Integer.parseInt(scan.nextLine())) {
		case 1:
			Rectangulo r = new Rectangulo();
			System.out.println("Introduzca la base");
			r.setAltura(Double.parseDouble(scan.nextLine()));
			System.out.println("Introduzca la altura");
			r.setBase(Double.parseDouble(scan.nextLine()));
			System.out.println("El area del rectangulo es > ");
			System.out.println(r.calcularArea());
			break;
		case 2:
			Circulo c = new Circulo();
			System.out.println("Introduzca la radio del circulo");
			c.setRadio(Double.parseDouble(scan.nextLine()));
			System.out.println("El area del circulo es > ");
			System.out.print(c.calcularArea());
			break;

		default:
			break;
		}
	}

}
