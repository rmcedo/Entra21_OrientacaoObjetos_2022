package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.classes.Professor;

public class main {
	//o objeto da classe Scanner esta na variavel de entrada, então é um objeto
	//porem o System.in é uma chamada static pq para acessar o in do System
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		Professor professorJava = new Professor();
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		System.out.println("O nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("Agora o nome dela = " + professoraIngles.getNome());
		System.out.println("A idade dela é " + professoraIngles.getIdade());
		
		System.out.println("Os professores trabalham na "+Professor.instituicao);

		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		Aluno alunoTeste = new Aluno();

		alunoObjeto = new Aluno();
		alunoObjeto.idade = 18;

		alunoTeste.nome = "Rafael";
		alunoTeste.idade = 27;

		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		/*
		 * System.out.println("Qual o nome do aluno novato? ");
		 * alunoNovato.nome=entrada.next();
		 * 
		 * System.out.println("\nQual a idade do "+alunoNovato.nome+" ?");
		 * alunoNovato.idade=entrada.nextByte();
		 * 
		 * System.out.println("\nBem vindo "+alunoNovato.nome);
		 */
	}

}
