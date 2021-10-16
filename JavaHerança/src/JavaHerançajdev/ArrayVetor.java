package JavaHerançajdev;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class ArrayVetor {
	
		// usado para executar codigo
	public static void main(String[] args) {
		
		// criacao do aluno
		
		double[] notasDiscp1 = {15.8,9.7,7.6,6.8};
		double[] notasDiscp2 = {10.8,9.0,7.1,5.8};
		double[] notasDiscp3 = {1.8,9.9,5.6,1.8};
		double[] notasDiscp4= {99.8,56.0,5.1,7.8};
		
		
		Aluno aluno = new Aluno();
		aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno 1"));
		aluno.setNomeEscola("UniBH");
		
		// criacao da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina(JOptionPane.showInputDialog("Qual a disciplina 1?"));
		disciplina.setNota(notasDiscp1);
	
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina(JOptionPane.showInputDialog("Qual a disciplina 2?"));
		disciplina2.setNota(notasDiscp2);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome(JOptionPane.showInputDialog("Qual o nome do aluno 2"));
		aluno2.setNomeEscola("UFMG");
		
		// criacao da disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina(JOptionPane.showInputDialog("Qual a disciplina 3?"));
		disciplina3.setNota(notasDiscp3);
	
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina(JOptionPane.showInputDialog("Qual a disciplina 4?"));
		disciplina4.setNota(notasDiscp4);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		Aluno[]ArrayAlunos = new Aluno[2];

		ArrayAlunos[0] = aluno;
		ArrayAlunos[1] = aluno2;
	
		for (int pos = 0; pos < ArrayAlunos.length; pos ++) {
		System.out.println("Nome do aluno é: " + ArrayAlunos[pos].getNome());
	
		for (Disciplina discp : ArrayAlunos[pos].getDisciplinas()) {
			System.out.println("Nome da disciplina é: " + discp.getDisciplina());	
		
			for (int posnota = 0; posnota < discp.getNota().length; posnota++) {
			System.out.println("A nota numero: " + posnota + " é igual = " + discp.getNota()[posnota]);
			
				}
		
			}
	
	
	
		}
		
	}
}
		
		
	/*	
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso = " + aluno.getNomeEscola());
		System.out.println("-------------------Disciplina do aluno ----------------------");
		
		for (Disciplina discp : aluno.getDisciplinas()) {
			
			
			System.out.println("Disciplina = " + discp.getDisciplina());
			System.out.println("As notas das disciplinas são: ");
			
			double notaMax = 0.0;
			double notaMenor = 0.0;
			for(int pos = 0; pos < discp.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual " + discp.getNota()[pos]);
				if(pos == 0) {
					notaMax = discp.getNota()[pos];
				}else {
					if(discp.getNota()[pos] > notaMax) {
						notaMax = discp.getNota()[pos];	
					}
				}
				if(pos == 0) {
					notaMenor = discp.getNota()[pos];
					
				}else {
					if(discp.getNota()[pos] < notaMenor) {
						notaMenor = discp.getNota()[pos];
					} 
			} */
		
		/*	System.out.println("A maior nota da disciplina = " + discp.getDisciplina() + " é o valor de " + notaMax);
			System.out.println("A menor nota da disciplina = " + discp.getDisciplina() + " é o valor de " + notaMenor);
		
		
			podemos atribuir valores dessas duas formas diretamente ou separando 

		String[] valores = {"alex", "97.2", "Curso java", "Contato joaopedromendessilva@gmial.com"};
			
		valores [0] = "alex";
		valores [1] =  "97.2";
		valores [2] = "Curso java";
		valores [3] = "Contato joaopedromendessilva@gmial.com"; 
		
		// Array pode ser de todos os tipos de dados e objetos tambem
		
		String posicoes =JOptionPane.showInputDialog("Quantas posicoes o array deve ter?");	
		
		// Array sempre deve ter a quantidade de posiçoes definidas
		double notas[] = new double[Integer.parseInt(posicoes)];
		
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + pos);
			notas[pos] = Double.parseDouble(valor);
		}
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
			*/
