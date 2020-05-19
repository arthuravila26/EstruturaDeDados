package trabalhandoswitchcase;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Lanchonete {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#0.00");
		
		int codigo;
		int qtde;
		double valorTotal = 0;

		codigo = Integer
				.parseInt(JOptionPane.showInputDialog("Especificação   Código   Preço "
						                          + "\nCachorro Quente   100     1,20"
						                          + "\nBauru simples        101     1,30"
						                          + "\nBauru com ovo       102     1,50"
						                          + "\nHamburguer           103     1,20"
						                          + "\nCheeseburguer     104     1,30"
						                          + "\nRefrigerante           105     1,00"));
		
		qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));

		switch (codigo) {
		case 100:
			valorTotal = qtde * 1.2;
			break;
		case 101:
			valorTotal = qtde * 1.3;
			break;
		case 102:
			valorTotal = qtde * 1.5;
			break;
		default:
			break;
		}

		System.out.println("O valor total: " + df.format(valorTotal));
		
		//System.out.println("O valor total: " + String.format("%.2f", valorTotal));
	}

}
