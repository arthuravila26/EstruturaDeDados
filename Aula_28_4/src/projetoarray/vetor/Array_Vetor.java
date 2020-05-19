package projetoarray.vetor;

import java.util.Scanner;

public class Array_Vetor {

    public static void main(String[] args) {
        // declarando um vetor

//		String nomes[] = new String[3];
//		nomes[0] = "Ana";
//		nomes[1] = "Pedro";
//		nomes[2] = "Antonia";
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println(nomes[i]);
//		}
//
//
//		int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.print(numeros[i] + " ");
//		}

//		int a[] = new int[10];
//
//		for (int i = 0; i < 10; i++) {
//			a[i] = i+1;
//			System.out.println("a[" + i + "] = " + a[i]);
//		}

        // atividade 1. a)
//		int a[] = new int[10];
//
//		for (int i = 0; i < 10; i++) {
//			a[i] = 10-i;
//			System.out.print(a[i] + " ");
//		}
//
//		int b[] = new int[10];
//		for (int i = 10; i > 0; i--) {
//			b[10-i] = i;
//			System.out.print(b[10-i] + " ");
//		}

        //b) 0 1 4 9 16 25 36 49 64 81 100
        Scanner sc = new Scanner(System.in);
//		int b[] = new int[11];
//
//		for (int i = 0; i < 11; i++) {
//			System.out.println("digite um numero");
//			b[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}

//		double f[] = new double[10];
//
//		for (int i = 0; i < f.length; i++) {
//			System.out.println("Numero");
//			f[i] = sc.nextDouble();
//		}
//		for (int i = 0; i < f.length; i++) {
//			System.out.println(f[i] + " ");
//		}

        //Exercício 4: Crie um código Java que recebe um array de inteiros
        //e retorne a quantidade de elementos do array que são números ímpares.
        int numeros[] = new int[5];
//		int contador = 0;

//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println("insira numeros");
//			numeros[i] = sc.nextInt();
//			if (numeros[i] % 2 == 1) {
//				contador++;
//			}
//		}
//
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i] + " ");
//		}
//
//		System.out.println("Quantidade numeros impares " + contador);

        // Crie um código Java que recebe um array de inteiros Z e um valor
        // inteiro X e retorne a quantidade de vezes que X aparece no array Z.
//		int z[]= new int[5];
//
//		int x=  0;
//		int contador = 0;
//
//		System.out.println("Digite um valor para x: ");
//		x = sc.nextInt();
//
//		for (int i = 0; i < z.length; i++) {
//			System.out.println("Digite um Numero");
//			z[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < z.length; i++) {
//			if (z[i] == x) {
//				contador++;
//			}
//		}
//
//		System.out.println(contador);

        // Escreva um código Java que recebe um array de inteiros A
        // e devolve um array de boolean onde, cada posição indique
        // true se o elemento da posição correspondente de A é positivo
        // e false caso seja negativo ou zero.

//		int a[] = new int[5];
//		boolean b[] = new boolean[5];
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Digite um numero positivo ou negativo");
//			a[i] = sc.nextInt();
//
//			//se é positivo
//			if (a[i] > 0) {
//				b[i] = true;
//			}
//			else {
//				b[i] = false;
//			}
//		}

        System.out.println("==== Fim ====");

//		for (int i = 0; i < 5; i++) {
//			System.out.println(a[i] + " - " + b[i]);
//		}




        // Crie um código Java que recebe um array de inteiros positivos
        // e substitui seus elementos de valor ímpar por -1 e os pares por +1.

        int num[] = new int[5];
        String n[] = new String[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite numeros positivos");
            num[i] = sc.nextInt();

            if (num[i] % 2 == 0) {
                n[i] = "+1";
            }
            else {
                n[i] = "-1";
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(num[i] + " " + n[i]);
        }




    }

}