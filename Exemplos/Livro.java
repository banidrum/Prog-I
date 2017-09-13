import java.util.Scanner;

public class Livro {
          
     String nome;
     String descricao;
     double valor;
     String isbn;
     String nomeDoAutor;
     String emailDoAutor;
     String cpfDoAutor;
                                            
     public void mostraDetalhes(){
     
     System.out.println("Nome: " +this.nome);
     System.out.println("Descrição: "+this.descricao);
     System.out.println("Valor: "+this.valor);
     System.out.println("ISBN: "+this.isbn);
              
     }

}
