package br.com.entra21.orientacao.objetos.principal.aula01;

public class Professor {
	//atributos static são de dominio da CLASSE e não de cada objeto
	//então nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acessos static basta informar a Classe.oqueVcQuer, sem utlizar o new
	public static String instituicao ="Proway";
	
	
	
	
	// atributos devem ser private e se possivel
	// criar gets e set para quem realmente precisa

	private String nome;
	private byte idadeAtual;
	private byte quantidadeAlunos;

	//new é criar objetos
	public Professor() {
		// construtor vazio não inicializa os atributos
	}

	public Professor(String nome, byte idade) {
		this.nome = nome;
		this.idadeAtual = idade;

		// construtor com parametros pode inicializar alguns ou todos os atributos

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return this.idadeAtual;
	}

}
