package Exercicio01;

public class Cachorro extends Animal{
	
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
	}
	
	public void cachorroCorre() {
		System.out.println("O cachorro "+getNome()+" est� correndo...");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro "+getNome()+" est� emitindo som... *"+getSom()+"*");
	}

}
