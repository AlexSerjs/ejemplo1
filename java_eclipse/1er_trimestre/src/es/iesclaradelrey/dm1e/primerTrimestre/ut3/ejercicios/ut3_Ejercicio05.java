package es.iesclaradelrey.dm1e.primerTrimestre.ut3.ejercicios;

import java.util.Scanner;

public class ut3_Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Escribe un radio: ");
	double radio = Double.parseDouble(sc.nextLine());
	
	
	System.out.println("TU nombre es: ");
	String nombre = sc.nextLine();
	
	System.out.println("Escribe el lado de un cuadrado");
	int lado = sc.nextInt();
	
	double perimetro = 2*radio*Math.PI;
	
	
	int area = (int) Math.pow(lado, 2);
	
	
	System.out.println("Hola "+nombre+". El cuadrado tiene un área de "+area+" y la circunferencia tiene un perímetro de "+perimetro);
	System.out.printf("Hola %s. El cuadrado tiene un área de %d y la circunferencia tiene un perímetro de %014.2f\n",nombre,area,perimetro);

	
	
	sc.close();

	}

}
