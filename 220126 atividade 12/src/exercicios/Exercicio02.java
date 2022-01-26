package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias, meses, anos, totaldias;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Você tem quantos dias? ");
		totaldias = leia.nextInt();
		
		anos = (totaldias / 365);
		meses = ((totaldias % 365) / 30);
		dias = ((totaldias % 365) % 30);
				
		System.out.println("\nVocê tem "+anos+" anos, "+meses+" meses e "+dias+ " dias.");
		
		leia.close();
	}

}
