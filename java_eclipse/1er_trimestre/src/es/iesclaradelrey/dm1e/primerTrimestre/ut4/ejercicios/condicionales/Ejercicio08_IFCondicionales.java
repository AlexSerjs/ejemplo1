package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio08_IFCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escribe tres numeros");
				
		System.out.print("1º numero:");
		int num1=sc.nextInt();	
		
		
		System.out.print("2º numero:");
		int num2=sc.nextInt();
        while (num1==num2) {
			System.out.println("intentalo de nuevo numero igual a tu primer numero ");
			System.out.print("2º numero");
			num2=sc.nextInt();
		}
		
        
        
        
        System.out.print("3º numero:");
		int num3=sc.nextInt();
		while (num1==num3 || num2==num3 ) {
			System.out.println("intentalo de nuevo numero igual a tu primer numero o segundo  ");
			System.out.print("3º numero");
			num3=sc.nextInt();
		}
		
		
		
		
		if (num1>num2 && num1>num3) {
		if (num2>num3) {
			System.out.println(num1+">"+num2+">"+num3);
		}
			else {
				System.out.println(num1+">"+num3+">"+num2);
			}
		}
		
		
		if (num2>num1 && num2>num3) {
			if (num3>num1) {
				System.out.println(num2+">"+num3+">"+num1);	
			}
			
			else {
				System.out.println(num2+">"+num1+">"+num3);
			}
			
		}
			if (num3>num2 && num3>num1) {
				if (num2>num1) {
					System.out.println(num3+">"+num2+">"+num1);	
				}
				
				else {
					System.out.println(num3+">"+num1+">"+num2);
				}
		}
			sc.close();
			
		}	
		
		
		
		
	}
	

	
