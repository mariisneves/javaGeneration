package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalsegundos, segundos, minutos, horas;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quantos segundos durou o evento? ");
		totalsegundos = leia.nextInt();
		
		horas = totalsegundos / 3600;
		minutos = (totalsegundos % 3600) / 60;
		segundos = ((totalsegundos % 3600) % 60);
		
		System.out.println("\nO evento durou "+horas+" horas, "+minutos+" minutos e "
							+segundos+" segundos.");
		
		leia.close();
	}

}
