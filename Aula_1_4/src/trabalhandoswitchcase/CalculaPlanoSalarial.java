package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class CalculaPlanoSalarial {

	public static void main(String[] args) {
		// valorPerc = (valor*perc/100) // obtenho somente o valor do percentual
		// valor = valor + valorPerc

		// ou
		// valor = (valor*perc/100) + valor

		// ou
		// p = perc/100 8% 0.08
		// valor = valor + (valor*p) // acrescimo
		// valor = valor - (valor*p) // desconto

		double salario;
		String plano;
		double novoSalario = 0;

		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
		plano = JOptionPane.showInputDialog("Informe o plano: A, B ou C");

		switch (plano) {
		case "A":
			novoSalario = salario + (salario * 10 / 100);
			break;
		case "B":
			novoSalario = salario + (salario * 15 / 100);
			break;
		case "C":
			novoSalario = salario + (salario * 20 / 100);
			break;
		default:
			System.out.println("Plano inválido");
			break;
		}
		
		System.out.println("Novo salário " + novoSalario);
	}

}
