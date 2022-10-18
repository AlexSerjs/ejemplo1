package es.iesclaradelrey.dm1e.primerTrimestre.ut3.ejemplos;

public class Programa {
	public static void main(String[] args) {
		
		//creacion de objetos
		System.out.println("antes de definir el coche");
		
		Coche coche1;
		System.out.println("antes de crear el objeto");
		
		coche1= new Coche(7);//como empieza en velocidad 7? 
		System.out.println("despues de crear el objeto");
		coche1.numeroAsientos=3;
		
//		coche1.acelerar(10);
//		System.out.println("la velocidad del coche1 es "+coche1.getVelocidad());
//		coche1.acelerar(20);
//		System.out.println("la velocidad del coche1 es "+coche1.getVelocidad());
//		coche1.decelerar(5);
//		System.out.println("la velocidad del coche1 es "+coche1.getVelocidad());
//		coche1.acelerar(10);
//		System.out.println("la velocidad del coche1 es "+coche1.getVelocidad());
//		coche1.parar();
//		System.out.println("la velocidad del coche1 es "+coche1.getVelocidad());
//		
		
		Coche coche2= new Coche(100);
		coche2.numeroAsientos =5;
		
		coche2.acelerar(10);
		System.out.println("\n"+"la velocidad del coche es "+coche2.getVelocidad());
		coche2.acelerar(20);
		System.out.println("la velocidad del coche es "+coche2.getVelocidad());
		coche2.decelerar(5);
		System.out.println("la velocidad del coche es "+coche2.getVelocidad());
		coche2.acelerar(10);
		System.out.println("la velocidad del coche es "+coche2.getVelocidad());
		coche2.parar();
		System.out.println("la velocidad del coche es "+coche2.getVelocidad());
		
	}
}
