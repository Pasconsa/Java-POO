//02 Criação de Objetos

public class CriaConta {
	
	public static void main(String[] args) {
		                      
		Conta primeiraConta =   new Conta();   // comando para criação de um objeto da ; class conta ="new Conta"
		primeiraConta.saldo = 200;
			System.out.println(primeiraConta.saldo);
			
			primeiraConta.saldo += 100;
			
			System.out.println(primeiraConta.saldo);
			
		
		
			Conta segundaConta = new Conta();
			segundaConta.saldo = 50;
			
		// Primeira conta e segunda são objetos diferentes pois tem referencias destintas, porem especificação é a mesma
		
			System.out.println("Primeira conta tem " + primeiraConta.saldo);  // Primeira conta e segunda conta não são objetos são referencias
			System.out.println("Segunda conta tem " + segundaConta.saldo);
			
			System.out.println(primeiraConta.agencia);
			System.out.println(primeiraConta.numero);
		
	}
}
