package HerenciaAplicada;

public class Main {
	
	    public static void main(String[] args) {
	        CuentaAhorro cuenta = new CuentaAhorro(1000, 0.05);

	        cuenta.depositar(200);
	        cuenta.retirar(500);
	        cuenta.retirar(800);
	        System.out.println("\n");
	        
	        
	        Docente docente = new Docente("Giselle", 19, "Programacion");
	        Estudiante estudiante = new Estudiante("Briseyda", 48, "14179");

	        System.out.println("Docente");
	        docente.mostrar();

	        System.out.println("\nEstudiante");
	        estudiante.mostrar();
	        
	        System.out.println("\n");
	        
	        Cuenta cuenta1 = new Cuenta(1000);
	        CuentaCorriente cc = new CuentaCorriente(1000, 500);

	        System.out.println("Cuenta Normal");
	        cuenta1.retirar(1200);

	        System.out.println("\nCuenta Corriente");
	        cc.retirar(1200); // aquí sí permite por sobregiro
	    }
	
	    }

	   
	    


