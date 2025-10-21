
public class TestaMetodos {
	public static void main(String[] args) {
		Conta conta1 =  new Conta();
		conta1.numero = 123;
		conta1.titular = "Fulano";
		conta1.saldo = 3000;
		
		Conta conta2 = new Conta ();
		conta2.numero = 456;
		conta2.titular = "Beltrano";
		conta2.saldo = 4000;
		
		conta1.deposita(1000);
		conta2.deposita(1000);
		
		conta2.saca(3000);
		conta1.transferePara(conta2, 2000);
		
		conta1.mostraDados();
		conta2.mostraDados();
	}
}
