package HerenciaAplicada;

public class Cuenta {
	

	    protected double saldo;

	    public Cuenta(double saldo) {
	        this.saldo = saldo;
	    }

	    public void depositar(double monto) {
	        saldo += monto;
	        System.out.println("Depósito realizado. Saldo actual: " + saldo);
	    }

	    public void retirar(double monto) {
	    	if (monto <= saldo) {
	            saldo -= monto;
	            System.out.println("Retiro realizado. Saldo actual: " + saldo);
	        } else {
	            System.out.println("Fondos insuficientes.");
	        }
	    }
	    
	    
	}


