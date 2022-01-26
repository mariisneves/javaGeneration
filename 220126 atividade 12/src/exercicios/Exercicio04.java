package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B, C, D, R, S;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		A = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		B = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = Math.pow((A+B), 2.0);
		System.out.println("R = "+R);
		
		S = Math.pow((B+C), 2.0);
		System.out.println("S = "+S);
		
		D = (R + S) / 2;
		System.out.println("D = "+D);
		
		leia.close();
		
		

	}

}
