package execicio.interfaces;

// Essa interface ser� o nosso contrato  de autentica�ao 
public interface PermitirAcesso {

	/** Primeiro meio de contrato interface */
	//public boolean autenticar();//13 apenas declara�ao do metodo
	
	
	/** Primeiro meio de contrato interface 19 */
	public boolean autenticar(String login, String senha);
	
	
	/** Terceiro meio de contrato interface 24 */
	public boolean autenticar();
}
