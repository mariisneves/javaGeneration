package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)*/
		
		int num, soma=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			soma += num;
		} while (num != 0);
		
		System.out.println("A soma dos n�meros digitados � "+soma);
		
		leia.close();
	}

}
