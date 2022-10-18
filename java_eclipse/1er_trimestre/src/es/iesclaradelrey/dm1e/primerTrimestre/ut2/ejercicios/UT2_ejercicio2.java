package es.iesclaradelrey.dm1e.primerTrimestre.ut2.ejercicios;



public class UT2_ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadenaLarga= "la cadena larga se compone de cadenas que encadena varias cadenas";
		
		String palabra="cadenas";
		String palabra1="cal";
	
		int posicion = cadenaLarga.indexOf(palabra);
		System.out.println("primera posicion Nº"+posicion);
		posicion=cadenaLarga.lastIndexOf(palabra);
		System.out.println("ultima posicion Nº"+posicion);
		
		System.out.println("longitud total: Nº"+ (cadenaLarga.length()-1));//el length cuenta desde el 1 y el index desde 0;_
		
		posicion=cadenaLarga.indexOf(palabra1);
		System.out.println("palabra diferente de la cadena"+posicion); 
		posicion=cadenaLarga.lastIndexOf(palabra1);
		System.out.println("palabra diferente de la cadena"+ posicion);
		
		
	}

}
