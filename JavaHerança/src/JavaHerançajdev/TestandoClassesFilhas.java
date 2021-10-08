package JavaHerançajdev;

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
		secretaria.setExperiencia("Administração");
		secretaria.setNumeroCPF("01934024398");
		secretaria.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretaria);
		
		System.out.println(" O aluno é maior de idade (18) sim ou nao ? = " + aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(" O diretor é maior de idade (18) sim ou nao ? = " + diretor.pessoaMaiorIdade());
		System.out.println(" A secretaria é maior de idade (18) sim ou nao ? = " + secretaria.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno é = " + aluno.salario());
		System.out.println("Salario diretor é = " + diretor.salario());
		System.out.println("Salario secretaria é = " + secretaria.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretaria);
		
		
	}
	
	
	
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() + 
			" e o salario é de = " + pessoa.salario());
	}

}
