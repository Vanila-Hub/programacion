package herencia_Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AppAnimal_Herencia {
	public static void run() {
		Ballena ballena = new Ballena();
		Ornitorinco orni = new Ornitorinco();
		Loro loro = new Loro();
		Gato gato = new Gato();
		Perro perro = new Perro();
		
		ballena.setOceano("Atlantico");
		ballena.setNumpatas(2);
		ballena.parir();
		
		orni.setNumpatas(4);
		orni.setClase("Mamifero");
		orni.comer();
		orni.parir();
		
		gato.setNumpatas(5);
		gato.setClase("Gatus Latrusus");
		gato.parir();
		
		loro.setNumpatas(5);
		loro.setClase("Lorus Latrusus");
		loro.parir();
		
		perro.ladrar();
		perro.setClase("Canus Lupus");
		
		System.out.println(perro.toString() + ballena.toString() + loro.toString() + gato.toString());
		
		
		
		
	}
}
