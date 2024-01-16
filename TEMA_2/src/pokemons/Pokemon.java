package pokemons;
/*Nombre,Tipo,Nivel,Ataque,Defensa,Velocidad*/
public class Pokemon {
	private String nombre;
	private String tipo;
	private int nivel;
	private int ataque;
	private int defensa;
	private int velocidad;
	
	public Pokemon() {}
	public Pokemon(String nombre, String tipo, int nivel, int ataque, int defensa, int velocidad) {
		this.ataque = ataque;
		this.defensa = defensa;
		this.nivel = nivel;
		this.nombre = nombre;
		this.tipo = tipo;
		this.velocidad = velocidad;
	}
	
	//setters
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setTipo(String tipo) {this.tipo = tipo;}
	public void setNivel(int nivel) {this.nivel = nivel;}
	public void setAtaque(int ataque) {this.ataque = ataque;}
	public void setDefensa(int defensa) {this.defensa = defensa;}
	public void setVelocidad(int velocidad) {this.velocidad = velocidad;}
	
	//getters
	public String getNombre() {return(this.nombre);}
	public String getTipo() {return(this.tipo);}
	public int getNivel() {return(this.nivel);}
	public int getAtaque() {return(this.ataque);}
	public int getDefensa() {return(this.defensa);}
	public int getVelocidad() {return(this.velocidad);}
}
