package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio10_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el dia: ");
		int dia = sc.nextInt();
		System.out.print("Escribe el mes: ");
		int mes = sc.nextInt();
		System.out.print("Escribe el año: ");
		int anio = sc.nextInt();

		System.out.println(dia + " / " + mes + " / " + anio);
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia > 0 || dia <=31) {
				System.out.print("la Fecha es corecta");

			} else {
				System.out.println("fecha DIA INCORRECTA");
			}
			break;
		case 2:
			if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
				if (dia > 0 && dia <= 29) {
					System.out.print("la Fecha es correcta");
				}
				else {
						System.out.println("fecha DIA INCORRECTO");
					}
			

				} 
				
				else {
					if (dia > 0 && dia <= 28) {
						System.out.print("la Fecha es correcta");
					}
				

			 else {
				System.out.println("fecha DIA INCORRECTO");
			}
			}
			break;
			
			
		case 4, 6, 9, 11:
			if (dia > 0 && dia <= 30) {
				System.out.print("la Fecha es correcta");

			} else {
				System.out.println("fecha DIA INCORRECTO");

			}
			break;
		default:
			System.out.println("mes INCORRECTO");

		}
		sc.close();
	}
}


