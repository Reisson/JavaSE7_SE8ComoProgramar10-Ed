//Figura 2.7: Adicao.java
//Programa de Adição que insere dois numeros,então exibe a soma deles.
//Autor: reissonramos@gmail.com
//Data: 16/12/2019
import javax.swing.JOptionPane;

public class Exer3_1
{
	public static void main(String[] args)
	{
		
		String num1 = JOptionPane.showInputDialog("Informe o primeiro nº: ");
		String num2 = JOptionPane.showInputDialog("Informe o Segundo  nº: /n");
		
		int num01 = Integer.parseInt(num1);//Convertendo para inteiro.
		int num02 = Integer.parseInt(num2);//Convertendo para inteiro.
		
		int soma = (num01 + num02);// Soma
		
		String soma2 = Integer.toString(soma);////Convertendo para String.
		
		
		String mensagem = 
			String.format(" %s + %s = %s.", num1, num2, soma2);
		JOptionPane.showMessageDialog(null, mensagem);
	}
}