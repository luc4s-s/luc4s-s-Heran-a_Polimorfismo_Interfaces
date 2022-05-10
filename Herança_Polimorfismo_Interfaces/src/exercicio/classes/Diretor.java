package exercicio.classes;

import execicio.interfaces.PermitirAcesso;

//classe filho que Extends da Classe pai Pessoa
public class Diretor extends Pessoa implements PermitirAcesso{

	private String registroEducacao;
	private String tempoDirecao;
	private String titulacao;
	
	private String login;//32
	private String senha;
	
	//32
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {
	}
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	//reescrevendo o metodo abstract da class pai Pessoa 
	@Override
	public double Salario() {
		// TODO Auto-generated method stub
		return 5000.00;
	}
	

	//32
		@Override
		public boolean autenticar(String login, String senha) {
			this.login = login;
			this.senha = senha;
			return autenticar();
		}
		
		//32
		@Override
		public boolean autenticar() {
			return login.equals("diretor") && senha.equals("diretor");
		}
	
}
