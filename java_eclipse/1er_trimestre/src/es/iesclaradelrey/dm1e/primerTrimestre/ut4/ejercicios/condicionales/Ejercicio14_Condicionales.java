package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio14_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el numero del Mes");
		
		int mes= sc.nextInt();
		switch (mes) {
		case 1,3,5,7,8,10,12:
			System.out.println("Tiene 31 dias");
			
			break;
        case 2:
        	System.out.println("Tiene 28 dias");
			break;
        case 4,6,9,11:
        	System.out.println("Tiene 31 dias");
	
	        break;

	

		default:
			System.out.println("ERROR");
			break;
		}
		
		
		sc.close();

	}

}
