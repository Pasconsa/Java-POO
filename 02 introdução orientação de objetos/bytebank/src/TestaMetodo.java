
//Metodo manneira de transferir dinheiro para outra conta

public class TestaMetodo {
	
	//saldo
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();           //Conta= class , contaDoPaulo variavel
		contaDoPaulo.saldo =100;
		contaDoPaulo.deposita(50);                  //nomeDaReferencia.nomeDoMetodo();
		System.out.println(contaDoPaulo.saldo);
		
		
	//objetivo identificar se é posivel a retirada do saque
		
		boolean conseguiuRetirar = contaDoPaulo.saca(150);               // invocação de método é parenteses
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
	//deposita	
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
	
	//transfere
		if(contaDaMarcela.transfere(800, contaDoPaulo))  {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		
	}
}

