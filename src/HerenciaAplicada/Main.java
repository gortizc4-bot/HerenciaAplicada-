package HerenciaAplicada;

/*
========================================
      EXPLICACIÓN DEL PROYECTO
========================================

Herencia aplicada:
Se utilizó herencia creando clases base y clases hijas.
Por ejemplo:
FacturaContado y FacturaCredito heredan de Factura
Perro hereda de Animal
Moto hereda de Vehiculo

Esto permite reutilizar código, evitar duplicación
y mejorar la organización del programa.

Métodos sobrescritos:
Se sobrescribieron métodos utilizando @Override:
calcularTotal() en FacturaContado y FacturaCredito
hacerSonido() en Perro
mostrarInfo() en Moto
calcularArea() en Rectangulo y Circulo

 Casos de prueba:
 Se realizaron pruebas para verificar el funcionamiento:
 Depósitos y retiros en cuentas
 Validación de sobregiro en cuenta corriente
 Cálculo de áreas en figuras
 Funcionamiento de productos perecederos
 Diferencias entre transporte y bus
 Cálculo de facturación con descuento y recargo

Validaciones:
Se validó que valores como el total no sean negativos
y evitar errores como divisiones inválidas.

Encapsulamiento:
Se utilizaron atributos privados y métodos públicos
(getters y setters) para proteger la información.

========================================
*/
public class Main {
	
	    public static void main(String[] args) {
	    	
	    	System.out.println("\n=========EJEMPLO PRACTICO========");
	        CuentaAhorro cuenta = new CuentaAhorro(1000, 0.05);

	        cuenta.depositar(200);
	        cuenta.retirar(500);
	        cuenta.retirar(800);
	        System.out.println("\n");
	        
	        System.out.println("\n=========EJERCICIO 1========");
	        Docente docente = new Docente("Briseyda", 48, "Programacion");
	        Estudiante estudiante = new Estudiante("Giselle", 19, "0905 25 14179");

	        System.out.println("Docente");
	        docente.mostrar();

	        System.out.println("\nEstudiante");
	        estudiante.mostrar();
	        
	        System.out.println("\n");
	        
	        System.out.println("\n=========EJERCICIO 2========");
	        Cuenta cuenta1 = new Cuenta(1000);
	        CuentaCorriente cc = new CuentaCorriente(1000, 500);
	        System.out.println("Cuenta Normal");
	        cuenta1.retirar(1200);
	        System.out.println("\nCuenta Corriente");
	        cc.retirar(1200); // aquí sí permite por sobregiro
	        System.out.println("\n");
	        
	        
	        System.out.println("\n=========EJERCICIO 3 ========");
	        Producto producto = new Producto("Azucar", 10.0);
	        ProductoPerecedero aceite = new ProductoPerecedero(
	            "Aceite",
	            30.0,
	            1, 4, 2024
	        );
	        System.out.println("Producto Normal");
	        producto.mostrar();

	        System.out.println("\nProducto Perecedero ");
	        aceite.mostrar();
	        System.out.println("\n");
	        
	        	
	       System.out.println("\n=========EJERCICIO 4 ========");
	       Trasporte transporte = new Trasporte(30);
	       Bus bus = new Bus(25, "Horcones");

	       System.out.println("Transporte");
	       transporte.descripcion();

	       System.out.println("\nBus");
	       bus.descripcion();
	       System.out.println("\n");
	    
	       System.out.println("\n=========EJERCICIO 5 ========");
	       Empleado emp = new Empleado ("Giselle", 2000); 
	       Gerente ger = new Gerente ("Briseyda", 5000, 500); 
	       
	       System.out.println("Empleado:");
	        emp.mostrarDatos();

	       System.out.println("\nGerente:");
	       ger.mostrarDatos();
	       System.out.println("\n");
	    
	       System.out.println("\n=========EJERCICIO 6 ========");
	       Animal animal =new Animal ();
	       Perro perro = new Perro();
	       System.out.println("Animal:");
	       animal.hacersonido();
	       System.out.println("Perro:");
	       perro.hacersonido();
	       System.out.println("\n");
	       
	       System.out.println("\n=========EJERCICIO 7 ========");
	       Vehiculo v = new Vehiculo("Toyota", 120);
	        Moto m = new Moto("Yamaha", 180, 600);
	        System.out.println("Vehiculo:");
	        v.mostrarInfo();
	        System.out.println("\nMoto:");
	        m.mostrarInfo();
	        System.out.println("\n");
	        
	        System.out.println("\n=========EJERCICIO 8 ========");
	        Rectangulo rect = new Rectangulo(5, 3);
	        Circulo circ = new Circulo(4);
	        System.out.println("Área del Rectángulo: " + rect.calcularArea());
	        System.out.println("Área del Círculo: " + circ.calcularArea()); 
	        System.out.println("\n");
	        
	        System.out.println("\n=========EJERCICIO 9 ========");
	        Libro libro = new Libro("A dos metros sobre ti", "Rachael Lippincott");
	        LibroDigital ebook = new LibroDigital("El Principito", "Antoine de Saint-Exupéry", 5.2);
	        System.out.println("Libro físico:");
	        libro.mostrarInfo();
	        System.out.println("\nLibro digital:");
	        ebook.mostrarInfo();
	        System.out.println("\n");
	        
	        
	        System.out.println("\n=========EJERCICIO 10 ========");
	        Cliente cliente1 = new Cliente(" Giselle Calvillo", "30356351");

	        FacturaContando fc = new FacturaContando(1, cliente1, 1000, 100);
	        System.out.println("Factura Contado");
	        fc.mostrarInfo();

	        FacturaCredito fcr = new FacturaCredito(2, cliente1, 1000, 200, 4);
	        System.out.println("\nFactura Crédito");
	        fcr.mostrarInfo();
	        fcr.mostrarCuotas();
	    }
	    }
	    
	        
	       
	       
	       
	       
	       
	    	        
	                
	                
	                
	                
	            
	        
	    
	   
	    
	        

	        
	    
	    
	    
	
	    

	   
	    


