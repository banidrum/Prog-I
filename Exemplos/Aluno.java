public class Aluno{

	Disciplina[] disciplinas = new Disciplina[5];

	String nome;
	int mat;
	
	public Aluno(String nome, int mat){

	this.nome = nome;
	this.mat = mat;
	
	}

	public String toString(){
		return "\nAluno: " + this.nome + "\nMatricula" +this.mat+"\n";

	}

	public void listarDisciplinas(){

	for(Disciplina d : disciplinas)
	   System.out.println(d);

	}		
	
	public void matricular(Disciplina d){

	int qtdDis;
	
	}

}
