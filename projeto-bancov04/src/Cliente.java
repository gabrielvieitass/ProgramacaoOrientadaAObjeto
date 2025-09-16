
public class Cliente {
	//Atributos
	
	private String nome;
	private String email;
	private String cpf;
	
	// Métodos de acesso
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	private boolean validaCpf ( String cpf ) {
		return ( cpf.length() == 11 );
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if ( this.validaCpf(cpf) )
		this.cpf = cpf;
	}
	
	public void mostraDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Email: " + this.email);
	}
}
