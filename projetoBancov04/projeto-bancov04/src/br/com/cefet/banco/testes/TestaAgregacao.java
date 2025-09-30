package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Cliente;
import br.com.cefet.banco.modelos.Conta;

public class TestaAgregacao {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setNumero(123);
		conta1.getTitular().setNome("Fulano");
		conta1.getTitular().setCpf("12345678910");
		conta1.getTitular().setEmail("fulano@cefet-rj.br");
		conta1.deposita(3000);
		
		Conta conta2 = new Conta();
		conta2.setNumero(456);
		conta2.getTitular().setNome("Beltrano");
		conta2.getTitular().setCpf("12345678911");
		conta2.getTitular().setEmail("beltrano@cefet-rj.br");
		conta2.deposita(4000);
		
		System.out.println("Conta1: ");
		conta1.mostraDados();
		System.out.println("############################################");
		System.out.println("Conta2: ");
		System.out.println("Número: "+conta2.getNumero());
		System.out.println("Nome do titular: "+conta2.getTitular().getNome());
		System.out.println("Cpf do titular: "+conta2.getTitular().getCpf());
		System.out.println("E-mail do titular: "+conta2.getTitular().getEmail());
		System.out.println("Saldo: R$"+conta2.getSaldo());
	}
}
