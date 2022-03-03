
class Conta {
	private double saldo;
	private int agencia;   //o valor dos atributos s�o zero , porem se colocar um valor esse representara o vazio
	private int numero;
	private Cliente titular ;                  //titular sera uma referencia para cliente
	
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
		
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}