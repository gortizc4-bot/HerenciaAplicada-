package HerenciaAplicada;

public class Vehiculo {
	protected String marca; 
	protected int velocidad;
	
	public Vehiculo(String marca, int velocidad) {
		super();
		this.marca = marca;
		this.velocidad = (int) velocidad;
	} 
	
	public void mostrarInfo() {
		System.out.println("Marca:"+ marca);
		System.out.println("Velocidad:"+ velocidad + "km/h");
		
		
	}
	
	
	

}
