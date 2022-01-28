package ExerciciosCondicao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int num1, num2, num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("\nO maior número é o "+num1);
		} else if(num2>num3 && num2>num1) {
			System.out.println("\nO maior número é o "+num2);
		} else {
			System.out.println("\nO maior número é o "+num3);
		}
		
		leia.close();

	}

}
