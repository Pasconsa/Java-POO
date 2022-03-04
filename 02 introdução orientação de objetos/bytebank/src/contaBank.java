//01 Especificação do tipo conta 1º class


//especificação
class Conta {
//são 4 atributos
	double saldo;
	int agencia;   //o valor dos atributos são zero , porem se colocar um valor padão que esse representara o vazio
	int numero;
	String titular;
	  

//são 3 metodos = deposita, saca, transfere
	
	public void deposita(double valor) {          //METODO  = define o que um objeto sabe fazer. O comportamento(maneira) é implementado dentro do método, 
		this.saldo = this.saldo += valor;          //referência para este projeto = this (é um atributo e não variavel) exp: saldo é um atributo ; valor é uma variavel
	}
	
	
	
	
	public boolean saca(double valor) {              //Metodo para saber se tem saldo verdadeiro senão é falso
		if(this.saldo >= valor) {
			this.saldo = this.saldo -= valor;
			return true;
		}
	    return false;
	}	
		
		
	
	public boolean transfere(double valor, Conta destino) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			}
			return false;
		
	}
}