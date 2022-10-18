package es.iesclaradelrey.dm1e.primerTrimestre.ut2.ejercicios;



public class UT2_ejercicio1 {

	public static void main(String[] args) {
		
		String cadena = " Frase que quiero que esté en la cadena " ;
		

		System.out.println("frase"+cadena);
		
		int cadena1=cadena.length();
		System.out.println("longitud: "+cadena1);
		
		String cadena2=cadena.toLowerCase();
		System.out.println("minusculas: "+cadena2);
		
		String cadena3=cadena.trim();
		System.out.println("sin espacios: "+cadena3);
		
		System.out.print("longitud sin espacio: "+cadena3.length());
		

	}

	
	
}
