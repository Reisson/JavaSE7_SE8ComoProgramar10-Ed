// Figura 3.9: TesteConta3_9
// Entrada e saida de números flutuantes com objetos Conta3_8
// Data 30/12/2019
// Autor reissonramos@gmail.com
import java.util.Scanner;

public class TesteConta3_9
{
	public static void main(String[] args)
	{
		Conta3_8 novaConta1 = new Conta3_8("Jane Green", 50.00);
		Conta3_8 novaConta2 = new Conta3_8("John Blue", -7.53);
	
		//Exibe o saldo inicial de cada objeto
		
		System.out.printf("%s Balanco: $%.2f %n", novaConta1.getNome(),novaConta1.getBalanco());
		System.out.printf("%s Balanco: $%.2f %n%n", novaConta2.getNome(),novaConta2.getBalanco());
		
		//Cria um scanner para obter a entrada a partir da janela de comendo
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o montante do deposito 1: ");// prompt
		double depositoMontante = entrada.nextDouble();// obtem a entrada do usuario
		System.out.printf("%nAdicionado %.2f to novaConta1 balanco%n%n",depositoMontante);
		novaConta1.deposito(depositoMontante);// Adicona o Saldo a conta
		
		
		//Exibe Saldos
		System.out.printf("%s Balanco: $%.2f novaConta1 balanco%n%n", novaConta1.getNome(),novaConta1.getBalanco());
		System.out.printf("%s Balanco: $%.2f novaConta2 balanco%n%n", novaConta2.getNome(),novaConta2.getBalanco());
		
		System.out.print("Informe o montante do deposito 2: ");//Prompt
		depositoMontante = entrada.nextDouble(); // obtem a entrada do usuario
		System.out.printf("%nAdicionado %.2f to novaConta2 balanco%n%n",depositoMontante);
		novaConta2.deposito(depositoMontante);// Adicona o Saldo a conta
		
		
		//Exibe Saldos
		System.out.printf("%s Balanco: $%.2f novaConta1 balanco%n%n", novaConta1.getNome(),novaConta1.getBalanco());
		System.out.printf("%s Balanco: $%.2f novaConta2 balanco%n%n", novaConta2.getNome(),novaConta2.getBalanco());
	}
}