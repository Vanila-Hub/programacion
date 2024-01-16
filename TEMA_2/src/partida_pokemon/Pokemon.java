package partida_pokemon;

public class Pokemon {
	
	private String nombre ;
	private String tipo;
	private int nivel;
	private int ataque;
	private int defensa;
	private int salud;
	/*atributos privados y lo metodos publicos
	 * set para seignar valores a los atributos
	 * t get para leer valores de los atributos*/
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}
	public void setAtaque(int ataque) 
	{
		this.ataque = ataque;
	}
	
	public void setDefensa(int defensa) 
	{
		this.defensa = defensa;
	}
	public void setNivel(int nivel)
	{
		this.nivel = nivel;
	}
	public void setSalud(int salud) 
	{
		this.salud = salud;
	}
	
	//GETTERS
	public String getNombre() 
	{
		return (this.nombre);
	}
	public String getTipo()
	{
		return (this.tipo);
	}
	public int getNivel() 
	{
		return (this.nivel);
	}
	public int getAtaque() 
	{
		return (this.ataque);
	}
	public int getDefensa()
	{
		return(this.defensa);
	}
	public int getSalud()
	{
		return(this.salud);
	}
	
}
