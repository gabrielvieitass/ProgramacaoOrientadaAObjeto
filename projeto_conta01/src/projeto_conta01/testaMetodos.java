package projeto_conta01;

public class testaMetodos {
	public static void main(String args[]) {
		Conta conta1 = new Conta();
		conta1.numero = 123;
		conta1.titular = "Bruno Henrique";
		conta1.saldo = 3000;
		
		Conta conta2 = new Conta();
		conta2.numero = 456;
		conta2.titular = "Irmão do Bruno Henrique";
		conta2.saldo = 4000;
		
		conta1.deposita(1000);
		conta2.deposita(1000);
		 
		if ( ! conta1.saca(4001) )
			System.out.println("Saldo insuficiente. O saldo atual é de: R$"+conta1.saldo);
		else
			System.out.println("Saque efetuado com sucesso!");
		
		conta2.saca(3001);
		conta1.transferePara(conta2, 2000);
		
		System.out.println("Conta 1: ");
		System.out.println("Numero: "+conta1.numero);
		System.out.println("Titular: "+conta1.titular);
		System.out.println("Saldo: "+conta1.saldo);
		System.out.println("##########################");
		System.out.println("Conta 2: ");
		System.out.println("Número: "+conta2.numero);
		System.out.println("Titular: "+conta2.titular);
		System.out.println("Saldo: "+conta2.saldo);
		
	}

}
