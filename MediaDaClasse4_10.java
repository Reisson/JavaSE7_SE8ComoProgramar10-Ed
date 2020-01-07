//Figura 4.10: MediaDaClasse4_10.java
//Resolvendo o poblema da média da classe usando a repetição controlada por sentinela.
//Data 07/01/2020
//Autor reissonramos@gmail.com
import java.util.Scanner; // programa  utiliza a classe Scanner

public class MediaDaClasse4_10
{
	public static void main(String[] args)
	{
		//Cria Scanner para obter a entrada a partir da janela de comando
		Scanner entrada = new Scanner(System.in);
		
		//fase de inicialização
		int total =0;//inicializa a soma das notas
		int mediaContador = 0; //inicializa o número de notas inseridas até agora.
		
		//Fase de processamento
		//Solicita a entrada e lê a nota fornecida pelo usuário
		System.out.print("Entre com a nota ou -1 para sair.");
		int nota = entrada.nextInt();
		
		//Faz um loop até ler o valor de sentinela inserido pelo usuário
		while(nota != -1)
		{
			total = total + nota; //adiciona nota ao total
			mediaContador = mediaContador + 1; // incrementa o contador
			
			//Solicita entrada e lê a próxima nota fornecida pelo usuário
			System.out.print("Entre com a nota ou -1 para sair.");
			nota = entrada.nextInt();
		}
		
		//Fase de término
		//Se o usuário inseriu pelo menos uma nota...
		if(mediaContador != 0)
		{
			//Usa número com ponto decimal para calcular média das notas
			double media = (double) total / mediaContador;
			
			//exibe o total e a média (com dois dígitos de precisão)
			System.out.printf("%nO total das %d notas são %d%n", mediaContador, total);
			System.out.printf("Média da classe: %.2f%n", media);
		}
		else // nenhuma nota foi inserida, assim gera a saída da mensagem apropiada
			System.out.println("Não foi informado nenhuma nota");
	}
}//Fim da Classe MediaDaClasse4_10
