package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo {
	
	private String nomeCientifico;
	
	

	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeCientifico+": eu n�o preciso de "+alimento+" pois fa�o fotossintese\n");
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeCientifico+": n�o preciso me mexer, consigo tudo sem sair daqui\n");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCientifico+": ....... planta n�o fala pq ainda � MUDA");
		
	}
	

}
