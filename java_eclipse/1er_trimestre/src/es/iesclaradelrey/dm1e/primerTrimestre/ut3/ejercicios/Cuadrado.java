package es.iesclaradelrey.dm1e.primerTrimestre.ut3.ejercicios;

public class Cuadrado {
	
	int lado;
	
	Cuadrado(int ladoInicial){
		lado=ladoInicial;
	}
	
	public int getLado() {
		return lado;
	}
	 int getArea() {
		int area=lado*lado;
		return  area;

	}
	 int getPerimetro() {
		int perimetro =lado*4;
		return perimetro;

	}

}
