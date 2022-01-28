package ExerciciosArray;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		int[][] matriz = new int[3][3];
		int maior10=0;
		Scanner leia = new Scanner(System.in);

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print("Digite um número: ");
				matriz[x][y] = leia.nextInt();
				if(matriz[x][y] > 10) {
					maior10++;
				}
			}
		}

		// mostrar matriz
		System.out.print("\n");
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print("[" + matriz[x][y] + "]");
			}
			System.out.print("\n");
		}
		
		//maior de 10
		System.out.print("\nA matriz tem "+maior10+" valores maiores que 10");

		leia.close();
	}
}
