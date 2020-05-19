package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class DiaSemanaFimSemana {

	public static void main(String[] args) {

		int dia;
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 1 e 7"));

		switch (dia) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia de semana");
			break;
			
		case 1:
		case 7:
			System.out.println("Fim de semana");
			break;
			
		default:
			System.out.println("Dia inválido");
			break;
		}

	}

}
