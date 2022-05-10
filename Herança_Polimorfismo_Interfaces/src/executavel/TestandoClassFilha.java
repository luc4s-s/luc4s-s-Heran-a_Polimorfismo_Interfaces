package executavel;

import exercicio.classes.Aluno;
import exercicio.classes.Diretor;
import exercicio.classes.Pessoa;
import exercicio.classes.Secretario;

public class TestandoClassFilha {

	public static void main(String[] args) {
		
		//set significa colocar os valores para os atributos 
		Aluno aluno = new Aluno();//instanciando um objeto
		aluno.setNome("lucas gomes");//setando os valores nos atributos
		aluno.setIdade(20);
		
		Diretor diretor = new Diretor();//instanciando um objeto
		diretor.setNome("Lucas Gomes");//setando os valores nos atributos
		diretor.setIdade(80);
		
		Secretario secretario = new Secretario();//instanciando um objeto
		secretario.setNome("lucas");//setando os valores nos atributos
		secretario.setIdade(15);
		
		
		
		// aqui esta chamando o metodo maiorIdade criado na class pai 
		System.out.println(secretario.maiorIdade());
		System.out.println(diretor.maiorIdade());
		System.out.println(aluno.maiorIdade() + " - " + aluno.msgMaior());
		
		
		
		//chamando o metodo abstract Salario criado na class pai Pessoa 10
		System.out.println("o salario do aluno é " + aluno.Salario());
		System.out.println("o salario do diretor é " +diretor.Salario());
		System.out.println("o salario do secretario é " +secretario.Salario());
		
		
		
		//chamando o metodo teste 11
		teste(aluno);
		teste(diretor);
		teste(secretario);

		

}
	
	//criando um metodo generico de polimofismo  11
	public static void teste(Pessoa pessoa ) {
		System.out.println("essa pessoa é de mais - "
		+ pessoa.getNome() + " e o salario é = " + pessoa.Salario());
	}
	
	
	
	
	
	
}
