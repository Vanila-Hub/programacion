package auricular;
public class Auricular {
	private String modelo;
	private String marca;
	private Double precio;
	private int stock;
	
	public Auricular(){
		
	}
	public Auricular(String modelo,String marca,double precio,int stock){
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
	}

	/*setters*/
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public void setPrecio(double percio)
	{
		this.precio = precio;
	}
	public void setStock(int stock)
	{
		this.stock = stock;
	}
	/*getters*/
	public String getModelo()
	{
		return(this.modelo);
	}
	public String getMarca()
	{
		return(this.marca);
	}
	public Double getPrecio()
	{
		return(this.precio);
	}
	public int getStock()
	{
		return(this.stock);
	}
	public String toString(String frase) {
		return(frase.toString());
	}

}
