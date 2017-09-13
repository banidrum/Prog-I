import java.util.Scanner;

public class Contas{
    
       Scanner leia = new Scanner(System.in);  

       int numero; 
       String dono;	
       double saldo;
       double valor;
	
         public void ChecaSaldo(){
	 System.out.println("Seu saldo é: " + saldo);
	 	}
	       	       	       
	 public void Depositar(){
	 System.out.println("Digite quanto quer depositar: ");
	 valor = leia.nextDouble();
         saldo += valor;		 
	 	}	
     
         public void Sacar(){
	 
         if(saldo > 0){		 
		 
         System.out.println("Digite quanto quer sacar: ");
         valor = leia.nextDouble();
         saldo -= valor;
	 	}
         else{
	 System.out.println("Você não possui saldo suficiente para fazer um saque!");
	 	}
		
	 }     	
	 public void Transfer(){
	 
	 
	 	}       	
	
	 public void ExibirDados(){
	 
	 	}       
}
