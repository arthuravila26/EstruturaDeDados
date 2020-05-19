package trabalhandoswitchcase;

import javax.swing.JOptionPane;

public class Pedidos {

	public static void main(String[] args) {

		int numero;
		int qtde;
		double valor = 0;
		String produto = "";

		numero = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o n�mero do produto:" + "\nProduto1 ..... R$ 2,98" + "\nProduto2 ..... R$ 4,50"
						+ "\nProduto3 ..... R$ 9,98" + "\nProduto4 ..... R$ 4,49" + "\nProduto5 ..... R$ 6,87"));

		qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));

		switch (numero) {
		case 1:
			produto = "Produto 1";
			valor = qtde * ((2.98 * 0.05) + 2.98);
			break;
		case 2:
			produto = "Produto 2";
			valor = qtde * ((2.98 * 0.05) + 2.98);
			break;
		case 3:
			produto = "Produto 3";
			valor = qtde * ((2.98 * 0.05) + 2.98);
			break;
		case 4:
			produto = "Produto 4";
			valor = qtde * ((2.98 * 0.05) + 2.98);
			break;
		case 5:
			produto = "Produto 5";
			valor = qtde * ((2.98 * 0.05) + 2.98);
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		
		JOptionPane.showMessageDialog(null, produto + " - Quantidade: " + qtde + " - Valor: R$ " + String.format("%.2f", new double[]{valor}));
	}

}
