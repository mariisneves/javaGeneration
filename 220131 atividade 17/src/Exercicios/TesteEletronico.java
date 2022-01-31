package Exercicios;

public class TesteEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eletronico[] eletronico = new Eletronico[3];

		eletronico[0] = new Eletronico("Celular", "Xiaomi", "Redmi Note 9s", 2000);
		eletronico[1] = new Eletronico("Tablet", "Amazon", "Fire HD8", 550);
		eletronico[2] = new Eletronico("Leitor", "Amazon", "Kindle 10", 300);

		for (Eletronico roda : eletronico) {
			roda.imprimir();
		}

		System.out.println("\n**************** AUMENTO DO DÓLAR ****************");

		for (Eletronico roda : eletronico) {
			roda.aumentarPreco(30);
			roda.imprimir();
		}

		System.out.println("\n**************** BLACK FRIDAY ****************");

		for (Eletronico roda : eletronico) {
			roda.abaixarPreco(40);
			roda.imprimir();
		}
		
		System.out.println("\n**************** OFERTA DE CELULAR ****************");

		eletronico[0].abaixarPreco(10);
		for(Eletronico roda:eletronico) {
			roda.imprimir();
		}

	}

}
