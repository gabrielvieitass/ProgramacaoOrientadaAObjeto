
public class Funcionario {
	
	// Atributos
	
	private String nome;
	private String departamento;
	private double salario;
	private boolean ativo = true;
	private Data dataDeNascimento = new Data();
	
	//Métodos acesso
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return ativo;
	}
	
	public Data getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Data dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public void aumentarSalario (double percentual) {
		if ( percentual > 0 ) {
			double aumento = this.salario * ( percentual / 100 );
			this.salario += aumento;
		} else {
			System.out.println("Percentual inválino!");
		}
	}
	
	public void demite() {
		this.ativo = false;
	}
	
	public void readimite() {
		this.ativo = true;
	}
	
	public void mostraDados() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: R$" + this.salario);
		System.out.println("Ativo: " + this.ativo);
		System.out.println("Data de nascimento: " + this.getDataDeNascimento().getDataBr());
	}
	

	
}
