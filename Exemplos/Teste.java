public class Teste{
	public static void main(String[] args){
		Livro[] lista = new Livro[3];
		lista[0] = new Livro();
		lista[0].nome = "Livro 1";
		lista[0].descricao = "O livro de tudo";
		lista[0].valor = 234;
		lista[0].autor.nomeAutor = "Sei la";
		lista[0].autor.emailAutor = "blablabla@bla.com";
		lista[0].autor.cpfAutor = "1111111111111";
		
		lista[1] = new Livro();
		lista[1].nome = "Livro 2";
		lista[1].descricao = "O livro de nada";
		lista[1].valor = 34;
		lista[1].autor.nomeAutor = "Sei la";
		lista[1].autor.emailAutor = "blablabla@bla.com";
		lista[1].autor.cpfAutor = "1111111111111";

		lista[2] = new Livro();
		lista[2].nome = "Livro 3";
		lista[2].descricao = "O livro";
		lista[2].valor = 4;
		lista[2].autor.nomeAutor = "Sei la";
		lista[2].autor.emailAutor = "blablabla@bla.com";
		lista[2].autor.cpfAutor = "1111111111111";

		for(Livro n : lista)
			n.mostraDetalhes();
		
	}


}
