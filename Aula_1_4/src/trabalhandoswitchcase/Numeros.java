package trabalhandoswitchcase;

import javax.swing.*;

public class Numeros {

	public static void main(String[] args) {

		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 80 e 100"));

		switch (numero) {
		case 80:
			System.out.println("Você digitou 80");
			break;
		case 90:
			System.out.println("Você digitou 90");
			break;
		case 100:
			System.out.println("Você digitou 100");
			break;
		default:
			System.out.println("Digitou o valor errado");
			break;
		}
	}

}
