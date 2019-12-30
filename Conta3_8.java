//Figura 3.8: Conta3_8.java
//Classe conta com uma variável de instãncia balance do tipo double e um contrutor
// e método depoisitar para executar a validação.
// Data 30/12/2019
// Autor reissonramos@gmail.com

public class Conta3_8
{
	private String nome; //Variável de intância.
	private Double balanco; //Variável de intância.
	
	//Contrutor de Conta3_8 que recebe os dois parâmetros.
	public Conta3_8(String nome, double balanco)
	{
		this.nome = nome;// atribui o nome à variável de instãncia nome
		
		//Validar que o balanco é maior que 0.0; senão for,
		//a variável de instãncia balancomatém se valor inicial padrão de 0.0
		if(balanco > 0.0)//Se o balanco for válido
			this.balanco = balanco; //o atribui à variável de instância balanco.
	}
	
	// método que deposita (adiciona) apenas apenas uma quantia válida no saldo.
	public void deposito(double depositoMontante)
	{
		if(depositoMontante > 0.0)//se o deposito for válido.
			balanco = balanco + depositoMontante; // adiciona o saldo.
	}
	
	// método retorna o saldo da conta
	public double getBalanco()
	{
		return balanco;
	}
	
	// método que define o nome
	public void setNome(String nome)
	{
		this.nome = nome; 
	}
	
	// método que retorna o nome
	public String gerNome()
	{
		return nome; // retorna o valor do nome ao chamador
	}
	// fim do método getNome
}// fim da classe Conta3_8