
public class Conta {
	
	// Atributos 
	
	private int numero;
	private Cliente titular = new Cliente();
	private double saldo;
	
	// Métodos de acesso
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void mostraDados() {
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Dados do titular: ");
		this.titular.mostraDados();
	}
	
	// Métodos (comportamento)
	
	boolean saca ( double valor ) {
		if( valor <= 0 || valor > this.saldo)
			return false;
		this.saldo -= valor;
		return true;
	}

	boolean deposita ( double valor ) {
		if ( valor <= 0 )
			return false;
		this.saldo += valor;
		return true;
	}
	
	public boolean transferePara ( Conta contaDestino, double valor ) {
		if ( this.saca(valor) ) {
			return contaDestino.deposita(valor);
		}
		return false;
	}
}
