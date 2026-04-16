package HerenciaAplicada;

public class Bus extends Trasporte{
	
	private String ruta;
	
//CONSTRUCTOR
	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}
	@Override
	public void descripcion() {
		super.descripcion();
		System.out.println("Ruta:" + ruta);
	} 
	
	
	
	

}
