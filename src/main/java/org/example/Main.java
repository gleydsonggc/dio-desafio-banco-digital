package org.example;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Fulano");

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();

		Banco banco = new Banco();
		banco.adicionarConta(cc);
		banco.adicionarConta(poupanca);
		System.out.println("\n=== Clientes ===");
		System.out.println(banco.listarClientes());
	}

}