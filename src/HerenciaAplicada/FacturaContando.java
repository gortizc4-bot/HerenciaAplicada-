package HerenciaAplicada;

public class FacturaContando extends Factura {
	private double descuento;

	public FacturaContando(int numero, Cliente cliente, double total, double descuento) {
		super(numero, cliente, total);
		this.descuento = descuento;
	}

	@Override
	public double calcularTotal() {
	double totalFinal = super.calcularTotal() - descuento;
	        
	        if (totalFinal < 0) {
	            totalFinal = 0;
	        }
	        return totalFinal;
	    }
	} 
	


