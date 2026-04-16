package HerenciaAplicada;

public class CuentaCorriente extends Cuenta {
	
	    private double limiteSobregiro;

	    public CuentaCorriente(double saldo, double limiteSobregiro) {
	        super(saldo);
	        this.limiteSobregiro = limiteSobregiro;
	    }

	    @Override
	    public void retirar(double monto) {
	        if (monto <= (saldo + limiteSobregiro)) {
	            saldo -= monto;
	            System.out.println("Retiro realizado (con sobregiro si aplica). Saldo actual: " + saldo);
	        } else {
	            System.out.println("Límite de sobregiro excedido.");
	        }
	    }
	}


