
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta =new Conta(1337, 332455);      //este parenteses esta passando por um construtor
	
		
	//conta.setNumero(1337);                    "Construtor elimina essas duas funções"
	//System.out.println(conta.getNumero());
	
	
	Cliente paulo = new Cliente();
	paulo.setNome("paulo silveira"); //ERROR
	conta.setTitular(paulo);
	
	System.out.println(conta.getTitular().getNome());
	
	
	
	
	conta.getTitular().setProfissao("programador");
	
	Cliente titularDaConta = conta.getTitular();
	titularDaConta.setProfissao("programador");
		
	}
	

}
