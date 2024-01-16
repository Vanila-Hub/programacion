package usuarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {		
	//Atributos
	int id = 0;
	String nombre;
	String apellido;
	String NombreUsuario;
	String contraseña;
	boolean activo; 
	
	
	//Constructor vacio
	public Usuario() {
	}

	//Constructor con todos los atributos
	public Usuario(int id, String nombre, String apellido, String nombreUsuario, String contrasenia, boolean activo) {
		//TODO
	}
	

	//TODO setters y getters
	public void setId(int id){this.id = id;}
	public void setNombre(String nombre){this.nombre = nombre;}
	public void setApellido(String apellido){this.apellido = apellido;}
	public void setNombreUsuario(String nombreUsr){this.NombreUsuario = nombreUsr;}
	public void setContraseña(String contraseña){this.contraseña = contraseña;}
	public void setEstado(boolean estado){this.activo = estado;}
	//setters
	public int getId(){return(this.id);}
	public String getNombre(){return(this.nombre);}
	public String getApellido(){return(this.apellido);}
	public String getNombreUsuario(){return(this.NombreUsuario);}
	public String getContraseña(){return(this.contraseña);}
	public boolean getEstado(){return(this.activo);}
	//TODO toString
	
	public String toString(){
		System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido + "Id: " + this.id + " Nombre Usuario: " + this.NombreUsuario + "Contraseña: " + this.contraseña + "Estado: " + this.activo);
		return null;
	}

	public static void guardarUsuarios(String nombrefichero, ArrayList<Usuario> usuarios) throws FileNotFoundException{
	
	
	}
	
	/**
	 * 
	 * @return String todos los datos del usuario en formato para guardarlo en el fichero
	 * ej:1:unnombre:unapellido:unNombreDeUsuario:unpassword:0
	 */
	private String enFormatoFichero() {
		
		return null;
	}
	
	public static ArrayList<Usuario> cargarUsuarios(String nombrefichero) throws FileNotFoundException{
		ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
		File archivo = new File(nombrefichero);
		Scanner scan = new Scanner(archivo);
		while (scan.hasNext()) {
			String separador = scan.next();
			String[] contenido = separador.split(":");
			int i;
			Usuario usuario = new Usuario();
			usuario.setNombre(contenido[0]);
			usuario.setApellido(contenido[1]);
			usuario.setId(Integer.parseInt(contenido[2]));
			usuario.setNombreUsuario(contenido[3]);
			usuario.setContraseña(contenido[4]);
			if (Integer.parseInt(contenido[5]) > 0) {
				usuario.setEstado(true);
			}else {
				usuario.setEstado(false);
			}
			listaDeUsuarios.add(usuario);
		}
		return listaDeUsuarios;
	}	
}
