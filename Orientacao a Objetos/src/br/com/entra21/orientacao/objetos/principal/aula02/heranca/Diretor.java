package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa {

	private String cursoAtual;
	private byte qtdProfessores;

	public Diretor() {
		super();

	}

	public Diretor(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
		this.cursoAtual = cursoAtual;
		this.qtdProfessores = qtdProfessores;
	}

	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQtdProfessores() {
		return qtdProfessores;
	}

	public void setQtdProfessores(byte qtdProfessores) {
		this.qtdProfessores = qtdProfessores;
	}

}
