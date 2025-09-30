package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Funcionario;

public class TestaFuncionarios {
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
		System.out.println("Nome: "+f1.getNome());
		System.out.println("Departamento: "+f1.getDepartamento());
		System.out.println("Salário: R$"+f1.getSalario());
		System.out.println((f1.isAtivo())?"Está na empresa":"Não está mais na empresa");
		System.out.println();
		System.out.println("Funcionário f2:");
		System.out.println("Nome: "+f2.getNome());
		System.out.println("Departamento: "+f2.getDepartamento());
		System.out.println("Salário: R$"+f2.getSalario());
		System.out.println((f2.isAtivo())?"Está na empresa":"Não está mais na empresa");

		
	}
}
