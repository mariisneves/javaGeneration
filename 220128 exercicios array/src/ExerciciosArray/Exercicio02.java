package ExerciciosArray;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
//			� Os n�meros pares digitados;  
//			� A soma dos n�meros pares digitados; 
//			� Os n�meros �mpares digitados; 
//			� A quantidade de n�meros �mpares digitados.

		int[] vetor = new int[6];
		int somaPares = 0, qtdImpares = 0;
		Scanner leia = new Scanner(System.in);

		// recebendo n�meros inteiros
		for (int x = 0; x < 6; x++) {
			System.out.print("Digite o " + (x + 1) + "� n�mero: ");
			vetor[x] = leia.nextInt();
		}

		// n�meros pares
		System.out.println("\n~ Os n�meros pares s�o:");
		for (int x = 0; x < 6; x++) {
			if ((vetor[x] % 2) == 0) {
				System.out.println(vetor[x]);
				somaPares += vetor[x];
			}
		}

		// mostrando soma dos n�meros pares
		System.out.println("\n~ A soma dos n�meros pares �: " + somaPares);

		// n�meros �mpares
		System.out.println("\n~ Os n�meros �mpares s�o:");
		for (int x = 0; x < 6; x++) {
			if ((vetor[x] % 2) != 0) {
				System.out.println(vetor[x]);
				qtdImpares++;
			}
		}

		// mostrando quantidade de n�meros �mpares
		System.out.println("\n~ A quantidade de n�meros �mpares �: " + qtdImpares);

		leia.close();

	}

}
