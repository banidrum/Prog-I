import java.util.Scanner;

public class Contas{
    
       Scanner leia = new Scanner(System.in);  

       int numero; 
       String dono;	
       double saldo;
       double valor;
	
         public void ChecaSaldo(){
	 System.Out.println("Seu saldo é: " + saldo);
	 	}
	       	       	       
	 public void Depositar(){
	 System.Out.println("Digite quanto quer depositar: ");
	 valor = leia.nextDouble();
         saldo += valor;		 
	 	}	
     
         public void Sacar(){
	 System.Out.println("Digite quanto quer sacar: ");
         valor = leia.nextDouble();
         saldo -= valor;		 
		}     	

	 public void Transfer(){
	 
	 
	 	}       	
	
	 public void ExibirDados(){
	 
	 	}       
	}

}
