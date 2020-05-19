package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class Calculadora2 {

	public static void main(String[] args) {

		int num1, num2, total;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		
		// exemplo utilizando String
		String opcao;
		opcao = JOptionPane.showInputDialog("Digite uma opção: + , - , / , * ");

		switch (opcao) {
		case "+":
			total = num1 + num2;
			System.out.println("A soma dos números : " + total);
			break;
		case "-":
			total = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + total);
			break;
		case "Div/ide":
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		case "*":
			System.out.println(num1 * num2);
			break;

		default:
			System.out.println("Dados inválidos");
			break;
		}

	}

}
