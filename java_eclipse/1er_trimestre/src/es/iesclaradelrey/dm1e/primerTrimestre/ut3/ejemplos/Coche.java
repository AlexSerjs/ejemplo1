package es.iesclaradelrey.dm1e.primerTrimestre.ut3.ejemplos;

public class Coche {
	int numeroAsientos;
//	private	int cilindrada;
//	private	String marca;
	private int velocidad=0;
	
//	int getvelocidad() {
//		return velocidad;
//	}
	public Coche(int velocidadInicial) {
		// TODO Auto-generated constructor stub
		System.out.println("Estoy en el Constructor ");
		velocidad=velocidadInicial;
	}
	//fechaCreacion =Llamar al sistemapara obtener 
	
	public int getVelocidad() {
		return velocidad;
	}


	void acelerar(int cuantosKmHora) {

		velocidad += cuantosKmHora;
//		velocidad=velocidad+cuantosKmHora;
	}

	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	void decelerar(int cuantosKmHora) {

		velocidad -= cuantosKmHora;
//		velocidad=velocidad-cuantosKmHora;
	}
	void parar() {
		velocidad=0;
	}

}
