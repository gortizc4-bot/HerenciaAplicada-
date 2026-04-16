package HerenciaAplicada;

public class ProductoPerecedero extends Producto {
	
	    int dia;
	    int mes;
	    int anio;

	    public ProductoPerecedero(String nombre, double precio, int dia, int mes, int anio) {
	        super(nombre, precio);
	        this.dia = dia;
	        this.mes = mes;
	        this.anio = anio;
	    }

	    public boolean estaVencido() {
	        int diaActual = 15;
	        int mesActual = 4;
	        int anioActual = 2026;

	        if (anio < anioActual) return true;
	        if (anio == anioActual && mes < mesActual) return true;
	        if (anio == anioActual && mes == mesActual && dia < diaActual) return true;

	        return false;
	    }

	    @Override
	    public void mostrar() {
	        super.mostrar();
	        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);

	        if (estaVencido()) {
	            System.out.println("Estado: VENCIDO");
	        } else {
	            System.out.println("Estado: Vigente");
	        }
	    }
	}

	
	


