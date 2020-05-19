package pacoteteste;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Formatacao {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double valor = 0;
        System.out.println("Valor " + df.format(valor));

        int vetor[];
        int matriz[][];

        //4. Leia um conjunto de salários, sendo que para terminar a entrada será
        //fornecido o valor 0. Após toda a entrada ter sido realizada, leia o valor
        //de um reajuste. Em seguida exiba todos os salários já reajustados.

        Scanner sc = new Scanner(System.in);
        double salarios[] = new double[100];
        double salariosReajustados[] = new double[100];
        double reajuste = 0;
        int controle = 0;
        int opcao = 1;

//		for (int i = 0; i < salarios.length; i++) {
//			System.out.println("Salário: ");
//			salarios[i] = sc.nextDouble();
//		}

        while(opcao != 0)	 {
            System.out.println("Salário: ");
            salarios[controle] = sc.nextDouble();
            controle++;
            System.out.println("Deseja continuar? 1-Sim ou 0-Não");
            opcao = sc.nextInt();
        }

        System.out.println("Reajuste");
        reajuste = sc.nextDouble();

        for (int i = 0; i < controle; i++) {
            salariosReajustados[i] = (salarios[i] * reajuste / 100) + salarios[i];
            System.out.println("anterior: " + salarios[i] + " - com aumento: " + salariosReajustados[i]);
        }

    }

}