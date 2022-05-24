package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Funcionario {

	private String nome;
	private byte idade;
	private String cargoAtual;
	private float salario;
	
	

	public Funcionario() {
		
	}
	public Funcionario(String nome, byte idade, String cargo, float valor) {

		this.nome=nome;
		this.idade=idade;
		this.cargoAtual=cargo;
		this.salario=valor;
		
		}
}
