package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio12_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca número del dado: ");
		int num = sc.nextInt();
		
		if (num==1 || num==2 ||num==3 ||num==4 ||num==5 ||num==6) {
			
		switch (num) {
		case 1:
			System.out.println("En la cara opuesta es el 'seis'");
			break;
        case 2:
        	System.out.println("En la cara opuesta es el 'cinco'");
			break;
        case 3:
        	System.out.println("En la cara opuesta es el 'cuatro'");
	        break;
        case 4:
        	System.out.println("En la cara opuesta es el 'tres'");
	        break;
        case 5:
        	System.out.println("En la cara opuesta es el 'dos'");
	        break;
        case 6:
        	System.out.println("En la cara opuesta es el 'uno'");
	        break;
		default :
			break;
		}
		}
		else {
			System.out.println("ERROR:número incorrecto");
		}
		
		
		sc.close();

	}

}
