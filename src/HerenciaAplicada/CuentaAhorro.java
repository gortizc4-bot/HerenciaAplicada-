package HerenciaAplicada;

public class CuentaAhorro extends Cuenta {
	
	    public CuentaAhorro(double saldo, double tasa) {
	        super(saldo);
	    }

	    @Override
	    public void retirar(double monto) {
	        if (saldo - monto >= 0) {
	            super.retirar(monto);
	        } else {
	            System.out.println("Saldo insuficiente");
	        }
	    }
	}


