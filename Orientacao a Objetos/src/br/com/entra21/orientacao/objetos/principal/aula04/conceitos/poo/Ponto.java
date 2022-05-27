package br.com.entra21.orientacao.objetos.principal.aula04.conceitos.poo;

public class Ponto {
	
	private float coordenadasX;
	private float coordenadasY;
	
	public Ponto() {
		
	}
	public Ponto(float coordenadasX, float coordenadasY) {
		super();
		this.coordenadasX = coordenadasX;
		this.coordenadasY = coordenadasY;
	}

	public float getCoordenadasX() {
		return coordenadasX;
	}

	public void setCoordenadasX(float coordenadasX) {
		this.coordenadasX = coordenadasX;
	}

	public float getCoordenadasY() {
		return coordenadasY;
	}

	public void setCoordenadasY(float coordenadasY) {
		this.coordenadasY = coordenadasY;
	}


	
}
