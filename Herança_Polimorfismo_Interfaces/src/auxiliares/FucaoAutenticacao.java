package auxiliares;

import execicio.interfaces.PermitirAcesso;

//So permite algem que tem ralmente o contrato da interface PermitirAcesso e chama a autenticar 28	
public class FucaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;//31
	
	//29 
	public boolean autenticar() {
		return permitirAcesso.autenticar(); //retornadno o autenticar da class Secretario 
	}

	public FucaoAutenticacao(PermitirAcesso acesso) {//31
		this.permitirAcesso = acesso;
	}
}
