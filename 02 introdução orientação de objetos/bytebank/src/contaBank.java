//01 Especifica��o do tipo conta 1� class


//especifica��o
class Conta {
//s�o 4 atributos
	double saldo;
	int agencia;   //o valor dos atributos s�o zero , porem se colocar um valor pad�o que esse representara o vazio
	int numero;
	String titular;
	  

//s�o 3 metodos = deposita, saca, transfere
	
	public void deposita(double valor) {          //METODO  = define o que um objeto sabe fazer. O comportamento(maneira) � implementado dentro do m�todo, 
		this.saldo = this.saldo += valor;          //refer�ncia para este projeto = this (� um atributo e n�o variavel) exp: saldo � um atributo ; valor � uma variavel
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
}