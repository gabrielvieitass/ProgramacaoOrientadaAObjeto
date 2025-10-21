package br.com.cefet.cefetflix.testes;
import br.com.cefet.cefetflix.modelo.Filme;

public class TestaFilme {
	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.titulo = "Interesterlar";
		meuFilme.anoDeLancamento = 2018;
		
		meuFilme.avalia(9.3);
		meuFilme.avalia(8.7);
		meuFilme.avalia(9);
		
		meuFilme.exibeFichaTecnica();
		System.out.println("Soma das avaliações: " +meuFilme.somaDasAvaliacoes);
		System.out.println("Total de Avaliações: " +meuFilme.totalDeAvaliacoes);
		System.out.println("Média Avaliações: " +meuFilme.retornaAvaliacao());
		
	}
}
