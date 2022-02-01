package Exercicio01;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Cachorro animal1 = new Cachorro("Antonella", 1, "au au au");
		Cavalo animal2 = new Cavalo("Pudim", 5, "iiirrrrí, rilinchin");
		Preguica animal3 = new Preguica("Zooboomafoo", 3, "som que preguiça faz");
		
		animal1.imprimirInfo();
		System.out.println("\n");
		animal2.imprimirInfo();
		System.out.println("\n");
		animal3.imprimirInfo();
		
		System.out.println("\n********************\n");
		
		animal1.emitirSom();
		animal1.cachorroCorre();
		
		System.out.println("\n********************\n");
		
		animal2.emitirSom();
		animal2.cavaloCorre();
		
		System.out.println("\n********************\n");
		
		animal3.emitirSom();
		animal3.preguicaSobeArvore();
	}

}
