package HerenciaAplicada;

public class Trasporte {
protected int capacidad;
//CONSTRUCTOR

public Trasporte(int capacidad) {
	super();
	this.capacidad = capacidad;
}
public void descripcion() {
	 System.out.println("Capacidad: " + capacidad + " pasajeros");

}

}
