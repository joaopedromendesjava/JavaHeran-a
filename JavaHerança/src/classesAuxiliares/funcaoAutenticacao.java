package classesAuxiliares;

import JavaInterfaces.PermitirAcesso;

// realmente e somente receber alguem que tenha contrato da interface de PermitirAcesso e achar o autenticar
public class funcaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public funcaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	
	}
}
