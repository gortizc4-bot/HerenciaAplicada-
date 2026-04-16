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
	        
	        System.out.println("\n");
	        
	        Producto producto = new Producto("Azucar", 10.0);

	        // Producto perecedero (ya vencido)
	        ProductoPerecedero aceite = new ProductoPerecedero(
	            "Aceite",
	            30.0,
	            1, 4, 2024
	        );

	        System.out.println("Producto Normal");
	        producto.mostrar();

	        System.out.println("\nProducto Perecedero 1");
	        aceite.mostrar();
	        System.out.println("\n");
	        
	    
	   
	       Trasporte transporte = new Trasporte(30);
	       Bus bus = new Bus(25, "Horcones");

	       System.out.println("Transporte");
	       transporte.descripcion();

	       System.out.println("\nBus");
	       bus.descripcion();
	       System.out.println("\n");
	    
	       
	       Empleado emp = new Empleado ("Giselle", 2000); 
	       Gerente ger = new Gerente ("Briseyda", 5000, 500); 
	       
	       System.out.println("Empleado:");
	        emp.mostrarDatos();

	       System.out.println("\nGerente:");
	       ger.mostrarDatos();
	       System.out.println("\n");
	    
	       Animal animal =new Animal ();
	       Perro perro = new Perro();
	       System.out.println("Animal:");
	       animal.hacersonido();
	      
	       
	       System.out.println("Perro:");
	       perro.hacersonido();
	       System.out.println("\n");
	       
	       Vehiculo v = new Vehiculo("Toyota", 120);
	        Moto m = new Moto("Yamaha", 180, 600);

	        System.out.println("Vehiculo:");
	        v.mostrarInfo();

	        System.out.println("\nMoto:");
	        m.mostrarInfo();
	        System.out.println("\n");
	        
	        Rectangulo rect = new Rectangulo(5, 3);
	        Circulo circ = new Circulo(4);

	        System.out.println("Área del Rectángulo: " + rect.calcularArea());
	        System.out.println("Área del Círculo: " + circ.calcularArea()); 
	        System.out.println("\n");
	        
	        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
	        LibroDigital ebook = new LibroDigital("El Principito", "Antoine de Saint-Exupéry", 5.2);

	        System.out.println("Libro físico:");
	        libro.mostrarInfo();

	        System.out.println("\nLibro digital:");
	        ebook.mostrarInfo();
	        System.out.println("\n");
	        
	        Cliente cliente1 = new Cliente(" Giselle", "30356361");

	        FacturaContando fc = new FacturaContando(1, cliente1, 1000, 100);
	        System.out.println("=== Factura Contado ===");
	        fc.mostrarInfo();

	        FacturaCredito fcr = new FacturaCredito(2, cliente1, 1000, 200, 4);
	        System.out.println("\n=== Factura Crédito ===");
	        fcr.mostrarInfo();
	        fcr.mostrarCuotas();
	    }
	    }
	    
	        
	       
	       
	       
	       
	       
	    	        
	                
	                
	                
	                
	            
	        
	    
	   
	    
	        

	        
	    
	    
	    
	
	    

	   
	    


