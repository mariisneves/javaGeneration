package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int num, i=1, par=0, impar=0;
		Scanner leia = new Scanner(System.in);
		
		for(i=1; i<=10;i++) {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if((num%2) == 0) {
				par++;
			} else {
				impar++;
			}
			
		}
		
		System.out.println("Você digitou "+par+" números pares");
		System.out.println("Você digitou "+impar+" números ímpares");
		
		leia.close();
		
		

	}

}
