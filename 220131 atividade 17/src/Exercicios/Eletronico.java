package Exercicios;

import java.text.NumberFormat;

public class Eletronico {
	
	private String tipo;
	private String marca;
	private String modelo;
	private double preco;
	
	public Eletronico(String tipo, String marca, String modelo, double preco) {
		this.setTipo(tipo);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPreco(preco);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimir() {
		System.out.println("Tipo: "+tipo+"\t|\tMarca: "+marca+"\t|\tModelo: "+modelo+"\t|\tPreço: "+this.formatarPreco());
	}

	public String formatarPreco() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoPreco = nf.format(preco);
		return formatoPreco;
	}
	
	public void aumentarPreco(double percentual) {
		preco *= 1 + percentual/100;
	}
	
	public void abaixarPreco(double percentual) {
		preco = (preco * (100-percentual)) /100;
	}
	
}
