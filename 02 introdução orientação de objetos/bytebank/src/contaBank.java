
class Conta {
	double saldo;
	int agencia;   //o valor dos atributos são zero , porem se colocar um valor esse representara o vazio
	int numero;
	String titular;
	
	public void deposita(double valor) {          //METODO  = definir o que um objeto sabe fazer. O comportamento é implementado dentro do método, ou seja uma maneira
		this.saldo = this.saldo += valor;          //referência para este projeto = this (é um atributo e não variavel)
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