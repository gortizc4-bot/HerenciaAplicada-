package HerenciaAplicada;

public class Empleado {
	protected String nombre;
	protected double salario;
	//CONSTRUCTOR
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	//METODO
	public double calcularsalario() {
		return salario; 
	}
	
		
	public void mostrarDatos() {
		System.out.println("Nombre:"+ nombre);
		System.out.println("Salario:"+ calcularsalario());
		
	}
}
