package ExerciciosArray;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
//		O programa deve executar os seguintes passos: 
//			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] 
//			e A[5] do vetor e mostre na tela esta soma. 
//			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
//			(d) Mostre na tela cada valor do vetor A, um em cada linha.
		
		int[] A = new int[6];
		int soma;
		
		//A
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = -7;
		
		//B
		soma = (A[0] + A[1] + A[5]);
		System.out.println("A soma dos valores é "+soma);
		
		//C
		A[3] = 100;
		System.out.println("\nO novo valor da posição 4 é "+A[3]);
		
		//D
		System.out.println("\n~ Valores do vetor A~");
		System.out.println(A[0]);
		System.out.println(A[1]);
		System.out.println(A[2]);
		System.out.println(A[3]);
		System.out.println(A[4]);
		System.out.println(A[5]);

	}

}
