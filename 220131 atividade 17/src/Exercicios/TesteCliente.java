package Exercicios;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente[] cli = new Cliente[2];
		
		cli[0] = new Cliente("Mariana", "Osasco", "Sim", 100);
		cli[1] = new Cliente("Gabriel", "Santos", "N�o", 200);
		
		for(Cliente clientes:cli) {
				clientes.imprimir();
			}
		
		System.out.println("\n*** APLICA��O DO DESCONTO***\n");
		for(Cliente clientes:cli) {
			clientes.descontoCompra(10);
			clientes.imprimir();
		}
		
		System.out.println("\n*** CORRE��O DE VALOR ***\n");
		cli[1].setValorCompra(200);
		for(Cliente clientes:cli) {
			clientes.imprimir();
		}
	}

}
