package executavel;

import javax.swing.JOptionPane;

import auxiliares.FucaoAutenticacao;
import exercicio.classes.Diretor;

public class PrimeiraClass {

	
	public static void main(String[] args) {
		
		/** PRATICA DA INTERFACE **/
		
		
		/** Primeiro meio de contrato interface **/
//		String login = JOptionPane.showInputDialog("Informe a Login ");//passo 17
//		String senha = JOptionPane.showInputDialog("Informe a Senha ");
//		
//		//passo 18
//		Secretario secretario = new Secretario();// trabalhando diretamente com o objeto
//		secretario.setLogin(login);
//		secretario.setSenha(senha);
//		
//		//18
//		if(secretario.autentincar()) {//se for true acessa se false nao acessa
//			JOptionPane.showMessageDialog(null, "Acesso Permitido");
//		}else {
//			JOptionPane.showMessageDialog(null, "Acesso Negado");
//		}
		
		
		
		
		
		
		/** Segundo meio de contrato interface 21 **/
//		String login = JOptionPane.showInputDialog("Informe a Login ");
//		String senha = JOptionPane.showInputDialog("Informe a Senha ");
//		
		
//		PermitirAcesso  secretario = new Secretario();// trabalhando diretamente com o objeto
//		
//		if(secretario.autenticar(login, senha)) {//se for true acessa se false nao acessa
//			JOptionPane.showMessageDialog(null, "Acesso Permitido");
//		}else {
//			JOptionPane.showMessageDialog(null, "Acesso Negado");
//		}
		
		/** OU para ficar mas lipo o codigo	*/			
		
//		if(new Secretario().autenticar(login, senha)) {//se for true acessa se false nao acessa
//			JOptionPane.showMessageDialog(null, "Acesso Permitido");
//		}else {
//			JOptionPane.showMessageDialog(null, "Acesso Negado");
//		}
		
		
		
		
		/** Terceiro meio de contrato interface  23 **/
		
//		String login = JOptionPane.showInputDialog("Informe a Login ");
//		String senha = JOptionPane.showInputDialog("Informe a Senha ");
//		
//		PermitirAcesso permitirAcesso = new Secretario(login, senha );
//		
//		if(permitirAcesso.autenticar()) {
//			JOptionPane.showMessageDialog(null, "Acesso Permitido");
//		} else {
//			JOptionPane.showMessageDialog(null, "Acesso Negado");
//		}
		
		
		
		/** Terceiro meio de contrato interface  30 **/
		
		String login = JOptionPane.showInputDialog("Informe a Login ");
		String senha = JOptionPane.showInputDialog("Informe a Senha ");
		
										//32
		if( new FucaoAutenticacao(new Diretor(login, senha )).autenticar()) {
			JOptionPane.showMessageDialog(null, "Acesso Permitido");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}
	}
	
}
