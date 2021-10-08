package JavaHeran�ajdev;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("joao pedro ");
		aluno.setNomeEscola("Jdev treinamento");
		aluno.setIdade(18);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Wemerson");
		diretor.setRegistroGeral("29382932");
		diretor.setIdade(50);
		
		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Elizete");
		secretaria.setExperiencia("Administra��o");
		secretaria.setNumeroCPF("01934024398");
		secretaria.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretaria);
		
		System.out.println(" O aluno � maior de idade (18) sim ou nao ? = " + aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(" O diretor � maior de idade (18) sim ou nao ? = " + diretor.pessoaMaiorIdade());
		System.out.println(" A secretaria � maior de idade (18) sim ou nao ? = " + secretaria.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno � = " + aluno.salario());
		System.out.println("Salario diretor � = " + diretor.salario());
		System.out.println("Salario secretaria � = " + secretaria.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretaria);
		
		
	}
	
	
	
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = " + pessoa.getNome() + 
			" e o salario � de = " + pessoa.salario());
	}

}
