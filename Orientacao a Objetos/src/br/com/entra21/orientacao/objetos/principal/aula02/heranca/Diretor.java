package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor {

	private String nome;
	private byte idade;
	private String cursoAtual;
	private byte qtdProfessores;

	public Diretor() {

	}

	public Diretor(String nome, byte idade) {

		this.nome = nome;
		this.idade = idade;

	}
	
	public void realizarApresentacao() {
	System.out.println("\nOi, meu nome é "+this.nome+ " e tenho "+this.idade);	
	}
	

}
