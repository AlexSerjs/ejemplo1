package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.basicos;


import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int parSuma=0;
		int imparMulti=1;
		//int num;
		int contador=1;
		//int numeroLimite;
		System.out.println("Escribe el numero Limite ");
		int numeroLimite=Integer.parseInt(scanner.nextLine());
		System.out.println("Escribe "+numeroLimite+" numeros ");
		
		
		for (int i = 1; i <= numeroLimite; i++) {
			System.out.print("Nº" +(contador)+" :");
			//num=scanner.nextInt();
			int num= Integer.parseInt(scanner.nextLine());
			contador++;
			
			if (num%2==0) {
				parSuma+=num;
				
			}
			else {
				
				imparMulti*=num;
			}
			
		
		}
		
		System.out.println("Suma de los Pares: "+parSuma);
		System.out.println("Producto de los Impares: "+imparMulti);
      	System.err.printf("la suma es %d y el producto es %d",parSuma,imparMulti);
//		do {
//			System.out.print("Nº" +(contador)+" :");
//			num= scanner.nextInt();
//			contador++;
//			
//			if (num%2==0) {
//				parSuma=parSuma+num;
//				
//			}
//			else {
//				
//				imparMulti=imparMulti*num;
//			}
//			
//			
//			
//		} while (num!=0);
//		
//			System.out.println(""+parSuma);
//			System.out.println(""+imparMulti);
//		}
			
			scanner.close();

	}

}