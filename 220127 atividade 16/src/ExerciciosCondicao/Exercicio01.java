package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("\nO maior n�mero � o "+num1);
		} else if(num2>num3 && num2>num1) {
			System.out.println("\nO maior n�mero � o "+num2);
		} else {
			System.out.println("\nO maior n�mero � o "+num3);
		}
		
		leia.close();

	}

}
