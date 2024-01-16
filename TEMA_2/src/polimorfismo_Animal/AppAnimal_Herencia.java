package polimorfismo_Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AppAnimal_Herencia {
	    
	final int CREAR_GATO = 0;

	public static void run() {
	    final int CREAR_ANIMAL = 1;
	    final int CREAR_BALLENA = 2;
	    final int CREAR_PERRO = 3;
	    final int CREAR_GATO = 4;
	    final int CREAR_ORNITORINCO = 5;
	    final int CREAR_LORO = 6;
	    final int MOSTRAR_TODOS = 7;
	    final int PARIR_TODOS = 8;
	    final int SALIR = 0;
	    
		ArrayList<Animal> listaAnimales = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
			do {
			    System.out.println("Menú:");
			    System.out.println(CREAR_ANIMAL + ". Crear Animal");
			    System.out.println(CREAR_BALLENA + ". Crear Ballena");
			    System.out.println(CREAR_PERRO + ". Crear Perro");
			    System.out.println(MOSTRAR_TODOS + ". Mostrar todos");
			    System.out.println(PARIR_TODOS + ". Parir todos");
			    System.out.println(SALIR + ". Salir");
			    System.out.print("Selecciona una opción: ");
			    
			    opcion = Integer.parseInt(scanner.nextLine());
				    switch (opcion) {
				        case CREAR_ANIMAL:
				            Animal animal = new Animal();
				            
				            System.out.println("Indique el tipo de Animal: ");
				            animal.setClase(scanner.nextLine());
				            System.out.println("Indique cuantas patas tiene el " + animal.getClase());
				            animal.setNumpatas(Integer.parseInt(scanner.nextLine()));
				            
				            listaAnimales.add(animal);
				            
				            break;
				        case CREAR_BALLENA:
				            Ballena ballena = new Ballena();
				            
				            System.out.println("Indique el tipo de Ballena: ");
				            ballena.setClase(scanner.nextLine());
				            
				            listaAnimales.add(ballena);
				            break;
				        case CREAR_PERRO:
				            Perro perro = new Perro();
				            
				            System.out.println("Indique el tipo de Perro: ");
				            perro.setClase(scanner.nextLine());
				            System.out.println("Indique cuantas patas");
				            perro.setNumpatas(Integer.parseInt(scanner.nextLine()));
				            
				            listaAnimales.add(perro);
				            break;
				        case CREAR_GATO:
				            Gato gato = new Gato();
				            
				            System.out.println("Indique el tipo de Gato: ");
				            gato.setClase(scanner.nextLine());
				            System.out.println("Indique cuantas patas");
				            gato.setNumpatas(Integer.parseInt(scanner.nextLine()));
				            
				            listaAnimales.add(gato);
				        	break;
				        case CREAR_ORNITORINCO:
				            Ornitorinco orni = new Ornitorinco();
				            
				            System.out.println("Indique el tipo de Ornitorinco: ");
				            orni.setClase(scanner.nextLine());
				            System.out.println("Indique cuantas patas");
				            orni.setNumpatas(Integer.parseInt(scanner.nextLine()));
				            
				            listaAnimales.add(orni);
				        	break;
				        case CREAR_LORO:
				            Loro loro = new Loro();
				            
				            System.out.println("Indique el tipo de Loro: ");
				            loro.setClase(scanner.nextLine());
				            System.out.println("Indique cuantas patas");
				            loro.setNumpatas(Integer.parseInt(scanner.nextLine()));
				            
				            listaAnimales.add(loro);
				        	break;
				        case MOSTRAR_TODOS:
				            for (Animal animall : listaAnimales) {
								System.out.println(animall.toString());
							}
				            break;
				        case PARIR_TODOS:
				            for (Animal animall : listaAnimales) {
								System.out.println(animall.parir());
							}
				            break;
				        case SALIR:
				            System.out.println("Saliendo del programa.");
				            break;
				        default:
				            System.out.println("Opción no válida. Inténtalo de nuevo.");
				    }
	
				} while (opcion != SALIR);
    	}
	}

