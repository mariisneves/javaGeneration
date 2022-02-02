package Exercicio01;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade,  String som) {
		super(nome, idade, som);
	}
	
	public void preguicaSobeArvore() {
		System.out.println("A preguiça "+getNome()+" está subindo a árvore...");
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça "+getNome()+" está emitindo som... *"+getSom()+"*");
		
	}

}
