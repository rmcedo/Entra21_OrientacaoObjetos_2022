package br.com.entra21.orientacao.objetos.principal.aula04.conceitos.poo;

public class Reta {

	private Ponto pontoA;
	private Ponto pontoB;

	public Reta() {

	}

	public Reta(Ponto pontoA, Ponto pontoB) {
		super();
		this.pontoA = pontoA;
		this.pontoB = pontoB;
	}

	public Ponto getPontoA() {
		return pontoA;
	}

	public void setPontoA(Ponto pontoA) {
		this.pontoA = pontoA;
	}

	public Ponto getPontoB() {
		return pontoB;
	}

	public void setPontoB(Ponto pontoB) {
		this.pontoB = pontoB;
	}

}
