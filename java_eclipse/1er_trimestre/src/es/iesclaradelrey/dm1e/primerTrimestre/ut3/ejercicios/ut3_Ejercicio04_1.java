package es.iesclaradelrey.dm1e.primerTrimestre.ut3.ejercicios;

import java.util.Scanner;

public class ut3_Ejercicio04_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("escribe el numerador: ");
		int numerador=sc.nextInt();
		System.out.print("escribe el denominador: ");
		int denominador=sc.nextInt();
		double cociente ;
		int resto;
		 cociente=numerador/denominador;
		 resto=numerador%denominador;
		 
System.out.println("numerador: "+numerador +"\n"+ "denominador: "+denominador+"\n"+"cociente: "+cociente +"\n" +"resto: "+resto);

	sc.close();
	}

}

