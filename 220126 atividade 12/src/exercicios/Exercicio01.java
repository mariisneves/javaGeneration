package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		int dias, meses, anos, total;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Voc� tem quantos anos? ");
		anos = leia.nextInt();
		System.out.print("Voc� tem quantos meses? ");
		meses = leia.nextInt();
		System.out.print("Voc� tem quantos dias? ");
		dias = leia.nextInt();
		
		total = (anos * 365) + (meses * 30) + dias;
		System.out.println("\nVoc� tem "+total+" dias.");
		
		leia.close();
	}

}
