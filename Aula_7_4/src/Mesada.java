import javax.swing.JOptionPane;

public class Mesada {

    public static void main(String[] args) {
        // while: uso qdo preciso fazer uma validação para depois executar um bloco
        // de ações

        // do - while: pelo menos uma vez preciso executar determinados comandos

        double mesada;
        double valorCompra;
        String opcao;

        mesada = Double.parseDouble(JOptionPane.showInputDialog("Valor da mesada: "));

//		opcao = JOptionPane.showInputDialog("Deseja comprar algo? S/N");
//		
//		while(opcao.equalsIgnoreCase("s")) {
//		
//		if (opcao.equalsIgnoreCase("s")) {
//			valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor da compra: "));
//			if (mesada >= valorCompra) {
//				mesada = mesada - valorCompra;
//				JOptionPane.showMessageDialog(null, "Saldo: " + mesada);
//			}
//		}
//		opcao = JOptionPane.showInputDialog("Deseja comprar algo? S/N");
//		}
//		
//		JOptionPane.showMessageDialog(null, "Fim do programa");



        do {
            opcao = JOptionPane.showInputDialog("Deseja comprar algo? S/N");
            if (opcao.equalsIgnoreCase("s")) {
                valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor da compra: "));
                if (mesada >= valorCompra) {
                    mesada = mesada - valorCompra;
                    JOptionPane.showMessageDialog(null, "Saldo: " + mesada);
                }else {
                    JOptionPane.showMessageDialog(null, "Você não possui Saldo para a compra");
                }
            }

        } while(opcao.equalsIgnoreCase("s"));

        JOptionPane.showMessageDialog(null, "Fim do programa");
    }

}