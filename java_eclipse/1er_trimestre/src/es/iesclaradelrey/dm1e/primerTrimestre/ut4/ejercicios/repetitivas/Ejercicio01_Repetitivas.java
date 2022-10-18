package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.repetitivas;


import java.util.Scanner;

public class Ejercicio01_Repetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float resultado =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un Numero");
	int num=Integer.parseInt(sc.nextLine());
//		for (int contador = 2; contador < num; contador++) {
//			resultado=resultado*contador;
//			
//			System.out.println("resultado: "+resultado);
//		}
		int contador=2;
		while (contador<=num) {
			resultado=resultado*contador;
			contador++;
		}
		System.out.println("resultado: "+resultado);
		
		sc.close();

	}

}
