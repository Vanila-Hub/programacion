package alimentos;

public class Alimento {
	private String nombre;
	private String situacion;
	private double caloria;
	private double grasa;
	private double proteina;
	private double carbohidrato;
	private String tipo;
	
	public Alimento(String nombres,String situaciones,double calorias,double grasas,double proteinas,double carbohidratos,String tipos) 
	{
		this.nombre = nombres;
		this.situacion = situaciones;
		this.caloria = calorias;
		this.grasa = grasas;
		this.proteina = proteinas;
		this.carbohidrato = carbohidratos;
		this.tipo = tipos;
		
	}
	
	public Alimento() {}
	
	public String toString(String frase)
	{
		return(frase.toString());
	}
	
	/*Setters y getters*/
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public void setSituaciones(String situacion)
	{
		this.situacion = situacion;
	}
	public void setCalorias(double caloria)
	{
		this.caloria = caloria;
	}
	public void setGrasas(Double grasa)
	{
		this.grasa = grasa;
	}
	public void setProteinas(Double proteina)
	{
		this.proteina = proteina;
	}
	public void setCarbohidratos(Double carbohidrato)
	{
		this.carbohidrato = carbohidrato;
	}
	public void setTipos(String tipo)
	{
		this.tipo = tipo;
	}
	/*getters*/
	public String getNombre()
	{
		return(this.nombre);
	}
	public String getSituaciones()
	{
		return(this.situacion);
	}
	public double getCalorias()
	{
		return(this.caloria);
	}
	public double getGrasas()
	{
		return(this.grasa);
	}
	public double getProteinas()
	{
		return(this.proteina);
	}
	public double getCarbohidratos()
	{
		return(this.carbohidrato);
	}
	public String getTipos()
	{
		return(this.tipo);
	}
}
