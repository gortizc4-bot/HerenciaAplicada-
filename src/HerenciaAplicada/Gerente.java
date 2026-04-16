package HerenciaAplicada;

public class Gerente extends Empleado {
	
	private double bono;

	public Gerente(String nombre, double salario, double bono) {
		super(nombre, salario);
		this.bono = bono;
	}
//SOBREESCRITURA DEL METODO
	@Override
	public double calcularsalario() {
		return salario + bono;
	}

	
	
	
	

	
	
	

}
 