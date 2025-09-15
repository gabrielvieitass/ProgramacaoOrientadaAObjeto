package br.com.cefet.cefetflix.modelo;

public class Filme {
	public String titulo;
	public int anoDeLancamento;
	public boolean incluidoNoPlano = true;
	public double somaDasAvaliacoes;
	public int totalDeAvaliacoes;
		
	public void exibeFichaTecnica () {
		System.out.println("Título : "+titulo);
		System.out.println("Ano de lançamento :"+anoDeLancamento);
		System.out.println((incluidoNoPlano)? "Incluido no plano" : "Não incluido no plano");
	}
	public void avalia (double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
			
	public double retornaAvaliacoes() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
		
}

