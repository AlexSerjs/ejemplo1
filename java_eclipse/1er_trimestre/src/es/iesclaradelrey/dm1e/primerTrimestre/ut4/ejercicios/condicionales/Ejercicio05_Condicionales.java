package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio05_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Iniciar Sesión");
		
		String usuarioString=JOptionPane.showInputDialog("Usuario");
		
		String claveString=JOptionPane.showInputDialog("Contraseña");
		
		if (usuarioString.equals("pepe") && claveString.equals("asdasd") ) {
			JOptionPane.showMessageDialog(null,"Bienvenido");
			
		} else {
			JOptionPane.showMessageDialog(null,"ERROR",null,JOptionPane.ERROR_MESSAGE );
		}

	}

}
