package es.iesclaradelrey.dm1e.primerTrimestre.ut3.ejercicios;

import javax.swing.JOptionPane;

public class ut3_Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringRadio= JOptionPane.showInputDialog("Escribe el radio !! ");
		JOptionPane.showMessageDialog(null,"has introducido= "+ stringRadio);
		String nombre= JOptionPane.showInputDialog("Escribe tu nombre !!");
		
		String stringLado= JOptionPane.showInputDialog("Escribe un lado de un Cuadrado !!");
		JOptionPane.showMessageDialog(null,"has introducido= "+ stringLado);
		
		double radio= Double.parseDouble(stringRadio);
		double perimetro=2*Math.PI*radio;
		
		double lado =Double.parseDouble(stringLado);
		double area = Math.pow(lado, 2);
		
		
		JOptionPane.showMessageDialog(null, "Hola "+nombre+". El cuadrado tiene un área de "+area+" y la circunferencia tiene un perímetro de "+perimetro);
		
		
		
		

	}

}
