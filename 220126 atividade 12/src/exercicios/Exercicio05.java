package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, nota3, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.print("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.printf("\nA média ponderada é: %2.2f",media);
		
		leia.close();
	}

}
