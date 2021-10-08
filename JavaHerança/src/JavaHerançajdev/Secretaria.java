package JavaHerançajdev;

import JavaInterfaces.PermitirAcesso;

public class Secretaria extends Pessoa implements PermitirAcesso {

	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String loguin;
	private String senha;
	
	public Secretaria (String loguin, String senha) {
		this.loguin = loguin;
		this.senha = senha;
	}
	
	public Secretaria() {
		
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
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
		return "Secretaria [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		
		return 1800.80 * 0.9;
	}
	
	// ESSE É O METODO DO CONTRATO DE AUTENTICAÇÃO 
	
	
	@Override
	public boolean autenticar(String loguin, String senha) {
		
		
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return false;
	}

	
		}
	
	


