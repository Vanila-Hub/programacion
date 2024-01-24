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
				System.out.println("1 columna se ha visto afectada _" + id);
			}else {
				System.out.println("Error al inentar eliminar al alumno con _id " + id);
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
