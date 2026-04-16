package HerenciaAplicada;

public class Producto {
	protected String nombre;
	protected double precio;
	
	//Constructor
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	//Metodo
	public void mostrar() {
		System.out.println("Nombre:"+ nombre);
		System.out.println("Precio:"+ precio);
		
	}
	
	
	

}
