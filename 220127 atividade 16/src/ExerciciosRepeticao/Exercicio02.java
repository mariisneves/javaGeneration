package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		int num, i=1, par=0, impar=0;
		Scanner leia = new Scanner(System.in);
		
		for(i=1; i<=10;i++) {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			if((num%2) == 0) {
				par++;
			} else {
				impar++;
			}
			
		}
		
		System.out.println("Voc� digitou "+par+" n�meros pares");
		System.out.println("Voc� digitou "+impar+" n�meros �mpares");
		
		leia.close();
		
		

	}

}
