public class Pessoa{

	   private int idade;
	   private float peso;
	   private String nome;
	   
	   public Pessoa(int idade, float peso, String nome){
	   
	   		  this.idade = idade;
	   		  this.peso = peso;	
	   		  this.nome = nome;		   			   	
		   	}
		   	
	   public String getInfos(){
	   
	   	  return this.idade + this.peso + this.nome;	
	   
	   }   	
}
