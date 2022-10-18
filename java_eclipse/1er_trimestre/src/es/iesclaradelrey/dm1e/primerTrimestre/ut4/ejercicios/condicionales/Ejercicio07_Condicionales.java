package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio07_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showInternalMessageDialog(null, "Vefiricación");
		
		String notaString=JOptionPane.showInputDialog("Introduce la nota ");
		String edadString=JOptionPane.showInputDialog("Introduce tu edad ");
		String sexoString = JOptionPane.showInputDialog("Escribe tu sexo Hombre(H) o Mujer(M)");
		
		double nota = Double.parseDouble(notaString);
		int edad = Integer.parseInt(edadString);
		char sexo=sexoString.charAt(0);
		
		
		if (nota>=5 && nota<=10 && edad>=18 && sexo=='M') {
			JOptionPane.showMessageDialog(null, "Aceptada");
		}
		else if (nota>=5 &&nota<=10 &&edad>=18 && sexo=='H') {
			JOptionPane.showMessageDialog(null, "Posible");
			
		} else {
			JOptionPane.showMessageDialog(null, "No Aceptada");

		}
        //boolean apto = nota>=5 && nota<=10 && edad>=18;
		
		//if (apto && sexo=='M') {
			//JOptionPane.showMessageDialog(null, "Aceptada");
		//}
		//else if (apto && sexo=='H') {
		//	JOptionPane.showMessageDialog(null, "Posible");
			
	//	} else {
		//	JOptionPane.showMessageDialog(null, "No Aceptada");


	}

}
