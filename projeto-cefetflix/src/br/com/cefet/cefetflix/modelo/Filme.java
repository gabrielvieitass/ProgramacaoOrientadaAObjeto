package br.com.cefet.cefetflix.modelo;

public class Filme {
	public String titulo;
	public int anoDeLancamento;
	public boolean incluidoNoPlano = true;
	public double somaDasAvaliacoes;
	public int totalDeAvaliacoes;
	
	public void exibeFichaTecnica () {
		System.out.println("Titulo: " +this.titulo);
		System.out.println("Ano de laçamento: " +this.anoDeLancamento);
		System.out.println((incluidoNoPlano)?"Incluido no plano":"Não incluido no Plano");
	}
	
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	public double retornaAvaliacao() {
		return somaDasAvaliacoes/totalDeAvaliacoes;
	}
	
}
