package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio09_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio 9
//		Escribir un programa que lea un año e indicar si es bisiesto. 
//		Un año es bisiesto si es un número divisible por 4, pero no si 
//		es divisible por 100, excepto que también sea divisible por 400.
		
		String anioString=JOptionPane.showInputDialog(null, "Escribe el año");
		int anio =Integer.parseInt(anioString);
		
		if (anio%4==0&&anio%100!=0 || anio%400==0) {
			JOptionPane.showMessageDialog(null, "ES año bisiesto :) "+anio);
		}
		else {
			JOptionPane.showMessageDialog(null, "!!NO!! es año bisiesto :( "+anio);
		}
		
		
		
		
				

	}

}
