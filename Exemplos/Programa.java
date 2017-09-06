

public class Programa{
       public static void  main(String[] args){
       
       Conta c1 = new Conta();
       c1.numero=5;
       c1.dono="Daniel";
       c1.saldo=1200;
       	 
       System.out.println(c1.numero);
       System.out.println(c1.dono);
       System.out.println(c1.saldo);	 	 
       	 
       c1.depositar(800.8);
       System.out.println(c1.saldo);
       
       c1.sacar(700);
       System.out.println(c1.saldo);	 
       	 
       	 }
       }
