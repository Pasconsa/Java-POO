
public class AEsquemaBytebank {

	//Contabank
	//Cria conta
	//TesteReferencia = Diferen�a de referencia e objeto
	//TestaMetodo = maneira de trnasferir dinheiro para outra conta
	
	
	
	// 01 Class Conta Especifica��o         ex  claas conta
	
	// 02 Objetos                            ex  primeira conta  ; cria "new"
	
	// 03 atributos(campo propriedade) ; sempre � orientado ao objeto   ex saldo ,agencia, numero    
		//,, atributos trabalham sempre orientado ao objeto
	
	// 04 Metodos ;  = define o que um objeto sabe fazer. O comportamento(maneira) � implementado dentro do m�todo,  
		//ex saca , deposita ,transfere;      sintaxe = "nomeDaReferencia.nomeDoMetodo();"
	          
	//05 this = Usamos o this dentro de um m�todo para acessar um atributo:
	
			class Conta {
				double saldo;
		        int numero;
		
		         void deposita(double valor) {
		          this.saldo = this.saldo + valor;
		        }

			}
}