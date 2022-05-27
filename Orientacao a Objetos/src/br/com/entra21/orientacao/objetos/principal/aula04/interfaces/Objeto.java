package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Objeto implements Individuo {
	
	private String tipoMovel;
	
	
	public Objeto(String tipoMovel) {
		super();
		this.tipoMovel = tipoMovel;
	}

	public String getTipoMovel() {
		return tipoMovel;
	}

	public void setTipoMovel(String tipoMovel) {
		this.tipoMovel = tipoMovel;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.tipoMovel+": móvel não se alimenta, apenas existe por causa do capitalismo");
		
	}

	@Override
	public void locomover() {
		System.out.println(this.tipoMovel+": Dependendo do que eu sou, talvez eu consiga me movimentar");
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.tipoMovel+": Se eu for uma Alexa, podemos até conversar");
	}

}
