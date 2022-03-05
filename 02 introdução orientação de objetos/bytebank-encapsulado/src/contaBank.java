
class Conta {
	private double saldo;
	private int agencia;  
	private int numero;
	private Cliente titular ;
	
	

//Construtor padrão = rotina especialização
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
	
//metodos de trabalho
	
	public void deposita(double valor) {          
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
		
		
	//Metodo mantem informação encapsulada
		//objetivo = Esconder o funcionamento do nosso objeto.
			//nesse caso pode fazer varias alterações em um unico lugar.
		
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {        //acessa o numero da conta
		return this.numero;
	}
	
	public void setNumero(int numero){   //modifica o numero da conta
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {                          //alterar o metodo para não ter numero negativo em agencia
			System.out.println("nao pode valor menor igual a zero");
			return;
		}
		
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}