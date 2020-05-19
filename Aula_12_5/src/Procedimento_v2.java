import java.util.Scanner;

public class Procedimento_v2 {

    // metodo para somar dois valores
    static void somar(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numero 1");
        a = sc.nextInt();
        System.out.println("Digite numero 2");
        b = sc.nextInt();
        int resultado = a + b;
        System.out.println("A soma é " + resultado);
    }

    static void somar(int d, int t, int o, int q) {

    }

    static void somar(int d, int t, int o) {

    }

    static void mensagem() {
        System.out.println("Boa noite");
    }

    static void mensagemNome(String nome) {
        System.out.println("Boa noite, " + nome);
    }

    static void mensagem(String nome) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = sc.next();
        System.out.println("Boa noite, " + nome);
    }

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;

        // chamada o metodo
        somar(n1, n2);

        somar(n1, n2);

        somar(n1, n2);

        mensagem();

        mensagemNome("Cláudia");

        mensagemNome("Paulo");

        String nome = null;
        mensagem(nome);

        somar(5, 9, 7);

    }




}