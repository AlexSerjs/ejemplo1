package es.iesclaradelrey.dm1e.primerTrimestre.ut4.ejercicios.condicionales;

import javax.swing.JOptionPane;

public class Ejercicio13_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Dia de la Semana");
		String diaString = JOptionPane.showInputDialog("Escribe el dia");
		int dia = Integer.parseInt(diaString);
		if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7) {

			switch (dia) {
			case 1:
				JOptionPane.showMessageDialog(null, "Dia Lunes");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Dia Martes");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Dia Miercoles");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Dia Jueves");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Dia Viernes");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Dia Sabado");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Dia Domingo");
				break;
			default:
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "ERROR numero incorrecto");
		}

	}

}
