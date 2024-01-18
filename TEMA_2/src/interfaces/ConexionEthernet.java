package interfaces;

public class ConexionEthernet implements ConexionRed,TransmisorRed {

	@Override
	public void conectarse() {
		System.out.println("Conectado Por Ethernet");
		
	}

	@Override
	public void desconectarse() {
		System.out.println("Desconectado");		
	}

	@Override
	public void enviar(String mensaje) {
		System.out.println("enviando al servidor: " + mensaje);
	}

	@Override
	public void recibir(String mensaje) {
		System.out.println("pidiendo al servidor: " + mensaje);
	}

}
