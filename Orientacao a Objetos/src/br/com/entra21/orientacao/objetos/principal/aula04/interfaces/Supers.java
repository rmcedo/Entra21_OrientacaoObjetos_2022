package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Supers implements Individuo {
	
	private String superPoder;
	private String superNome;
	
	public Supers() {
		
	}

	public Supers(String superPoder, String superNome) {
		super();
		this.superPoder = superPoder;
		this.superNome = superNome;
	}

	public String getSuperPoder() {
		return superPoder;
	}

	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}

	public String getSuperNome() {
		return superNome;
	}

	public void setSuperNome(String superNome) {
		this.superNome = superNome;
	}

	@Override
	public void alimentar(String alimento) {
		
		System.out.println("Não preciso me alimentar de "+alimento+", meu nome é "+this.superNome+", seu mero mortal!!!\n");
		
		
	}

	@Override
	public void locomover() {
		System.out.println(this.superNome+" voa mais rápido que o som\n");
				
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.superNome+" tem o super poder de "+this.superPoder+" mais rápido que a luz");
		
	}
	
	
	

}
