package br.com.cefet.banco.modelos;

public class Conta {
	private int numero;
	private Cliente titular = new Cliente();//Imutável
	private double saldo = 500;
	
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean saca(double valor) {
		if( valor <=0 || valor > this.saldo)
			return false;
		//Não precisa de else
		this.saldo -= valor;
		return true;
	}
	
	public boolean deposita(double valor) {
		if( valor <= 0 )
			return false;
		//else { Outra abordagem desnecessária
		this.saldo += valor;
		return true;
		//}	
	}
	
	public boolean transferePara(Conta contaDestino, double valor) {
		if( this.saca(valor) ) {//this é a contaOrigem
			return contaDestino.deposita(valor); // return true
		}
		return false;
	}
	
	public void mostraDados() {
		System.out.println("Número: "+this.numero);
		System.out.println("Dados do titular: ");
		this.titular.mostraDados();
		System.out.println("Saldo: R$"+this.saldo);
		
	}
}
