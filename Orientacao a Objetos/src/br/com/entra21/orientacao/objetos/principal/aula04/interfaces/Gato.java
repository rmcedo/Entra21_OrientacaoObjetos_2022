package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Gato implements Individuo {

	private String nome;
	private Pessoa dono;

	public Gato() {

	}

	public Gato(String nome, Pessoa dono) {
		super();
		this.nome = nome;
		this.dono = dono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nome + " miau, posso não gostar disso, mas meu dono " + this.dono.getNome()
				+ "só me dá " + alimento);
	}

	@Override
	public void locomover() {
		System.out.println(this.nome+ "miau... prefiro dormir!");

	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nome+" miau miau miau... traduzindo "+conteudo  );

	}

}
