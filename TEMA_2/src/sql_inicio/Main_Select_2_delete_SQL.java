package sql_inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import interfaces.ConexionEthernet;

public class Main_Select_2_delete_SQL {

	private static ArrayList<Tarea> tareas = new ArrayList<Tarea>();
	private static Tarea tarea = new Tarea();
	private static Scanner scan = new Scanner(System.in);
	private static String BBDD = "gestor_tarea";
	private static String Usuario = "root";
	private static String contraseña = "";
	private static String host = "localhost";
	public static void main(String[] args) {
		
		create_tarea();
		deleteTarea();
		updateTarea();
		readBBDD_Tarea();
		
	}

	public static void readBBDD_Tarea() {
		//pedir el ID
		//leer el ID
		String query = "SELECT * FROM tareas";
		//cargar la clase de la libreria
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("No se ha podido cargar la clase SQl java");
		}
		//crear la conexion
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + BBDD,Usuario,contraseña);
			//crear el statement
			Statement st = conexion.createStatement();
			//ejecutar la consulta y recibir eñ resultao
			//Recorrer y pintar en pantalla
			
			ResultSet resultado2 = st.executeQuery("SELECT * FROM tareas");
			//Recorrer y pintar en pantalla
			while (resultado2.next()) {
				tarea = new Tarea();
				tarea.setId(resultado2.getInt("id"));
				tarea.setTitulo(resultado2.getString("titulo"));
				tarea.setDescripcion(resultado2.getString("descripcion"));
				tareas.add(tarea);
			}
			for (Tarea tareaa : tareas) {
				System.out.println(tareaa.toString());
			}
		} catch (SQLException e) {
			System.out.println("NO se ha podido establecer la conexion a la base de Datos");
			e.printStackTrace();
		}
		
	}

	public static void updateTarea() {

		//pedir el ID
		System.out.println("Introduzca su ID");
		int id = Integer.parseInt(scan.nextLine());
		String descripcion = "NUeva descripcon";
		String titulo = "Nuevo Titulo";
		//leer el ID
		String query = "UPDATE tareas SET titulo = ?, descripcion = ? WHERE tareas.id = ?";
		//cargar la clase de la libreria
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("No se ha podido cargar la clase SQl java");
		}
		//crear la conexion
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + BBDD,Usuario,contraseña);
			//crear el statement
			PreparedStatement prst = conexion.prepareStatement(query);
			prst.setInt(12, id);
			prst.setString(12,descripcion);
			prst.setString(12, titulo);
			//ejecutar la consulta y recibir eñ resultao
			System.out.println("Update realizado");
			ResultSet resultado2 = prst.executeQuery("SELECT * FROM tareas");
			//Recorrer y pintar en pantalla
			while (resultado2.next()) {
				tarea = new Tarea();
				tarea.setId(resultado2.getInt("id"));
				tarea.setTitulo(resultado2.getString("titulo"));
				tarea.setDescripcion(resultado2.getString("descripcion"));
				tareas.add(tarea);
			}
			for (Tarea tareaa : tareas) {
				System.out.println(tareaa.toString());
			}
		} catch (SQLException e) {
			System.out.println("NO se ha podido establecer la conexion a la base de Datos");
			e.printStackTrace();
		}
	}

	public static void deleteTarea() {

		//pedir el ID
		System.out.println("Introduzca su ID");
		int id = Integer.parseInt(scan.nextLine());
		//leer el ID
		String checkId = "DELETE FROM tareas WHERE ID = " + id;
		//cargar la clase de la libreria
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("No se ha podido cargar la clase SQl java");
		}
		//crear la conexion
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + BBDD,Usuario,contraseña);
			//crear el statement
			Statement st = conexion.createStatement();
			//ejecutar la consulta y recibir eñ resultao
			boolean resultado = st.execute(checkId);
			//Recorrer y pintar en pantalla
			if (resultado==false) {
				System.out.println("1 columna se ha visto afectada _ID: " + id);
			}else {
				System.out.println("Error al inentar eliminar al alumno con _id " + id);
			}
			
			ResultSet resultado2 = st.executeQuery("SELECT * FROM tareas");
			//Recorrer y pintar en pantalla
			while (resultado2.next()) {
				tarea = new Tarea();
				tarea.setId(resultado2.getInt("id"));
				tarea.setTitulo(resultado2.getString("titulo"));
				tarea.setDescripcion(resultado2.getString("descripcion"));
				tareas.add(tarea);
			}
			for (Tarea tareaa : tareas) {
				System.out.println(tareaa.toString());
			}
		} catch (SQLException e) {
			System.out.println("NO se ha podido establecer la conexion a la base de Datos");
			e.printStackTrace();
		}
	}

	public static void create_tarea() {
		//pedir el ID
				Tarea tarea = new Tarea();
				tarea.setId(1);
				tarea.setDescripcion("otra descripcion");
				tarea.setTitulo("otro titulo");
				//leer el ID
				String create_tarea = "INSERT INTO tareas";
				//cargar la clase de la libreria
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("No se ha podido cargar la clase SQl java");
				}
				//crear la conexion
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://" + host + "/" + BBDD,Usuario,contraseña);
					//crear el statement
					Statement st = conexion.createStatement();
					String checkId = "SELECT * FROM tareas";
					//ejecutar la consulta y recibir eñ resultao
					boolean resultado = st.execute(checkId );
					
					ResultSet resultado2 = st.executeQuery("SELECT * FROM tareas");
					//Recorrer y pintar en pantalla
					while (resultado2.next()) {
						tarea = new Tarea();
						tarea.setId(resultado2.getInt("id"));
						tarea.setTitulo(resultado2.getString("titulo"));
						tarea.setDescripcion(resultado2.getString("descripcion"));
						tareas.add(tarea);
					}
					for (Tarea tareaa : tareas) {
						System.out.println(tareaa.toString());
					}
				} catch (SQLException e) {
					System.out.println("NO se ha podido establecer la conexion a la base de Datos");
					e.printStackTrace();
				}
		
	}
}
