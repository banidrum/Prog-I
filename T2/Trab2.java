public class Trab2{
       public static void main(String[] args){
       
       int op;
              
       do{
              
       System.out.println("MENU PRINCIPAL");
       System.out.println("1- Consultar saldo");       
       System.out.println("2- Efetuar saque");                     
       System.out.println("3- Efetuar depósito");
       System.out.println("4- Efetuar transferência");
       System.out.println("5- Exibir dados da conta");
       System.out.println("6- Sair");      
       
       switch(op){
              case 1:
              ChecaSaldo();       
              break;
              case 2:
              Depositar();
              break;
              case 3:
              Sacar();       
              break;
              case 4:
              Transfer();      
              break;
              case 5:
              ExibirDados();                            
              break;       
                  }       
              
       }while(op!=6);
       
       
       
       
       
       
       
       }
