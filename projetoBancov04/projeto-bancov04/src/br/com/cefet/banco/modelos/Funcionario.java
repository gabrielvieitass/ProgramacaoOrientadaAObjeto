package br.com.cefet.banco.modelos;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private boolean ativo = true;
	private Data dataDeNascimento = new Data();
	
	public void aumentaSalario(double percentualAumento) {
		this.salario += ((this.salario * percentualAumento)/100);
	}
	
	public void demite() {
		this.ativo = false;
	}
	
	public void readmite() {
		this.ativo = true;
	}
	
	public void mostraDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salário: R$"+this.getSalario());
		System.out.println((this.ativo==true)?"Está na empresa":"Não está mais na empresa");
		System.out.println("Data de nascimento: "+this.dataDeNascimento.getDataBr());
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return this.departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return this.ativo;
	}
	public Data getDataDeNascimento() {
		return this.dataDeNascimento;
	}
}
