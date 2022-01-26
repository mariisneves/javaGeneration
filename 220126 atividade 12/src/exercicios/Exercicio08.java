package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		double custoFabrica, custoConsumidor;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
		
		System.out.printf("\nO custo do consumidor é %.2f",custoConsumidor);
		
		leia.close();
	}

}
