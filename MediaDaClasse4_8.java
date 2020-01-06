//Figura 4.8: MediaDaClasse4_8.java
//Resolvendo o poblema da média da classe usando a repetição controlada por contador.
//Data 06/01/2020
//Autor reissonramos@gmail.com
import java.util.Scanner; // progama para utilizar a classe Scanner

public class MediaDaClasse4_8
{
	public static void main(String[] args)
	{
		// Cria a Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//Fase de inicialização
		int total = 0; //Inicializa a soma das notas inseridas pelo usuario
		int contadorAluno = 1; //Inicializa nº da nota a ser inserido em seguida.
		
		//Fase de processamento utiliza repetição controlada por contador
		while (contadorAluno <= 10)//faz o loop 10 vezes
		{
			System.out.print("Entre com a nota: "); //Solicita a nota
			int nota = input.nextInt(); // insere a proxima nota
			total = total + nota; // isere a nota ao total
			contadorAluno = contadorAluno + 1; // incremnta o contador com mais 1
		}
		//Fase do termino
		int media = total / 10;//Divisão de inteiros produz um resultado inteiros
		// exibe o total e a media das notas
		System.out.printf("%nO total das 10 notas e %d%n", total);
		System.out.printf("Media da classe e : %d%n", media);
	}
}