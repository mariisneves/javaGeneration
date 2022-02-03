package Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
//	COLLECTION
//	Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection 
//	do tipo List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes 
//	funcionalidades:
//		Armazenar dados da List
//		Remover dados da list;
//		Atualizar dados da list.
//		Apresentar todos os dados da list.

	public static void main(String[] args) {

		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();

		do {
			System.out.println("\n\n----------- MERCADO GUANABARA ----------- ");
			System.out.println("1- Adicionar um produto no estoque ");
			System.out.println("2- Remover um produto do estoque ");
			System.out.println("3- Atualizar um produto no estoque ");
			System.out.println("4- Mostrar todos os produtos do estoque ");
			System.out.println("0- Encerrar o programa ");
			System.out.println("-----------------------------------------");
			System.out.print("Digite a sua opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.print("\nDigite o produto que deseja adicionar: ");
				String produtoAdd = leia.nextLine();
				estoque.add(produtoAdd);
				System.out.print("****** Produto adicionado com sucesso! ******\n");
				break;

			case 2:
				leia.nextLine();
				System.out.print("\nDigite o produto que deseja remover: ");
				String produtoRemove = leia.nextLine();
				if (estoque.contains(produtoRemove)) {
					estoque.remove(produtoRemove);
					System.out.print("****** Produto removido com sucesso! ******\n");
				} else {
					System.out.println("****** Produto não encontrado. ******");
				}
				System.out.println(estoque);
				break;

			case 3:
				leia.nextLine();
				System.out.print("Digite o produto que deseja atualizar: ");
				String produtoVerifica = leia.nextLine();
				if (estoque.contains(produtoVerifica)) {
					System.out.print("Digite o produto que entrará no lugar de " + produtoVerifica + ": ");
					String produtoNovo = leia.nextLine();
					estoque.remove(produtoVerifica);
					estoque.add(produtoNovo);
					System.out.print("****** Produto atualizado com sucesso! ******\n");
				} else {
					System.out.println("\n****** Produto não encontrado. ******");
				}
				System.out.println(estoque);
				break;

			case 4:
				leia.nextLine();
				System.out.println(estoque);
				break;

			default:
				if (op == 0) {
					System.out.println("\n****** Obrigade por utilizar o sistema do Mercado Guanabara ******");
				} else {
					System.out.println("\n****** Opção inválida! Tente novamente. ******");
				}
			}

		} while (op != 0);

		leia.close();
	}

}
