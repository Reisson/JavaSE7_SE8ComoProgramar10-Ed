// Figura 3.13: DialogoNome3_13
// Obtendo a entrada do usuario a partir de um dialogo.
// Data 31/12/2019
// Autor reissonramos@gmail.com
import javax.swing.JOptionPane;

public class DialogoNome3_13
{
	public static void main(String[] args)
	{
		//Pede para o usuario inserir seu nome
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		
		//Cria a mensagem
		String mensagem = String.format("Bem vindo, %s, programador java!",nome);
		
		//Exibe a mensagem para comprimentar o usuariopelo nome.
		JOptionPane.showMessageDialog(null, mensagem);
	}//Fim main
}//Termina DialogoNome3_13