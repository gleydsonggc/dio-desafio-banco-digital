package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
public class Banco {

	private String nome;

	private List<Conta> contas = new ArrayList<>();

	public Set<Cliente> listarClientes() {
		return contas.stream()
				.map(Conta::getCliente)
				.collect(Collectors.toSet());
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

}