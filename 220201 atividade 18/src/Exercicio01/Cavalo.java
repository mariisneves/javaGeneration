package Exercicio01;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
	}
	
	public void cavaloCorre() {
		System.out.println("O cavalo "+getNome()+" est� correndo...");
	}

}
