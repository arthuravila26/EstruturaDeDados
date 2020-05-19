package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class Calculadora3 {

	public static void main(String[] args) {

		int num1, num2, total;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		
		// exemplo utilizando String
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: 1-Somar , 2-Subtrair , 3-Dividir , 4-Multiplicar "));

		switch (opcao) {
		case 1:
			total = num1 + num2;
			System.out.println("A soma dos números: " + total);
			break;
		case 2:
			total = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + total);
			break;
		case 3:
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		case 4:
			System.out.println(num1 * num2);
			break;

		default:
			System.out.println("Dados inválidos");
			break;
		}

	}

}
