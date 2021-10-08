package JavaHerançajdev;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import JavaInterfaces.PermitirAcesso;

public class javaexecutavel {

	public static void main(String[] args) {
		
		String loguin = JOptionPane.showInputDialog("Informe o loguin");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		PermitirAcesso permitirAcesso = new Secretaria(loguin,senha);

		
		if (permitirAcesso.autenticar()){ // se true acessa se false nao acessa
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/* é uma lista que dentro dela temos uma chave que identifica uma sequencia de valores tambem*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
	
		
		for (int qtd = 1; qtd <=5; qtd++) {
			
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " +qtd+ " ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String NumeroCPF = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String NomeMae = JOptionPane.showInputDialog("Qual o nome da mae do aluno?");
		String NomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String DataMatricula = JOptionPane.showInputDialog("Qual a data da matricula do aluno?");
		String NomeEscola = JOptionPane.showInputDialog("Qual a escola do aluno?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual a serie da matricula do aluno?");*/
		
		
		Aluno aluno1 = new Aluno(); 
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCPF(NumeroCPF);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setNomeEscola(NomeEscola);
		aluno1.setSerieMatriculado(SerieMatriculado);*/
		
		for (int pos = 1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina"+ pos +" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina"+ pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina ?");
			if (escolha == 0) { /* opção sim é zero */
				
				int continuarRemover = 0;
				int posicao = 1;
				
		while(continuarRemover == 0) {
				
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1 2 3 ou 4");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				
			}
				
		}
			alunos.add(aluno1);
			}
		
		maps.put(statusAluno.APROVADO,new ArrayList<Aluno>());
		maps.put(statusAluno.RECUPERACAO,new ArrayList<Aluno>());
		maps.put(statusAluno.REPROVADO,new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) { /*separei em listas*/
			if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.APROVADO)) {
				maps.get(statusAluno.APROVADO).add(aluno);
				
			}else
				if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.RECUPERACAO)) {
					maps.get(statusAluno.RECUPERACAO).add(aluno);
				}else if (aluno.getAlunoAprovado().equalsIgnoreCase(statusAluno.REPROVADO)) {
					maps.get(statusAluno.REPROVADO).add(aluno);
				}
			
		}
		
		System.out.println("----------------------Lista dos aprovados");
		for (Aluno aluno : maps.get(statusAluno.APROVADO)) {
			System.out.println("Nome do aluno = " + aluno.getNome());
			System.out.println(" Materia é = " + aluno.getDisciplinas());
			System.out.println("Resultado = " +aluno.getAlunoAprovado() + " com media de = " + aluno.getMediaNota());	
			
		}
	
		System.out.println("----------------------Lista dos Recuperação");
		for (Aluno aluno : maps.get(statusAluno.RECUPERACAO)) {
			System.out.println("Nome do aluno = " + aluno.getNome());
			System.out.println(" Materia é = " + aluno.getDisciplinas());
			System.out.println("Resultado = " +aluno.getAlunoAprovado() + "com media de = " + aluno.getMediaNota());	
			
		}
	
		System.out.println("----------------------Lista dos Reprovados");
		for (Aluno aluno : maps.get(statusAluno.REPROVADO)) {
			System.out.println("Nome do aluno = " + aluno.getNome());
			System.out.println(" Materia é = " + aluno.getDisciplinas());
			System.out.println("Resultado = " +aluno.getAlunoAprovado() + " com media de = " + aluno.getMediaNota());	
		}

		}else {
				JOptionPane.showMessageDialog(null, "Acesso nao permitido");
		}
	
		
	}
	
	
		
		
	}


