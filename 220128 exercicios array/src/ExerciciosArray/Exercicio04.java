package ExerciciosArray;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4- Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio 
//		um menu de op��es:
//			(1) somar as duas matrizes 
//			(2) subtrair a primeira matriz da segunda 
//			(3) adicionar uma constante as duas matrizes
//			(4) imprimir as matrizes 
//			Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
//			Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante 
//			deve ser armazenado na pr�pria matriz.

		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		int op, constante;
		Scanner leia = new Scanner(System.in);

		System.out.print("~ Definindo valores para a matriz M1 ~\n");
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				System.out.print("Digite um n�mero: ");
				m1[x][y] = leia.nextFloat();
			}
		}

		System.out.print("\n~ Definindo valores para a matriz M2 ~\n");
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				System.out.print("Digite um n�mero: ");
				m2[x][y] = leia.nextFloat();
			}
		}

		System.out.println("\n~ Escolha uma das op��es abaixo ~");
		System.out.println("(1) somar as duas matrizes");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		System.out.print("\nDigite a sua op��o: ");

		op = leia.nextInt();

		switch (op) {
		case 1:
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					m3[x][y] = m1[x][y] + m2[x][y];
				}
			}
			System.out.println("\nA matriz resultante da soma das matrizes �: ");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.print("[" + m3[x][y] + "]");
				}
				System.out.print("\n");
			}
			break;

		case 2:
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					m3[x][y] = m1[x][y] - m2[x][y];
				}
			}
			System.out.println("\nA matriz resultante da soma das matrizes �: ");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.print("[" + m3[x][y] + "]");
				}
				System.out.print("\n");
			}
			break;

		case 3:
			System.out.print("\nDigite o valor da constante: ");
			constante = leia.nextInt();
			
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					m1[x][y] = m1[x][y] + constante;
					m2[x][y] = m2[x][y] + constante;
				}
			}
			System.out.println("\nO resultado da adi��o da constante na matriz M1 �: ");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.print("[" + m1[x][y] + "]");
				}
				System.out.print("\n");
			}
			System.out.println("\nO resultado da adi��o da constante na matriz M2 �: ");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.print("[" + m2[x][y] + "]");
				}
				System.out.print("\n");
			}
			break;
			
		case 4:
			System.out.println("\nMatriz M1: ");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.print("[" + m1[x][y] + "]");
				}
				System.out.print("\n");
			}
			System.out.println("\nMatriz M2: ");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.print("[" + m2[x][y] + "]");
				}
				System.out.print("\n");
			}
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}

		leia.close();
	}

}
