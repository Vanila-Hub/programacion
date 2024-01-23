package usuarios;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


/**
 * @author Eñaut Agirre
 *
 */
public class GestorUsuariosApp {
	
	private static final int SALIR = 0;
	private static final int CREATE = 1;
	private static final int READ = 2;
	private static final int UPDATE = 3;
	private static final int DELETE = 4;

	final String NOMBRE_FICHERO = "txt/usuarios.txt";//TODO
	Scanner teclado = new Scanner(System.in);
	
	public void run() throws FileNotFoundException {
		ArrayList<Usuario> usuarios = Usuario.cargarUsuarios(NOMBRE_FICHERO);
		
		int aukera;

		do {
			menuPrincipal();
			aukera = Integer.parseInt(teclado.nextLine());

			switch (aukera) {
			case CREATE:
				crearUsuario(usuarios);
				break;
			case DELETE:
				eliminarUsuario(usuarios);
				break;
			case READ:
				mostrarUsuarios(usuarios);
				break;
			case UPDATE:
				modificarUsuario(usuarios);
			case SALIR:
				saludoFinal();
				break;
			default:
				break;
			}

		} while (aukera != SALIR);
		Usuario.guardarUsuarios(NOMBRE_FICHERO, usuarios);
	}
	/**
	 * @param usuarios
	 */
	@SuppressWarnings("unlikely-arg-type")
	private void modificarUsuario(ArrayList<Usuario> usuarios) {
		Scanner scan = new Scanner(System.in);
		String opcion = "";
		System.out.println("Nombre del Usuario a modificar: ");
		opcion = scan.nextLine();
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getNombre().equals(opcion)) {
				System.out.print("Introduzca los siguientes parametros -> ");
				System.out.println("Nombre: ");
				opcion = scan.next();
				usuarios.get(i).setNombre(opcion);
				System.out.println("Apellido: ");
				opcion = scan.next();
				usuarios.get(i).setApellido(opcion);
				System.out.println("Nombre de usuario: ");
				opcion = scan.next();
				usuarios.get(i).setNombreUsuario(opcion);
				System.out.println("contraseña: ");
				opcion = scan.next();
				usuarios.get(i).setContraseña(opcion);
				System.out.println("estado (0 o 1): ");
				opcion = scan.next();
				usuarios.get(i).setEstado(Boolean.parseBoolean(opcion));
			}
		}
	}
	/**
	 * @param usuarios
	 */
	private void mostrarUsuarios(ArrayList<Usuario> usuarios) {
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println("Usuario: " + usuarios.get(i).getNombre());
		}
	}


	/**
	 * se pedira un nombre de usuario por pantalla y 
	 * si existe se eliminará de la lista
	 * 
	 * @param usuarios la lista de usuarios
	 */
	@SuppressWarnings("unlikely-arg-type")
	private void eliminarUsuario(ArrayList<Usuario> usuarios) {
		Scanner scan = new Scanner(System.in);
		String opcion = "";
		
		System.out.println("Nombre del Usuario a eliminar: ");
		opcion = scan.nextLine();
		for (int i = 0; i < usuarios.size(); i++) {
			if (usuarios.get(i).getNombre().equals(opcion)) {
				usuarios.remove(i);
				System.out.println(opcion + " Eliminado con exito.");
			}
		}
	}


	/**
	 * @param usuarios
	 */
	private void crearUsuario(ArrayList<Usuario> usuarios) {
		Scanner scan = new Scanner(System.in);
		Usuario usuario = new Usuario();
		String opcion = "";
		Random random = new Random();
		
		System.out.print("Introduzca los siguientes parametros -> ");
		System.out.println("Nombre: ");
		opcion = scan.next();
		usuario.setNombre(opcion);
		System.out.println("Apellido: ");
		opcion = scan.next();
		usuario.setApellido(opcion);
		System.out.println("Nombre de usuario: ");
		opcion = scan.next();
		usuario.setNombreUsuario(opcion);
		System.out.println("contraseña: ");
		opcion = scan.next();
		usuario.setContraseña(opcion);
		usuario.setId(3);
		usuario.setEstado(random.nextBoolean());
		usuarios.add(usuario);
	}

	//CRUD viene de las iniciales de las operaciones mas basicas con los datos
	//Create Read Update Delete
	private void menuPrincipal() {
		System.out.println(CREATE + "- creates");
		System.out.println(READ + "- read");
		System.out.println(UPDATE + "- updates");
		System.out.println(DELETE + "- deletes");
		System.out.println(SALIR + "- salir");

	}
	
	private void saludoFinal() {
		//TODO
	}

}
