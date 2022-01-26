package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		a = leia.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = leia.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = leia.nextDouble();
		System.out.print("Digite o valor de d: ");
		d = leia.nextDouble();
		System.out.print("Digite o valor de e: ");
		e = leia.nextDouble();
		System.out.print("Digite o valor de f: ");
		f = leia.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));
		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.printf("\nO valor de x é %.2f", x);
		System.out.printf("\nO valor de y é %.2f", y);
		
		leia.close();
	}

}
