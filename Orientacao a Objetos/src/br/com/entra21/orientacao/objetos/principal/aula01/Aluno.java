package br.com.entra21.orientacao.objetos.principal.aula01;

import java.util.Scanner;

public class Aluno {
// definir atributos de um aluno e cada objeto aluno tera essas varaiveis, chamadas de atributos
	
	public String nome;
	public byte idade, quantidadePresencas;
	
	
	//na declaracao so ttem, acesso e tipo de retorno
	public Aluno() { //construtor vazio que ao utilizar o (new Aluno) ele é executado
		
	}
	public Aluno(String nomeLaDeFora) {
		this.nome = nomeLaDeFora; //objeto já inicializado
				
	}
	
	public byte responderChamada() {
		Scanner entrada= new Scanner(System.in);
		System.out.println("O aluno "+this.nome+" está aí?");
		String resposta = entrada.next();
		if(resposta.equalsIgnoreCase("sim")) {
			this.quantidadePresencas++;
			// o this serve para reafirmar que estamos mencionando
			// um atributo do meu objeto
		}
		return this.quantidadePresencas;
	}
}
