package es.iesclaradelrey.dm1e.primerTrimestre.ut3.ejercicios;


public class ProgramaCuadrdo {
	
	public static void main(String[] args) {
		
	
	Cuadrado cuadrado1= new Cuadrado(5) ;
	System.out.println("lado: "+cuadrado1.getLado());
	System.out.println("area: "+cuadrado1.getArea());
	System.out.println("perimetro: "+cuadrado1.getPerimetro()+"\n");
	
	Cuadrado cuadrado2= new Cuadrado(7) ;
	System.out.println("lado: "+cuadrado2.getLado());
	System.out.println("area: "+cuadrado2.getArea());
	System.out.println("perimetro: "+cuadrado2.getPerimetro());
	
	
}
}
