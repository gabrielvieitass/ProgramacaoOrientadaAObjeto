package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Funcionario;

public class TestaFuncionarios2 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Marcolino");
		f1.setSalario(5000);
		f1.setDepartamento("FRONT");

		Funcionario f2 = new Funcionario();
		f2.setNome("Rebeca");
		f2.setSalario(6000);
		f2.setDepartamento("BACK");

		System.out.println("Funcionário f1:");
		f1.mostraDados();
		System.out.println();
		System.out.println("Funcionário f2:");
		f2.mostraDados();

	}
}
