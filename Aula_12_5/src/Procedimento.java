import java.util.Scanner;

public class Procedimento {

    // metodo para somar dois valores
    static void somar(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma é " + resultado);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Digite numero 1");
        n1 = sc.nextInt();
        System.out.println("Digite numero 2");
        n2 = sc.nextInt();

        // chamada o metodo
        somar(n1, n2);

        System.out.println("Digite numero 1");
        n1 = sc.nextInt();
        System.out.println("Digite numero 2");
        n2 = sc.nextInt();

        // chamada o metodo
        somar(n1, n2);


        System.out.println("Digite numero 1");
        n1 = sc.nextInt();
        System.out.println("Digite numero 2");
        n2 = sc.nextInt();

        // chamada o metodo
        somar(n1, n2);
    }




}