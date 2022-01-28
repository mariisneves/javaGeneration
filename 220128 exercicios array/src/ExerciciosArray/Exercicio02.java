package ExerciciosArray;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2- Faça um programa que receba 6 números inteiros e mostre: 
//			• Os números pares digitados;  
//			• A soma dos números pares digitados; 
//			• Os números ímpares digitados; 
//			• A quantidade de números ímpares digitados.

		int[] vetor = new int[6];
		int somaPares = 0, qtdImpares = 0;
		Scanner leia = new Scanner(System.in);

		// recebendo números inteiros
		for (int x = 0; x < 6; x++) {
			System.out.print("Digite o " + (x + 1) + "º número: ");
			vetor[x] = leia.nextInt();
		}

		// números pares
		System.out.println("\n~ Os números pares são:");
		for (int x = 0; x < 6; x++) {
			if ((vetor[x] % 2) == 0) {
				System.out.println(vetor[x]);
				somaPares += vetor[x];
			}
		}

		// mostrando soma dos números pares
		System.out.println("\n~ A soma dos números pares é: " + somaPares);

		// números ímpares
		System.out.println("\n~ Os números ímpares são:");
		for (int x = 0; x < 6; x++) {
			if ((vetor[x] % 2) != 0) {
				System.out.println(vetor[x]);
				qtdImpares++;
			}
		}

		// mostrando quantidade de números ímpares
		System.out.println("\n~ A quantidade de números ímpares é: " + qtdImpares);

		leia.close();

	}

}
