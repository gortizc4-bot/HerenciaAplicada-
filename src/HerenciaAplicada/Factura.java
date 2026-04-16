package HerenciaAplicada;

public class Factura {
	private int numero; 
	private Cliente cliente; 
	private double total;
	
	public Factura(int numero, Cliente cliente, double total) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.total = total;
	} 
	 public int getNumero() {
	        return numero;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public double getTotal() {
	        return total;
	    }

	    public void setTotal(double total) {
	        if (total < 0) {
	            this.total = 0;
	        } else {
	            this.total = total;
	        }
	    }

	    public double calcularTotal() {
	        return total;
	    }

	    public void mostrarInfo() {
	        System.out.println("Factura No: " + numero);
	        System.out.println("Cliente: " + cliente.getNombre());
	        System.out.println("NIT: " + cliente.getNit());
	        System.out.println("Total: " + calcularTotal());
	    }
	
	

}
