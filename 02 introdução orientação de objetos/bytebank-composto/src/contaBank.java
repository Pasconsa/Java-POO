
class Conta {
	private double saldo;
	int agencia;   //o valor dos atributos s�o zero , porem se colocar um valor esse representara o vazio
	int numero;
	Cliente titular ;                  //titular sera uma especifica��o cliente
	
	public void deposita(double valor) {          //METODO  = definir o que um objeto sabe fazer. O comportamento � implementado dentro do m�todo, ou seja uma maneira
		this.saldo = this.saldo += valor;          //refer�ncia para este projeto = this (� um atributo e n�o variavel)
	}
	
	public boolean saca(double valor) {              //Metodo para saber se tem saldo verdadeiro sen�o � falso
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
		
	public double getSaldo() {   //maneira de acessar informa��o sem que as pessoas vejam
		return this.saldo;
	}
}