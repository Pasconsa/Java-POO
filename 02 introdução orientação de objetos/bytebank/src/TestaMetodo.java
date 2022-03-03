
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();           //Conta= class , contaDoPaulo variavel
		contaDoPaulo.saldo =100;
		contaDoPaulo.deposita(50);                  //nomeDaReferencia.nomeDoMetodo();
		System.out.println(contaDoPaulo.saldo);
		
		
		//objetivo identificar se � posivel a retirada do saque
		boolean conseguiuRetirar = contaDoPaulo.saca(150);               // invoca��o de m�todo � parenteses
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(3000, contaDoPaulo))  {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
	}
}

