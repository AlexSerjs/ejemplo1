package es.iesclaradelrey.dm1e.primerTrimestre.ut2.ejercicios;

import java.net.MalformedURLException;
import java.net.URL;

public class UT2_ejercicio4 {

	public static void main(String[] args) throws MalformedURLException {
	    URL direccion =new URL("https://iesclaradelrey.es/");
	    URL direccion1= new URL("https","iesclaradelrey.es","portal/index.php/es/"); 
	    URL direccion2 = new URL("https","iesclaradelrey.es",80,"/portal/index.php/es/");
	    System.out.println(direccion);
	    System.out.println(direccion1);
	    System.out.println(direccion2);
		

	}

}
