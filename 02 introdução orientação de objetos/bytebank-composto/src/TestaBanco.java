
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome ="Paulo Silveira";
		paulo.cpf = "222.222.222.22-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);

		
		//associa o cliente Paulo a contaDoPaulo
		
		contaDoPaulo.titular  = paulo;                  //duas formas de referenciar ao mesmo objeto
		System.out.println(contaDoPaulo.titular.nome);   //buscando informação contado paulo -> dentro titular -> dentro de nome
		}

}
