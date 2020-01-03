// Figura 4.4: Estudante4_4.java
// Uma classe Estudante que armazena o nome e a média de um aluno.
// Data 03/01/2019
// Autor reissonramos@gmail.com

public class Estudante4_4
{
	private String nome;
	private double media;
	
	//Contrutor que inicializa variáveis de isntância
	public Estudante4_4(String nome, double media)
	{
		this.nome =  nome;
		//valida que a média é > 0.0 e <=100.0; caso contrário,
		//armazena o valor padrão da média da variável de intácia (0,0);
		if(media > 0.0)
			if(media <= 100.0)
				this.media = media; // atribui à variável de instãncia;
	}
	//Define o nome do Estudante
	public void setName(String name)
	{
		this.nome = nome;
	}
	//Recupera o nome do Estudante
	public String getNome()
	{
		return nome;
	}
	//Define a média do Estudante
	public void setMedia(double estudanteMedia)
	{
		//valida que a média é > 0.0 e <=100.0; caso contrário,
		//armazena o valor padrão da média da variável de intácia (0,0);
		if(media > 0.0)
			if(media <= 100.0)
				this.media = media; // atribui à variável de instãncia;
	}
	//Recupera a média de Média
	public double getMedia()
	{
		return media;
	}
	//Determina e retorna a letra referente a nota do estudante
	public String setLetraDaGrade()
	{
		String letraDaGrade = "";
		
		if(media >= 90.0)
			letraDaGrade = "A";
		else if (media >= 80.0)
			letraDaGrade = "B";
		else if (media >= 70.0)
			letraDaGrade = "C";
		else if (media >= 60.0)
			letraDaGrade = "D";
		else
			letraDaGrade = "F";
		
		return letraDaGrade;
	}
} // Finaliza a classe Estudante4_4