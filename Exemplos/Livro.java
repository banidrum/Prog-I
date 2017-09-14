public class Livro{
	String nome;
	String descricao;
	String isbn;	
	double valor;
	Pessoa autor = new Pessoa();
	
	public void mostraDetalhes(){
		System.out.println("\nDetalhes");
		System.out.println("Nome: "+this.nome);
		System.out.println("Descrição: "+this.descricao);
		System.out.println("Valor: "+this.valor);
		System.out.println("ISBN: "+this.isbn);
		System.out.println("Nome do autor: "+this.autor.nomeAutor);
		System.out.println("Email do autor: "+this.autor.emailAutor);
		System.out.println("CPF do autor: "+this.autor.cpfAutor);
	}

}
