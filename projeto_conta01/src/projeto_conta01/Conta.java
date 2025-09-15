package projeto_conta01;

public class Conta {
	int numero;
	String titular;
	double saldo;
	
	boolean saca (double valor) {
		if (valor <= 0 || valor > this.saldo)
			return false;
		this.saldo-=valor;
		return true;
	}
	
	boolean deposita (double valor) {
		if(valor<=0) 
			return false;
		this.saldo += valor;
		return true;
	}
	
	boolean transferePara (Conta contaDestino , double valor) {
		if (this.saca(valor)) {
			return contaDestino.deposita(valor);
		}
		return false;
		
		
	}
}
