package sql_inicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import interfaces.ConexionEthernet;

public class Main_Select_2_delete_SQL {

	public static void main(String[] args) {
		ArrayList<Tarea> tareas = new ArrayList<Tarea>();
		Tarea tarea = new Tarea();
		Scanner scan = new Scanner(System.in);
		String BBDD = "gestor_tarea";
		String Usuario = "root";
		String contraseña = "";
		String host = "localhost";
		
		
		//pedir el ID
		System.out.println("Introduzca su ID");
		int id = Integer.parseInt(scan.nextLine());
		//leer el ID
		String checkId = "SELECT * FROM tareas WHERE ID = " + id;
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
			ResultSet resultado = st.executeQuery(checkId);
			//Recorrer y pintar en pantalla
			    resultado.next();
				tarea = new Tarea();
				tarea.setId(resultado.getInt("id"));
				tarea.setTitulo(resultado.getString("titulo"));
				tarea.setDescripcion(resultado.getString("descripcion"));
				tareas.add(tarea);
			
			for (Tarea tareaa : tareas) {
				System.out.println(tareaa.toString());
			}
		} catch (SQLException e) {
			System.out.println("NO se ha podido establecer la conexion a la base de Datos");
			e.printStackTrace();
		}
	}

}
