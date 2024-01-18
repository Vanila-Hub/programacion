package interfaces;

public class Main {

	public static void main(String[] args) {
		run();
	}
	private static void run() {

		ConexionEthernet conexionEther = new ConexionEthernet();
		ConexionWifi wifi = new ConexionWifi();
		
		wifi.conectarse();
		wifi.enviar("Crear usuarios");
		wifi.recibir("usuario1,2,3,4,56,7");
		wifi.desconectarse();
		
		conexionEther.conectarse();
		conexionEther.enviar("Quiero crear nuevo Usuario");
		conexionEther.recibir("dime el usurio con id 1");
		conexionEther.desconectarse();
		
	}
		
}
