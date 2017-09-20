public class Disciplina {
	
	int cod;
	String nome;
	int cred;
        boolean concluido;		


	public Disciplina(int cod, String nome, int cred){

	this.cod = cod;
	this.nome = nome;
	this.cred = cred;	
	this.concluido = false;
		
	}

	public String toString (){
	       
		String con = (this.concluido) ? "Concluída" : "\nEm andamento";
		return "\nNome: " + this.nome + "\nCreditos: " + this.cred + "\nCodigo: " + this.cod + con+"\n";

	}

	public void encerrar(){
	       this.concluido = true;
		
	}


}
