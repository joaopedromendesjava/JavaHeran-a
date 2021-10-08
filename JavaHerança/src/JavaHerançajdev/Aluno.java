package JavaHerançajdev;

import java.util.ArrayList;
import java.util.List;

import JavaHerançajdev.Aluno;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;


	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	public Aluno() { /*cria os dados na memoria do java/ padrao*/
		
	}
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
		
	}
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	/*VEREMOS SOBRE OS METODOS SETTERS E GATTERS DO OBJETO*/
	/* SET É PARA ADC OU RECEBER DADOS PARA OS ATRIBUTOS*/
	/* GET É PARA RESGATAR OU OBTER O VALOR DO ATRIBUTO*/
	
	/* Recebe dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
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
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	/* metodo que retorna a media do aluno*/
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		 return	somaNotas / disciplinas.size();
		
	}
	
	
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
	if (media  >= 50){
		if (media >= 70) {
			return statusAluno.APROVADO;
	}else {
			return statusAluno.RECUPERACAO;
		}
	}else {
		return statusAluno.REPROVADO;
	}
		}

	@Override
	public String toString() {
		return "Alunoo [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
@Override
public boolean pessoaMaiorIdade() {
	
	return idade >= 18;
	
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Oba Aluno é maior de Idade " : "ixxx vc é menor de idade";
 	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1500.90;
	}


}
	

