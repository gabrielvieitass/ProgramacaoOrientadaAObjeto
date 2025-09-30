package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Funcionario;

public class TestaFuncionarios3 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Marcolino");
		f1.setSalario(5000);
		f1.setDepartamento("FRONT");
		f1.getDataDeNascimento().setDia("14");
		f1.getDataDeNascimento().setMes("02");
		f1.getDataDeNascimento().setAno("2004");

		Funcionario f2 = new Funcionario();
		f2.setNome("Rebeca");
		f2.setSalario(6000);
		f2.setDepartamento("BACK");
		f2.getDataDeNascimento().setDia("02");
		f2.getDataDeNascimento().setMes("02");
		f2.getDataDeNascimento().setAno("2004");
		
		f2.aumentaSalario(20);
		f1.demite();

		System.out.println("Funcionário f1:");
		f1.mostraDados();
		System.out.println();
		System.out.println("Funcionário f2:");
		f2.mostraDados();
		System.out.println(f2.getDataDeNascimento().getDataBr());

	}
}
