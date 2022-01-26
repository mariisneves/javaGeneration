package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d, x1, x2, y1, y2;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entre com X1: ");
		x1 = leia.nextFloat();
		System.out.print("Entre com X2: ");
		x2 = leia.nextFloat();
		System.out.print("Entre com Y1: ");
		y1 = leia.nextFloat();
		System.out.print("Entre com Y2: ");
		y2 = leia.nextFloat();
		
		d = Math.sqrt(Math.pow((x2-x1), 2.0) + Math.pow((y2-y1),2.0));
		System.out.printf("A Distância entre os dois pontos é: %.2f",d);

		leia.close();
	}

}
