
public class CriaConta {
	
	public static void main(String[] args) {
		                      // comando para cria��o de um objeto tipo conta "new"
		Conta primeiraConta =   new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);  // Primeira conta e segunda conta n�o s�o objetos s�o referencias
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
	}
}
