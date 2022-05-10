package exercicio.classes;

//classe filho que Extends da Classe pai Pessoa
public class Aluno extends Pessoa {
	
	//passo 2
	private String dataMatricula;
	private String nomeEscola;
	private String seriematriculado;
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSeriematriculado() {
		return seriematriculado;
	}
	public void setSeriematriculado(String seriematriculado) {
		this.seriematriculado = seriematriculado;
	}
	

	
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", seriematriculado="
				+ seriematriculado + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	/** essa anotacao sobreescreve um metodo ja criado que esta la na Class pai Pessoa 
	 *  com ela possoa fazer qualquer coisa regra de negocio, alguma validaçao **/
	//reescrevendo o metodo abstract da class pai Pessoa 
	@Override 
	public boolean maiorIdade() {
		
		return idade >= 20;
	}
	
	public String msgMaior() {
		return this.maiorIdade() ? "Sim é maior de idade" : "Ixii Nao é maior de idade";
	}
	
	//reescrevendo o metodo abstract da class pai Pessoa 
	@Override
	public double Salario() {
		return 1500.90;
	}

}
