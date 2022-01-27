package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		
		int idade=0, menos21=0, mais50=0;
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			if(idade!=-99) {
				if (idade<21) {
					menos21++;
				}
				
				if (idade>50) {
					mais50++;
				}
			}
			
		}
		
		System.out.println("O total de pessoas com menos de 21 anos é "+menos21+".");
		System.out.println("O total de pessoas com mais de 50 anos é "+mais50+".");
		
		leia.close();
	}

}
