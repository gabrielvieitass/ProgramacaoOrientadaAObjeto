package br.com.cefet.cefetflix.teste;

import br.com.cefet.cefetflix.modelo.Filme;

public class TestaFilme {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.titulo = "Interestelar";
		meuFilme.anoDeLancamento = 2018;
		
		meuFilme.avalia(9.3);
		meuFilme.avalia(8.7);
		meuFilme.avalia(9);
		
		meuFilme.exibeFichaTecnica();
		
		System.out.println("Soma das Avaliações: "+meuFilme.somaDasAvaliacoes);
		System.out.println("Total Avaliações: "+meuFilme.totalDeAvaliacoes);
		System.out.println("Média Avaliações: "+meuFilme.retornaAvaliacoes());
		
	}
}
