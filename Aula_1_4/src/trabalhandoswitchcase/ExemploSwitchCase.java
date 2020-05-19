package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		// ler um numero de 0 a 10 e mostrar o valor por extenso
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0 e 10"));
		
		// int - String - char
		// 1-Siga ou 2-Pare
		
		switch (numero) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 7:
			System.out.println("sete");
			break;
		case 8:
			System.out.println("oito");
			break;
		case 9:
			System.out.println("nove");
			break;
		case 10:
			System.out.println("dez");
			break;
		default:
			System.out.println("Valor inválido");
			break;
		}

	}

}
