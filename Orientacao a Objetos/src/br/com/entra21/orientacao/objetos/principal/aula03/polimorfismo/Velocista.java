package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Velocista extends Atleta {

	private String tipoPista;
	private String marcaCalcado;

	public Velocista() {

	}

	public Velocista(String tipoPista, String marcaCalcado) {
		super();
		this.tipoPista = tipoPista;
		this.marcaCalcado = marcaCalcado;
	}

	public Velocista(String name, byte age, int qtdWin, int qtdLoss, String tipoPista, String marcaCalcado) {
		super(name, age, qtdWin, qtdLoss);

	}

	public String getTipoPista() {
		return tipoPista;
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getMarcaCalcado() {
		return marcaCalcado;
	}

	public void setMarcaCalcado(String marcaCalcado) {
		this.marcaCalcado = marcaCalcado;
	}

	@Override
	// protege em relação a alterações de sintaxe, como visibilidade, tipo de
	// retorno, nome do método e parâmetros.
	// o método é meu, mas eu aproveito a implementação da super-classe
	// porém eu posso fazer um diferencial

	public void comemorarVitoria() {
		super.comemorarVitoria();
		System.out.println(getName() + ": ahhh, estou cansado mas corri para a vitória!!");

	}

}
