package br.com.cefet.banco.modelos;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if(nome.length()>=3)
			this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	//Método encapsulado
	private boolean validaCpf(String cpf) {
		return (cpf.length()==11);
	}

	public void setCpf(String cpf) {
		if(this.validaCpf(cpf))
			this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostraDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Cpf: "+this.cpf);
		System.out.println("E-mail: "+this.getEmail());
	}

}
