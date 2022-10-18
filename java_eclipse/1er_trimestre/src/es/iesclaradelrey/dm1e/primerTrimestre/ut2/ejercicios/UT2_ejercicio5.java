package es.iesclaradelrey.dm1e.primerTrimestre.ut2.ejercicios;

import java.util.Scanner;

public class UT2_ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("escribe dos Numeros int o double");
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		double a=sc.nextDouble();
		double b =sc.nextDouble();
		
		System.out.println("Numeros a Utilizar: A: "+a+" ; B: "+b+"\n");
		System.out.println("Redondeado A: "+Math.round(a));
		
		System.out.println("Redondeado A abajo: "+(int)Math.floor(a)+"\n");
		
		int redondeo=(int)a;
		System.out.println("Truncado A: "+redondeo+"\n");
		
		
		double c= (Math.pow(a, 2));
		System.out.println("Cuadrado de A: "+c);
		System.out.println("Raiz de A: "+(int)Math.sqrt(a)+"\n");
		
		System.out.println("Minimo de A;B : "+Math.min(a, b));
		System.out.println("Maximo de A;B : "+Math.max(a, b));
		
		sc.close();
		
	}

}
