package partida_pokemon;

public class Jugador {
	private String nombre;
	private String pueblo;
	private int xpe;
	private String nivel;
	
	
	public void Jugador() {}
	/*SETTERS*/
	void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	void setPueblo(String pueblo)
	{
		this.pueblo = pueblo;
	}
	void setXpe(int xpe)
	{
		this.xpe = xpe;
	}
	void setNivel(String nivel)
	{
		this.nivel = nivel;
	}
	
	/*GETTERS*/
	
	String getNombre()
	{
		return(this.nombre);
	}
	String getPueblo()
	{
		return (this.pueblo);
	}
	int getXpe()
	{
		return (this.xpe);
	}
	String getNivel()
	{
		return (this.nivel);
	}


}
