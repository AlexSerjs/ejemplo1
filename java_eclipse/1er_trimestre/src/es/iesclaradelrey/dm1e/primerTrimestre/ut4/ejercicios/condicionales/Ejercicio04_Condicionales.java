package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio04_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Par o Impar");
		System.out.print("Escribe el numero: ");
		float num =sc.nextFloat();
		if (num%2==0) {
			System.out.println("Es Par");
		} else {
			System.out.println("Es Impar");

		}
		sc.close();

	}

}
