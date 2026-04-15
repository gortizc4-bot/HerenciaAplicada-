package HerenciaAplicada;

public class Main {
	
	    public static void main(String[] args) {
	        CuentaAhorro cuenta = new CuentaAhorro(1000, 0.05);

	        cuenta.depositar(200);
	        cuenta.retirar(500);
	        cuenta.retirar(800);
	    }
	}


