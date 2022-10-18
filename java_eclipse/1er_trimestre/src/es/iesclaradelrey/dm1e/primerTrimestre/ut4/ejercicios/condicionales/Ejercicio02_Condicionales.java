package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio02_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Positivo o Negativo");
		System.out.print("Escribe el numero: ");
		float num =sc.nextFloat();
		
		if (num%2==0&&num!=0) {
			System.out.println("Es Positivo");
		} else if (num==0) {
			System.out.println("Es cero");
		} 
		
		else {
			System.out.println("Es Negativo");
		}
		

		
		sc.close();

	}

}
