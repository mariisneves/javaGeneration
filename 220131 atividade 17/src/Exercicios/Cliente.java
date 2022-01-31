package Exercicios;

import java.text.NumberFormat;

public class Cliente {
//	1) Crie uma classe cliente e apresente os atributos e métodos referentes
//	esta classe, em seguida crie um objeto cliente, defina as instancias deste
//	objeto e apresente as informações deste objeto no console.

	private String nome;
	private String cidade;
	private String temCartao;
	private double valorCompra;

	public Cliente(String nome, String cidade, String temCartao, double valorCompra) {
		this.setNome(nome);
		this.setCidade(cidade);
		this.setTemCartao(temCartao);
		this.setValorCompra(valorCompra);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTemCartao() {
		return temCartao;
	}

	public void setTemCartao(String temCartao) {
		this.temCartao = temCartao;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorCompra);
		return formatoMoeda;
	}

	public void descontoCompra(double percentual) {
		valorCompra = (valorCompra * (100 - percentual)) / 100;
	}

	public void imprimir() {
		System.out.println("Cliente: " + nome + "\t|\tCidade: " + cidade + "\t|\tValor da compra: "
				+ this.formatarMoeda() + "\t|\tTem cartão? " + temCartao);
	}

}
