// Figura 3.6: TesteConta.java
// Usando o construtor de Conta3_5 para iniciar as instância nome.
// Variavel no momento em que cada objeto Conta é criado.
// Data: 30/12/2019.
// Autor: reissonramos@gmail.com

import java.util.Scanner;

public class TesteConta3_6
{
	public static void main(String[] agrs)
	{

		Scanner entrada = new Scanner(System.in);
		

		Conta3_5 NovaConta1 = new Conta3_5("Jane Green");
		Conta3_5 NovaConta2 = new Conta3_5("John Blue");
		

		System.out.printf("Valor inicial Novaconta1: %s%n", NovaConta1.getName());
		System.out.printf("Valor inicial Novaconta2: %s%n", NovaConta2.getName());		

		System.out.printf("O nome da conta e:%n%s%n",NovaConta1.getName());
		System.out.printf("O nome da conta e:%n%s%n",NovaConta2.getName());
	}
}