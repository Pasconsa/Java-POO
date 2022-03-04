	//03 Diferença de Referencia vs objetos =

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		
		// Existem 2 variavies (referencia )para o mesmo objeto = valores semelhantes 
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		//Teste se  primeira conta é igual a segunda.
		 	// == comparou referencia e não objeto
		if(primeiraConta == segundaConta)  {
			System.out.println("são a mesma conta");
		}
		
	}
}


