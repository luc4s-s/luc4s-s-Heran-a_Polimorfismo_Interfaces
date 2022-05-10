package execicio.interfaces;

// Essa interface será o nosso contrato  de autenticaçao 
public interface PermitirAcesso {

	/** Primeiro meio de contrato interface */
	//public boolean autenticar();//13 apenas declaraçao do metodo
	
	
	/** Primeiro meio de contrato interface 19 */
	public boolean autenticar(String login, String senha);
	
	
	/** Terceiro meio de contrato interface 24 */
	public boolean autenticar();
}
