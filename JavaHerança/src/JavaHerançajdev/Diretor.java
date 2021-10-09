package JavaHerançajdev;

import JavaInterfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	private String loguin;
	private String senha;
	
	public Diretor(String loguin, String senha) {
		this.loguin = loguin;
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
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
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
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3500.78;
	}
	@Override
	public boolean autenticar(String loguin, String senha) {
		this.loguin = loguin;
		this.senha = senha;
		return autenticar();
		
	}

	@Override
	public boolean autenticar() {
		
		return loguin.equals("joao pedro") && senha.equals("123");
		}
	
	
}
