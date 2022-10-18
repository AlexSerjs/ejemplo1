package es.iesclaradelrey.dm1e.primerTrimestre.ut2.ejercicios;

public class UT2_ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaLarga = "la cadena larga se compone de cadenas que encadena varias cadenas";
		int numeroTotal = cadenaLarga.length();
		int mitad = (int) numeroTotal / 2;
		System.out.println(cadenaLarga.length());

		System.out.println("mitad de la cadena: Nº" + mitad);
		System.out.println("primera mitad: " + cadenaLarga.substring(0, mitad));
		System.out.println("segunda mitad: " + cadenaLarga.substring(mitad));

	}

}
