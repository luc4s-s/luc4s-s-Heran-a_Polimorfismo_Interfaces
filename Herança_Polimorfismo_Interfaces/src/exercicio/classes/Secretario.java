package exercicio.classes;

import execicio.interfaces.PermitirAcesso;

//classe filho que Extends da Classe pai Pessoa
public class Secretario extends Pessoa implements PermitirAcesso{

	private String registro;
	private int nivelCargo;
    private String experiencia;
    
    /** Primeiro meio de contrato interface **/
//20    private String login;//passo 15
//    	private String senha;
    
    private String login;//27
	private String senha;
    
    
	//27
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Secretario() {
	}
    
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public int getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(int nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	
	// Reescrevendo o metodo abstract da class pai Pessoa 
	@Override
	public double Salario() {
		return 1890.50 * 0.9;
	}
	
	
	/** Primeiro meio de contrato interface **/
	//Esse é o metodo de contrato de autenticação com a class Secretario 
//	@Override
//	public boolean autentincar() {
//		return login.equals("lucas") && senha.equals("123");//passo 16
//	}
	
	
	//20 erra assim 
//	@Override
//	public boolean autenticar(String login, String senha) {
//		return login.equals("lucas") && senha.equals("123");
//	}
	
	//esta assim 26
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	
	//25
	@Override
	public boolean autenticar() {
		return login.equals("lucas") && senha.equals("123");
	}
    
    
}
